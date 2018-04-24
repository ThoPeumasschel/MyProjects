SELECT
    w.last_name "Mitarbeiter",
    w.employee_id "Mit#",
    m.last_name "Chef",
    m.employee_id "Chef#"
FROM
    employees w
    left OUTER JOIN employees m ON ( w.manager_id = m.employee_id );