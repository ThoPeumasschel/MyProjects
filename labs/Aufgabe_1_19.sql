UPDATE employees
    SET
        salary = ( salary * 1.2 )
WHERE
    ( salary * 12 ) < 50000;

ROLLBACK;