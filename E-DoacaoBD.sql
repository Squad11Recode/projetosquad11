create database EDoacao;

use EDoacao;

CREATE TABLE Permissoes (
    Id_Permissao INTEGER PRIMARY KEY auto_increment,
    Tipo_Permissao VARCHAR(20)
);

CREATE TABLE Doador (
    Id_Doador INTEGER PRIMARY KEY auto_increment,
    Nome VARCHAR (60),
    Email VARCHAR(60),
    Id_Permissao INTEGER,
    foreign key (id_Permissao) references Permissoes (id_permissao)
);

CREATE TABLE Doacao (
    Id_Doacao INTEGER PRIMARY KEY auto_increment,
    Data_Doacao DATE,
    Tipo_Doacao VARCHAR (60),
    Id_Doador INTEGER,
    foreign key (Id_Doador) references Doador (Id_Doador)
);

CREATE TABLE TipoDoacao (
	Id_Tipo_Doacao integer primary key auto_increment,
    Quantidade INTEGER,
    Id_Doacao integer,
    foreign key (Id_Doacao) references Doacao (Id_Doacao)
);

CREATE TABLE Dinheiro (
    Id_Dinheiro INTEGER PRIMARY KEY auto_increment,
    Valor_Dinheiro DECIMAL(5,2),
    Id_Tipo_Doacao integer,
    foreign key (Id_Tipo_Doacao) references TipoDoacao (Id_Tipo_Doacao)
);

CREATE TABLE Manutencao (
    Id_Manutencao INTEGER PRIMARY KEY auto_increment,
    Tipo_Manutencao VARCHAR(80),
    Id_Tipo_Doacao integer,
    foreign key (Id_Tipo_Doacao) references TipoDoacao (Id_Tipo_Doacao)
);

CREATE TABLE Equipamentos (
    Id_Equipamentos INTEGER PRIMARY KEY,
    Tipo_Equipamento VARCHAR (90),
    Estado_Equipamento VARCHAR(100),
    Id_Tipo_Doacao integer,
    foreign key (Id_Tipo_Doacao) references TipoDoacao (Id_Tipo_Doacao)
);
 
 CREATE TABLE Internet (
    Id_Internet INTEGER PRIMARY KEY,
    Tipo_Internet VARCHAR (90),
    Id_Tipo_Doacao integer,
    foreign key (Id_Tipo_Doacao) references TipoDoacao (Id_Tipo_Doacao)
);