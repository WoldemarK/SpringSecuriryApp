create table Person
(
    id            int primary key generated by default as identity,
    username      varchar(100) not null,
    year_of_birth int          not null,
    password      varchar(50)  not null

);
insert into Person(username, year_of_birth, password) VALUES ('test1_user1', 1960, '123');
insert into Person(username, year_of_birth, password) VALUES ('test1_user2', 1980, '321');
insert into Person(username, year_of_birth, password) VALUES ('test1_user3', 1970, '213');
