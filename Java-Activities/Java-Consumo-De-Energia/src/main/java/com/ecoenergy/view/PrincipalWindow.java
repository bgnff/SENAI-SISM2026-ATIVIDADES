package com.ecoenergy.view;

import com.ecoenergy.service.EnergyCalculator;
import javax.swing.*;
import java.awt.*;

public class PrincipalWindow extends JFrame {
    private EnergyCalculator calculator;
    private JTabbedPane tabbedPane;
    private PainelCadastroArea painelArea;
    private PainelCadastroEquipamento painelEquipamento;
    private PainelRelatorios painelRelatorios;

    public PrincipalWindow(EnergyCalculator calculator) {
        this.calculator = calculator;
        setTitle("EcoEnergy School - Sistema de Monitoramento de Energia");
        setSize(900, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        tabbedPane = new JTabbedPane();

        painelArea = new PainelCadastroArea(calculator, this);
        painelEquipamento = new PainelCadastroEquipamento(calculator, this);
        painelRelatorios = new PainelRelatorios(calculator);
        PainelEconomia painelEconomia = new PainelEconomia(calculator);

        tabbedPane.addTab("Cadastro de Áreas", painelArea);
        tabbedPane.addTab("Cadastro de Equipamentos", painelEquipamento);
        tabbedPane.addTab("Relatórios", painelRelatorios);
        tabbedPane.addTab("Simulação de Economia", painelEconomia);

        add(tabbedPane, BorderLayout.CENTER);
    }

    public void atualizarComboBoxAreas() {
        painelEquipamento.atualizarComboBoxAreas();
        painelRelatorios.atualizarComboAreasPublico();
    }
    
    public void atualizarListaAreas() {
        painelArea.atualizarLista();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    EnergyCalculator calculator = new EnergyCalculator();
                    PrincipalWindow window = new PrincipalWindow(calculator);
                    window.setVisible(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao iniciar a aplicação: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
