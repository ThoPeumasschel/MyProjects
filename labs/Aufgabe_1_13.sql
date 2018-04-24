SELECT DISTINCT
    job_id,
    department_id,
    location_id
FROM
    employees
    JOIN departments USING ( department_id )
WHERE
    department_id = 20;