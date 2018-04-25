-- Aufgabe 2

SELECT
    *
FROM
    employees
WHERE
    TO_CHAR(hire_date, 'YYYY') > '2003'
ORDER BY
    hire_date;
