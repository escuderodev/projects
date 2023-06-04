create table pedidos(
                         idpedido bigint not null auto_increment,
                         cliente varchar(150) not null,
                         orcamento varchar(20) not null,
                         valor decimal not null,
                         data_de_entrega varchar(10) not null,
                         data_de_pagamento varchar(10) not null,
                         primary key(idpedido)
);