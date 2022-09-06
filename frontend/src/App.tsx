import Cabeçalho from "./componests/Cabeçalho"
import SalesCard from "./componests/SalesCard"

function App() {
  return (
    <>
      <Cabeçalho />
      <main>
        <section id="sales">
          <div className="dsmeta-container">
            <SalesCard />
          </div>
        </section>
      </main>
    </>
  )
}

export default App
