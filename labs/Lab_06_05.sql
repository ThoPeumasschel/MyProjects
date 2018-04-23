SELECT
    worker.last_name "Employee",
    worker.employee_id "EMP#",
    manager.last_name "Manager",
    manager.employee_id "Mgr#"
FROM
    employees worker
    JOIN employees manager ON ( worker.manager_id = manager.employee_id )
ORDER BY
    manager.employee_id;