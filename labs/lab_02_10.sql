SELECT
    employee_id,
    last_name,
    salary,
    department_id manager_id
FROM
    employees
WHERE
    manager_id = &mgr_eingabe
ORDER BY
    &sortierung;