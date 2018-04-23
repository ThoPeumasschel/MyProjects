SELECT
    employee_id,
    last_name,
    salary,
    round(salary * 1.155, 0) "New Salary",
    round(salary * 1.155, 0) - salary "Increase"
FROM
    employees;