@echo off
echo Compilando EcoEnergy School...
mkdir bin
javac -cp bin -d bin src/main/java/com/ecoenergy/model/Equipamento.java src/main/java/com/ecoenergy/model/AreaComum.java src/main/java/com/ecoenergy/service/EnergyCalculator.java src/main/java/com/ecoenergy/view/PrincipalWindow.java src/main/java/com/ecoenergy/view/PainelCadastroArea.java src/main/java/com/ecoenergy/view/PainelCadastroEquipamento.java src/main/java/com/ecoenergy/view/PainelRelatorios.java src/main/java/com/ecoenergy/view/PainelEconomia.java
if %errorlevel% equ 0 (
    echo Compilacao concluida com sucesso!
    echo Para executar, use: executar.bat
) else (
    echo Erro na compilacao!
)
pause
