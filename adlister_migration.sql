USE adlister_db;

drop table if exists users;

CREATE TABLE users(
  id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255)  NOT NULL,
  password VARCHAR(255)  NOT NULL,
  email VARCHAR(255)  NOT NULL
);

drop table if exists ads;

CREATE TABLE ads(
  id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  user_id INT UNSIGNED NOT NULL,
  FOREIGN Key(user_id) references users(id),
  title VARCHAR(255)  NOT NULL,
  description VARCHAR(255)  NOT NULL
);