INSERT INTO MOVIE (id, title, rating, subtitles, releaseYear, director, actors, reviews, posterUrl) VALUES ('1', 'Mad Title', '8', True, '1994', 'Chad', 'Brad', 'Mad review', 'https://ia.media-imdb.com/images/M/MV5BMzQ4ZTc5ZTItYWRhNi00YTJjLWI4NGMtNjA0ODQ1ZDQxNzkyXkEyXkFqcGdeQXVyNjc4NjAxMzM@._V1_UY268_CR9,0,182,268_AL_.jpg')
INSERT INTO MOVIE (id, title, rating, subtitles, releaseYear, director, actors, reviews, posterUrl) VALUES ('2', 'Inside Man', '10', False, '1995','someone', 'someone else', 'good movie', 'https://ia.media-imdb.com/images/M/MV5BMTViZGIyNDYtNThlNS00Y2JhLWExYTItZGYwZjliNThjMjc0XkEyXkFqcGdeQXVyNTkzNDQ4ODc@._V1_UY268_CR9,0,182,268_AL_.jpg')
INSERT INTO MOVIE (id, title, rating, subtitles, releaseYear, director, actors, reviews, posterUrl) VALUES ('3', 'Bond James', '12', True, '1996', 'Mason','Brad Pitt', 'Bad Movie', 'https://ia.media-imdb.com/images/M/MV5BOWZjMjkwM2QtZTJiMy00MmI5LWI2YjEtMmY5NjNiYTE2NTBiXkEyXkFqcGdeQXVyNjQ2MjQ5NzM@._V1_UY268_CR2,0,182,268_AL_.jpg')
INSERT INTO MOVIE (id, title, rating, subtitles, releaseYear, director, actors, reviews, posterUrl) VALUES ('4', 'The Room', '20', True,'2003', 'Tommy', 'Ronaldo', 'alright Movie', 'https://ia.media-imdb.com/images/M/MV5BMDNkZTVjYWMtZGJjNS00YTM5LWI1YmMtYmY0ZDFlOWNlZjFmXkEyXkFqcGdeQXVyMTkzOTcxOTg@._V1_UY268_CR4,0,182,268_AL_.jpg')
INSERT INTO MOVIE (id, title, rating, subtitles, releaseYear, director, actors, reviews, posterUrl) VALUES ('5', 'The Other Room', '7', False, '2010', 'John', 'Nohj', 'Not Bad', 'https://ia.media-imdb.com/images/M/MV5BN2NlMmUyZWUtZmI5Yy00YWM3LTkxYzgtM2ZiOTMwNTc5ZDg0XkEyXkFqcGdeQXVyNjcyNjMzMjQ@._V1_UY268_CR2,0,182,268_AL_.jpg')
INSERT INTO MOVIE (id, title, rating, subtitles, releaseYear, director, actors, reviews, posterUrl) VALUES ('6', 'One', '19',True, '2016', 'Callum', 'Tib', 'This is review', 'https://ia.media-imdb.com/images/M/MV5BZWNkYzBhMzgtY2FlNC00Nzg1LWEyZmYtMTEyZDA0MTI0YTIyXkEyXkFqcGdeQXVyNjYxNzE3MDc@._V1_UY268_CR2,0,182,268_AL_.jpg')

INSERT INTO SCREEN (id, numberofSeats, screenNumber, screenType) VALUES ('1', '35', '1', 'IMAX')
INSERT INTO SCREEN (id, numberofSeats, screenNumber, screenType) VALUES ('2', '50', '2', 'Normal')
INSERT INTO SCREEN (id, numberofSeats, screenNumber, screenType) VALUES ('3', '40', '3', 'IMAX and Normal')

INSERT INTO SEAT (id, seatNumber, seatRow, seatType, SCREEN_ID) VALUES ('1', '1', 'A', 'Normal', '1' )
INSERT INTO SEAT (id, seatNumber, seatRow, seatType, SCREEN_ID) VALUES ('2', '2', 'B', 'VIP', '1')
INSERT INTO SEAT (id, seatNumber, seatRow, seatType, SCREEN_ID) VALUES ('3', '1', 'A', 'Normal', '2')
INSERT INTO SEAT (id, seatNumber, seatRow, seatType, SCREEN_ID) VALUES ('4', '2', 'B', 'VIP', '2')
INSERT INTO SEAT (id, seatNumber, seatRow, seatType, SCREEN_ID) VALUES ('5', '1', 'A', 'Normal', '3')
INSERT INTO SEAT (id, seatNumber, seatRow, seatType, SCREEN_ID) VALUES ('6', '2', 'B', 'VIP', '3')

INSERT INTO SHOWING (id, startTime, screenNumber, dimension, MOVIE_ID, SCREEN_ID) VALUES ('1', '08:45pm', '1', '2D', '1', '1')
INSERT INTO SHOWING (id, startTime, screenNumber, dimension, MOVIE_ID, SCREEN_ID) VALUES ('2', '06:45pm', '2', '3D', '2', '2')
INSERT INTO SHOWING (id, startTime, screenNumber, dimension, MOVIE_ID, SCREEN_ID) VALUES ('3', '05:45pm', '3', '2D', '3', '2')

INSERT INTO TICKET (id, SEAT_ID, SHOWING_ID) VALUES ('1', 1, 1)
INSERT INTO TICKET (id, SEAT_ID, SHOWING_ID) VALUES ('2', 2, 1)
INSERT INTO TICKET (id, SEAT_ID, SHOWING_ID) VALUES ('3', 3, 1)
INSERT INTO TICKET (id, SEAT_ID, SHOWING_ID) VALUES ('4', 1, 2)
INSERT INTO TICKET (id, SEAT_ID, SHOWING_ID) VALUES ('5', 2, 2)
INSERT INTO TICKET (id, SEAT_ID, SHOWING_ID) VALUES ('6', 3, 2)



