SELECT
    last_name,
    salary
FROM
    employees
WHERE
    salary > 12000
    AND   salray < 5000
ORDER BY
    last_name DESC;