SELECT
    last_name,
    salary
FROM
    employees
WHERE
    ( salary * 12 >= 75000 )
    AND   ( salary * 12 <= 200000 )
  --  ( ( salary * 12 ) BETWEEN 74999 AND 200001 )
    AND   department_id NOT IN (
        20,
        50,
        80
    )
ORDER BY
    last_name DESC;