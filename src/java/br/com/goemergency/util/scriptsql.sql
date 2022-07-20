CREATE TABLE pessoa(
idpessoa serial primary key,
cpf varchar(11) not null,
nome varchar(100) not null,
datanascimento Date not null,
email varchar(30) not null,
senha varchar(30) not null,
idendereco integer not null,
isPaciente boolean,
isMedico boolean,
isAdmin boolean,
inactivatedAt Date,
createdAt Date DEFAULT CURRENT_TIMESTAMP,
updatedAt Date DEFAULT CURRENT_TIMESTAMP,

CONSTRAINT fk_id_endereco FOREIGN KEY (idendereco) REFERENCES endereco (idendereco)
)

CREATE TABLE medico(
idmedico serial primary key,
crm  varchar(11) not null,
idpessoa int not null,
CONSTRAINT fk_medico_pessoa
FOREIGN KEY (idpessoa) REFERENCES pessoa(idpessoa)
)

CREATE TABLE estado(
idestado serial primary key,
nomeestado varchar(40) not null,
siglaestado varchar(2) not null );

CREATE TABLE cidade(
idcidade serial primary key,
nomecidade varchar(100) not null,
idestado integer not null,
CONSTRAINT fk_cidade_estado
FOREIGN KEY (idestado)
REFERENCES estado(idestado)
);

CREATE TABLE endereco(
idendereco serial primary key,
idcidade integer  not null,
rua varchar(100) not null,
numero integer not null,
bairro integer not null,
cep varchar (8) not null,
    
CONSTRAINT fk_endereco_cidade FOREIGN KEY (idcidade) REFERENCES cidade(idcidade)
);