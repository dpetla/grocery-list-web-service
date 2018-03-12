# Grocery List Web Service

This is a simple RESTful web service for the repo [grocery-list](https://github.com/dpetla/grocery-list)(branch __clientAPI__) built with Java 8, Maven, Spring Boot and MySQL.

### Database configuration

- Install [MySQL](https://dev.mysql.com/downloads/)
- Create a database (GroceryList)
- Create table (Items)
```
+--------+--------------+------+-----+---------+----------------+
| Field  | Type         | Null | Key | Default | Extra          |
+--------+--------------+------+-----+---------+----------------+
| id     | int(11)      | NO   | PRI | NULL    | auto_increment |
| title  | varchar(100) | NO   |     | NULL    |                |
| notes  | varchar(255) | YES  |     | NULL    |                |
| picked | varchar(100) | NO   |     | NULL    |                |
+--------+--------------+------+-----+---------+----------------+
```


Follow these steps to run this application:
- run branch clientAPI of [grocery-list](https://github.com/dpetla/grocery-list) (check README.md for details)
- install, configure and run MySQL server
- build and run grocery-list-web-service
