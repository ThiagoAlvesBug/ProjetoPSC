# criando banco de dados para projeto de PSC
CREATE DATABASE MovieTime;

# usando database criado
USE MovieTime;

# criando tabela usuário
CREATE TABLE Usuario(
    id_usuario INT PRIMARY KEY AUTO_INCREMENT,
	Nome VARCHAR(50),
	Idade INT,
    Genero1 VARCHAR(30),
    Genero2 VARCHAR(30),
    Sexo CHAR (1),        # 'M', 'F', 'O'
    Senha VARCHAR(50),
    EhAdmin BIT DEFAULT 0
);	

# inserindo usuário
INSERT INTO Usuario 
	(Nome, 
    Idade, 
    Genero1, 
    Genero2, 
    Sexo, 
    Senha)
VALUES
	('Thiago', 
    18, 
    'Ficção-Científica', 
    'Terror', 
    'M', 
    'thiaguin123');
    
    INSERT INTO Usuario 
	(Nome, 
    Idade, 
    Genero1, 
    Genero2, 
    Sexo, 
    Senha)
VALUES
	('Victor', 
    24, 
    'Suspense', 
    'Terror', 
    'M', 
    'vitin123');

# inserindo filme
CREATE TABLE Filme (
id_filme INT PRIMARY KEY AUTO_INCREMENT,
id_usuario INT,
titulo VARCHAR(100),
genero VARCHAR(100),
ano INT,
nota INT,
FOREIGN KEY (id_usuario) REFERENCES Usuario (id_usuario)
);

# adicionando a coluna nota na tabela
ALTER TABLE Filme
ADD nota INT;

ALTER TABLE Usuario
ADD EhAdmin BIT DEFAULT 0;

SELECT 
    *
FROM 
	Usuario 
WHERE 
	sexo = 'M';


UPDATE 
	Usuario
SET 
	EhAdmin = 1
WHERE
	id_usuario = 1;


SELECT * FROM Usuario;

SELECT * FROM Filme;

DELETE FROM Filme
WHERE id_filme = 5;
