CREATE OR REPLACE PROCEDURE getstock(
	   --p_name IN DBUSER.USER_ID%TYPE,
	   o_name OUT clothing.name%TYPE,
	   o_description  OUT  clothing.description%TYPE,
	   o_status OUT clothing.status%TYPE)
IS
BEGIN

  SELECT name , description, status
  INTO o_name, o_description,  o_status 
  from  clothing ;

END;
/