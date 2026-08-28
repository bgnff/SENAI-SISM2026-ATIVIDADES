# Conceitos de Programação Demonstrados no EcoEnergy School

Este documento explica os conceitos de programação Java utilizados no projeto EcoEnergy School.

## 1. Estruturas de Controle

### if/else
Utilizado para tomadas de decisão baseadas em condições.

**Exemplo em EnergyCalculator.java:**
```java
if (consumoKWh < 10) {
    return "BAIXO";
} else if (consumoKWh < 50) {
    return "MEDIO";
}
```

### switch
Utilizado para seleção múltipla baseada em valores.

**Exemplo em EnergyCalculator.java:**
```java
switch (classificacao) {
    case "BAIXO":
        return "EXCELENTE - Práticas sustentáveis muito bem aplicadas!";
    case "MEDIO":
        return "BOM - Há espaço para melhorias sustentáveis.";
    case "ALTO":
        return "ATENÇÃO - Consumo elevado, reveja equipamentos.";
    case "MUITO ALTO":
        return "CRÍTICO - Ações imediatas necessárias para redução.";
    default:
        return "INDEFINIDO";
}
```

### for
Utilizado para iterar sobre coleções ou repetir um bloco de código.

**Exemplo em AreaComum.java:**
```java
for (int i = 0; i < equipamentos.size(); i++) {
    if (equipamentos.get(i).getNome().equals(nomeEquipamento)) {
        equipamentos.remove(i);
        return true;
    }
}
```

### for-each (enhanced for)
Utilizado para iterar sobre coleções de forma mais simples.

**Exemplo em AreaComum.java:**
```java
for (Equipamento equipamento : equipamentos) {
    total += equipamento.calcularConsumoDiarioKWh();
}
```

### while
Utilizado para repetir um bloco enquanto uma condição for verdadeira.

**Exemplo em PainelCadastroArea.java:**
```java
while (nome.isEmpty()) {
    JOptionPane.showMessageDialog(this, "O nome da área é obrigatório!", "Erro", JOptionPane.ERROR_MESSAGE);
    return;
}
```

### do-while
Utilizado quando o bloco deve ser executado pelo menos uma vez.

**Exemplo (poderia ser usado em validação de entrada):**
```java
do {
    // Validar entrada do usuário
} while (entradaInvalida);
```

## 2. Arrays e ArrayList

### Array
Estrutura de tamanho fixo para armazenar elementos do mesmo tipo.

**Exemplo em PainelCadastroArea.java:**
```java
String[] tipos = {"Iluminação", "Ar Condicionado", "Computador", "Projetor", "Televisão", "Outro"};
comboTipo = new JComboBox<>(tipos);
```

### ArrayList
Coleção dinâmica que pode crescer conforme necessário.

**Exemplo em AreaComum.java:**
```java
private ArrayList<Equipamento> equipamentos;

public AreaComum() {
    this.equipamentos = new ArrayList<>();
}

public void adicionarEquipamento(Equipamento equipamento) {
    equipamentos.add(equipamento);
}
```

## 3. Classes e Objetos

### Classe
Modelo/template para criar objetos.

**Exemplo - Classe Equipamento:**
```java
public class Equipamento {
    private String nome;
    private double potenciaWatts;
    private int horasUsoDiario;
    private String tipo;
    
    // construtores, métodos, getters e setters
}
```

### Objeto
Instância de uma classe.

**Exemplo em PainelCadastroEquipamento.java:**
```java
Equipamento equipamento = new Equipamento(nome, potencia, horas, tipo);
area.adicionarEquipamento(equipamento);
```

## 4. Encapsulamento

### Private Modifiers
Atributos privados para proteger o estado interno do objeto.

**Exemplo em Equipamento.java:**
```java
private String nome;
private double potenciaWatts;
private int horasUsoDiario;
private String tipo;
```

### Getters e Setters
Métodos públicos para acessar e modificar atributos privados.

**Exemplo em Equipamento.java:**
```java
public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}
```

## 5. Construtores

### Construtor Padrão
Inicializa o objeto com valores padrão.

**Exemplo em Equipamento.java:**
```java
public Equipamento() {
}
```

### Construtor com Parâmetros
Inicializa o objeto com valores específicos.

**Exemplo em Equipamento.java:**
```java
public Equipamento(String nome, double potenciaWatts, int horasUsoDiario, String tipo) {
    this.nome = nome;
    this.potenciaWatts = potenciaWatts;
    this.horasUsoDiario = horasUsoDiario;
    this.tipo = tipo;
}
```

## 6. Métodos

### Métodos com Retorno
Executam uma operação e retornam um valor.

**Exemplo em Equipamento.java:**
```java
public double calcularConsumoDiarioKWh() {
    return (potenciaWatts * horasUsoDiario) / 1000;
}
```

### Métodos void
Executam uma operação sem retornar valor.

**Exemplo em AreaComum.java:**
```java
public void adicionarEquipamento(Equipamento equipamento) {
    equipamentos.add(equipamento);
}
```

### Métodos com Parâmetros
Recebem dados para processar.

**Exemplo em EnergyCalculator.java:**
```java
public String classificarConsumo(double consumoKWh) {
    if (consumoKWh < 10) {
        return "BAIXO";
    }
    // ...
}
```

## 7. Sobrecarga de Métodos

Múltiplos métodos com mesmo nome mas parâmetros diferentes.

**Exemplo em Equipamento.java:**
```java
public Equipamento() {
}

public Equipamento(String nome, double potenciaWatts, int horasUsoDiario, String tipo) {
    this.nome = nome;
    this.potenciaWatts = potenciaWatts;
    this.horasUsoDiario = horasUsoDiario;
    this.tipo = tipo;
}
```

## 8. Tratamento de Exceções

### try-catch
Captura e trata erros em tempo de execução.

**Exemplo em PainelCadastroEquipamento.java:**
```java
try {
    double potencia = Double.parseDouble(potenciaStr);
    int horas = Integer.parseInt(horasStr);
    // processamento...
} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Digite valores numéricos válidos!", "Erro", JOptionPane.ERROR_MESSAGE);
} catch (Exception ex) {
    JOptionPane.showMessageDialog(this, "Erro ao cadastrar: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
}
```

## 9. Herança

### Extensão de Classes
Herança de funcionalidades de classes existentes.

**Exemplo em PrincipalWindow.java:**
```java
public class PrincipalWindow extends JFrame {
    // JFrame é uma classe do Swing que fornece funcionalidades de janela
}
```

**Exemplo em PainelCadastroArea.java:**
```java
public class PainelCadastroArea extends JPanel {
    // JPanel é uma classe do Swing que fornece funcionalidades de painel
}
```

## 10. Interface Gráfica com Swing

### JFrame
Janela principal da aplicação.

**Exemplo em PrincipalWindow.java:**
```java
setTitle("EcoEnergy School - Sistema de Monitoramento de Energia");
setSize(900, 700);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```

### JPanel
Container para componentes da interface.

**Exemplo em PainelCadastroArea.java:**
```java
setLayout(new BorderLayout(10, 10));
setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
```

### JButton
Botão para ações do usuário.

**Exemplo em PainelCadastroArea.java:**
```java
JButton btnCadastrar = new JButton("Cadastrar Área");
btnCadastrar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        cadastrarArea();
    }
});
```

### JTextField
Campo de texto para entrada de dados.

**Exemplo em PainelCadastroArea.java:**
```java
txtNome = new JTextField(20);
```

### JComboBox
Caixa de seleção dropdown.

**Exemplo em PainelCadastroEquipamento.java:**
```java
comboTipo = new JComboBox<>(new String[]{"Iluminação", "Ar Condicionado", "Computador", "Projetor", "Televisão", "Outro"});
```

### JList
Lista de itens selecionáveis.

**Exemplo em PainelCadastroArea.java:**
```java
listModel = new DefaultListModel<>();
listaAreas = new JList<>(listModel);
```

### JTextArea
Área de texto multi-linhas.

**Exemplo em PainelRelatorios.java:**
```java
txtRelatorio = new JTextArea();
txtRelatorio.setEditable(false);
```

### ActionListener
Interface para tratar eventos de clique.

**Exemplo em PainelCadastroArea.java:**
```java
btnCadastrar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        cadastrarArea();
    }
});
```

## 11. Pacotes

Organização de classes em grupos lógicos.

**Estrutura do projeto:**
```
com.ecoenergy.model   - Classes de modelo (Equipamento, AreaComum)
com.ecoenergy.service - Classes de serviço (EnergyCalculator)
com.ecoenergy.view    - Classes de interface (PrincipalWindow, Painéis)
com.ecoenergy.main    - Classe principal
```

## 12. StringBuilder

Classe para manipulação eficiente de strings.

**Exemplo em EnergyCalculator.java:**
```java
StringBuilder relatorio = new StringBuilder();
relatorio.append("=== RELATÓRIO GERAL DE CONSUMO ===\n\n");
relatorio.append("Total de Áreas: ").append(quantidadeAreas()).append("\n");
relatorio.append("Consumo Diário Total: ").append(String.format("%.2f", calcularConsumoTotalDiario())).append(" kWh\n");
return relatorio.toString();
```

## Conclusão

Este projeto demonstra de forma prática os conceitos fundamentais de programação Java, aplicados em um sistema real de monitoramento de energia. Cada conceito é utilizado de forma clara e didática, facilitando o entendimento por alunos iniciantes.
