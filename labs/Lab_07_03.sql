SELECT
    last_name,
    job_id
FROM
    employees
WHERE
    department_id = ANY (
        SELECT
            department_id
        FROM
            employees
        WHERE
            ( last_name LIKE '%z%' )
            OR   ( last_name LIKE '%Z%' )
    )
ORDER BY
    last_name;