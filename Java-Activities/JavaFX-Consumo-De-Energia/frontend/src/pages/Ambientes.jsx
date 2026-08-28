import { useEffect, useState } from 'react'
import { Plus, Trash2, Edit2 } from 'lucide-react'

function Ambientes() {
  const [ambientes, setAmbientes] = useState([])
  const [showForm, setShowForm] = useState(false)
  const [formData, setFormData] = useState({
    nome: '',
    descricao: '',
    icone: '🏢',
    categoria: 'Geral'
  })
  const [loading, setLoading] = useState(true)

  useEffect(() => {
    fetchAmbientes()
  }, [])

  const fetchAmbientes = async () => {
    try {
      const response = await fetch('/api/ambientes')
      const data = await response.json()
      setAmbientes(data)
    } catch (error) {
      console.error('Erro ao carregar ambientes:', error)
    } finally {
      setLoading(false)
    }
  }

  const handleSubmit = async (e) => {
    e.preventDefault()
    try {
      const response = await fetch('/api/ambientes', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(formData)
      })
      
      if (response.ok) {
        setShowForm(false)
        setFormData({ nome: '', descricao: '', icone: '🏢', categoria: 'Geral' })
        fetchAmbientes()
      }
    } catch (error) {
      console.error('Erro ao criar ambiente:', error)
    }
  }

  const handleDelete = async (id) => {
    if (!confirm('Tem certeza que deseja excluir este ambiente?')) return
    
    try {
      await fetch(`/api/ambientes/${id}`, { method: 'DELETE' })
      fetchAmbientes()
    } catch (error) {
      console.error('Erro ao excluir ambiente:', error)
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
          <h1 className="text-3xl font-bold text-white mb-2">Ambientes</h1>
          <p className="text-gray-400">Gerencie os ambientes da escola</p>
        </div>
        <button
          onClick={() => setShowForm(true)}
          className="btn-primary flex items-center gap-2"
        >
          <Plus className="w-5 h-5" />
          Novo Ambiente
        </button>
      </div>

      {showForm && (
        <div className="card">
          <h3 className="text-lg font-semibold text-white mb-4">Novo Ambiente</h3>
          <form onSubmit={handleSubmit} className="space-y-4">
            <div>
              <label className="block text-sm font-medium text-gray-300 mb-2">Nome</label>
              <input
                type="text"
                value={formData.nome}
                onChange={(e) => setFormData({ ...formData, nome: e.target.value })}
                className="input-field"
                placeholder="Ex: Biblioteca"
                required
              />
            </div>
            <div>
              <label className="block text-sm font-medium text-gray-300 mb-2">Descrição</label>
              <input
                type="text"
                value={formData.descricao}
                onChange={(e) => setFormData({ ...formData, descricao: e.target.value })}
                className="input-field"
                placeholder="Ex: Sala de leitura com 30 mesas"
              />
            </div>
            <div className="grid grid-cols-2 gap-4">
              <div>
                <label className="block text-sm font-medium text-gray-300 mb-2">Ícone</label>
                <input
                  type="text"
                  value={formData.icone}
                  onChange={(e) => setFormData({ ...formData, icone: e.target.value })}
                  className="input-field"
                  placeholder="🏢"
                />
              </div>
              <div>
                <label className="block text-sm font-medium text-gray-300 mb-2">Categoria</label>
                <input
                  type="text"
                  value={formData.categoria}
                  onChange={(e) => setFormData({ ...formData, categoria: e.target.value })}
                  className="input-field"
                  placeholder="Geral"
                />
              </div>
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
        {ambientes.map((ambiente) => (
          <div key={ambiente.id} className="card hover:border-primary-500 transition-colors">
            <div className="flex items-start justify-between mb-4">
              <div className="flex items-center gap-3">
                <span className="text-4xl">{ambiente.icone}</span>
                <div>
                  <h3 className="text-lg font-semibold text-white">{ambiente.nome}</h3>
                  <p className="text-sm text-gray-400">{ambiente.categoria}</p>
                </div>
              </div>
              <button
                onClick={() => handleDelete(ambiente.id)}
                className="text-gray-400 hover:text-red-500 transition-colors"
              >
                <Trash2 className="w-5 h-5" />
              </button>
            </div>
            {ambiente.descricao && (
              <p className="text-gray-300 text-sm">{ambiente.descricao}</p>
            )}
          </div>
        ))}
      </div>

      {ambientes.length === 0 && (
        <div className="card text-center py-12">
          <p className="text-gray-400">Nenhum ambiente cadastrado</p>
          <button
            onClick={() => setShowForm(true)}
            className="btn-primary mt-4"
          >
            Criar Primeiro Ambiente
          </button>
        </div>
      )}
    </div>
  )
}

export default Ambientes
