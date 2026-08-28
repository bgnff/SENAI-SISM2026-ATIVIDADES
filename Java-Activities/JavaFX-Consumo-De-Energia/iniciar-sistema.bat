@echo off
REM Script principal para iniciar o sistema EcoEnergy

echo ================================
echo   EcoEnergy School - Sistema Web
echo ================================
echo.
echo Este script iniciara:
echo   1. Backend Spring Boot (porta 8080)
echo   2. Frontend React (porta 3000)
echo.
echo Pressione Ctrl+C para parar
echo.
echo ================================
echo.

REM Verificar GEMINI_API_KEY
if "%GEMINI_API_KEY%"=="" (
    echo AVISO: GEMINI_API_KEY nao esta definida
    echo A funcionalidade de IA nao funcionara sem ela
    echo.
    echo Para configurar:
    echo set GEMINI_API_KEY=sua_chave_aqui
    echo.
    pause
)

REM Iniciar backend em nova janela
echo Iniciando Backend...
start "EcoEnergy Backend" cmd /k "cd backend && mvn spring-boot:run"

REM Aguardar alguns segundos para o backend iniciar
timeout /t 10 /nobreak > nul

REM Iniciar frontend em nova janela
echo Iniciando Frontend...
start "EcoEnergy Frontend" cmd /k "cd frontend && npm run dev"

echo.
echo ================================
echo Sistema iniciado!
echo.
echo Backend: http://localhost:8080
echo Frontend: http://localhost:3000
echo.
echo Pressione qualquer tecla para fechar esta janela
echo (as janelas do backend e frontend continuaram abertas)
echo ================================
pause
