# EcoEnergy School - Sistema Web de Monitoramento de Energia

Sistema web moderno para monitoramento de consumo de energia elétrica em escolas, desenvolvido com **Spring Boot** (backend) e **React** (frontend).

## 🎯 Tecnologias

### Backend
- **Java 21**
- **Spring Boot 3.2.3**
- **Spring Data JPA** (com SQLite)
- **Spring AI** (integração com Google Gemini)
- **Lombok** (redução de boilerplate)

### Frontend
- **React 18**
- **Vite** (build tool)
- **Tailwind CSS** (estilização)
- **React Router** (navegação)
- **Recharts** (gráficos)
- **Lucide React** (ícones)

## 📁 Estrutura do Projeto

```
JavaFX-Consumo-De-Energia/
├── backend/                    # Spring Boot API
│   ├── src/
│   │   └── main/
│   │       ├── java/com/ecoenergy/
│   │       │   ├── model/       # JPA Entities
│   │       │   ├── repository/  # JPA Repositories
│   │       │   ├── service/     # Business Logic
│   │       │   ├── controller/  # REST Controllers
│   │       │   └── EcoEnergyApplication.java
│   │       └── resources/
│   │           └── application.properties
│   └── pom.xml
├── frontend/                   # React App
│   ├── src/
│   │   ├── components/         # React Components
│   │   ├── pages/              # Page Components
│   │   ├── App.jsx
│   │   ├── main.jsx
│   │   └── index.css
│   ├── index.html
│   ├── package.json
│   ├── vite.config.js
│   └── tailwind.config.js
└── README.md
```

## 🚀 Como Executar

### Pré-requisitos
- Java 21 ou superior
- Node.js 18 ou superior
- Maven (ou use o wrapper)
- GEMINI_API_KEY (opcional, para funcionalidade de IA)

### Backend

```bash
cd backend

# Definir a API Key do Gemini (Windows)
set GEMINI_API_KEY=sua_chave_aqui

# Ou (Linux/Mac)
export GEMINI_API_KEY=sua_chave_aqui

# Executar com Maven
mvn spring-boot:run

# Ou compilar e executar
mvn clean package
java -jar target/ecoenergy-api-1.0.0.jar
```

O backend estará disponível em: `http://localhost:8080`

### Frontend

```bash
cd frontend

# Instalar dependências
npm install

# Executar em modo desenvolvimento
npm run dev

# Build para produção
npm run build
```

O frontend estará disponível em: `http://localhost:3000`

## 📱 Funcionalidades

### 1. Dashboard
- 📊 Cards com métricas principais (consumo, valor, economia)
- 📈 Gráfico de barras: consumo por ambiente
- 🥧 Gráfico de pizza: consumo por tipo de equipamento
- 💡 Sugestões automáticas de economia

### 2. Ambientes
- ➕ Cadastro de ambientes (Biblioteca, Cantina, etc.)
- 🏢 Organização por categorias
- 🗑️ Exclusão de ambientes
- 🎨 Ícones personalizáveis

### 3. Equipamentos
- ⚡ Cadastro de equipamentos
- 🔗 Vinculação com ambientes
- 📊 Cálculo automático de consumo
- 📋 Lista com filtros

### 4. Ideias de Economia com IA
- 🤖 Integração com Google Gemini API
- 💬 Sugestões personalizadas por ambiente
- 🎯 Recomendações práticas e específicas
- ⚡ Respostas em português

## 🔌 API Endpoints

### Ambientes
- `GET /api/ambientes` - Listar todos
- `GET /api/ambientes/{id}` - Buscar por ID
- `POST /api/ambientes` - Criar novo
- `PUT /api/ambientes/{id}` - Atualizar
- `DELETE /api/ambientes/{id}` - Deletar

### Equipamentos
- `GET /api/equipamentos` - Listar todos
- `GET /api/equipamentos/ambiente/{ambienteId}` - Listar por ambiente
- `GET /api/equipamentos/{id}` - Buscar por ID
- `POST /api/equipamentos` - Criar novo
- `PUT /api/equipamentos/{id}` - Atualizar
- `DELETE /api/equipamentos/{id}` - Deletar

### Dashboard
- `GET /api/dashboard` - Dados do dashboard
- `GET /api/dashboard/consumo-por-ambiente` - Consumo por ambiente
- `GET /api/dashboard/consumo-por-tipo` - Consumo por tipo
- `POST /api/dashboard/sugestao-ia` - Gerar sugestão com IA
- `GET /api/dashboard/api-configurada` - Verificar configuração da API

## 🗄️ Banco de Dados

O sistema usa **SQLite** por padrão, criando automaticamente o arquivo `ecoenergy.db` no diretório do backend.

### Estrutura das Tabelas

**ambientes**
- id (PK)
- nome
- descricao
- icone
- categoria
- created_at
- updated_at

**equipamentos**
- id (PK)
- nome
- tipo
- potencia
- quantidade
- horasUso
- diasUso
- consumoMensal (calculado automaticamente)
- ambienteId (FK)
- created_at
- updated_at

## 🎨 Design System

### Cores
- **Primary**: Verde (#10b981)
- **Dark Background**: #111827
- **Card Background**: #1f2937
- **Text**: Branco e cinzas

### Componentes
- Cards com bordas arredondadas
- Botões com hover effects
- Gráficos interativos
- Sidebar fixa à esquerda
- Responsivo para mobile

## 🔧 Configuração

### application.properties

```properties
# Porta do servidor
server.port=8080

# Database (SQLite)
spring.datasource.url=jdbc:sqlite:ecoenergy.db

# Valor do kWh (pode ser alterado)
# Atualmente definido no código: 0.90

# Spring AI (Gemini)
spring.ai.openai.api-key=${GEMINI_API_KEY}
spring.ai.openai.base-url=https://generativelanguage.googleapis.com/v1beta
spring.ai.openai.chat.options.model=gemini-2.5-flash
```

## 🧮 Cálculos

### Consumo de Energia
```
Consumo (kWh) = (Potência × Horas × Dias × Quantidade) ÷ 1000
```

### Valor do Consumo
```
Valor = Consumo × 0.90 (R$/kWh)
```

### Economia Possível
```
Economia = Consumo × 0.20 (20%)
```

## 📝 Diferenças da Versão JavaFX

| Aspecto | JavaFX | Web (Nova) |
|---------|--------|------------|
| **Plataforma** | Desktop (.exe) | Web (navegador) |
| **Persistência** | ArrayList (memória) | SQLite (arquivo) |
| **IA** | HttpClient manual | Spring AI |
| **UI** | JavaFX | React + Tailwind |
| **Build** | Scripts .bat | Maven + npm |
| **Acessibilidade** | Local | Qualquer dispositivo |
| **Escalabilidade** | Limitada | Alta (REST API) |

## 🚀 Próximas Melhorias

- [ ] Autenticação de usuários
- [ ] Exportação de relatórios (PDF/Excel)
- [ ] Histórico de consumo ao longo do tempo
- [ ] Alertas de consumo excessivo
- [ ] Integração com sensores IoT
- [ ] Deploy em nuvem (AWS/DigitalOcean)
- [ ] Testes automatizados
- [ ] Docker para containerização

## 📄 Licença

Projeto acadêmico para fins educacionais.

## 👨‍💻 Desenvolvido com

- Spring Boot
- React
- Google Gemini AI
- 💚 e muito café
