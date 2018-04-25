-- Aufgabe 2
SELECT
    *
FROM
    employees
WHERE
    TO_CHAR(hire_date, 'YYYY') > '2003'
ORDER BY
    hire_date;
--- Aufgabe 3
SELECT
    last_name,
    job_id,
    salary,
    commission_pct
FROM
    employees
WHERE
    commission_pct IS NOT NULL
ORDER BY
    salary DESC;
---Aufgabe 4
describe locations
select * from locations;
-- Aufgabe 5
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
-- Aufgabe 6
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
-- Aufgabe 7
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
-- Aufgabe 8
SELECT
    first_name,
    salary,
    phone_number
FROM
    employees
WHERE
    TO_CHAR(hire_date,'YYYY') LIKE '2003'
    OR   TO_CHAR(hire_date,'YYYY') LIKE '2004'
    OR   TO_CHAR(hire_date,'YYYY') LIKE '2005'
     --TO_CHAR(hire_date,'YYYY') BETWEEN '2003' AND '2005'
ORDER BY
    hire_date DESC;
-- Aufgabe 9
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
-- Aufgabe 10
SELECT
    last_name,
    salary
FROM
    employees
WHERE
    ( salary * 12 >= 75000 )
    AND   ( salary * 12 <= 200000 )
 --   ( ( salary * 12 ) BETWEEN 75000 AND 200000 )
    AND   department_id NOT IN (
        20,
        50,
        80
    )
ORDER BY
    last_name DESC;
-- Aufgabe 11
SELECT
    last_name,
    salary, 
    DECODE(commission_pct,'NULL','No','Yes') provisionsberechtigt
FROM
    employees;
-- Aufgabe 12
SELECT
    d.department_name,
    d.location_id,
    e.last_name,
    e.job_id,
    to_char(e.salary, '99999L')
FROM
    departments d
    JOIN employees e ON ( d.department_id = e.department_id )
WHERE
    location_id = '&Standortkennung';
-- Aufgabe 13
SELECT DISTINCT
    job_id,
    department_id,
    location_id
FROM
    employees
    JOIN departments USING ( department_id )
WHERE
    department_id = 20;
-- Aufgabe 14
SELECT
    last_name,
    department_name,
    location_id,
    city
FROM
    employees
    JOIN departments USING ( department_id )
    JOIN locations USING ( location_id )
WHERE
    commission_pct IS NOT NULL
    AND   city = 'Oxford';

SELECT
    e.last_name,
    d.department_name,
    d.location_id,
    l.city
FROM
    employees e
    JOIN departments d ON e.department_id = d.department_id
    JOIN locations l ON d.location_id = l.location_id
WHERE
    e.commission_pct IS NOT NULL
    AND   l.city = 'Oxford';
-- Aufgabe 15
SELECT
    w.last_name "Mitarbeiter",
    w.employee_id "Mit#",
    m.last_name "Chef",
    m.employee_id "Chef#"
FROM
    employees w
    left OUTER JOIN employees m ON ( w.manager_id = m.employee_id );
-- Aufgabe 16
SELECT --DISTINCT
    department_id,
    MIN(salary) gehalt
FROM
    employees
WHERE
    department_id IS NOT NULL
GROUP BY
    department_id
HAVING department_id IS NOT NULL
       AND MIN(salary) > 7000
ORDER BY
    gehalt;
-- Aufgabe 17
SELECT
    d.department_name "Abteilung",
    d.location_id "Location",
    COUNT(*) "Angestelltenzahl",
    round(AVG(e.salary),2) "Durchschnittsgehalt"
FROM
    employees e
    JOIN departments d ON ( e.department_id = d.department_id )
GROUP BY
    e.department_id,
    d.department_name,
    d.location_id
--ORDER BY
--    e.department_id
;
-- Aufgabe 18
SELECT
    last_name,
    department_id,
    salary
FROM
    employees
WHERE
    department_id IN (
        SELECT
            department_id
        FROM
            employees
        WHERE
            salary = (
                SELECT
                    MAX(salary)
                FROM
                    employees
            )
    );
-- Aufgabe 19
UPDATE employees
    SET
        salary = ( salary * 1.2 )
WHERE
    ( salary * 12 ) < 50000;

ROLLBACK;
-- Aufgabe 20
DELETE FROM departments
WHERE
    department_id NOT IN (
        SELECT DISTINCT
            department_id
        FROM
            department_id
        WHERE
            department_id IS NOT NULL
    );

