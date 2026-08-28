@echo off
REM Script para iniciar o frontend React

echo ================================
echo   EcoEnergy - Frontend
echo ================================
echo.

echo Verificando dependencias...
cd frontend

if not exist "node_modules" (
    echo Instalando dependencias...
    call npm install
)

echo.
echo Iniciando frontend na porta 3000...
echo.

call npm run dev

pause
