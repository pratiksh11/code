import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Header from 'C:\Users\prati\OneDrive\Desktop\apna\chai aur react\07reactRROuter\src\assets\components\Header'
import Footer from 'C:\Users\prati\OneDrive\Desktop\apna\chai aur react\07reactRROuter\src\assets\components\Footer'
import Home from './components/Home/Home'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
    <Header/>
    <Home/>
    <Footer/>
      
    </>
  )
}

export default App
