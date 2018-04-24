SELECT
    last_name
FROM
    employees
WHERE
    last_name LIKE 'J%'
    OR   last_name LIKE 'K%'
    OR   last_name LIKE 'L%'
    OR   last_name LIKE 'M%'
    --SUBSTR(last_name, 1, 1) IN ('J', 'K', 'L', 'M')
ORDER BY
    last_name;