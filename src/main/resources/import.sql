INSERT INTO MOVIE (id, title, rating, subtitles, releaseYear, director, actors, reviews) VALUES ('1', 'Mad Title', '8', 'English', '1994', 'Chad', 'Brad', 'Mad review')
INSERT INTO MOVIE (id, title, rating, subtitles, releaseYear, director, actors, reviews) VALUES ('2', 'Inside Man', '10', 'Spanish', '1995','someone', 'someone else', 'good movie')
INSERT INTO MOVIE (id, title, rating, subtitles, releaseYear, director, actors, reviews) VALUES ('3', 'Bond James', '12', 'English', '1996', 'Mason','Brad Pitt', 'Bad Movie')
INSERT INTO MOVIE (id, title, rating, subtitles, releaseYear, director, actors, reviews) VALUES ('4', 'The Room', '20', 'Polish','2003', 'Tommy', 'Ronaldo', 'alright Movie')
INSERT INTO MOVIE (id, title, rating, subtitles, releaseYear, director, actors, reviews) VALUES ('5', 'The Other Room', '7', 'Afrikant', '2010', 'John', 'Nohj', 'Not Bad')
INSERT INTO MOVIE (id, title, rating, subtitles, releaseYear, director, actors, reviews) VALUES ('6', 'One', '19','Somalian', '2016', 'Callum', 'Tib', 'This is review')

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



