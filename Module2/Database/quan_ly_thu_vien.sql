create database quan_ly_thu_vien;
use quan_ly_thu_vien;
create table category (
codeCategory int primary key auto_increment,
nameCategory varchar(50) not null
);

create table book (
idBook int primary key auto_increment,
nameBook varchar(250) not null,
authorName varchar(100) not null,
category int not null,
yearPublish date not null,
timePublish int,
price numeric not null,
image varchar(100),
foreign key (category) references category(codeCategory)
);

create table student (
studentID varchar(10) not null primary key,
studentName varchar(50) not null,
birthDay date not null,
address varchar(50) not null,
email varchar(50) not null,
phoneNumber varchar(20) not null,
image varchar(100)
);

create table statusOrder (
codeStatus int primary key,
statusBorrow varchar(20)
);

create table borrowOrder(
studentID varchar(10) not null,
idBook int not null,
borrowDate date,
returnDate date,
statusBorrow int,
primary key(studentID,idBook),
foreign key(studentID) references student (studentID),
foreign key(idBook) references book (idBook),
foreign key(statusBorrow) references statusOrder (codeStatus)
);