@echo off
REM Script para iniciar o backend Spring Boot

echo ================================
echo   EcoEnergy - Backend
echo ================================
echo.

REM Verificar se GEMINI_API_KEY está definida
if "%GEMINI_API_KEY%"=="" (
    echo AVISO: GEMINI_API_KEY nao esta definida
    echo A funcionalidade de IA nao funcionara sem ela
    echo.
    echo Para configurar:
    echo set GEMINI_API_KEY=sua_chave_aqui
    echo.
    pause
)

echo Iniciando backend na porta 8080...
echo.

cd backend
mvn spring-boot:run

pause
