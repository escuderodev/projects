create table pedidos(
                         idpedido bigint not null auto_increment,
                         orcamento varchar(20) not null,
                         valor decimal not null,
                         cliente varchar(150) not null,
                         telefone varchar(20) not null,
                         email varchar(150) not null,
                         contato varchar(150) not null,
                         entrega date not null,
                         pagamento date not null,
                         primary key(idpedido)
);