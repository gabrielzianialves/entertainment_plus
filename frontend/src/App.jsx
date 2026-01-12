import { useEffect } from "react";
import { api } from "./services/api";
import Header from "./components/header/header.jsx";
import Home from "./pages/home.jsx"

function App() {

  useEffect(() => {
    api.get("/reviews")
      .then(response => {
        console.log(response.data);
      });
  }, []);

  return (
    <>
      <Header />
      <Home />
    </>
  );
}

export default App;
