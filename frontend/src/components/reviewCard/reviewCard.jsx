import "./reviewCard.css";

function ReviewCard() {

    const { title, rating, comment, reviewDate, watchedDate } = review;

    return (
        <div className="card">
            <div className="card-header">

                <h1 className="show-title">{title}</h1>
                <div className="stars">
                    {Array.from({ length: 5 }).map((_, index) => (
                    <span
                        key={index}
                        className={index < rating ? "star filled" : "star"}
                    >
                        ★
                    </span>
                    ))}

                </div>
            </div>

            <div className="date-container">
                <span className="date-title">Publicado em: <span className="date">{reviewDate}</span></span>
                <span className="date-title">Assistido em: <span className="date">{watchedDate}</span></span>
            </div>
            
            <div className="comment-container">
                <span className="comment-title">Comentário:</span>
                <p className="comment">{comment}</p>
            </div>

        </div>
    );
}

export default ReviewCard;