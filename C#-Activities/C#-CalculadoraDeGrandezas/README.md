#  Calculadora de Grandezas Elétricas

Um projeto em C# que calcula grandezas elétricas (tensão, corrente, resistência e potência) e exibe as cores correspondentes dos resistores de forma visual.

##  Funcionalidades

- ✅ Calcular Tensão (V = R × I)
- ✅ Calcular Corrente (I = V / R)
- ✅ Calcular Resistência (R = V / I)
- ✅ Calcular Potência (P = V × I)
- ✅ Visualizar cores do resistor com cores no terminal

##  Cores do Resistor

O projeto exibe as cores padrão dos resistores:
- **Preto** (0), **Marrom** (1), **Vermelho** (2), **Laranja** (3), **Amarelo** (4)
- **Verde** (5), **Azul** (6), **Violeta** (7), **Cinza** (8), **Branco** (9)
- **Dourado** (Tolerância ±5%)

##  Tecnologias

- **Linguagem**: C#
- **.NET**: .NET Framework / .NET Core
- **IDE**: Visual Studio

##  Como Usar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/C-CalculadoraDeGrandezas.git
   ```

2. Abra o projeto no Visual Studio

3. Compile e execute (F5)

4. Selecione a opção desejada no menu:
   ```
   1 - Calcular Tensão
   2 - Calcular Corrente
   3 - Calcular Resistência
   4 - Calcular Potência
   ```

##  Estrutura do Projeto

```
C#-CalculadoraDeGrandezas/
├── Calculos/
│   ├── CalculoResistencia.cs
│   ├── CalculoTensao.cs
│   ├── CalculoCorrente.cs
│   └── CalculoPotencia.cs
├── Resistor/
│   └── CoresResistor.cs
├── MenuPrincipal/
│   └── Menu.cs
└── Program.cs
```

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se livre para abrir **Issues** ou enviar **Pull Requests**.

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.

## 👨‍💻 Autor

Desenvolvido por Brayan Oliveira - SENAI SISM 2026

---

**Se gostou, deixe uma estrela no repositório!**
