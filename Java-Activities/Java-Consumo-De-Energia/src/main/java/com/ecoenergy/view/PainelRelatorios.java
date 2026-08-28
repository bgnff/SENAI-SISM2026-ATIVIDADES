package com.ecoenergy.view;

import com.ecoenergy.service.EnergyCalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelRelatorios extends JPanel {
    private EnergyCalculator calculator;
    private JComboBox<String> comboTipoRelatorio;
    private JComboBox<String> comboAreas;
    private JTextArea txtRelatorio;

    public PainelRelatorios(EnergyCalculator calculator) {
        this.calculator = calculator;
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel painelControle = new JPanel(new FlowLayout(FlowLayout.LEFT));

        painelControle.add(new JLabel("Tipo de Relatório:"));
        comboTipoRelatorio = new JComboBox<>(new String[]{"Geral", "Por Área"});
        painelControle.add(comboTipoRelatorio);

        painelControle.add(new JLabel("Área:"));
        comboAreas = new JComboBox<>();
        painelControle.add(comboAreas);
        comboAreas.setEnabled(false);

        JButton btnGerar = new JButton("Gerar Relatório");
        btnGerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gerarRelatorio();
            }
        });
        painelControle.add(btnGerar);

        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtRelatorio.setText("");
            }
        });
        painelControle.add(btnLimpar);

        comboTipoRelatorio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tipo = (String) comboTipoRelatorio.getSelectedItem();
                if (tipo.equals("Por Área")) {
                    comboAreas.setEnabled(true);
                    atualizarComboAreas();
                } else {
                    comboAreas.setEnabled(false);
                }
            }
        });

        add(painelControle, BorderLayout.NORTH);
        
        atualizarComboAreas();

        txtRelatorio = new JTextArea();
        txtRelatorio.setEditable(false);
        txtRelatorio.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(txtRelatorio);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Relatório"));
        add(scrollPane, BorderLayout.CENTER);
    }

    private void gerarRelatorio() {
        String tipo = (String) comboTipoRelatorio.getSelectedItem();
        String relatorio = "";

        switch (tipo) {
            case "Geral":
                if (calculator.quantidadeAreas() == 0) {
                    JOptionPane.showMessageDialog(this, "Não há áreas cadastradas!", "Aviso", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                relatorio = calculator.gerarRelatorioGeral();
                break;
            case "Por Área":
                String nomeArea = (String) comboAreas.getSelectedItem();
                if (nomeArea == null) {
                    JOptionPane.showMessageDialog(this, "Selecione uma área!", "Aviso", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                relatorio = calculator.gerarRelatorioPorArea(nomeArea);
                break;
            default:
                relatorio = "Tipo de relatório inválido!";
        }

        txtRelatorio.setText(relatorio);
    }

    private void atualizarComboAreas() {
        String selecionado = (String) comboAreas.getSelectedItem();
        comboAreas.removeAllItems();
        for (String nome : calculator.listarTodasAreas()) {
            comboAreas.addItem(nome);
        }
        if (selecionado != null && calculator.listarTodasAreas().contains(selecionado)) {
            comboAreas.setSelectedItem(selecionado);
        }
    }
    
    public void atualizarComboAreasPublico() {
        atualizarComboAreas();
    }
}
