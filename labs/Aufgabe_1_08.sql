SELECT
    first_name,
    salary,
    phone_number
FROM
    employees
WHERE
    TO_CHAR(hire_date,'YYYY') LIKE '2003'
    OR   TO_CHAR(hire_date,'YYYY') LIKE '2004'
    OR   TO_CHAR(hire_date,'YYYY') LIKE '2005'
     --TO_CHAR(hire_date,'YYYY') BETWEEN '2003' AND '2005'
ORDER BY
    hire_date DESC;