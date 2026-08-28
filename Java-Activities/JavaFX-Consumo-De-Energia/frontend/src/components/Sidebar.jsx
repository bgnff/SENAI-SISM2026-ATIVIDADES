import { Link, useLocation } from 'react-router-dom'
import { 
  LayoutDashboard, 
  Building2, 
  Zap, 
  Plus, 
  BarChart3, 
  Lightbulb,
  Leaf
} from 'lucide-react'

const menuItems = [
  { path: '/', icon: LayoutDashboard, label: 'Dashboard' },
  { path: '/ambientes', icon: Building2, label: 'Ambientes' },
  { path: '/equipamentos', icon: Zap, label: 'Equipamentos' },
  { path: '/ideias', icon: Lightbulb, label: 'Ideias de Economia' },
]

function Sidebar() {
  const location = useLocation()

  return (
    <aside className="fixed left-0 top-0 h-full w-64 bg-dark-800 border-r border-dark-700 p-6">
      <div className="flex items-center gap-3 mb-8">
        <Leaf className="w-8 h-8 text-primary-500" />
        <h1 className="text-xl font-bold text-white">EcoEnergy</h1>
      </div>
      
      <nav className="space-y-2">
        {menuItems.map((item) => {
          const Icon = item.icon
          const isActive = location.pathname === item.path
          
          return (
            <Link
              key={item.path}
              to={item.path}
              className={`flex items-center gap-3 px-4 py-3 rounded-lg transition-colors ${
                isActive 
                  ? 'bg-primary-600 text-white' 
                  : 'text-gray-400 hover:bg-dark-700 hover:text-white'
              }`}
            >
              <Icon className="w-5 h-5" />
              <span>{item.label}</span>
            </Link>
          )
        })}
      </nav>
      
      <div className="absolute bottom-6 left-6 right-6">
        <div className="bg-dark-900 rounded-lg p-4 border border-dark-700">
          <p className="text-sm text-gray-400 mb-2">Monitoramento Inteligente</p>
          <p className="text-xs text-gray-500">Use IA para otimizar seu consumo</p>
        </div>
      </div>
    </aside>
  )
}

export default Sidebar
