import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Login from './login/Login'

function App() {

  return (
    <BrowserRouter basename='/app'>
      <Routes>
        <Route path='/' Component={Login}/>
      </Routes>
    </BrowserRouter>
  )
}

export default App;