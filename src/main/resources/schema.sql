create table if not exists CUSTOMERS
(
    id serial primary key,
    name varchar(255),
    surname varchar(255),
    age int,
    phone_number varchar(255)
);

create table if not exists ORDERS
(
    id serial primary key,
    date timestamp,
    customer_id int references CUSTOMERS(id),
    product_name varchar(255),
    amount int
);
