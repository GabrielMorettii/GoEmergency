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

       CREATE TABLE sintomas(
    idsintoma integer NOT NULL GENERATED ALWAYS AS IDENTITY,
    nomesintoma varying(500) NOT NULL,
    partecorpo varying(500) NOT NULL,
    CONSTRAINT idsintoma_pkey PRIMARY KEY (idsintoma)
);

INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor de cabeça', 'cabeca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no rosto', 'cabeça');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor ou pressão nos seios da face', 'cabeça');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Febre', 'cabeça');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Rosto inchado', 'cabeça');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Fraqueza dos músculos faciais', 'cabeça');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Rosto dormente ou formigando', 'cabeça');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Perda de consciência', 'cabeça');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Memória prejudicada', 'cabeça');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Tonto', 'cabeça');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Sentindo-se enjoado', 'cabeça');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Perda de cabelo', 'cabeça');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Mudanças na pele localizadas do rosto', 'cabeça');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão recente na cabeça', 'cabeça');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor nos olhos', 'olhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Olho vermelho', 'olhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Olhos vermelhos e ardendo', 'olhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Olhos coçando', 'olhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Olhos marejados', 'olhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Olhos amarelos', 'olhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor ao redor ou atrás do olho', 'olhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Deficiência visual', 'olhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Visão dupla', 'olhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Cegueira temporária', 'olhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Pupilas assimétricas', 'olhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Nariz dolorido', 'olhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Mudança na pele da pálpebra', 'olhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Inchaço ao redor dos olhos', 'olhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Pálpebras caídas', 'olhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Secreção seca nas pálpebras', 'olhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Flashes nos olhos', 'olhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Sensibilidade à luz', 'olhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão grave no olho', 'olhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Nariz dolorido', 'nariz');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Nariz inchado', 'nariz');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Nariz escorrendo', 'nariz');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Nariz entupido', 'nariz');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Nariz ou garganta coçando', 'nariz');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Voz nasal', 'nariz');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Ronco', 'nariz');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Espirro', 'nariz');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dificuldade de sentir cheiro', 'nariz');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor ou pressão nos seios da face', 'nariz');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Sangrando pelo nariz', 'nariz');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Muco pingando no fundo da garganta', 'nariz');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão no nariz', 'nariz');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor de ouvido', 'ouvido');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Diminuição da audição', 'ouvido');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Secreção do ouvido', 'ouvido');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Ouvido entupido', 'ouvido');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Coçando dentro do ouvido', 'ouvido');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Ouvidos zumbindo', 'ouvido');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão no ouvido', 'ouvido');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Alterações dentro da boca', 'boca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Mau hálito', 'boca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Boca seca', 'boca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor de dente', 'boca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dificuldade de morder e mastigar', 'boca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor na gengiva', 'boca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Gengivas inchadas', 'boca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Sangramento nas gengivas', 'boca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Língua anormalmente vermelha', 'boca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Sensação de queimação na língua', 'boca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Tosse', 'boca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Ronco', 'boca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Vômito', 'boca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Tossindo sangue', 'boca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Apetite diminuído', 'boca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Sede aumentada', 'boca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Placas brancas nas amígdalas', 'boca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Falta de ar', 'boca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão labial', 'boca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor de garganta', 'pescoço e garganta');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor ao en,lir', 'pescoço e garganta');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dificuldade de en,lir', 'pescoço e garganta');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Garganta vermelha', 'pescoço e garganta');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Tosse', 'pescoço e garganta');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Raspando a garganta', 'pescoço e garganta');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Som de assobio feito durante a respiração', 'pescoço e garganta');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Muco pingando no fundo da garganta', 'pescoço e garganta');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Rouquidão', 'pescoço e garganta');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Nariz ou garganta coçando', 'pescoço e garganta');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Falta de ar', 'pescoço e garganta');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no pescoço', 'pescoço e garganta');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Linfonodos aumentados', 'pescoço e garganta');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Pescoço inchado', 'pescoço e garganta');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Torcicolo', 'pescoço e garganta');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Veia do pescoço aumentada', 'pescoço e garganta');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão no pescoço', 'pescoço e garganta');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Aumento da mama em homem', 'peito');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no peito', 'peito');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no peito se espalhando para o membro superior esquerdo', 'peito');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no peito do tipo pressão', 'peito');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Azia', 'peito');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Palpitações', 'peito');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Batimento cardíaco acelerado', 'peito');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Ritmo cardíaco lento', 'peito');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Tosse', 'peito');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Falta de ar', 'peito');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Respiração superficial', 'peito');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Respiração acelerada', 'peito');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Som de assobio feito durante a respiração', 'peito');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão torácica', 'peito');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no membro superior', 'braços');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor forte no membro superior', 'braços');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no ombro', 'braços');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor ao mover o ombro', 'braços');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Articulação difícil de mover', 'braços');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor em ambos os membros superiores', 'braços');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Inchaço do membro superior', 'braços');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Ombro inchado', 'braços');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Formigamento ou dormência de um membro superior', 'braços');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Formigamento ou dormência em ambos os membros superiores', 'braços');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Perda de sensibilidade em ambos os braços', 'braços');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Espasmos nos braços ou mãos', 'braços');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão no braço', 'braços');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no membro superior', 'antebraço');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no antebraço', 'antebraço');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor em ambos os membros superiores', 'antebraço');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor forte no membro superior', 'antebraço');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Inchaço do membro superior', 'antebraço');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Cotovelo inchado', 'antebraço');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Punho inchado', 'antebraço');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no punho', 'antebraço');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor ao mover o punho', 'antebraço');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no cotovelo', 'antebraço');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor ao mover o cotovelo', 'antebraço');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Formigamento ou dormência em ambos os membros superiores', 'antebraço');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Mão caída', 'antebraço');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Perda de sensibilidade em ambos os braços', 'antebraço');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Espasmos nos braços ou mãos', 'antebraço');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão no antebraço', 'antebraço');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no punho', 'mão');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor ao mover o punho', 'mão');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor na mão ou dedos da mão', 'mão');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor em um dedo da mão', 'mão');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor na pele ao redor da unha', 'mão');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Mão inchada', 'mão');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Punho inchado', 'mão');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dedo da mão inchado', 'mão');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Mudanças na pele das mãos', 'mão');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Mão vermelha', 'mão');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dedos azul-acinzentados', 'mão');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Pele vermelha nas palmas das mãos', 'mão');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dedos da mão formigando', 'mão');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Tremor de ambas as mãos', 'mão');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Tremor em uma mão', 'mão');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Perda de massa muscular nas mãos', 'mão');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Mãos rígidas pela manhã', 'mão');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dedos ou mãos frias', 'mão');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão na mão', 'mão');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor na barriga', 'abdome superior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor na região central e superior do abdome', 'abdome superior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor na parte superior esquerda do abdome', 'abdome superior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor na parte superior direita do abdome', 'abdome superior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor de estôma, em queimação ou al, roendo', 'abdome superior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Cólica na barriga', 'abdome superior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor abdominal em cãibra', 'abdome superior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor de estôma, fina e em pontadas', 'abdome superior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor ao pressionar o abdome', 'abdome superior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Azia', 'abdome superior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Caroço no barriga', 'abdome superior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Aumento do tamanho abdominal', 'abdome superior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Inchaço', 'abdome superior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Vômito', 'abdome superior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Sentindo-se enjoado', 'abdome superior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Indigestão', 'abdome superior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Vomitando sangue', 'abdome superior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Perda de peso', 'abdome superior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão abdominal recente', 'abdome superior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor na barriga', 'abdome médio');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no centro da barriga', 'abdome médio');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor de estôma, em queimação ou al, roendo', 'abdome médio');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Cólica na barriga', 'abdome médio');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor abdominal em cãibra', 'abdome médio');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor de estôma, fina e em pontadas', 'abdome médio');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor ao pressionar o abdome', 'abdome médio');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Caroço no barriga', 'abdome médio');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Aumento do tamanho abdominal', 'abdome médio');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Inchaço', 'abdome médio');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Constipação', 'abdome médio');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Diarreia', 'abdome médio');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Vômito', 'abdome médio');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Sentindo-se enjoado', 'abdome médio');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Fezes pretas', 'abdome médio');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Fezes vermelhas', 'abdome médio');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão abdominal recente', 'abdome médio');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor na barriga', 'abdome inferior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor na parte inferior esquerda do abdome', 'abdome inferior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Cólica na barriga', 'abdome inferior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor abdominal em cãibra', 'abdome inferior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor na parte inferior direita do abdome', 'abdome inferior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor na parte inferior do abdome', 'abdome inferior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor de estôma, fina e em pontadas', 'abdome inferior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor ao pressionar o abdome', 'abdome inferior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Inchaço', 'abdome inferior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Aumento do tamanho abdominal', 'abdome inferior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Caroço no barriga', 'abdome inferior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Perda do controle intestinal', 'abdome inferior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Constipação', 'abdome inferior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Diarreia', 'abdome inferior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Fezes pretas', 'abdome inferior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Fezes vermelhas', 'abdome inferior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão abdominal recente', 'abdome inferior');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Secreção da uretra', 'orgãos sexuais');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Fluxo urinário intermitente', 'orgãos sexuais');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no escroto ou testículo', 'orgãos sexuais');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Inchaço do escroto', 'orgãos sexuais');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Sensação de peso no escroto', 'orgãos sexuais');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Diferença no tamanho dos testículos', 'orgãos sexuais');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Caroço no escroto', 'orgãos sexuais');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Disfunção erétil', 'orgãos sexuais');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Urinando com frequência', 'orgãos sexuais');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor quando urino', 'orgãos sexuais');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Urina escura', 'orgãos sexuais');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Urina vermelha', 'orgãos sexuais');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Perdendo urina por acidente', 'orgãos sexuais');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Urinando frequente à noite', 'orgãos sexuais');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor na virilha', 'orgãos sexuais');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Coceira na virilha', 'orgãos sexuais');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Necessidade urgente de urinar', 'orgãos sexuais');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Micção em pequenas quantidades', 'orgãos sexuais');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Mudanças na pele sobre ou em torno dos órgãos genitais', 'orgãos sexuais');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no membro inferior', 'coxa');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor forte no membro inferior', 'coxa');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor na coxa', 'coxa');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor em ambos os membros inferiores', 'coxa');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no quadril', 'coxa');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor ao mover o quadril', 'coxa');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor lombar se espalhando pela parte de trás da coxa até o joelho', 'coxa');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Mancando devido à dor', 'coxa');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor aguda na coxa ou nádega que surge durante o esforço e alivia após um breve descanso', 'coxa');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor ao pressionar membro inferior', 'coxa');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Perna inchada', 'coxa');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Inchaço da articulação do quadril', 'coxa');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Pernas inchadas', 'coxa');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Formigamento ou dormência em um membro inferior', 'coxa');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Formigamento ou dormência em ambos os membros inferiores', 'coxa');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Estrias vermelhas na barriga, quadris ou coxas', 'coxa');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão na coxa', 'coxa');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no membro inferior', 'joelhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor forte no membro inferior', 'joelhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor em ambos os membros inferiores', 'joelhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor em apenas um joelho', 'joelhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor ao mover o joelho', 'joelhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor ao pressionar a articulação', 'joelhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Juntas rígidas', 'joelhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Mancando devido à dor', 'joelhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Joelho inchado', 'joelhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Andar mais lento', 'joelhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Estalos da articulação durante o movimento', 'joelhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão no joelho', 'joelhos');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no membro inferior', 'panturrilha');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor em ambos os membros inferiores', 'panturrilha');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor forte no membro inferior', 'panturrilha');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor na panturrilha', 'panturrilha');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor ao pressionar a panturrilha', 'panturrilha');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor forte na panturrilha ao andar', 'panturrilha');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor em apenas um joelho', 'panturrilha');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Perna inchada', 'panturrilha');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Pernas inchadas', 'panturrilha');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Formigamento ou dormência em um membro inferior', 'panturrilha');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Formigamento ou dormência em ambos os membros inferiores', 'panturrilha');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão na perna', 'panturrilha');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Cãibras na panturrilha', 'panturrilha');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Pernas pesadas no final do dia', 'panturrilha');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Perda de sensibilidade em apenas um braço ou perna', 'panturrilha');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor em um pé', 'pé');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no dedo do pé', 'pé');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Unha dolorida', 'pé');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor na pele ao redor da unha', 'pé');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no tornozelo', 'pé');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no dedão do pé', 'pé');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Pés formigando ou dormentes', 'pé');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Pés inchados', 'pé');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dedo do pé inchado', 'pé');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Mudanças na pele dos pés', 'pé');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Unhas espessadas', 'pé');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Pontas dos dedos e unhas aumentadas', 'pé');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Descoloração marrom nas unhas', 'pé');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Pontos brancos na unha', 'pé');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Unhas amareladas', 'pé');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Pés e dedos dos pés frios', 'pé');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Queda da parte da frente do pé', 'pé');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão no dedo do pé', 'pé');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor nos dois pés', 'pé');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão no pé', 'pé');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no pescoço', 'nuca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Pescoço dói em apenas um lado', 'nuca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Torcicolo', 'nuca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dificuldade em se curvar', 'nuca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Pescoço inchado', 'nuca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão no pescoço', 'nuca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão de chicote', 'nuca');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor nas costas', 'costas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor nas costas que vem e vai', 'costas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor nas costas que piora após atividade física', 'costas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor nas costas de repente', 'costas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor nas costas forte', 'costas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no meio ou parte superior das costas', 'costas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor nas costas que diminui durante o repouso', 'costas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor nas costas durando várias horas', 'costas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Coluna rígida pela manhã', 'costas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Assimetria da coluna vertebral', 'costas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dificuldade em se curvar', 'costas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão nas costas', 'costas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no membro superior', 'cotovelo');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor forte no membro superior', 'cotovelo');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no cotovelo', 'cotovelo');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor ao mover o cotovelo', 'cotovelo');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Cotovelo inchado', 'cotovelo');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão no cotovelo', 'cotovelo');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Articulação difícil de mover', 'cotovelo');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor nas costas', 'lombar');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor na região lombar', 'lombar');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor nas costas que vem e vai', 'lombar');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor nas costas de repente', 'lombar');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor nas costas forte', 'lombar');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor nas costas que piora após atividade física', 'lombar');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor lombar se espalhando para a virilia', 'lombar');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor nas costas que diminui durante o repouso', 'lombar');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor nas costas durando várias horas', 'lombar');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor lombar se espalhando pela parte de trás da coxa até o joelho', 'lombar');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Sensibilidade muscular paravertebral', 'lombar');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dificuldade em se curvar', 'lombar');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Coluna rígida pela manhã', 'lombar');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Lesão nas costas', 'lombar');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor nas nádegas', 'nádegas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no quadril', 'nádegas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor ao mover o quadril', 'nádegas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor no membro inferior', 'nádegas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor em ambos os membros inferiores', 'nádegas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor aguda na coxa ou nádega que surge durante o esforço e alivia após um breve descanso', 'nádegas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor lombar se espalhando pela parte de trás da coxa até o joelho', 'nádegas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Inchaço da articulação do quadril', 'nádegas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor anorretal', 'nádegas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Sangramento pelo ânus', 'nádegas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Úlcera, ferida ou abscesso perto do ânus', 'nádegas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Ânus coçando', 'nádegas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Fezes vermelhas', 'nádegas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Fezes pretas', 'nádegas');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor anorretal', 'ânus');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor nas nádegas', 'ânus');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Dor ao defecar', 'ânus');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Ânus coçando', 'ânus');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Úlcera, ferida ou abscesso perto do ânus', 'ânus');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Fezes vermelhas', 'ânus');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Sangramento pelo ânus', 'ânus');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Fezes pretas', 'ânus');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Fezes com odor fétido', 'ânus');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Diarreia', 'ânus');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Diarreia com mais de  evacuações por dia', 'ânus');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Constipação', 'ânus');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Perda do controle intestinal', 'ânus');
INSERT INTO sintomas (nomesintoma, partecorpo) VALUES ('Vermes nas fezes ou ao redor do ânus', 'ânus')

CREATE TABLE DOENCA (
 	IDDOENCA INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	NOMEDONECA VARCHAR(500) NOT NULL,
	DESCRICAO VARCHAR(8000) NOT NULL,
	CAUSAS VARCHAR(8000) NOT NULL,
	DIAGNOSTICO VARCHAR(8000) NOT NULL,
	TRATAMENTO VARCHAR(8000) NOT NULL,
	PREVENCAO VARCHAR(8000) NOT NULL,
	MEDICOESPECIALISTA VARCHAR(500) NOT NULL,
	CAMINHOIMAGEM VARCHAR(500) NOT NULL
)