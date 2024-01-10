import{Link} from "react-router-dom"

const Inicio = () => {
  return (
    <>
      <div>
        <h2>Página Inicio</h2>
        <Link to = "about-us">
          Presiona para ir a about -us
          </Link>
          <br></br>
          <Link to = "contact">
            Presiona para ir a contacto
          </Link>
          <br></br>
        
      </div>
    </>
  )
}

export default Inicio