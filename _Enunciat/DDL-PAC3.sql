--Universitat Oberta de Catalunya
--TDP 2014

CREATE TABLE TALLER(
    id_taller numeric NOT NULL,
    nombre character varying(30) NOT NULL,
    direccion character varying(100) NOT NULL,
    PRIMARY KEY (id_taller)
);

CREATE TABLE EMPLEADO (
    id_empleado numeric NOT NULL,
    id_taller numeric NOT NULL,
    nombre character varying(30) NOT NULL,
    apellidos character varying(50) NOT NULL,
    fecha_alta date NOT NULL,
    PRIMARY KEY (id_empleado),
    FOREIGN KEY (id_taller) REFERENCES TALLER(id_taller)
);

CREATE TABLE CAMPANYA (
    id_campanya numeric NOT NULL,
    fecha_desde date NOT NULL,
    fecha_hasta date NOT NULL,
    fecha_alta date NOT NULL,
    nombre character varying(30) NOT NULL,
    PRIMARY KEY (id_campanya)
);

CREATE TABLE PETICION (
    id_taller numeric NOT NULL,
    id_campanya numeric NOT NULL,
    id_empleado numeric NOT NULL,	
    fecha_peticion date NOT NULL,
    puntuacion numeric NOT NULL,
    PRIMARY KEY (id_taller, id_campanya),
    FOREIGN KEY (id_campanya) REFERENCES CAMPANYA(id_campanya),
    FOREIGN KEY (id_empleado) REFERENCES EMPLEADO(id_empleado)
);

CREATE SEQUENCE SQ_CAMPANYA START 1;