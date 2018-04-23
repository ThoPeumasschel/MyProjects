SELECT
    last_name,
    job_id,
    salary
FROM
    employees
WHERE
    salary > ANY (
        SELECT
            AVG(salary) average
        FROM
            employees
    )
    AND   department_id = ANY (
        SELECT
            department_id
        FROM
            employees
        WHERE
            last_name LIKE '%u%'
    );