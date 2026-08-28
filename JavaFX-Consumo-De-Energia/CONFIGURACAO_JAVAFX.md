# Configuração do JavaFX

O JavaFX foi removido do JDK principal a partir da versão 11. Para executar este projeto, você precisa configurar o JavaFX separadamente.

## Opção 1: Baixar JavaFX SDK

### 1. Baixar JavaFX SDK
Acesse: https://gluonhq.com/products/javafx/

Baixe a versão compatível com seu Java (Java 17+).

### 2. Extrair e Configurar
Extraia o JavaFX SDK em uma pasta de sua preferência.

### 3. Atualizar Scripts de Compilação

Edite o arquivo `compilar.bat` e substitua `CAMINHO_DO_JAVAFX_LIB` pelo caminho onde você extraiu o JavaFX:

```batch
set JAVAFX_PATH=C:\caminho\para\javafx-sdk\lib
```

Faça o mesmo no arquivo `executar.bat`.

### 4. Compilar e Executar
```bash
compilar.bat
executar.bat
```

## Opção 2: Usar IntelliJ IDEA (Recomendado)

1. Abra o IntelliJ IDEA
2. File -> New -> Project
3. Selecione "Java" e marque "JavaFX"
4. Configure o JavaFX SDK nas configurações do projeto
5. Copie os arquivos do projeto para a estrutura do IntelliJ
6. Execute diretamente pela IDE

## Opção 3: Usar Eclipse com e(fx)clipse

1. Instale o plugin e(fx)clipse no Eclipse
2. Crie um novo JavaFX Project
3. Copie os arquivos do projeto
4. Configure o JavaFX SDK nas propriedades do projeto
5. Execute pela IDE

## Opção 4: Java 8 (Solução Simples)

Se você tiver acesso ao Java 8, ele ainda inclui o JavaFX integrado:

1. Instale Java 8
2. Use o Java 8 para compilar e executar
3. Não precisa de configuração adicional

## Verificação da Versão do Java

Para verificar sua versão do Java:

```bash
java -version
```

Se for Java 11 ou superior, você precisa configurar o JavaFX separadamente.

## Problemas Comuns

### Erro: "package javafx does not exist"
Solução: Verifique se o caminho do JavaFX está correto nos scripts.

### Erro: "JavaFX runtime components are missing"
Solução: Adicione `--module-path` e `--add-modules` ao comando de execução.

### Erro: "class file has wrong version"
Solução: Verifique se a versão do Java compatível com o JavaFX SDK.

## Suporte

Se tiver dificuldades, recomendo usar uma IDE como IntelliJ IDEA com suporte nativo a JavaFX, pois ela configura automaticamente o classpath necessário.
