# Conceitos de Programação Java Demonstrados

Este documento explica os conceitos de programação Java utilizados no projeto EcoEnergy School, focado em estudantes iniciantes.

## 1. Estruturas de Controle

### if / else
Usado para tomar decisões baseadas em condições.

**Exemplo em CadastroController.java:**
```java
if (nome.isEmpty() || tipo == null || potenciaStr.isEmpty()) {
    mostrarAlerta("Erro", "Por favor, preencha todos os campos!");
    return;
}
```

**Exemplo em RelatorioController.java:**
```java
if (consumoTotal < 50) {
    classificacao = "✅ Baixo consumo - Excelente!";
} else if (consumoTotal >= 50 && consumoTotal <= 150) {
    classificacao = "⚠️ Consumo moderado - Atenção necessária.";
} else {
    classificacao = "🔴 Alto consumo - Ações urgentes recomendadas.";
}
```

### for
Usado para repetir um bloco de código um número determinado de vezes.

**Exemplo em DashboardController.java:**
```java
for (int i = 0; i < listaEquipamentos.size(); i++) {
    consumoTotal = consumoTotal + listaEquipamentos.get(i).consumoMensal;
}
```

### while
Usado para repetir enquanto uma condição for verdadeira.

**Exemplo (poderia ser usado em validação):**
```java
while (entradaInvalida) {
    // Pedir nova entrada
}
```

### do-while
Usado quando o bloco deve ser executado pelo menos uma vez.

**Exemplo (poderia ser usado em menu):**
```java
do {
    // Mostrar menu
    // Ler opção
} while (opcao != 0);
```

### switch
Usado para seleção múltipla (não usado extensivamente neste projeto, mas disponível).

**Exemplo:**
```java
switch (opcao) {
    case 1:
        // ação 1
        break;
    case 2:
        // ação 2
        break;
    default:
        // ação padrão
}
```

## 2. Estruturas de Dados

### ArrayList
Lista dinâmica que pode crescer conforme necessário.

**Exemplo em DashboardController.java:**
```java
public static ArrayList<Equipamento> listaEquipamentos = new ArrayList<>();

// Adicionar elemento
listaEquipamentos.add(equipamento);

// Percorrer lista
for (int i = 0; i < listaEquipamentos.size(); i++) {
    Equipamento eq = listaEquipamentos.get(i);
}

// Remover elemento
listaEquipamentos.remove(equipamento);
```

### Arrays
Estrutura de tamanho fixo (usado internamente pelo ArrayList).

**Exemplo:**
```java
String[] tipos = {"Ar Condicionado", "Iluminação", "Computador"};
```

## 3. Classes e Objetos

### Classe
Modelo/template para criar objetos.

**Exemplo em Equipamento.java:**
```java
public class Equipamento {
    public String nome;
    public String tipo;
    public double potencia;
    public int quantidade;
    public int horasUso;
    public int diasUso;
    public double consumoMensal;
}
```

### Objeto
Instância de uma classe.

**Exemplo em CadastroController.java:**
```java
Equipamento eq = new Equipamento(nome, tipo, potencia, quantidade, horas, dias);
DashboardController.listaEquipamentos.add(eq);
```

## 4. Métodos

### Métodos com retorno
Executam uma operação e retornam um valor.

**Exemplo em Equipamento.java:**
```java
public double calcularConsumo() {
    double resultado = (potencia * horasUso * diasUso * quantidade) / 1000;
    this.consumoMensal = resultado;
    return resultado;
}
```

### Métodos void
Executam uma operação sem retornar valor.

**Exemplo em CadastroController.java:**
```java
public void limparCampos() {
    txtNome.setText("");
    comboTipo.setValue(null);
    txtPotencia.setText("");
}
```

### Métodos com parâmetros
Recebem dados para processar.

**Exemplo em DashboardController.java:**
```java
public void adicionarSugestao(String texto) {
    Label sugestao = new Label("• " + texto);
    sugestoesContainer.getChildren().add(sugestao);
}
```

## 5. Variáveis e Operadores

### Declaração de variáveis
```java
String nome = "Ar Condicionado";
double potencia = 1200.0;
int quantidade = 2;
boolean ativo = true;
```

### Operadores matemáticos
```java
double soma = valor1 + valor2;
double subtracao = valor1 - valor2;
double multiplicacao = valor1 * valor2;
double divisao = valor1 / valor2;
double resto = valor1 % valor2;
```

### Operadores de comparação
```java
if (valor1 > valor2) { }
if (valor1 >= valor2) { }
if (valor1 < valor2) { }
if (valor1 <= valor2) { }
if (valor1 == valor2) { }
if (valor1 != valor2) { }
```

### Operadores lógicos
```java
if (condicao1 && condicao2) { }  // E
if (condicao1 || condicao2) { }  // OU
if (!condicao) { }                // NÃO
```

## 6. Tratamento de Exceções

### try-catch
Captura e trata erros em tempo de execução.

**Exemplo em CadastroController.java:**
```java
try {
    double potencia = Double.parseDouble(potenciaStr);
    int quantidade = Integer.parseInt(quantidadeStr);
    // processamento...
} catch (NumberFormatException e) {
    mostrarAlerta("Erro", "Por favor, digite valores numéricos válidos!");
}
```

## 7. Conversão de Tipos

### String para número
```java
String texto = "123";
int numero = Integer.parseInt(texto);
double decimal = Double.parseDouble(texto);
```

### Número para String
```java
int numero = 123;
String texto = String.valueOf(numero);
```

### Formatação de números
```java
double valor = 1234.5678;
String formatado = String.format("%.2f", valor);  // "1234.57"
```

## 8. JavaFX Básico

### FXML
Arquivo XML que define a estrutura da interface.

**Exemplo em Dashboard.fxml:**
```xml
<Label fx:id="lblConsumoTotal" text="0 kWh" styleClass="card-value"/>
```

### Controller
Classe Java que controla a lógica da interface.

**Exemplo em DashboardController.java:**
```java
@FXML
private Label lblConsumoTotal;

@FXML
public void initialize(URL location, ResourceBundle resources) {
    atualizarDashboard();
}
```

### Eventos
Ações do usuário (cliques, digitação, etc.).

**Exemplo em CadastroController.java:**
```java
@FXML
public void adicionarEquipamento() {
    // lógica ao clicar no botão
}
```

## 9. Cálculos do Sistema

### Fórmula de Consumo
```java
// Consumo (kWh) = (Potência × Horas × Dias × Quantidade) ÷ 1000
double consumo = (potencia * horasUso * diasUso * quantidade) / 1000;
```

### Fórmula de Valor
```java
// Valor = Consumo × Valor do kWh
double valor = consumo * valorKwh;
```

### Cálculo de Economia
```java
// Economia = Consumo × (Percentual / 100)
double economia = consumoTotal * (percentual / 100);
```

## 10. Strings

### Concatenação
```java
String nome = "Ar " + "Condicionado";
String mensagem = "Consumo: " + consumo + " kWh";
```

### Comprimento
```java
String texto = "Hello";
int tamanho = texto.length();  // 5
```

### Comparação
```java
if (texto1.equals(texto2)) { }
```

### Conversão para maiúsculo/minúsculo
```java
String maiusculo = texto.toUpperCase();
String minusculo = texto.toLowerCase();
```

## 11. Comentários

### Comentário de linha única
```java
// Este é um comentário
double valor = 10.0;  // Valor em reais
```

### Comentário de múltiplas linhas
```java
/*
 * Este é um comentário
 * de múltiplas linhas
 */
```

### Comentário de documentação
```java
/**
 * Método para calcular o consumo de energia
 * @return consumo em kWh
 */
public double calcularConsumo() {
    // implementação
}
```

## 12. Boas Práticas

### Nomes de variáveis claros
```java
// Bom
double consumoMensalTotal;
int quantidadeDeEquipamentos;

// Ruim
double x;
int n;
```

### Indentação correta
```java
if (condicao) {
    // código indentado
    if (outraCondicao) {
        // código mais indentado
    }
}
```

### Métodos pequenos e focados
```java
// Bom
public void calcularConsumo() {
    // focado em uma tarefa
}

// Ruim
public void fazerTudo() {
    // muitas responsabilidades
}
```

## Conclusão

Este projeto demonstra de forma prática os conceitos fundamentais de programação Java, aplicados em um sistema real de monitoramento de energia. Cada conceito é utilizado de forma clara e didática, facilitando o entendimento por alunos iniciantes.

O código foi escrito seguindo princípios de simplicidade, sem recursos avançados como encapsulamento, herança ou design patterns, tornando-o perfeito para fins educacionais.
