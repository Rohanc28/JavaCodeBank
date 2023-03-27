CREATE TABLE emp(
id INT NOT NULL PRIMARY KEY,
name VARCHAR(50),
salary FLOAT
);

DESC emp;

INSERT INTO emp (id, name, salary) VALUES 
(1, 'John Smith', 5000.00),
(2, 'Jane Doe', 6000.00),
(3, 'Bob Johnson', 4500.00),
(4, 'Emily Jones', 7000.00),
(5, 'Michael Brown', 5500.00);

CREATE TABLE user_details(
  email VARCHAR2(120) NOT NULL UNIQUE,
  username VARCHAR2(100) NOT NULL UNIQUE,
  password VARCHAR2(150) NOT NULL UNIQUE,
  CONSTRAINT user_pk PRIMARY KEY (email)
  );
