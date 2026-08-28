package com.ecoenergy.view;

import com.ecoenergy.service.EnergyCalculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelEconomia extends JPanel {
    private EnergyCalculator calculator;
    private JTextField txtHorasReducao;
    private JTextArea txtResultado;

    public PainelEconomia(EnergyCalculator calculator) {
        this.calculator = calculator;
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel painelControle = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        painelControle.add(new JLabel("Redução de Horas de Uso Diário:"), gbc);

        gbc.gridx = 1;
        txtHorasReducao = new JTextField(10);
        painelControle.add(txtHorasReducao, gbc);

        gbc.gridx = 2;
        painelControle.add(new JLabel("horas"), gbc);

        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btnCalcular = new JButton("Calcular Economia");
        JButton btnLimpar = new JButton("Limpar");

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularEconomia();
            }
        });

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtHorasReducao.setText("");
                txtResultado.setText("");
            }
        });

        painelBotoes.add(btnCalcular);
        painelBotoes.add(btnLimpar);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        painelControle.add(painelBotoes, gbc);

        add(painelControle, BorderLayout.NORTH);

        txtResultado = new JTextArea();
        txtResultado.setEditable(false);
        txtResultado.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(txtResultado);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Resultado da Simulação"));
        add(scrollPane, BorderLayout.CENTER);

        JPanel painelInfo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lblInfo = new JLabel("<html><i>Simule a economia reduzindo as horas de uso diário dos equipamentos.</i></html>");
        painelInfo.add(lblInfo);
        add(painelInfo, BorderLayout.SOUTH);
    }

    private void calcularEconomia() {
        String horasStr = txtHorasReducao.getText().trim();

        if (horasStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite a quantidade de horas de redução!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (calculator.quantidadeAreas() == 0) {
            JOptionPane.showMessageDialog(this, "Não há áreas cadastradas!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int reducaoHoras = Integer.parseInt(horasStr);

            if (reducaoHoras <= 0) {
                JOptionPane.showMessageDialog(this, "A redução deve ser maior que zero!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double economiaKWh = calculator.calcularEconomiaPotencial(reducaoHoras);
            double economiaFinanceira = calculator.calcularEconomiaFinanceira(economiaKWh);

            StringBuilder resultado = new StringBuilder();
            resultado.append("=== SIMULAÇÃO DE ECONOMIA ===\n\n");
            resultado.append("Redução de Uso Diário: ").append(reducaoHoras).append(" horas\n");
            resultado.append("Economia Mensal de Energia: ").append(String.format("%.2f", economiaKWh)).append(" kWh\n");
            resultado.append("Economia Mensal Financeira: R$ ").append(String.format("%.2f", economiaFinanceira)).append("\n");
            resultado.append("Economia Anual de Energia: ").append(String.format("%.2f", economiaKWh * 12)).append(" kWh\n");
            resultado.append("Economia Anual Financeira: R$ ").append(String.format("%.2f", economiaFinanceira * 12)).append("\n\n");
            resultado.append("=== IMPACTO AMBIENTAL ===\n\n");
            resultado.append("Cada 1 kWh economizado evita aproximadamente 0.5 kg de CO2 na atmosfera.\n");
            resultado.append("Redução Mensal de CO2: ").append(String.format("%.2f", economiaKWh * 0.5)).append(" kg\n");
            resultado.append("Redução Anual de CO2: ").append(String.format("%.2f", economiaKWh * 12 * 0.5)).append(" kg\n\n");
            resultado.append("=== DICAS DE TI VERDE ===\n\n");
            resultado.append("• Desligue equipamentos quando não estiverem em uso\n");
            resultado.append("• Utilize equipamentos com maior eficiência energética\n");
            resultado.append("• Aproveite a luz natural sempre que possível\n");
            resultado.append("• Configure monitores para modo de economia de energia\n");
            resultado.append("• Desligue equipamentos no final do expediente\n");

            txtResultado.setText(resultado.toString());

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Digite um valor numérico válido para as horas!", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao calcular economia: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
