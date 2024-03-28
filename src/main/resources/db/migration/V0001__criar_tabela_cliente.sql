create table cliente (
	id SERIAL primary key,
	nome varchar(30) not null,
	email varchar(100) not null unique,
	telefone varchar(20) not null
);