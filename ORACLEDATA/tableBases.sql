CREATE TABLE color (
  idcolor      NUMBER        GENERATED ALWAYS AS IDENTITY,
  NAME   VARCHAR2(100) NOT NULL,
  DESCRIPTION  VARCHAR(500) NULL,
  STATUS   NUMBER(1,0) NOT NULL,
  CHECK (STATUS BETWEEN 0 and 1)
);
 --INSERT INTO COLOR (NAME,DESCRIPTION,STATUS)
 --VALUES('RED','RED COLOR',1)
 
 --SELECT * FROM COLOR

CREATE TABLE clothingline (
  idclothingline      NUMBER        GENERATED ALWAYS AS IDENTITY,
  NAME   VARCHAR2(100) NOT NULL,
  DESCRIPTION  VARCHAR(500) NULL,
  STATUS   NUMBER(1,0) NOT NULL,
  createdate timestamp  not null,
  updatedate TIMESTAMP not null,
  CHECK (STATUS BETWEEN 0 and 1)
);


CREATE TABLE clothing (
  idclothing     NUMBER        GENERATED ALWAYS AS IDENTITY,
  idclothingline  numeric ,
  idcolor numeric ,
  NAME   VARCHAR2(100) NOT NULL,
  DESCRIPTION  VARCHAR(500) NULL,
  STATUS   NUMBER(1,0) NOT NULL,
  createdate timestamp  not null,
  updatedate TIMESTAMP not null,
  CHECK (STATUS BETWEEN 0 and 1)
);


CREATE TABLE Groupparameter (
  idGroupparameter   NUMBER        GENERATED ALWAYS AS IDENTITY,
  DESCRIPTION  VARCHAR(500) NULL,
  createdate timestamp  not null,
  updatedate TIMESTAMP not null
);

CREATE TABLE parameter (
  idparameter    NUMBER        GENERATED ALWAYS AS IDENTITY,
  NAME   VARCHAR2(100) NOT NULL,
  STATUS   NUMBER(1,0) NOT NULL,
  createdate timestamp  not null,
  updatedate TIMESTAMP not null
);




