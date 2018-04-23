SELECT
    e.last_name,
    e.department_id,
    e.job_id
FROM
    employees e
 --   JOIN departments d ON e.department_id = d.department_id
WHERE
   -- d.location_id = '&Standortkennung';
   department_id = any (select department_id from departments
   where location_id =1700)
   ;