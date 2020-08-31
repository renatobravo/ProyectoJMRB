CREATE TABLE postulantes (
    id_postulante                   INTEGER NOT NULL,
    estado_inscrito                 VARCHAR2(20 CHAR) NOT NULL,
    num_cedula_identidad            VARCHAR2(9 CHAR) NOT NULL,
    fecha_de_nacimiento             DATE NOT NULL,
    primer_apellido                 VARCHAR2(20 CHAR) NOT NULL,
    segundo_apellido                VARCHAR2(20 CHAR) NOT NULL,
    nombres                         VARCHAR2(30 CHAR) NOT NULL,
    nacionalidad                    VARCHAR2(20 CHAR) NOT NULL,
    estado_civil                    CHAR(1 CHAR) NOT NULL,
    certificado_permanencia         CHAR(1),
    fecha_certificado_permanencia   DATE,
    es_separado_de_hecho            CHAR(1) NOT NULL,
    titulo                          VARCHAR2(30)
);

ALTER TABLE postulantes ADD CONSTRAINT postulante_pk PRIMARY KEY (id_postulante );

ALTER TABLE postulantes ADD CONSTRAINT rut_postu_unique UNIQUE (num_cedula_identidad);


CREATE SEQUENCE postulantes_seq START WITH 1;

CREATE OR REPLACE TRIGGER postulante_bir 
BEFORE INSERT ON postulantes 
FOR EACH ROW

BEGIN
  SELECT postulantes_seq.NEXTVAL
  INTO   :new.id_postulante
  FROM   dual;
END;

CREATE TABLE cuentas_ahorros_viviendas (
    num_cuenta             INTEGER NOT NULL,
    saldo                  INTEGER NOT NULL,
    fecha_apertura         DATE NOT NULL,
    nombre_banco           VARCHAR2(30 CHAR) NOT NULL,
    tipo_cuenta_bancaria   VARCHAR2(20 CHAR) NOT NULL,
    id_del_postulante      INTEGER NOT NULL references postulantes(id_postulante)
);

ALTER TABLE cuentas_ahorros_viviendas ADD CONSTRAINT cuentas_ahorros_viviendas_pk PRIMARY KEY ( num_cuenta );

ALTER TABLE cuentas_ahorros_viviendas ADD CONSTRAINT cuentas_postu_unique UNIQUE (id_del_postulante);


