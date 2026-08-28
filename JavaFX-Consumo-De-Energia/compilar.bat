@echo off
REM Configure o caminho do JavaFX SDK abaixo
REM Exemplo: set JAVAFX_PATH=C:\Program Files\Java\javafx-sdk-17\lib
set JAVAFX_PATH=C:\Users\zBray\Desktop\SENAI-SISM2026-ATIVIDADES\JavaFX-Consumo-De-Energia\javafx-sdk-21.0.12\lib

REM Verifica se o caminho foi configurado
if "%JAVAFX_PATH%"=="C:\Users\zBray\Desktop\SENAI-SISM2026-ATIVIDADES\JavaFX-Consumo-De-Energia\javafx-sdk-21.0.12\lib" (
    echo ERRO: Configure o caminho do JavaFX no arquivo compilar.bat
    echo Consulte o arquivo CONFIGURACAO_JAVAFX.md para instrucoes
    pause
    exit /b 1
)

echo Compilando EcoEnergy School JavaFX...
echo JavaFX Path: %JAVAFX_PATH%
mkdir bin
javac -d bin -cp "%JAVAFX_PATH%\*" --module-path "%JAVAFX_PATH%" --add-modules javafx.controls,javafx.fxml src/application/Main.java src/model/Equipamento.java src/controller/DashboardController.java src/controller/CadastroController.java src/controller/EquipamentosController.java src/controller/RelatorioController.java src/controller/SimulacaoController.java
if %errorlevel% equ 0 (
    echo Compilacao concluida com sucesso!
    echo Para executar, use: executar.bat
) else (
    echo Erro na compilacao!
)
pause
