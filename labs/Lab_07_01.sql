UNDEFINE enter_name

SELECT
    last_name,
    hire_date
FROM
    employees
WHERE
    department_id = (
        SELECT
            department_id
        FROM
            employees
        WHERE
            last_name = '&&Enter_name'
    )
    AND   last_name <> '&Enter_name'
ORDER BY
    last_name;