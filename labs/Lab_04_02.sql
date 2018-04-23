select
    last_name, 
    hire_date,
    hire_date + 6 months as review
from
    employees
    ;