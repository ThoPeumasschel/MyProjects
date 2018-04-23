SELECT
    rpad(last_name,9, '{')
    || ' '
    || rpad(' ',salary / 1000,'}') employees_and_their_salaries
FROM
    employees
ORDER BY
    salary DESC;