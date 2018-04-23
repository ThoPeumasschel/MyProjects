
SELECT
    lpad(employee_id, 10, ' ')
    || ', '
    || lpad(first_name, 10, ' ')
    || ', '
    || lpad(last_name, 10, ' ')
    || ', '
    || lpad(email, 10, ' ')
    || ', '
    || lpad(phone_number, 10, ' ')
    || ', '
    || hire_date
    || ', '
    || job_id
    || ', '
    || salary
    || ', '
    || commission_pct
    || ', '
    || manager_id
    || ', '
    || department_id AS the_output
FROM
    employees;