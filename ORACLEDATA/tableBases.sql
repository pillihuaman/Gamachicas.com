CREATE TABLE color (
  idcolor      NUMBER        GENERATED ALWAYS AS IDENTITY,
  NAME   VARCHAR2(100) NOT NULL,
  DESCRIPTION  VARCHAR(500) NULL,
  STATUS   NUMBER(1,0) NOT NULL,
  CHECK (STATUS BETWEEN 0 and 1)
);

alter table color add  code varchar(50)

ALTER TABLE color
ADD CONSTRAINT constraint_idcolor PRIMARY KEY (idcolor);
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
ALTER TABLE clothingline
ADD CONSTRAINT constraint_idclothingline PRIMARY KEY (idclothingline);


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

ALTER TABLE clothing
ADD CONSTRAINT constraint_idclothing PRIMARY KEY (idclothing);


CREATE TABLE Groupparameter (
  idGroupparameter   NUMBER        GENERATED ALWAYS AS IDENTITY,
  DESCRIPTION  VARCHAR(500) NULL,
  createdate timestamp  not null,
  updatedate TIMESTAMP not null
);


ALTER TABLE Groupparameter
ADD CONSTRAINT constraint_Groupparameter PRIMARY KEY (idGroupparameter);


CREATE TABLE parameter (
  idparameter    NUMBER        GENERATED ALWAYS AS IDENTITY,
  NAME   VARCHAR2(100) NOT NULL,
  STATUS   NUMBER(1,0) NOT NULL,
  createdate timestamp  not null,
  updatedate TIMESTAMP not null
);

ALTER TABLE parameter
ADD CONSTRAINT constraint_Gidparameter PRIMARY KEY (idparameter);

CREATE TABLE parameter (
  idparameter    NUMBER        GENERATED ALWAYS AS IDENTITY,
  NAME   VARCHAR2(100) NOT NULL,
  STATUS   NUMBER(1,0) NOT NULL,
  createdate timestamp  not null,
  updatedate TIMESTAMP not null
);

create table sizes
(  idsize NUMBER        GENERATED ALWAYS AS IDENTITY,
  CODE  VARCHAR(5) NOT NULL,
  NAME  VARCHAR(50)  NOT NULL,
  STATUS   NUMBER(1,0) NOT NULL,
 CHECK (STATUS BETWEEN 0 and 1)
)
 ALTER TABLE sizes
ADD CONSTRAINT constraint_sizes PRIMARY KEY (idsize);

 --// CREATE TABLE  DESCRIPTION 
  --//(
   --//iddescription NUMBER        GENERATED ALWAYS AS IDENTITY,
   --//DESCRIPTION  VARCHAR(500) NOT NULL,
   --idbackground varchar(200) not nul
   
  --)
 
 
 CREATE TABLE stock
 (
 idstock NUMBER        GENERATED ALWAYS AS IDENTITY,
 idclothingline      NUMBER  not null ,
 idclothing     NUMBER    not null,
 idcolor      NUMBER   not null,
 iddescription number  not null,
 price decimal  null,
 count numeric ,
 description varchar(200) null,
 createdate timestamp not null,
 updatedate timestamp not null,
 status numeric(1,0) not null,
 idusercreate numeric,
 CHECK (STATUS BETWEEN 0 and 1)
 
 )
  ALTER TABLE stock
ADD CONSTRAINT constraint_stock PRIMARY KEY (idstock);

 CREATE TABLE temptpayheader
 (
 
 idtemptpayheader NUMBER        GENERATED ALWAYS AS IDENTITY,
 idvaucher numeric,
 totalprice decimal  null,
 totalitem numeric ,
 description varchar(200) null,
 idstatus numeric not null,
 createdate timestamp not null,
 updatedate timestamp not null,
 status numeric(1,0) not null,
 idusercreate numeric,
 CHECK (STATUS BETWEEN 0 and 1)
 
 )
   ALTER TABLE temptpayheader
ADD CONSTRAINT constraint_temptpayheader PRIMARY KEY (idtemptpayheader);
 
  CREATE TABLE Detailtemptpay
 (
 idDetailtemptpay NUMBER        GENERATED ALWAYS AS IDENTITY,
 idclothingline      NUMBER  not null ,
 idclothing     NUMBER    not null,
 idcolor      NUMBER   not null,
 iddescription number  not null,
 price decimal  null,
 idvaucher numeric,
 totalprice decimal  null,
 totalitem numeric ,
 description varchar(200) null,
 idstatus numeric not null,
 createdate timestamp not null,
 updatedate timestamp not null,
 status numeric(1,0) not null,
 idusercreate numeric,
 CHECK (STATUS BETWEEN 0 and 1)
 
 )

 create table users
 ( iduser NUMBER        GENERATED ALWAYS AS IDENTITY,
   name varchar(200) not null,
   email varchar(100) not null,
   password varchar2(100) not null,
   createdate timestamp not null,
   updatedate timestamp null,
  status numeric(1,0) not null,
   CHECK (STATUS BETWEEN 0 and 1)
 )
ALTER TABLE users
ADD CONSTRAINT constraint_iduser PRIMARY KEY (iduser);

   ALTER TABLE Detailtemptpay
ADD CONSTRAINT constraint_idDetailtemptpay PRIMARY KEY (idDetailtemptpay);


  



