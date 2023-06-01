create table clientes(
                       idcliente bigint not null auto_increment,
                       nome varchar(150) not null,
                       telefone varchar(20) not null,
                       endereco varchar(40) not null,
                       restricao varchar(200) not null,
                       status tinyint default 1,
                       primary key(idcliente)
);