SELECT
    employee_id "Mitarbeiter_Nr.",
    last_name "Nachname",
    job_id "Job",
    --TO_CHAR(hire_date,'DD.MM.YY') "Einstellungsdatum", -- 
    (salary ||' €') "Monatsgehalt",
    -- to_char(salary, '99999L') 
    round(months_between(sysdate, hire_date),0) "Einstellungsdatum"
    
FROM
    employees
ORDER BY
    salary DESC;