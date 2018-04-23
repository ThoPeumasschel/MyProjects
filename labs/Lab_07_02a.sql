SELECT
    job_id,
    last_name, 
    salary
from
    employees
where salary > 
    (
        SELECT
            AVG(salary)
        FROM
            employees
    )
    
order by salary;
    