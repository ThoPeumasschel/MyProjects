SELECT
    last_name,
    salary, 
    DECODE(commission_pct,'NULL','No','Yes') provisionsberechtigt
FROM
    employees;