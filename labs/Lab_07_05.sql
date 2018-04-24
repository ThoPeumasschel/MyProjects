SELECT
    last_name,
    salary
FROM
    employees
WHERE
    manager_id = (
        SELECT
            employee_id
        FROM
            employees
        WHERE
            last_name = 'King'
          and manager_id IS NULL -- ist nicht!! gleichbedeutend mit 'any' oder 'in'
    );