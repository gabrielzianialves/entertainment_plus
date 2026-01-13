import "./home.css"
import { useEffect, useState } from "react";
import { api } from "../services/api";

function Home() {

  const [reviews, setReviews] = useState([]);

  useEffect(() => {
    api.get("/reviews").then(res => {
      setReviews(res.data);
    });
  }, []);


  return (
    <div className="home">

      <div className="title-button">
        <h1 className="title">Minhas Avaliações</h1>
        <button className="button">+ Nova Avaliação</button>
      </div>

      {reviews.map(review => (
        <ReviewCard key={review.id} review={review} />
      ))}

    </div>
  );
}

export default Home;
