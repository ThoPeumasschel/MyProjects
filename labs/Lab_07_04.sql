SELECT
    e.last_name,
    e.department_id,
    e.job_id
FROM
    employees e 
 --   JOIN departments d ON e.department_id = d.department_id
WHERE
   -- d.location_id = '&Standortkennung';
    department_id in (
        SELECT
            department_id
        FROM
            departments
        WHERE
            location_id = 1700 -- &Enter_Location
    );