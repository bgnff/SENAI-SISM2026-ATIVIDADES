package com.ecoenergy.view;

import com.ecoenergy.model.AreaComum;
import com.ecoenergy.model.Equipamento;
import com.ecoenergy.service.EnergyCalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelCadastroEquipamento extends JPanel {
    private EnergyCalculator calculator;
    private PrincipalWindow mainWindow;
    private JComboBox<String> comboAreas;
    private JTextField txtNome;
    private JTextField txtPotencia;
    private JTextField txtHoras;
    private JComboBox<String> comboTipo;
    private DefaultListModel<String> listModelEquipamentos;
    private JList<String> listaEquipamentos;

    public PainelCadastroEquipamento(EnergyCalculator calculator, PrincipalWindow mainWindow) {
        this.calculator = calculator;
        this.mainWindow = mainWindow;
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel painelFormulario = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        painelFormulario.add(new JLabel("Área:"), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        comboAreas = new JComboBox<>();
        painelFormulario.add(comboAreas, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        painelFormulario.add(new JLabel("Nome do Equipamento:"), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        txtNome = new JTextField(20);
        painelFormulario.add(txtNome, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        painelFormulario.add(new JLabel("Potência (Watts):"), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        txtPotencia = new JTextField(20);
        painelFormulario.add(txtPotencia, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        painelFormulario.add(new JLabel("Horas de Uso Diário:"), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        txtHoras = new JTextField(20);
        painelFormulario.add(txtHoras, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        painelFormulario.add(new JLabel("Tipo:"), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        comboTipo = new JComboBox<>(new String[]{"Iluminação", "Ar Condicionado", "Computador", "Projetor", "Televisão", "Outro"});
        painelFormulario.add(comboTipo, gbc);

        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btnCadastrar = new JButton("Cadastrar Equipamento");
        JButton btnLimpar = new JButton("Limpar");
        JButton btnRemover = new JButton("Remover Selecionado");

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarEquipamento();
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });

        btnRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerEquipamento();
            }
        });

        painelBotoes.add(btnCadastrar);
        painelBotoes.add(btnLimpar);
        painelBotoes.add(btnRemover);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        painelFormulario.add(painelBotoes, gbc);

        listModelEquipamentos = new DefaultListModel<>();
        listaEquipamentos = new JList<>(listModelEquipamentos);
        JScrollPane scrollLista = new JScrollPane(listaEquipamentos);
        scrollLista.setBorder(BorderFactory.createTitledBorder("Equipamentos da Área Selecionada"));

        comboAreas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarListaEquipamentos();
            }
        });

        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, painelFormulario, scrollLista);
        splitPane.setResizeWeight(0.5);

        add(splitPane, BorderLayout.CENTER);
        
        atualizarComboBoxAreas();
    }

    private void cadastrarEquipamento() {
        String nomeArea = (String) comboAreas.getSelectedItem();
        if (nomeArea == null) {
            JOptionPane.showMessageDialog(this, "Selecione uma área primeiro!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String nome = txtNome.getText().trim();
        String potenciaStr = txtPotencia.getText().trim();
        String horasStr = txtHoras.getText().trim();
        String tipo = (String) comboTipo.getSelectedItem();

        if (nome.isEmpty() || potenciaStr.isEmpty() || horasStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            double potencia = Double.parseDouble(potenciaStr);
            int horas = Integer.parseInt(horasStr);

            if (potencia <= 0 || horas <= 0) {
                JOptionPane.showMessageDialog(this, "Potência e horas devem ser maiores que zero!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            AreaComum area = calculator.buscarArea(nomeArea);
            if (area == null) {
                JOptionPane.showMessageDialog(this, "Área não encontrada!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Equipamento equipamento = new Equipamento(nome, potencia, horas, tipo);
            area.adicionarEquipamento(equipamento);
            atualizarListaEquipamentos();
            limparCampos();
            JOptionPane.showMessageDialog(this, "Equipamento cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Digite valores numéricos válidos para potência e horas!", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar equipamento: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void removerEquipamento() {
        String nomeArea = (String) comboAreas.getSelectedItem();
        if (nomeArea == null) {
            JOptionPane.showMessageDialog(this, "Selecione uma área primeiro!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String selecionado = listaEquipamentos.getSelectedValue();
        if (selecionado == null) {
            JOptionPane.showMessageDialog(this, "Selecione um equipamento para remover!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirmacao = JOptionPane.showConfirmDialog(this, 
            "Deseja realmente remover o equipamento " + selecionado + "?", 
            "Confirmação", 
            JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            AreaComum area = calculator.buscarArea(nomeArea);
            if (area != null && area.removerEquipamento(selecionado)) {
                atualizarListaEquipamentos();
                JOptionPane.showMessageDialog(this, "Equipamento removido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao remover equipamento!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void limparCampos() {
        txtNome.setText("");
        txtPotencia.setText("");
        txtHoras.setText("");
        comboTipo.setSelectedIndex(0);
    }

    public void atualizarComboBoxAreas() {
        String selecionado = (String) comboAreas.getSelectedItem();
        comboAreas.removeAllItems();
        for (String nome : calculator.listarTodasAreas()) {
            comboAreas.addItem(nome);
        }
        if (selecionado != null && calculator.listarTodasAreas().contains(selecionado)) {
            comboAreas.setSelectedItem(selecionado);
        }
        atualizarListaEquipamentos();
    }

    private void atualizarListaEquipamentos() {
        String nomeArea = (String) comboAreas.getSelectedItem();
        listModelEquipamentos.clear();
        
        if (nomeArea != null) {
            for (String nome : calculator.listarEquipamentosPorArea(nomeArea)) {
                listModelEquipamentos.addElement(nome);
            }
        }
    }
}
