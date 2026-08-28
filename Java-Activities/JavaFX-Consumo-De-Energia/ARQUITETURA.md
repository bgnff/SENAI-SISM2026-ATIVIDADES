# Arquitetura Atual - EcoEnergy School

## Diagnóstico do Projeto (Fase 0)

### 1. Arquitetura Atual

**Padrão Arquitetural:** FXML + Controller (Model-View-Controller)

**Estrutura de Pacotes:**
```
src/
├── application/
│   └── Main.java              - Classe principal que inicia a aplicação
├── controller/
│   ├── DashboardController.java  - Controller do Dashboard
│   ├── CadastroController.java   - Controller de Cadastro de Equipamentos
│   ├── EquipamentosController.java - Controller de Lista de Equipamentos
│   ├── RelatorioController.java  - Controller de Relatórios
│   └── SimulacaoController.java  - Controller de Simulação de Economia
├── model/
│   └── Equipamento.java         - Modelo de dados de equipamento
├── view/
│   ├── Dashboard.fxml            - Interface do Dashboard
│   ├── Cadastro.fxml             - Interface de Cadastro
│   ├── Equipamentos.fxml         - Interface de Lista de Equipamentos
│   ├── Relatorio.fxml            - Interface de Relatórios
│   └── Simulacao.fxml            - Interface de Simulação
└── css/
    └── style.css                - Estilização global (tema escuro)
```

**Características:**
- ✅ Separação Model/View/Controller
- ✅ Uso de FXML para definição de interface
- ✅ Atributos públicos nos models (sem encapsulamento - projeto acadêmico)
- ✅ JavaFX 21 com tema escuro customizado
- ✅ Navegação por sidebar com menus

### 2. Camada de Persistência Atual

**Tipo:** ArrayList em memória (sem persistência)

**Implementação:**
- `DashboardController.listaEquipamentos` - ArrayList estático compartilhado entre controllers
- `DashboardController.valorKwh` - Variável estática para tarifa de energia
- **Limitação:** Dados são perdidos ao fechar a aplicação
- **Solução necessária:** Implementar persistência em arquivo (JSON/Properties) ou banco local

### 3. Telas Existentes

#### 3.1 Dashboard
**Funcionalidade:**
- 4 cards informativos: Consumo Total, Valor Estimado, Economia Possível, Quantidade de Equipamentos
- Painel de sugestões automáticas baseadas em regras fixas
- Navegação para outras telas via sidebar

**Limitações:**
- Sugestões são regras fixas (if/else), não geradas por IA
- Não há gráficos visuais
- Não há separação por ambientes

#### 3.2 Cadastro de Equipamentos
**Funcionalidade:**
- Formulário com campos: Nome, Tipo, Potência (W), Quantidade, Horas/dia, Dias/mês
- Combo box com tipos pré-definidos
- Validação básica de campos
- Cálculo automático de consumo mensal

**Limitações:**
- Não há vínculo com ambientes
- Tipos são limitados ao combo box pré-definido

#### 3.3 Lista de Equipamentos
**Funcionalidade:**
- TableView com todos os equipamentos
- Pesquisa por nome/tipo
- Botões de edição e exclusão
- Atualização automática da tabela

**Limitações:**
- Não há filtro por ambiente
- Edição apenas mostra informações (não edita realmente)

#### 3.4 Relatórios
**Funcionalidade:**
- Cards com estatísticas: Quantidade, Consumo Total, Valor Total
- Identificação de maior e menor consumidor
- Média de consumo
- Classificação do consumo (Baixo/Moderado/Alto)

**Limitações:**
- Não há gráficos visuais
- Não há separação por ambientes
- Dados são globais, não por ambiente

#### 3.5 Simulação de Economia
**Funcionalidade:**
- Configuração de valor do kWh
- Configuração de percentual de economia
- Cálculo de novo consumo e economia em kWh/reais

**Limitações:**
- Simulação é global, não por ambiente
- Não há histórico de simulações

### 4. Tecnologias Atuais

**Java e JavaFX:**
- Java 21 (javafx-sdk-21.0.12 incluso no projeto)
- JavaFX FXML para interface
- CSS customizado para estilização

**Bibliotecas:**
- Nenhuma biblioteca externa além do JavaFX padrão
- Sem frameworks (Spring, Hibernate, etc.)
- Sem bibliotecas de UI modernas (AtlantaFX, ControlsFX, etc.)

**Construção:**
- Compilação manual via scripts .bat
- Sem Maven/Gradle
- Sem gerenciamento de dependências automatizado

### 5. Bugs e Limitações Conhecidas

**Limitações Funcionais:**
1. ❌ **Sem modelo de Ambiente** - Equipamentos não estão organizados por ambientes (Biblioteca, Cantina, etc.)
2. ❌ **Persistência apenas em memória** - Dados perdidos ao fechar a aplicação
3. ❌ **Sem gráficos visuais** - Apenas cards numéricos, sem gráficos de barras/pizza
4. ❌ **Sugestões fixas** - Regras if/else, não inteligência artificial
5. ❌ **Sem integração externa** - Não há APIs ou serviços externos

**Limitações Técnicas:**
1. ❌ **Sem gerenciador de dependências** - Dificulta adicionar novas bibliotecas
2. ❌ **UI básica** - Sem componentes modernos (AtlantaFX, ControlsFX, TilesFX)
3. ❌ **Sem ícones profissionais** - Usa emojis em vez de ícones vetoriais
4. ❌ **Sem validação avançada** - Validação básica manual

**Funcionalidades Existentes que Funcionam:**
- ✅ Navegação entre telas
- ✅ Cadastro de equipamentos com cálculo de consumo
- ✅ Lista e pesquisa de equipamentos
- ✅ Exclusão de equipamentos
- ✅ Cálculos de consumo e valor
- ✅ Classificação de consumo
- ✅ Simulação básica de economia

### 6. Modelo de Dados Atual

**Equipamento:**
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

**Fórmula de Cálculo:**
```
Consumo (kWh) = (Potência × Horas × Dias × Quantidade) ÷ 1000
```

### 7. Próximos Passos (Segundo Roadmap)

**Fase 1 - Fundação de UI:**
- Adicionar Maven/Gradle para gerenciamento de dependências
- Integrar AtlantaFX, ControlsFX, Ikonli, TilesFX
- Migrar para tema visual profissional
- Implementar design system unificado

**Fase 2 - Cadastro de Ambientes:**
- Criar modelo `Ambiente`
- Implementar CRUD de ambientes
- Adicionar ícones/categorias

**Fase 3 - Equipamentos por Ambiente:**
- Modificar modelo `Equipamento` para incluir FK de ambiente
- Atualizar cadastro para selecionar ambiente
- Filtrar equipamentos por ambiente

**Fase 4 - Dashboard Visual:**
- Adicionar gráficos (BarChart, PieChart)
- Implementar cards via TilesFX
- Separar dados por ambiente

**Fase 5 - Integração IA:**
- Integrar Google Gemini API
- Implementar serviço de sugestões
- Adicionar tela de ideias de economia

**Fase 6 - Polimento:**
- Adicionar persistência em arquivo
- Testar fluxo completo
- Empacotar aplicação

---

**Status:** Projeto funcional básico, pronto para evolução seguindo o roadmap. ✅
