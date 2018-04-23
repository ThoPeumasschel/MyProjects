SELECT
    rpad(last_name, 10, ' ')
    || ' earns '
    || TO_CHAR(salary,'$99,999.00')
    || ' monthly but wants '
    || to_char((round(3 * salary,-2)), '$99,999.00') AS "Dream Salaries"
FROM
    employees
ORDER BY
    last_name;