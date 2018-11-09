/*CREATE OR REPLACE PROCEDURE getstock(
	   o_idclothing IN clothing.idclothing%TYPE,
	   o_name OUT clothing.name%TYPE,
	   o_description  OUT  clothing.description%TYPE,
	   o_status OUT clothing.status%TYPE)
IS
BEGIN
  SELECT name , description, status
  INTO o_name, o_description,  o_status 
  from  clothing  where idclothing=o_idclothing;

END;
/
*/

create or replace procedure getstocklist
(
v_idclothing  out NUMBER ,
v_name out  varchar
)
is
--v_idclothing number;
--v_name  varchar(500);

 begin
  for reg in 
  (
 SELECT
    idclothing,
    name 
FROM
    clothing)
    LOOP
    v_idclothing:=reg.idclothing;
    v_name:=reg.name;
    DBMS_OUTPUT.PUT_LINE(to_char(v_idclothing));
    DBMS_OUTPUT.PUT_LINE(to_char(v_name));
     end loop;  
  end;
  /
  
  

begin
 getstocklist();
  end;
  /
 
 
 CREATE OR REPLACE 
PROCEDURE getlitsas(cursor_ OUT SYS_REFCURSOR)
AS

BEGIN

OPEN cursor_ FOR
      SELECT idclothing ,name FROM clothing; 
END;

 begin
 getlitsas();
  end;
  
  create or replace PROCEDURE getlitsas(
numero numeric ,
cursor_ OUT SYS_REFCURSOR)
is

BEGIN

OPEN cursor_ FOR
      SELECT idclothing ,name,description FROM clothing; 
END;

create or replace PROCEDURE getlitsas(
numero numeric ,
cursor_ OUT SYS_REFCURSOR)
is

BEGIN

OPEN cursor_ FOR
      SELECT idclothing ,name,description FROM clothing; 
END;

 /*insert into clothing(
IDCLOTHINGLINE,
IDCOLOR,
NAME,
DESCRIPTION,
STATUS,
CREATEDATE,
UPDATEDATE
 ) values (2,1,'Polivestidos','Polivestido con fondo negro',1,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)

 

