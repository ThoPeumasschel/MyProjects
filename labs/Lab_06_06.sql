SELECT
    a.department_id abteilung,
    a.last_name arbeiter,
    k.last_name kollege
FROM
    employees a
    JOIN employees k ON ( a.department_id = k.department_id )
WHERE
    a.employee_id <> k.employee_id
ORDER BY
    a.department_id,
    a.last_name,
    k.last_name;