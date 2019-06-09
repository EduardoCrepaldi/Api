##CREATE DATABASE maeapi

##use maeapi

CREATE TABLE IF NOT EXISTS Mae(
	id INT AUTO_INCREMENT,
    nome VARCHAR(30),
    sobrenome VARCHAR(30),
    qtdFilho INT,
    disponivel TINYINT,
    
    PRIMARY KEY(id)
) 