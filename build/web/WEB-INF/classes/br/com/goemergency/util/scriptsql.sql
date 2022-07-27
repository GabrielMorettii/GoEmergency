CREATE TABLE pessoa(
idpessoa int GENERATED ALWAYS AS IDENTITY not null primary key,
cpf varchar(11) not null,
nome varchar(100) not null,
datanascimento Date not null,
email varchar(100) not null,
senha varchar(100) not null,
telefone varchar(11) not null,
idendereco integer not null,
code varchar(5),
isPaciente boolean,
isMedico boolean,
isAdmin boolean,
inactivatedAt Date,
createdAt Date DEFAULT CURRENT_TIMESTAMP,
updatedAt Date DEFAULT CURRENT_TIMESTAMP,
CONSTRAINT fk_id_endereco FOREIGN KEY (idendereco) REFERENCES endereco (idendereco)
);

CREATE TABLE medico(
idmedico int GENERATED ALWAYS AS IDENTITY not null primary key,
crm  varchar(11) not null,
idpessoa int not null,
ufcrm varchar(2),
inactivatedAt Date,
createdAt Date DEFAULT CURRENT_TIMESTAMP,
updatedAt Date DEFAULT CURRENT_TIMESTAMP,
CONSTRAINT fk_medico_pessoa
FOREIGN KEY (idpessoa) REFERENCES pessoa(idpessoa)
);

CREATE TABLE endereco(
idendereco int GENERATED ALWAYS AS IDENTITY not null primary key,
cidade varchar(100) not null,
estado varchar(100) not null,
rua varchar(150) not null,
numero integer not null,
bairro varchar(150) not null,
cep varchar (8) not null,
inactivatedAt Date,
createdAt Date DEFAULT CURRENT_TIMESTAMP,
updatedAt Date DEFAULT CURRENT_TIMESTAMP
);

SELECT * FROM pessoa

SELECT * FROM endereco

SELECT * FROM medico            
