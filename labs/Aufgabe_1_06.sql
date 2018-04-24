SELECT
    last_name,
    --round(((SYSDATE - hire_date) / 30),0) AS monate --Zu ungenau!!!
    --round(months_between(sysdate, hire_date),0) monate
    trunc(Months_between(sysdate, hire_date) / 12) years,
    trunc(mod(Months_between(sysdate, hire_date), 12)) months
FROM
    employees
ORDER BY
    Months_between(sysdate, hire_date) DESC;