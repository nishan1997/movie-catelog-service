
DROP TABLE IF EXISTS movie;

CREATE TABLE movie (
  id INT NOT NULL,
  description VARCHAR(255) DEFAULT NULL,
  name VARCHAR(255) DEFAULT NULL,
  path VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (id)
);


INSERT INTO `movie` VALUES (1,'UEFA Foot ball match','Foot Ball','football.mp4'),(2,'F1 Car race ','Car Race','carrace.mp4'),(3,'Friendly basket ball match ','Basket Ball','basketball.mp4');

