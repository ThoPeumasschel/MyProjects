DELETE FROM departments
WHERE
    department_id NOT IN (
        SELECT DISTINCT
            department_id
        FROM
            department_id
        WHERE
            department_id IS NOT NULL
    );

