SELECT --DISTINCT
    department_id,
    MIN(salary) gehalt
FROM
    employees
WHERE
    department_id IS NOT NULL
GROUP BY
    department_id
HAVING --department_id IS NOT NULL
       AND MIN(salary) > 7000
ORDER BY
    gehalt;