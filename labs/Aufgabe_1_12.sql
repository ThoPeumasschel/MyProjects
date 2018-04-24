SELECT
    d.department_name,
    d.location_id,
    e.last_name,
    e.job_id,
    to_char(e.salary, '99999L')
FROM
    departments d
    JOIN employees e ON ( d.department_id = e.department_id )
WHERE
    location_id = '&Standortkennung';