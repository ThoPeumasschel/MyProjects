SELECT
    initcap(last_name) "Name",
    length(last_name) "Length"
FROM
    employees
WHERE
    last_name LIKE upper('&Anfangsbuchstabe%')
ORDER BY
    last_name;