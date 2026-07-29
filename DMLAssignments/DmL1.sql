INSERT INTO employees
VALUES (207, 'Michael', 'Hartstein', 'MHARTSTEIN', '1234567890',
        TO_DATE('17-JUN-2007', 'DD-MON-YYYY'),
        'IT_PROG', 13000, NULL, NULL, 20);
        
        SELECT * FROM employees
WHERE employee_id = 207;