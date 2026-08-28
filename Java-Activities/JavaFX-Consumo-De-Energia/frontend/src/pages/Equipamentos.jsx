import { useEffect, useState } from 'react'
import { Plus, Trash2, Zap } from 'lucide-react'

function Equipamentos() {
  const [equipamentos, setEquipamentos] = useState([])
  const [ambientes, setAmbientes] = useState([])
  const [showForm, setShowForm] = useState(false)
  const [formData, setFormData] = useState({
    nome: '',
    tipo: '',
    potencia: '',
    quantidade: '',
    horasUso: '',
    diasUso: '',
    ambienteId: ''
  })
  const [loading, setLoading] = useState(true)

  const tiposEquipamento = [
    'Ar Condicionado',
    'Iluminação',
    'Computador',
    'Impressora 3D',
    'Projetor',
    'Ventilador',
    'Outro'
  ]

  useEffect(() => {
    fetchData()
  }, [])

  const fetchData = async () => {
    try {
      const [eqRes, ambRes] = await Promise.all([
        fetch('/api/equipamentos'),
        fetch('/api/ambientes')
      ])
      setEquipamentos(await eqRes.json())
      setAmbientes(await ambRes.json())
    } catch (error) {
      console.error('Erro ao carregar dados:', error)
    } finally {
      setLoading(false)
    }
  }

  const handleSubmit = async (e) => {
    e.preventDefault()
    try {
      const response = await fetch('/api/equipamentos', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({
          ...formData,
          potencia: parseFloat(formData.potencia),
          quantidade: parseInt(formData.quantidade),
          horasUso: parseInt(formData.horasUso),
          diasUso: parseInt(formData.diasUso),
          ambienteId: formData.ambienteId ? parseInt(formData.ambienteId) : null
        })
      })
      
      if (response.ok) {
        setShowForm(false)
        setFormData({
          nome: '', tipo: '', potencia: '', quantidade: '',
          horasUso: '', diasUso: '', ambienteId: ''
        })
        fetchData()
      }
    } catch (error) {
      console.error('Erro ao criar equipamento:', error)
    }
  }

  const handleDelete = async (id) => {
    if (!confirm('Tem certeza que deseja excluir este equipamento?')) return
    
    try {
      await fetch(`/api/equipamentos/${id}`, { method: 'DELETE' })
      fetchData()
    } catch (error) {
      console.error('Erro ao excluir equipamento:', error)
    }
  }

  if (loading) {
    return <div className="flex items-center justify-center h-full">
      <div className="animate-spin rounded-full h-12 w-12 border-b-2 border-primary-500"></div>
    </div>
  }

  return (
    <div className="space-y-6">
      <div className="flex items-center justify-between">
        <div>
          <h1 className="text-3xl font-bold text-white mb-2">Equipamentos</h1>
          <p className="text-gray-400">Gerencie os equipamentos da escola</p>
        </div>
        <button
          onClick={() => setShowForm(true)}
          className="btn-primary flex items-center gap-2"
        >
          <Plus className="w-5 h-5" />
          Novo Equipamento
        </button>
      </div>

      {showForm && (
        <div className="card">
          <h3 className="text-lg font-semibold text-white mb-4">Novo Equipamento</h3>
          <form onSubmit={handleSubmit} className="space-y-4">
            <div className="grid grid-cols-2 gap-4">
              <div>
                <label className="block text-sm font-medium text-gray-300 mb-2">Nome</label>
                <input
                  type="text"
                  value={formData.nome}
                  onChange={(e) => setFormData({ ...formData, nome: e.target.value })}
                  className="input-field"
                  placeholder="Ex: Ar Condicionado Sala 1"
                  required
                />
              </div>
              <div>
                <label className="block text-sm font-medium text-gray-300 mb-2">Tipo</label>
                <select
                  value={formData.tipo}
                  onChange={(e) => setFormData({ ...formData, tipo: e.target.value })}
                  className="input-field"
                  required
                >
                  <option value="">Selecione...</option>
                  {tiposEquipamento.map(tipo => (
                    <option key={tipo} value={tipo}>{tipo}</option>
                  ))}
                </select>
              </div>
            </div>
            
            <div className="grid grid-cols-2 gap-4">
              <div>
                <label className="block text-sm font-medium text-gray-300 mb-2">Potência (W)</label>
                <input
                  type="number"
                  value={formData.potencia}
                  onChange={(e) => setFormData({ ...formData, potencia: e.target.value })}
                  className="input-field"
                  placeholder="Ex: 1200"
                  required
                />
              </div>
              <div>
                <label className="block text-sm font-medium text-gray-300 mb-2">Quantidade</label>
                <input
                  type="number"
                  value={formData.quantidade}
                  onChange={(e) => setFormData({ ...formData, quantidade: e.target.value })}
                  className="input-field"
                  placeholder="Ex: 2"
                  required
                />
              </div>
            </div>

            <div className="grid grid-cols-2 gap-4">
              <div>
                <label className="block text-sm font-medium text-gray-300 mb-2">Horas de Uso/dia</label>
                <input
                  type="number"
                  value={formData.horasUso}
                  onChange={(e) => setFormData({ ...formData, horasUso: e.target.value })}
                  className="input-field"
                  placeholder="Ex: 8"
                  required
                />
              </div>
              <div>
                <label className="block text-sm font-medium text-gray-300 mb-2">Dias de Uso/mês</label>
                <input
                  type="number"
                  value={formData.diasUso}
                  onChange={(e) => setFormData({ ...formData, diasUso: e.target.value })}
                  className="input-field"
                  placeholder="Ex: 22"
                  required
                />
              </div>
            </div>

            <div>
              <label className="block text-sm font-medium text-gray-300 mb-2">Ambiente</label>
              <select
                value={formData.ambienteId}
                onChange={(e) => setFormData({ ...formData, ambienteId: e.target.value })}
                className="input-field"
              >
                <option value="">Selecione um ambiente (opcional)</option>
                {ambientes.map(amb => (
                  <option key={amb.id} value={amb.id}>{amb.nome}</option>
                ))}
              </select>
            </div>

            <div className="flex gap-3">
              <button type="submit" className="btn-primary">Salvar</button>
              <button
                type="button"
                onClick={() => setShowForm(false)}
                className="btn-secondary"
              >
                Cancelar
              </button>
            </div>
          </form>
        </div>
      )}

      <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6">
        {equipamentos.map((eq) => {
          const ambiente = ambientes.find(a => a.id === eq.ambienteId)
          return (
            <div key={eq.id} className="card hover:border-primary-500 transition-colors">
              <div className="flex items-start justify-between mb-4">
                <div className="flex items-center gap-3">
                  <div className="p-3 bg-primary-500/20 rounded-lg">
                    <Zap className="w-6 h-6 text-primary-500" />
                  </div>
                  <div>
                    <h3 className="text-lg font-semibold text-white">{eq.nome}</h3>
                    <p className="text-sm text-gray-400">{eq.tipo}</p>
                  </div>
                </div>
                <button
                  onClick={() => handleDelete(eq.id)}
                  className="text-gray-400 hover:text-red-500 transition-colors"
                >
                  <Trash2 className="w-5 h-5" />
                </button>
              </div>
              
              <div className="space-y-2 text-sm">
                <div className="flex justify-between">
                  <span className="text-gray-400">Potência:</span>
                  <span className="text-white">{eq.potencia}W</span>
                </div>
                <div className="flex justify-between">
                  <span className="text-gray-400">Quantidade:</span>
                  <span className="text-white">{eq.quantidade}</span>
                </div>
                <div className="flex justify-between">
                  <span className="text-gray-400">Uso:</span>
                  <span className="text-white">{eq.horasUso}h/dia</span>
                </div>
                <div className="flex justify-between">
                  <span className="text-gray-400">Consumo:</span>
                  <span className="text-primary-500 font-semibold">
                    {eq.consumoMensal?.toFixed(2)} kWh
                  </span>
                </div>
                {ambiente && (
                  <div className="flex justify-between pt-2 border-t border-dark-700">
                    <span className="text-gray-400">Ambiente:</span>
                    <span className="text-white">{ambiente.nome}</span>
                  </div>
                )}
              </div>
            </div>
          )
        })}
      </div>

      {equipamentos.length === 0 && (
        <div className="card text-center py-12">
          <p className="text-gray-400">Nenhum equipamento cadastrado</p>
          <button
            onClick={() => setShowForm(true)}
            className="btn-primary mt-4"
          >
            Criar Primeiro Equipamento
          </button>
        </div>
      )}
    </div>
  )
}

export default Equipamentos
