package com.ecoenergy.view;

import com.ecoenergy.model.AreaComum;
import com.ecoenergy.service.EnergyCalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelCadastroArea extends JPanel {
    private EnergyCalculator calculator;
    private PrincipalWindow mainWindow;
    private JTextField txtNome;
    private JTextArea txtDescricao;
    private DefaultListModel<String> listModel;
    private JList<String> listaAreas;

    public PainelCadastroArea(EnergyCalculator calculator, PrincipalWindow mainWindow) {
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
        painelFormulario.add(new JLabel("Nome da Área:"), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        txtNome = new JTextField(20);
        painelFormulario.add(txtNome, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        painelFormulario.add(new JLabel("Descrição:"), gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        txtDescricao = new JTextArea(3, 20);
        txtDescricao.setLineWrap(true);
        JScrollPane scrollDescricao = new JScrollPane(txtDescricao);
        painelFormulario.add(scrollDescricao, gbc);

        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btnCadastrar = new JButton("Cadastrar Área");
        JButton btnLimpar = new JButton("Limpar");
        JButton btnRemover = new JButton("Remover Selecionada");

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarArea();
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
                removerArea();
            }
        });

        painelBotoes.add(btnCadastrar);
        painelBotoes.add(btnLimpar);
        painelBotoes.add(btnRemover);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        painelFormulario.add(painelBotoes, gbc);

        listModel = new DefaultListModel<>();
        listaAreas = new JList<>(listModel);
        JScrollPane scrollLista = new JScrollPane(listaAreas);
        scrollLista.setBorder(BorderFactory.createTitledBorder("Áreas Cadastradas"));
        
        atualizarLista();

        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, painelFormulario, scrollLista);
        splitPane.setResizeWeight(0.4);

        add(splitPane, BorderLayout.CENTER);
    }

    private void cadastrarArea() {
        String nome = txtNome.getText().trim();
        String descricao = txtDescricao.getText().trim();

        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O nome da área é obrigatório!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (calculator.buscarArea(nome) != null) {
            JOptionPane.showMessageDialog(this, "Já existe uma área com este nome!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            AreaComum area = new AreaComum(nome, descricao);
            calculator.adicionarArea(area);
            listModel.addElement(nome);
            mainWindow.atualizarComboBoxAreas();
            limparCampos();
            JOptionPane.showMessageDialog(this, "Área cadastrada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar área: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void removerArea() {
        String selecionado = listaAreas.getSelectedValue();
        if (selecionado == null) {
            JOptionPane.showMessageDialog(this, "Selecione uma área para remover!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirmacao = JOptionPane.showConfirmDialog(this, 
            "Deseja realmente remover a área " + selecionado + "?", 
            "Confirmação", 
            JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            if (calculator.removerArea(selecionado)) {
                listModel.removeElement(selecionado);
                mainWindow.atualizarComboBoxAreas();
                mainWindow.atualizarListaAreas();
                JOptionPane.showMessageDialog(this, "Área removida com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao remover área!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void limparCampos() {
        txtNome.setText("");
        txtDescricao.setText("");
    }

    public void atualizarLista() {
        listModel.clear();
        for (String nome : calculator.listarTodasAreas()) {
            listModel.addElement(nome);
        }
    }
}
