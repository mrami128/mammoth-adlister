USE adlister_db;

drop table if exists ads;
drop table if exists users;

CREATE TABLE users(
  id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(250)  NOT NULL,
  password VARCHAR(250)  NOT NULL,
  email VARCHAR(250)  NOT NULL,
  Primary key(id)
);


CREATE TABLE ads(
  id    INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
  title     VARCHAR(255),
  description VARCHAR(255),
  user_id INT UNSIGNED NOT NULL,
  Primary KEY (id),
  FOREIGN Key(user_id) references users(id)
);