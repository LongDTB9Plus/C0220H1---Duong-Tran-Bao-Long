create database quan_ly_ban_hang;
use quan_ly_ban_hang;
create table offices (
officeCode varchar(10) primary key,
city varchar(50) not null,
phone varchar(50) not null,
addressLine1 varchar(50) not null,
addressLine2 varchar(50),
state varchar(50),
country varchar(50) not null,
postalCode varchar(15) not null
);

create table employees (
employeeNumber int primary key auto_increment,
lastName varchar(50) not null,
firstName varchar(50) not null,
email varchar(100) not null,
jobTitle varchar(50) not null,
officeCode varchar(10),
reportTo int,
foreign key(reportTo) references employees (employeeNumber),
foreign key (officeCode) references offices (officeCode)
);

create table product_line (
productLine varchar(50) not null primary key,
textDescription  varchar(1000) not null,
image varchar(50)
);

create table product (
productCode varchar(15) not null primary key,
productName varchar(70) not null,
productScale varchar(10) not null,
productVendor varchar(50) not null,
productDescription varchar(50) not null,
quantityInStock  int not null,
buyPrice numeric not null,
MSRP numeric not null,
foreign key (productDescription) references product_line (productLine)
);

create table customer (
customerNumber int not null primary key,
customerName varchar(50) not null,
contactLastName varchar(50) not null,
contactFirstName varchar(50) not null,
phone varchar(50) not null,
addressLine1 varchar(50) not null,
address2 varchar(50),
city varchar(50) not null,
state varchar(50) not null,
postalCode varchar(15) not null,
creditLimit numeric,
salesRepEmployeeNumber  int,
foreign key(salesRepEmployeeNumber ) references employees(employeeNumber)
);

create table payment (
customerNumber int not null primary key,
checkNumber varchar(50),
paymentDate date not null,
amount numeric,
foreign key (customerNumber) references customer(customerNumber)
);

create table orders (
orderNumber int not null primary key,
orderDate date not null,
requiredDate date not null,
shippedDate date ,
status varchar(15) not null,
comment text,
quantityOrdered int not null,
priceEach numeric not null,
customerNumber int not null,
foreign key(customerNumber) references customer(customerNumber)
);

create table OrderDetails (
productCode varchar(15) not null,
orderNumber int not null,
primary key(productCode,orderNumber),
foreign key(productCode) references product(productCode),
foreign key(orderNumber) references orders(orderNumber)
);
