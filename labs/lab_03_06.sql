SELECT
    last_name,
    round(months_between(SYSDATE, hire_date) ) months_worked
FROM
    employees

ORDER BY
    months_worked;