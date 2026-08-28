@echo off
REM Configure o caminho do JavaFX SDK abaixo (igual ao compilar.bat)
REM Exemplo: set JAVAFX_PATH=C:\Program Files\Java\javafx-sdk-17\lib
set JAVAFX_PATH=C:\Users\zBray\Desktop\SENAI-SISM2026-ATIVIDADES\JavaFX-Consumo-De-Energia\javafx-sdk-21.0.12\lib

REM Verifica se o caminho foi configurado
if "%JAVAFX_PATH%"=="C:\Users\zBray\Desktop\SENAI-SISM2026-ATIVIDADES\JavaFX-Consumo-De-Energia\javafx-sdk-21.0.12\lib" (
    echo ERRO: Configure o caminho do JavaFX no arquivo executar.bat
    echo Consulte o arquivo CONFIGURACAO_JAVAFX.md para instrucoes
    pause
    exit /b 1
)

echo Executando EcoEnergy School JavaFX...
java -cp bin --module-path "%JAVAFX_PATH%" --add-modules javafx.controls,javafx.fxml application.Main
pause
