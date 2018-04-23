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
            (last_name LIKE '%u%') or (last_name LIKE '%U%') 
    )
ORDER BY
    last_name;