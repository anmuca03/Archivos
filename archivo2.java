CREATE DATABASE carcel;
USE carcel;

CREATE TABLE celdas ( 

  id INT  PRIMARY KEY, 

  numero INT(20) , 

  capacidad INT(20) 

); 

INSERT INTO celdas (id, numero, capacidad)
VALUES (1, 100, 1),
       (2, 101, 2),
       (3, 102, 4),
       (4, 103, 3),
       (5, 104, 2);




CREATE TABLE presos( 
  id INT PRIMARY KEY,
  id_celda INT,
  nombre VARCHAR(255),
  apellido VARCHAR(255),
  fecha_nacimiento DATE,
  fecha_ingreso DATE,
  FOREIGN KEY (id_celda) REFERENCES celdas(id)
); 

INSERT INTO presos (id, nombre, apellido, fecha_nacimiento, fecha_ingreso, id_celda)
VALUES (1, 'Juan', 'Pérez', '1980-01-01', '1996-01-01', 1),
       (2, 'Maria', 'González', '1985-02-14', '1935-03-01', 2),
       (3, 'Carlos', 'Rodríguez', '1990-05-20', '2009-04-15', 3),
       (4, 'Ana', 'García', '1995-07-06', '2022-06-10', 3),
       (5, 'Pedro', 'Sánchez', '1989-11-30', '2020-08-20', 4),
       (6, 'Sonia', 'Ramírez', '1979-11-30', '2005-02-20', null);




CREATE TABLE guardias ( 

  id INT PRIMARY KEY, 

  id_celda INT,

  nombre VARCHAR(255) , 

  apellido VARCHAR(255) , 

  fecha_nacimiento DATE, 

  fecha_ingreso DATE,

  FOREIGN KEY (id_celda) REFERENCES celdas(id)

) ; 

INSERT INTO guardias (id, nombre, apellido, fecha_nacimiento, fecha_ingreso, id_celda)
VALUES (1, 'Luis', 'Martínez', '1975-01-01', '2015-01-01', 1),
       (2, 'Verónica', 'Castro', '1980-02-14', '2016-03-01', 2),
       (3, 'Daniel', 'Ruíz', '1985-05-20', '2017-04-15', 3),
       (4, 'Gabriela', 'Díaz', '1990-05-20', '2018-06-10', 4),
       (5, 'José', 'Jiménez', '1995-11-30', '2019-08-20', 5),
       (6, 'Rocío', 'Sánchez', '1975-01-07', '2013-03-17', 3);

  

CREATE TABLE visitantes ( 

  id INT  PRIMARY KEY, 

  fecha_nacimiento DATE, 

  nombre VARCHAR(255) , 

  apellido VARCHAR(255) 

) ; 

INSERT INTO visitantes (id, nombre, apellido, fecha_nacimiento)
VALUES (1, 'Pepe', 'Pérez', '1985-01-01'),
       (2, 'Lucía', 'González', '1975-01-01'),
       (3, 'Sofía', 'Rodríguez', '1943-02-14'),
       (4, 'Carla', 'Romero', '1999-05-20'),
       (5, 'Irene', 'Montero', '1961-07-06'),
       (6, 'Juan', 'García', '1961-08-06'),
       (7, 'Marta', 'García', '1961-09-06');

CREATE TABLE registro_visitas ( 

  id INT  PRIMARY KEY,

  id_preso INT,

  id_visitante INT,

  FOREIGN KEY (id_preso) REFERENCES presos(id),

  FOREIGN KEY (id_visitante) REFERENCES visitantes(id),

  duracion INT(40) , 

  fecha_visita DATE

) ; 

INSERT INTO registro_visitas (id, fecha_visita, duracion, id_visitante, id_preso)
VALUES (1, '2019-01-01', 120, 1, 1),
       (2, '2022-02-01', 150, 2, 2),
       (3, '2021-05-01', 90, 3, 3),
       (4, '2022-05-15', 60, 4, 4),
       (5, '2023-01-30', 180, 5, 5),
       (6, '2023-02-10', 180, 2, 4),
       (7, '2023-02-02', 60, 6, 5),
       (8, '2023-02-05', 75, 7, 2);

CREATE TABLE delitos ( 

  id INT PRIMARY KEY, 

  id_preso INT,

  descripcion VARCHAR(255) , 

  fecha DATE, 

  FOREIGN KEY (id_preso) REFERENCES presos(id)
) ; 

INSERT INTO delitos (id, descripcion, fecha, id_preso)
VALUES  (1, 'Robo con violencia', '2020-01-01', 1),
        (2, 'Asalto a mano armada', '2021-04-01', 2),
        (3, 'Narcotráfico', '2008-01-01', 3),
        (4, 'Homicidio', '2019-12-10', 4),
        (5, 'Fraude financiero','2022-10-01',5),
        (6, 'Fraude financiero','2023-01-01',5),
        (7, 'Robo con violencia','2021-04-10',1),
        (8, 'Robo con violencia','2021-05-10',1),
        (9, 'Robo con violencia','2021-06-10',1),
        (10, 'Robo con violencia','2021-07-10',1),
        (11, 'Robo con violencia','2021-08-10',1),
        (12, 'Robo con violencia','2021-09-10',1),
        (13, 'Hacking','2005-09-10',6);
//archivo 2
