import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Login from './login/Login'
import rootStore from './RootStore';

function App() {

  return (
    <BrowserRouter basename='/'>
      <Routes>
        <Route path='/' element={<Login store={rootStore.loginStore}/>}/>
      </Routes>
    </BrowserRouter>
  )
}

export default App;