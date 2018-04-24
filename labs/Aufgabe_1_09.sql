SELECT
    last_name
    || '. '
    || job_id "Mitarbeiter und Job"
FROM
    employees
WHERE -- job_id in ('SA_REP', 'ST_CLERK')
    (job_id = 'SA_REP'
    OR    job_id = 'ST_CLERK')
    AND   last_name LIKE '_e%';