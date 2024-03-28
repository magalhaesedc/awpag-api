create table parcelamento(
	id SERIAL primary key,
	cliente_id int not null,
	descricao varchar(20) not null,
	valor_total decimal(10, 2) not null,
	quantidade_parcelas smallint,
	data_criacao timestamp not null
);

alter table parcelamento add constraint fk_parcelamento_cliente
foreign key (cliente_id) references cliente (id);