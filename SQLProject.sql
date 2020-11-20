CREATE TABLE users (
    id serial UNIQUE NOT NULL,
    first_name varchar(255) NOT NULL,
  	last_name varchar(255),
    address Varchar(255),
    state varchar(255),
  	PRIMARY key (id)
);

CREATE TABLE books (
  id serial,
  title varchar(100) NOT NULL,
  author varchar(100) NOT NULL,
  published_date timestamp NOT NULL,
  isbn char(12),
  PRIMARY KEY (id),
  UNIQUE (isbn)
);

CREATE TABLE checkouts (
  id serial,
  user_id int NOT NULL,
  book_id int NOT NULL,
  checkout_date timestamp,
  return_date timestamp,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
  FOREIGN KEY (book_id) REFERENCES books(id) ON DELETE CASCADE
);

Insert into users (id, first_name, last_name, address, state) VALUES
(1, 'John', 'Smith', '3245 Wood Street', 'NC'),
(2, 'Jane', 'Steward', '7998 Eld Street', 'AL'),
(3, 'Jack', 'Doe', '1278 Liquid Boulevard', 'TR'),
(4, 'Jessie', 'Jay', '4587 Nowhere Street', 'KI'),
(5, 'Matt', 'Matson', '1456 Solid Apt', 'ET'),
(6, 'Mike', 'Jackson', '7954 Toe Foot', 'ZX'),
(7, 'Greg', 'McCreed', '6598 Hand Place', 'YU'),
(8, 'Elsa', 'Melt', '8657 Condesation Location', 'ER'),
(9, 'Hobbs', 'Shane', '3219 Fast Lane', 'RQ'),
(10, 'Sara', 'Set', '1569 Slow Lane', 'JU'),
(11, 'Jessica', 'Mann', '1463 Weast Street', 'EU'),
(12, 'Jane', 'Not', '1578 Nom Place', 'AL'),
(13, 'Dora', 'Carpet', '3214 Gas Street', 'DS'),
(14, 'Robb', 'Ups', '7532 Han Boulevard', 'YU'),
(15, 'Cat', 'Dog', '8524 Uhh Street', 'TF'),
(16, 'Griff', 'Nonr', '6842 Play Street', 'AL'),
(17, 'Jack', 'Mars', '4198 Eld Street', 'AL'),
(18, 'May', 'Stew', '7541 Tech Place', 'ER'),
(19, 'Hobbs', 'Wor', '9911 Gruber Place', 'CD'),
(20, 'Joe', 'Varg', '1684 Mess Street', 'EY'),
(21, 'Robert', 'Poor', '4271 Mable Boulevard', 'CD'),
(22, 'Angel', 'Wings', '9856 Heaven Place', 'HV'),
(23, 'Shermie', 'Young', '1497 Hot Street', 'HO'),
(24, 'Yuri', 'Shikaro', '5789 Old Street', 'IO'),
(25, 'Roy', 'Bash', '6427 Final Street', 'QW');

INSERT INTO checkouts (id, user_id, book_id, checkout_date, return_date) VALUES
  (1, 1, 1, '2017-10-15 14:43:18', NULL),
  (2, 1, 2, '2017-10-05 16:22:44', '2017-10-13 13:0:12'),
  (3, 2, 2, '2017-10-15 11:11:24', '2017-10-22 17:47:10'),
  (4, 5, 3, '2015-12-15 09:27:07', NULL),
  (5, 25, 4, '2012-06-16 12:06:45', '2012-10-22 09:48:10'),
  (6, 14, 9, '2020-06-16 12:10:24', NULL),
  (7, 14, 8, '2018-09-01 16:56:01', NULL),
  (8, 6, 7, '2019-05-18 11:32:15.', '2020-05-04 12:58:16'),
  (9, 11, 6, '2014-12-20 13:20:24', '2015-10-22 10:22:10'),
  (10, 14, 9, '2020-11-20 08:10:39', NULL);
  
  INSERT INTO books (id, title, author, published_date, isbn) VALUES
  (1, 'How to SQL', 'Mary Parker', '2012-02-22 12:08:17', '981483029127'),
  (2, 'How to SQL Part Duex', 'Mary Parker', '1972-07-03 09:22:45', '857300923713'),
  (3, 'How to Cook in the Fallout Universe', 'Cary Flint', '2015-10-18 14:05:44', '523120967812'),
  (4, 'The Last House on the Right', 'Bryan Main', '1999-04-03 15:54:45', '547845512312'),
  (5, 'Broble', 'Chris Chad', '2010-09-30 08:47:12', '457899874123'),
  (6, 'PC Builder', 'Tim Pear', '2018-12-03 12:08:12', '658988741257'),
  (7, 'Count to Infinity', 'Buzz Lights', '1999-03-16 11:20:12', '125998745632'),
  (8, 'Deep Down His Soul', 'Julia Robs', '1991-10-22 13:40:45', '369887541125'),
  (9, 'Some Book Title', 'Alison Burgers', '2006-06-08 14:30:12', '114747589652'),
  (10, 'I love', 'April Neal', '1981-01-03 08:30:46', '254789887412');
  
  SELECT users.first_name, users.last_name, users.address, users.state, books.title, books.author
  from users
  INNER JOIN books on users.id = books.id;
  
  alter TABLE users
  add middle_name varchar(255);