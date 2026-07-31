CREATE TABLE MY_EMPLOYEE AS
SELECT employee_id,
       first_name,
       last_name,
       department_id,
       salary
FROM employees
WHERE 1 = 2;


INSERT INTO MY_EMPLOYEE
(employee_id, first_name, last_name, department_id)
VALUES
(203, 'Susan', 'Mavris', 40);

SELECT * FROM employees
WHERE employee_id = 203;