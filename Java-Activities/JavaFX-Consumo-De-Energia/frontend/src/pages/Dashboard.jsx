import { useEffect, useState } from 'react'
import { Zap, DollarSign, TrendingDown, Server, Activity } from 'lucide-react'
import { BarChart, Bar, XAxis, YAxis, CartesianGrid, Tooltip, ResponsiveContainer, PieChart, Pie, Cell } from 'recharts'

const COLORS = ['#10b981', '#3b82f6', '#f59e0b', '#ef4444', '#8b5cf6']

function Dashboard() {
  const [dashboardData, setDashboardData] = useState(null)
  const [consumoPorAmbiente, setConsumoPorAmbiente] = useState([])
  const [consumoPorTipo, setConsumoPorTipo] = useState([])
  const [loading, setLoading] = useState(true)

  useEffect(() => {
    fetchDashboardData()
  }, [])

  const fetchDashboardData = async () => {
    try {
      const [dashRes, ambRes, tipoRes] = await Promise.all([
        fetch('/api/dashboard'),
        fetch('/api/dashboard/consumo-por-ambiente'),
        fetch('/api/dashboard/consumo-por-tipo')
      ])

      const dashData = await dashRes.json()
      const ambData = await ambRes.json()
      const tipoData = await tipoRes.json()

      setDashboardData(dashData)
      setConsumoPorAmbiente(ambData)
      setConsumoPorTipo(tipoData)
    } catch (error) {
      console.error('Erro ao carregar dados:', error)
    } finally {
      setLoading(false)
    }
  }

  if (loading) {
    return (
      <div className="flex items-center justify-center h-full">
        <div className="animate-spin rounded-full h-12 w-12 border-b-2 border-primary-500"></div>
      </div>
    )
  }

  return (
    <div className="space-y-8">
      <div>
        <h1 className="text-3xl font-bold text-white mb-2">Dashboard</h1>
        <p className="text-gray-400">Visão geral do consumo de energia</p>
      </div>

      {/* Cards */}
      <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-6">
        <div className="card">
          <div className="flex items-center justify-between mb-4">
            <Zap className="w-8 h-8 text-primary-500" />
            <span className="text-xs text-gray-400">Total</span>
          </div>
          <p className="text-2xl font-bold text-white">
            {dashboardData?.consumoTotal?.toFixed(2)} kWh
          </p>
          <p className="text-sm text-gray-400 mt-1">Consumo Mensal</p>
        </div>

        <div className="card">
          <div className="flex items-center justify-between mb-4">
            <DollarSign className="w-8 h-8 text-green-500" />
            <span className="text-xs text-gray-400">Estimado</span>
          </div>
          <p className="text-2xl font-bold text-white">
            R$ {dashboardData?.valorEstimado?.toFixed(2)}
          </p>
          <p className="text-sm text-gray-400 mt-1">Valor a Pagar</p>
        </div>

        <div className="card">
          <div className="flex items-center justify-between mb-4">
            <TrendingDown className="w-8 h-8 text-blue-500" />
            <span className="text-xs text-gray-400">Economia</span>
          </div>
          <p className="text-2xl font-bold text-white">
            {dashboardData?.economiaPossivel?.toFixed(2)} kWh
          </p>
          <p className="text-sm text-gray-400 mt-1">Potencial (20%)</p>
        </div>

        <div className="card">
          <div className="flex items-center justify-between mb-4">
            <Server className="w-8 h-8 text-purple-500" />
            <span className="text-xs text-gray-400">Ativos</span>
          </div>
          <p className="text-2xl font-bold text-white">
            {dashboardData?.quantidadeEquipamentos}
          </p>
          <p className="text-sm text-gray-400 mt-1">Equipamentos</p>
        </div>
      </div>

      {/* Gráficos */}
      <div className="grid grid-cols-1 lg:grid-cols-2 gap-6">
        <div className="card">
          <h3 className="text-lg font-semibold text-white mb-4">Consumo por Ambiente</h3>
          <ResponsiveContainer width="100%" height={300}>
            <BarChart data={consumoPorAmbiente}>
              <CartesianGrid strokeDasharray="3 3" stroke="#374151" />
              <XAxis dataKey="nome" stroke="#9ca3af" />
              <YAxis stroke="#9ca3af" />
              <Tooltip 
                contentStyle={{ backgroundColor: '#1f2937', border: '1px solid #374151' }}
                itemStyle={{ color: '#fff' }}
              />
              <Bar dataKey="consumo" fill="#10b981" />
            </BarChart>
          </ResponsiveContainer>
        </div>

        <div className="card">
          <h3 className="text-lg font-semibold text-white mb-4">Consumo por Tipo</h3>
          <ResponsiveContainer width="100%" height={300}>
            <PieChart>
              <Pie
                data={consumoPorTipo}
                cx="50%"
                cy="50%"
                labelLine={false}
                label={({ nome, percent }) => `${nome} ${(percent * 100).toFixed(0)}%`}
                outerRadius={80}
                fill="#8884d8"
                dataKey="consumo"
              >
                {consumoPorTipo.map((entry, index) => (
                  <Cell key={`cell-${index}`} fill={COLORS[index % COLORS.length]} />
                ))}
              </Pie>
              <Tooltip 
                contentStyle={{ backgroundColor: '#1f2937', border: '1px solid #374151' }}
                itemStyle={{ color: '#fff' }}
              />
            </PieChart>
          </ResponsiveContainer>
        </div>
      </div>

      {/* Sugestões */}
      <div className="card">
        <div className="flex items-center gap-2 mb-4">
          <Activity className="w-6 h-6 text-primary-500" />
          <h3 className="text-lg font-semibold text-white">Sugestões Automáticas</h3>
        </div>
        <div className="space-y-3">
          <div className="flex items-start gap-3 p-3 bg-dark-900 rounded-lg">
            <span className="text-green-500">•</span>
            <p className="text-gray-300 text-sm">
              Cadastre ambientes para obter sugestões personalizadas por local
            </p>
          </div>
          <div className="flex items-start gap-3 p-3 bg-dark-900 rounded-lg">
            <span className="text-green-500">•</span>
            <p className="text-gray-300 text-sm">
              Use a funcionalidade de Ideias de Economia com IA para recomendações personalizadas
            </p>
          </div>
        </div>
      </div>
    </div>
  )
}

export default Dashboard
