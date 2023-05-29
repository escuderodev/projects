create table filmes(
    idfilme bigint not null auto_increment,
    nome varchar(100) not null,
    duracao_em_minutos int not null,
    ano_de_lancamento int not null,
    genero varchar(100) not null,
    primary key(idfilme)
);