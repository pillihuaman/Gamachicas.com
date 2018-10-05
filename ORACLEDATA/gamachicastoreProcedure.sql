CREATE OR REPLACE PROCEDURE getstock(
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

 execu


 /*insert into clothing(
IDCLOTHINGLINE,
IDCOLOR,
NAME,
DESCRIPTION,
STATUS,
CREATEDATE,
UPDATEDATE
 ) values (2,1,'Polivestidos','Polivestidos piel de  durazno con flores ',1,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP)*/
 select * from clothing
 

