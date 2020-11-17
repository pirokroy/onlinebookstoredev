CREATE USER 'bookstoredev'@'localhost' IDENTIFIED BY 'bookstoredev';

GRANT ALL PRIVILEGES ON * . * TO 'bookstoredev'@'localhost';

ALTER USER 'bookstoredev'@'localhost' IDENTIFIED WITH mysql_native_password BY 'bookstoredev';