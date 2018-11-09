
CREATE or replace PROCEDURE PROGETSTOCK
(
idclothin NUMBER,
v_name OUT VARCHAR2,
v_description OUT VARCHAR2
)
is
 
BEGIN


  SELECT
    name,
    description into v_name,v_description
 
FROM
    clothing;
  
 /* SELECT Full_Name, Age, Nationality, Category, Airline_Name, Class_Type
  FROM Passenger
    JOIN Ticket on Passenger.Passenger_No = Ticket.Passenger_No
    JOIN Airline ON Airline.Airline_No = Ticket.Airline_No
    JOIN Class ON Class.Class_No = Ticket.Class_No;*/

END;
/


CREATE OR REPLACE PROCEDURE p_highest_paid_emp
       (ip_deptno NUMBER,
       op_empno OUT NUMBER,
       op_ename OUT VARCHAR2,
       op_sal OUT NUMBER)
IS
 v_empno NUMBER;
 v_ename VARCHAR2(20);
 v_sal NUMBER;
BEGIN
 SELECT empno, ename, sal
 INTO v_empno, v_ename, v_sal
 FROM emp e1
 WHERE sal = (SELECT MAX(e2.sal)
     FROM emp e2
     WHERE e2.deptno = e1.deptno
     AND e2.deptno = ip_deptno)
  AND deptno = ip_deptno;
 op_empno := v_empno;
 op_ename := v_ename;
 op_sal := v_sal;
END;
/



 