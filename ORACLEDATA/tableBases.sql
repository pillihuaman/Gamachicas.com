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






