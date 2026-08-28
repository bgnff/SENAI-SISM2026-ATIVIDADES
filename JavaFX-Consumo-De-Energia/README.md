# EcoEnergy School - Sistema JavaFX

Sistema desktop moderno para monitoramento de consumo de energia elétrica em escolas, desenvolvido com JavaFX, FXML e CSS.

## 🎯 Objetivo

Auxiliar escolas a monitorar o consumo de energia elétrica das áreas comuns e incentivar práticas de TI Verde através de relatórios de economia, consumo e sustentabilidade.

## 🚀 Tecnologias Utilizadas

- **Java 17+**
- **JavaFX** - Interface gráfica moderna
- **FXML** - Estruturação da interface
- **CSS** - Estilização profissional
- **ArrayList** - Armazenamento em memória

## 📁 Estrutura do Projeto

```
src/
├── application/
│   └── Main.java              - Classe principal
├── view/
│   ├── Dashboard.fxml         - Tela inicial
│   ├── Cadastro.fxml          - Cadastro de equipamentos
│   ├── Equipamentos.fxml      - Lista de equipamentos
│   ├── Relatorio.fxml         - Relatórios de consumo
│   └── Simulacao.fxml         - Simulação de economia
├── controller/
│   ├── DashboardController.java
│   ├── CadastroController.java
│   ├── EquipamentosController.java
│   ├── RelatorioController.java
│   └── SimulacaoController.java
├── model/
│   └── Equipamento.java       - Modelo de dados
└── css/
    └── style.css              - Estilos globais
```

## 🎨 Interface

### Características
- ✅ Tema escuro profissional
- ✅ Sidebar fixa à esquerda
- ✅ Cards modernos com efeitos hover
- ✅ Botões arredondados
- ✅ Layout responsivo
- ✅ Ícones emoji para visual amigável

### Cores
- **Background**: #111827
- **Sidebar**: #0F172A
- **Cards**: #1F2937
- **Botões**: #10B981 (Verde)
- **Texto**: #FFFFFF (Branco)

## 📱 Funcionalidades

### 1. Dashboard
- 4 cards com informações principais
- Painel de sugestões automáticas de economia

### 2. Cadastro de Equipamentos
- Formulário para adicionar equipamentos
- Validação de campos
- Combo box com tipos pré-definidos

### 3. Lista de Equipamentos
- Tabela com todos os equipamentos
- Funcionalidade de pesquisa
- Botões para editar e excluir

### 4. Relatórios
- Estatísticas completas de consumo
- Classificação do consumo (Baixo/Moderado/Alto)

### 5. Simulação de Economia
- Configuração do valor do kWh
- Definição do percentual de economia
- Cálculo de economia em kWh e reais

## 💻 Como Executar

### IMPORTANTE: Configuração do JavaFX

O JavaFX foi removido do JDK principal a partir da versão 11. Você precisa configurar o JavaFX separadamente.

#### Passo 1: Baixar JavaFX SDK
Acesse: https://gluonhq.com/products/javafx/
Baixe a versão compatível com seu Java (Java 17+).

#### Passo 2: Configurar Scripts
Edite os arquivos `compilar.bat` e `executar.bat` e substitua `CAMINHO_DO_JAVAFX_LIB` pelo caminho onde você extraiu o JavaFX:

```batch
set JAVAFX_PATH=C:\caminho\para\javafx-sdk\lib
```

#### Passo 3: Compilar e Executar
```bash
compilar.bat
executar.bat
```

## 🧮 Cálculos Utilizados

### Consumo de Energia
```
Consumo (kWh) = (Potência × Horas × Dias × Quantidade) ÷ 1000
```

### Valor do Consumo
```
Valor = Consumo × Valor do kWh
```

### Classificação do Consumo
- **< 50 kWh**: Baixo consumo - Excelente!
- **50 - 150 kWh**: Consumo moderado - Atenção necessária.
- **> 150 kWh**: Alto consumo - Ações urgentes recomendadas.

## 🎓 Conceitos de Programação Demonstrados

### Estruturas de Controle
- ✅ if / else
- ✅ for
- ✅ while
- ✅ do-while

### Estruturas de Dados
- ✅ Arrays
- ✅ ArrayList

### Programação Orientada a Objetos
- ✅ Classes simples
- ✅ Objetos
- ✅ Métodos simples
- ✅ Atributos públicos (sem encapsulamento complexo)

### JavaFX
- ✅ FXML
- ✅ Controllers
- ✅ CSS
- ✅ TableView
- ✅ Eventos

### Outros
- ✅ Tratamento simples de exceções
- ✅ Conversão de tipos
- ✅ Formatação de strings

## 🌱 Sugestões Automáticas

O sistema gera sugestões automáticas baseadas no uso dos equipamentos:
- **Ar Condicionado**: Se uso > 8 horas/dia
- **Iluminação**: Se quantidade > 10 lâmpadas
- **Impressora 3D**: Se uso > 8 horas/dia
- **Computadores**: Se quantidade > 5

## 📝 Notas Acadêmicas

Este projeto foi desenvolvido para fins educacionais, demonstrando:
- Interface moderna com JavaFX
- Conceitos básicos de programação Java
- Boas práticas de organização de código
- Comentários explicativos em cada método

O código foi escrito de forma simples e didática, sem recursos avançados como encapsulamento, herança ou design patterns.

## 🔧 Alternativas de Execução

### IntelliJ IDEA (Recomendado)
1. Crie um novo projeto JavaFX
2. Configure o JavaFX SDK
3. Copie os arquivos do projeto
4. Execute diretamente pela IDE

### Eclipse com e(fx)clipse
1. Instale o plugin e(fx)clipse
2. Crie um projeto JavaFX
3. Configure o JavaFX SDK
4. Copie os arquivos e execute

### Java 8
Se você tiver acesso ao Java 8, ele ainda inclui o JavaFX integrado e não precisa de configuração adicional.

## 📄 Licença

Projeto acadêmico para fins educacionais.
