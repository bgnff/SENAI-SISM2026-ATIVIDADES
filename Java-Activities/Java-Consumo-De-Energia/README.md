# EcoEnergy School

Sistema desktop para monitoramento de consumo de energia elétrica em escolas, desenvolvido em Java com Swing.

## Objetivo

Auxiliar escolas a monitorar o consumo de energia elétrica das áreas comuns e incentivar práticas de TI Verde através de relatórios de economia, consumo e sustentabilidade.

## Tecnologias Utilizadas

- Java 17+
- Java Swing (Interface Gráfica)
- Programação Orientada a Objetos
- Armazenamento em memória (ArrayList)

## Estrutura do Projeto

```
src/main/java/com/ecoenergy/
├── main/
│   └── PrincipalWindow.java (Classe principal com main)
├── model/
│   ├── Equipamento.java (Modelo de equipamento)
│   └── AreaComum.java (Modelo de área comum)
├── service/
│   └── EnergyCalculator.java (Lógica de cálculos)
└── view/
    ├── PrincipalWindow.java (Janela principal)
    ├── PainelCadastroArea.java (Cadastro de áreas)
    ├── PainelCadastroEquipamento.java (Cadastro de equipamentos)
    ├── PainelRelatorios.java (Relatórios de consumo)
    └── PainelEconomia.java (Simulação de economia)
```

## Conceitos de Programação Demonstrados

- Estruturas de controle: if, else, switch, while, do-while, for
- Arrays e ArrayList
- Classes e objetos
- Encapsulamento (getters e setters)
- Construtores
- Métodos
- Tratamento de exceções
- Herança (JFrame, JPanel)
- Interface gráfica com Swing

## Como Compilar e Executar

### Compilação

```bash
javac -d bin src/main/java/com/ecoenergy/**/*.java
```

### Execução

```bash
java -cp bin com.ecoenergy.view.PrincipalWindow
```

Ou usando o método main da PrincipalWindow:

```bash
java -cp bin com.ecoenergy.view.PrincipalWindow
```

## Funcionalidades

### 1. Cadastro de Áreas Comuns
- Cadastro de áreas como: Sala de Aula, Laboratório, Biblioteca, etc.
- Descrição opcional para cada área
- Listagem e remoção de áreas

### 2. Cadastro de Equipamentos
- Cadastro de equipamentos por área
- Informações: nome, potência (Watts), horas de uso diário, tipo
- Tipos pré-definidos: Iluminação, Ar Condicionado, Computador, Projetor, Televisão, Outro
- Listagem e remoção de equipamentos

### 3. Relatórios
- Relatório Geral: consumo total da escola, custos, classificação de sustentabilidade
- Relatório por Área: detalhamento do consumo de cada área e seus equipamentos

### 4. Simulação de Economia
- Cálculo de economia potencial reduzindo horas de uso
- Estimativa de economia financeira mensal e anual
- Impacto ambiental (redução de CO2)
- Dicas de TI Verde

## Cálculos Realizados

- Consumo Diário (kWh) = (Potência em Watts × Horas de Uso) / 1000
- Consumo Mensal (kWh) = Consumo Diário × 30
- Custo Mensal = Consumo Mensal × Preço do kWh (R$ 0,75)
- Custo Anual = Custo Mensal × 12

## Classificação de Consumo

- BAIXO: < 10 kWh
- MÉDIO: 10 - 50 kWh
- ALTO: 50 - 100 kWh
- MUITO ALTO: > 100 kWh

## Notas Acadêmicas

Este projeto foi desenvolvido para fins educacionais, demonstrando conceitos básicos de programação Java e desenvolvimento de interfaces gráficas. O sistema opera totalmente offline, sem necessidade de banco de dados ou conexões externas.

## Autor

Projeto acadêmico para disciplina de programação Java.
