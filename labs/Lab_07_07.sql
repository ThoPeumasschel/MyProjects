SELECT
    salary,
    first_name,
    last_name
FROM
    employees
WHERE
    salary > ALL (
        SELECT
            avg(salary)
        FROM
            employees
        WHERE
            department_id = 60
    )
ORDER BY
    last_name;