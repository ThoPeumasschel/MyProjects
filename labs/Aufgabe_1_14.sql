SELECT
    last_name,
    department_name,
    location_id,
    city
FROM
    employees
    JOIN departments USING ( department_id )
    JOIN locations USING ( location_id )
WHERE
    commission_pct IS NOT NULL
    AND   city = 'Oxford';

SELECT
    e.last_name,
    d.department_name,
    d.location_id,
    l.city
FROM
    employees e
    JOIN departments d ON e.department_id = d.department_id
    JOIN locations l ON d.location_id = l.location_id
WHERE
    e.commission_pct IS NOT NULL
    AND   l.city = 'Oxford';