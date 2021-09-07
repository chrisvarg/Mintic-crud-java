-- Drop database;
DROP SCHEMA IF EXISTS cinefilo;

-- Crear la base de datos
CREATE SCHEMA cinefilo;
USE cinefilo;

-- Borrar tablas si existe anteriormente
DROP TABLE IF EXISTS directores;
DROP TABLE IF EXISTS usuarios;
DROP TABLE IF EXISTS peliculas;
DROP TABLE IF EXISTS series;
DROP TABLE IF EXISTS registros;

-- Tabla director
CREATE TABLE director
(
    id              int auto_increment,
    nombre          varchar(50) not null,
    apellidos       varchar(50) not null,
    nacionalidad    varchar(50) null,
    CONSTRAINT pk_director PRIMARY KEY(id)
);
INSERT INTO director(id, nombre, apellidos, nacionalidad) VALUES(101, "Hayo", "Miyazaki", "japones");
INSERT INTO director(id, nombre, apellidos, nacionalidad) VALUES(102, "Joss", "Whedon", "estadounidense");
INSERT INTO director(id, nombre, apellidos, nacionalidad) VALUES(103, "Christopher", "Nola", "estadounidense");
INSERT INTO director(id, nombre, apellidos, nacionalidad) VALUES(104, "Bong", "Joon-ho", "coreano");
INSERT INTO director(id, nombre, apellidos, nacionalidad) VALUES(105, "Vicent", "Ward", "neozelandes");


-- Tabla serie
CREATE TABLE serie
(
    id              int auto_increment,
    titulo          varchar(50)  not null,
    episodios       int not null,
    temporadas      int not null,
    CONSTRAINT pk_serie PRIMARY KEY(id)
);
INSERT INTO serie(titulo, episodios, temporadas) VALUES("The walking dead", 153, 11);
INSERT INTO serie(titulo, episodios, temporadas) VALUES("Viaje a las estrellas: la serie original", 80, 3);
INSERT INTO serie(titulo, episodios, temporadas) VALUES("Glow ", 30, 3);
INSERT INTO serie(titulo, episodios, temporadas) VALUES("La casa de papel", 31, 4);
INSERT INTO serie(titulo, episodios, temporadas) VALUES("Friends ", 236, 10);
INSERT INTO serie(titulo, episodios, temporadas) VALUES("Arrow ", 170, 8);
INSERT INTO serie(titulo, episodios, temporadas) VALUES("The big bang theory", 279, 12);
INSERT INTO serie(titulo, episodios, temporadas) VALUES("Vikingos ", 79, 6);


-- Tabla usuario
CREATE TABLE usuario
(
    alias               varchar(50) not null,
    nombre              varchar(50) not null,
    apellidos           varchar(50) not null,
    celular             varchar(50) not null,
    email               varchar(50) not null,
    password            varchar(50) not null,
    fecha_nacimiento    DATE not null,
    CONSTRAINT pk_usuario PRIMARY KEY(alias)
);
INSERT INTO usuario(alias, nombre, apellidos, celular, email, password, fecha_nacimiento) VALUES("lucky", "Pedro", "Perez", "3109865512", "luckPerez@gmail.com", "luckSkywalker", '1992/5/20');
INSERT INTO usuario(alias, nombre, apellidos, celular, email, password, fecha_nacimiento) VALUES("malopez", "Maria", "Lopez", "3221284379", "malopez@gmail.com", "malopez1990", '1990/2/6');
INSERT INTO usuario(alias, nombre, apellidos, celular, email, password, fecha_nacimiento) VALUES("diva", "Ana", "Diaz", "3155974231", "analadiva@yahoo.es", "analadiva", '1998/10/15');
INSERT INTO usuario(alias, nombre, apellidos, celular, email, password, fecha_nacimiento) VALUES("dreamer", "Luis ", "Rojas", "3208891238", "luisdreamer@hotmail.com", "dreamrojas", '1985/9/28');
INSERT INTO usuario(alias, nombre, apellidos, celular, email, password, fecha_nacimiento) VALUES("ninja", "Andres ", "Cruz", "3020986232", "andreselninjaCruz@gmail.com", "soyelninjaandre123", '2000/8/18');
INSERT INTO usuario(alias, nombre, apellidos, celular, email, password, fecha_nacimiento) VALUES("neon", "Nelson ", "Ruiz", "3047452834", "nelsitoruiz@hotmail.com", "nelsitoruiz123", '1990/11/28');
INSERT INTO usuario(alias, nombre, apellidos, celular, email, password, fecha_nacimiento) VALUES("rose", "Claudia ", "Mendez", "3238812976", "claudiaRoselopez@yahoo.es", "luckSkywalker", '1987/1/20');
INSERT INTO usuario(alias, nombre, apellidos, celular, email, password, fecha_nacimiento) VALUES("green", "Jorge", "Rodriguez", "3235983231", "greenliternJorge@gmail.com", "iamjorge1992", '1992/5/20');



-- Tabla pelicula
CREATE TABLE pelicula
(
    id              int auto_increment,
    id_director     int not null,
    titulo          varchar(50) not null,
    resumen         text not null,
    año             year,
    CONSTRAINT pk_pelicula PRIMARY KEY(id),
    CONSTRAINT fk_pelicula_director FOREIGN KEY(id_director) REFERENCES director(id)
);
INSERT INTO pelicula(id_director, titulo, resumen, año) VALUES(102, 'Los Vengadores','Pelicula de superheroes basada en Marvel Comics. Nick Fury director de SHIELD recluta a Tony Stark, Steve Rogers, Bruce Banner y Thor para forma un equipo y evitar que Loki, hermano de Thor, se apodere de la tierra', 1990 );
INSERT INTO pelicula(id_director, titulo, resumen, año) VALUES(103, "Interestelar", "Pelicula de ciencia fición, donde la humanidad lucha por sobrevivir. La pelicula cuenta una historia de un grupo de astronautas que viajana traves de un agujero de gusano en busca de un nuevo hogar.", 2014);
INSERT INTO pelicula(id_director, titulo, resumen, año) VALUES(101, "El viaje de Chihiro", "Pelicula de animación japonesa. Es la historia de una niña de 12 años, quien se ve atrapada por un mundo mágico y sobrenatural, teniendo como misión buscar su libertad y la de sus padres y regresar al mundo real.", 2001);
INSERT INTO pelicula(id_director, titulo, resumen, año) VALUES(104, "Parasitos", "Pelicula de drama, suspenso y humor negro. Toca temas como las diferencias sociales y vulnerabilidad del espiritu humano", 2019);
INSERT INTO pelicula(id_director, titulo, resumen, año) VALUES(105, "Mas alla de los sueños", "Pelicula de drama, narra una historia trágica de una familia, donde el padre va en busca de sus esposa al mas allá para recuperarla.", 1998);

-- Tabla registro
CREATE TABLE registro
(
    id              int auto_increment,
    alias           varchar(50) not null,
    titulo          varchar(50) not null,
    fecha           TIMESTAMP,
    CONSTRAINT pk_registro PRIMARY KEY(id),
    CONSTRAINT fk_registro_alias FOREIGN KEY(alias) REFERENCES usuario(alias)
);
INSERT INTO registro(alias, titulo, fecha) VALUES("lucky", "Los Vengadores", '2017-10-25 20:00:00');
INSERT INTO registro(alias, titulo, fecha) VALUES("lucky", "Parasitos", '2019-03-15 18:30:00');
INSERT INTO registro(alias, titulo, fecha) VALUES("lucky", "La casa de papel", '2019-05-20 20:30:00');
INSERT INTO registro(alias, titulo, fecha) VALUES("malopez", "Los Vengadores", '2018-05-20 20:30:00');
INSERT INTO registro(alias, titulo, fecha) VALUES("malopez", "La casa de papel", '2020-01-20 20:30:00');
INSERT INTO registro(alias, titulo, fecha) VALUES("diva", "Interestelar", '2019-05-20 20:30:00');
INSERT INTO registro(alias, titulo, fecha) VALUES("diva", "El viaje de Chihiro", '2018-06-22 21:30:00');
INSERT INTO registro(alias, titulo, fecha) VALUES("diva", "The walking dead", '2020-03-17 15:30:20');
INSERT INTO registro(alias, titulo, fecha) VALUES("dreamer", "The walking dead", '2020-03-17 15:30:20');
INSERT INTO registro(alias, titulo, fecha) VALUES("dreamer", "Viaje a las estrellas: la serie original", '2020-04-10 18:30:20');
INSERT INTO registro(alias, titulo, fecha) VALUES("ninja", "Glow", '2020-02-17 20:30:20');
INSERT INTO registro(alias, titulo, fecha) VALUES("ninja", "La casa de papel", '2020-02-20 16:30:20');
INSERT INTO registro(alias, titulo, fecha) VALUES("ninja", "Arrow", '2020-03-27 18:30:20');
INSERT INTO registro(alias, titulo, fecha) VALUES("rose", "Friends", '2020-03-20 21:30:20');
INSERT INTO registro(alias, titulo, fecha) VALUES("green", "Interestelar", '2020-01-10 17:30:20');
INSERT INTO registro(alias, titulo, fecha) VALUES("green", "Parasitos" , '2020-02-15 20:30:20');
INSERT INTO registro(alias, titulo, fecha) VALUES("green", "Mas alla de los sueños", '2020-03-17 18:30:20');