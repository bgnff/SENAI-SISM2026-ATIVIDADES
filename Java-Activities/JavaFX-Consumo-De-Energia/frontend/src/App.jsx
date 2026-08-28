import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'
import Sidebar from './components/Sidebar'
import Dashboard from './pages/Dashboard'
import Ambientes from './pages/Ambientes'
import Equipamentos from './pages/Equipamentos'
import Ideias from './pages/Ideias'

function App() {
  return (
    <Router>
      <div className="flex min-h-screen">
        <Sidebar />
        <main className="flex-1 ml-64 p-8">
          <Routes>
            <Route path="/" element={<Dashboard />} />
            <Route path="/ambientes" element={<Ambientes />} />
            <Route path="/equipamentos" element={<Equipamentos />} />
            <Route path="/ideias" element={<Ideias />} />
          </Routes>
        </main>
      </div>
    </Router>
  )
}

export default App
