SELECT
    last_name,
    trunc( (SYSDATE - hire_date) / 7) weeks_worked
FROM
    employees
WHERE
    department_id = 90
ORDER BY
    weeks_worked DESC;