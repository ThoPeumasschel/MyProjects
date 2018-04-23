select      job_id, sum(salary) payroll
from        employees
where       job_id not like '%REP%'
Group by    job_id
having      sum(salary) > 13000
order by    sum(salary);