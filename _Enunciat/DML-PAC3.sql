--Universitat Oberta de Catalunya
--TDP 2014

INSERT INTO TALLER VALUES (1, 'Taller Sobre Ruedas', 'Taller Sobre Ruedas Gran Via 2 Local 99-A, 08025 Barcelona');
INSERT INTO TALLER VALUES (2, 'Taller Arranque', 'Taller Arranque Diagonal Mar Local 21-C, 08018 Barcelona');
INSERT INTO TALLER VALUES (3, 'Taller Veloz', 'Taller Veloz, Avenida del Paseo Maritimo 244, 08179 Badalona');

INSERT INTO EMPLEADO VALUES (1, 1,'Jordi', 'Soldevilla Alonso', '13/11/1998');
INSERT INTO EMPLEADO VALUES (2, 1,'Carles', 'Andreu Felipe', '11/01/1997');
INSERT INTO EMPLEADO VALUES (3, 2,'Sandra', 'Lopez Vilchez', '21/05/2008');
INSERT INTO EMPLEADO VALUES (4, 2,'Laura', 'Castro Lorenzo', '23/09/2014');
INSERT INTO EMPLEADO VALUES (5, 3,'Juan', 'Fernandez Gomez', '15/08/2000');
INSERT INTO EMPLEADO VALUES (6, 3,'Estela', 'Jurado Jimenez', '16/08/2003');

INSERT INTO CAMPANYA VALUES (NEXTVAL('SQ_CAMPANYA'),'13/12/2014','07/01/2014',CURRENT_DATE,'Navidades');