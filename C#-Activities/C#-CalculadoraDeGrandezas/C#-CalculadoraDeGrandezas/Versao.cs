namespace C__CalculadoraDeGrandezas
{
    /// <summary>
    /// Informações de versão da aplicação
    /// </summary>
    internal static class Versao
    {
        /// <summary>
        /// Versão atual da aplicação
        /// </summary>
        public const string VERSAO_ATUAL = "1.0.0";

        /// <summary>
        /// Nome da aplicação
        /// </summary>
        public const string NOME_APLICACAO = "Calculadora de Grandezas Elétricas";

        /// <summary>
        /// Autor/Instituição
        /// </summary>
        public const string AUTOR = "SENAI SISM 2026";

        /// <summary>
        /// Ano de lançamento
        /// </summary>
        public const int ANO_LANCAMENTO = 2026;

        /// <summary>
        /// Retorna a versão completa da aplicação
        /// </summary>
        public static string ObterVersaoCompleta()
        {
            return $"{NOME_APLICACAO} v{VERSAO_ATUAL}";
        }

        /// <summary>
        /// Retorna as informações de versão formatadas
        /// </summary>
        public static string ObterInformacoes()
        {
            return $"{NOME_APLICACAO} v{VERSAO_ATUAL}\nAutor: {AUTOR}\nAno: {ANO_LANCAMENTO}";
        }
    }
}
