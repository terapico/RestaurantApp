create table DishCategory (
    name varchar(20) primary key
);

create table Dish (
    id identity not null primary key,
    name varchar(50) not null,
    category varchar(20) not null,
    foreign key (category) references DishCategory(name) on update cascade
);
