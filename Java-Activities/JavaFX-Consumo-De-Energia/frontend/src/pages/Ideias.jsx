import { useEffect, useState } from 'react'
import { Sparkles, Loader2, AlertCircle } from 'lucide-react'

function Ideias() {
  const [ambientes, setAmbientes] = useState([])
  const [selectedAmbiente, setSelectedAmbiente] = useState('')
  const [sugestao, setSugestao] = useState('')
  const [loading, setLoading] = useState(false)
  const [apiConfigurada, setApiConfigurada] = useState(true)

  useEffect(() => {
    fetchAmbientes()
    checkApiConfigurada()
  }, [])

  const fetchAmbientes = async () => {
    try {
      const response = await fetch('/api/ambientes')
      const data = await response.json()
      setAmbientes(data)
    } catch (error) {
      console.error('Erro ao carregar ambientes:', error)
    }
  }

  const checkApiConfigurada = async () => {
    try {
      const response = await fetch('/api/dashboard/api-configurada')
      const data = await response.json()
      setApiConfigurada(data)
    } catch (error) {
      console.error('Erro ao verificar API:', error)
    }
  }

  const gerarSugestao = async () => {
    if (!selectedAmbiente) {
      alert('Selecione um ambiente primeiro')
      return
    }

    setLoading(true)
    setSugestao('')

    try {
      const response = await fetch('/api/dashboard/sugestao-ia', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ ambienteId: parseInt(selectedAmbiente) })
      })

      const data = await response.text()
      setSugestao(data)
    } catch (error) {
      setSugestao('Erro ao gerar sugestão. Tente novamente.')
    } finally {
      setLoading(false)
    }
  }

  return (
    <div className="space-y-6">
      <div>
        <h1 className="text-3xl font-bold text-white mb-2">Ideias de Economia com IA</h1>
        <p className="text-gray-400">Sugestões personalizadas usando inteligência artificial</p>
      </div>

      {!apiConfigurada && (
        <div className="card border-yellow-500 bg-yellow-500/10">
          <div className="flex items-start gap-3">
            <AlertCircle className="w-6 h-6 text-yellow-500 flex-shrink-0 mt-0.5" />
            <div>
              <h3 className="text-lg font-semibold text-yellow-500 mb-2">API Não Configurada</h3>
              <p className="text-gray-300 text-sm mb-3">
                Para usar esta funcionalidade, configure a variável de ambiente GEMINI_API_KEY no backend.
              </p>
              <p className="text-gray-400 text-xs">
                1. Acesse https://aistudio.google.com<br />
                2. Crie uma API Key gratuita<br />
                3. Defina GEMINI_API_KEY=sua_chave_aqui
              </p>
            </div>
          </div>
        </div>
      )}

      <div className="card">
        <div className="space-y-4">
          <div>
            <label className="block text-sm font-medium text-gray-300 mb-2">Selecione o Ambiente</label>
            <select
              value={selectedAmbiente}
              onChange={(e) => setSelectedAmbiente(e.target.value)}
              className="input-field"
              disabled={!apiConfigurada}
            >
              <option value="">Selecione um ambiente...</option>
              {ambientes.map(amb => (
                <option key={amb.id} value={amb.id}>{amb.nome}</option>
              ))}
            </select>
          </div>

          <button
            onClick={gerarSugestao}
            disabled={!apiConfigurada || !selectedAmbiente || loading}
            className="btn-primary w-full flex items-center justify-center gap-2"
          >
            {loading ? (
              <>
                <Loader2 className="w-5 h-5 animate-spin" />
                Gerando sugestão...
              </>
            ) : (
              <>
                <Sparkles className="w-5 h-5" />
                Gerar Ideia com IA
              </>
            )}
          </button>
        </div>
      </div>

      {sugestao && (
        <div className="card">
          <div className="flex items-start gap-3">
            <div className="p-3 bg-primary-500/20 rounded-lg">
              <Sparkles className="w-6 h-6 text-primary-500" />
            </div>
            <div className="flex-1">
              <h3 className="text-lg font-semibold text-white mb-2">Sugestão da IA</h3>
              <p className="text-gray-300 leading-relaxed whitespace-pre-wrap">
                {sugestao}
              </p>
            </div>
          </div>
        </div>
      )}

      {ambientes.length === 0 && (
        <div className="card text-center py-12">
          <p className="text-gray-400">Cadastre ambientes primeiro para gerar sugestões</p>
        </div>
      )}
    </div>
  )
}

export default Ideias
