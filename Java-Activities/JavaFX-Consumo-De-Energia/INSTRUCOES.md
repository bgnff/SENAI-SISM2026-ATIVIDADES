# 🎉 EcoEnergy School - Nova Versão Web

O sistema foi **completamente migrado** de JavaFX (desktop) para uma **aplicação web moderna** com Spring Boot + React!

## 📋 O que mudou?

### ❌ Removido (JavaFX Antigo)
- Aplicação desktop (.exe)
- JavaFX FXML
- ArrayList em memória (dados perdidos ao fechar)
- HttpClient manual para IA
- Scripts de compilação .bat

### ✅ Novo (Web Moderno)
- Aplicação web (acessível via navegador)
- Spring Boot REST API
- React + Tailwind CSS
- SQLite para persistência de dados
- Spring AI para integração com Gemini
- Build automatizado (Maven + npm)

## 🚀 Como Usar

### Passo 1: Configurar API Key (Opcional, mas recomendado)

Para usar a funcionalidade de IA:

```bash
# Windows
set GEMINI_API_KEY=sua_chave_aqui

# Linux/Mac
export GEMINI_API_KEY=sua_chave_aqui
```

**Obtenha sua chave em:** https://aistudio.google.com

### Passo 2: Instalar Dependências do Frontend

```bash
cd frontend
npm install
```

### Passo 3: Iniciar o Sistema

**Opção A - Script Automático (Recomendado):**
```bash
iniciar-sistema.bat
```

Isso abrirá duas janelas:
- Backend (Spring Boot) na porta 8080
- Frontend (React) na porta 3000

**Opção B - Manual:**

Terminal 1 (Backend):
```bash
cd backend
mvn spring-boot:run
```

Terminal 2 (Frontend):
```bash
cd frontend
npm run dev
```

### Passo 4: Acessar o Sistema

Abra seu navegador em: **http://localhost:3000**

## 📱 Funcionalidades

### 1. Dashboard
- 📊 Métricas em tempo real
- 📈 Gráficos interativos
- 💡 Sugestões automáticas

### 2. Ambientes
- ➕ Cadastro de ambientes
- 🏢 Organização por categorias
- 🎨 Ícones personalizáveis

### 3. Equipamentos
- ⚡ Cadastro de equipamentos
- 🔗 Vinculação com ambientes
- 📊 Cálculo automático de consumo

### 4. Ideias de Economia com IA
- 🤖 Integração com Google Gemini
- 💬 Sugestões personalizadas
- 🎯 Recomendações práticas

## 🗂️ Estrutura do Projeto

```
JavaFX-Consumo-De-Energia/
├── backend/                  # Spring Boot API
│   ├── src/main/java/
│   │   └── com/ecoenergy/
│   │       ├── model/       # JPA Entities
│   │       ├── repository/  # JPA Repositories
│   │       ├── service/     # Business Logic
│   │       └── controller/  # REST Controllers
│   ├── src/main/resources/
│   │   └── application.properties
│   └── pom.xml
├── frontend/                # React App
│   ├── src/
│   │   ├── components/     # React Components
│   │   ├── pages/          # Page Components
│   │   ├── App.jsx
│   │   └── index.css
│   ├── package.json
│   └── vite.config.js
├── iniciar-sistema.bat      # Script principal
├── iniciar-backend.bat     # Script backend
├── iniciar-frontend.bat    # Script frontend
└── README.md
```

## 🔌 API Endpoints

### Ambientes
- `GET /api/ambientes` - Listar todos
- `POST /api/ambientes` - Criar novo
- `PUT /api/ambientes/{id}` - Atualizar
- `DELETE /api/ambientes/{id}` - Deletar

### Equipamentos
- `GET /api/equipamentos` - Listar todos
- `GET /api/equipamentos/ambiente/{id}` - Listar por ambiente
- `POST /api/equipamentos` - Criar novo
- `PUT /api/equipamentos/{id}` - Atualizar
- `DELETE /api/equipamentos/{id}` - Deletar

### Dashboard
- `GET /api/dashboard` - Dados do dashboard
- `GET /api/dashboard/consumo-por-ambiente` - Gráfico por ambiente
- `GET /api/dashboard/consumo-por-tipo` - Gráfico por tipo
- `POST /api/dashboard/sugestao-ia` - Gerar sugestão com IA

## 🗄️ Banco de Dados

O sistema usa **SQLite** automaticamente:
- Arquivo: `backend/ecoenergy.db`
- Criado automaticamente na primeira execução
- Tabelas criadas automaticamente (JPA DDL)

## 🎨 Design

- **Tema**: Dark mode moderno
- **Cores**: Verde primário (#10b981)
- **Framework**: Tailwind CSS
- **Gráficos**: Recharts
- **Ícones**: Lucide React

## ⚠️ Solução de Problemas

### Backend não inicia
- Verifique se Java 21 está instalado: `java -version`
- Verifique se Maven está instalado: `mvn -version`
- Verifique se a porta 8080 está disponível

### Frontend não inicia
- Verifique se Node.js está instalado: `node -version`
- Execute `npm install` no diretório frontend
- Verifique se a porta 3000 está disponível

### IA não funciona
- Verifique se GEMINI_API_KEY está definida
- Teste a chave em https://aistudio.google.com
- Verifique os logs do backend

### Dados não persistem
- Verifique se o arquivo `ecoenergy.db` existe no diretório backend
- Verifique permissões de escrita no diretório

## 📚 Documentação Adicional

Para mais detalhes, consulte o arquivo principal:
```bash
README.md
```

## 🎓 Diferenças da Versão Antiga

| Aspecto | Antigo (JavaFX) | Novo (Web) |
|---------|----------------|------------|
| **Plataforma** | Desktop only | Web (qualquer dispositivo) |
| **Persistência** | Memória (perde dados) | SQLite (persiste) |
| **UI** | JavaFX | React + Tailwind |
| **IA** | HttpClient manual | Spring AI |
| **Build** | Scripts .bat | Maven + npm |
| **Escalabilidade** | Limitada | Alta (REST API) |
| **Manutenção** | Manual | Automatizada |

## 🚀 Próximos Passos

Após testar o sistema, você pode:
1. Configurar a API Key do Gemini para usar IA
2. Adicionar ambientes e equipamentos
3. Explorar os gráficos no Dashboard
4. Gerar sugestões de economia com IA
5. Personalizar o design no Tailwind

---

**Sistema pronto para uso! 🎉**

Acesso: http://localhost:3000
