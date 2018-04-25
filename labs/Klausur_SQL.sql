-- Aufgabe 3
SELECT
    employee_id "Mitarbeiter_Nr.",
    last_name "Nachname",
    job_id "Job",
    TO_CHAR(salary,'$99999') "Monatsgehalt",
    TO_CHAR(hire_date,'fmDD. Month YYYY') "Einstellungsdatum"
FROM
    employees
ORDER BY
    salary DESC;
-- Aufgabe 4

SELECT
    last_name,
    job_id,
    hire_date
FROM
    employees
WHERE
    TO_CHAR(hire_date,'YYYY') LIKE '2003'
    OR   TO_CHAR(hire_date,'YYYY') LIKE '2005'
    OR   TO_CHAR(hire_date,'YYYY') LIKE '2006'
     --TO_CHAR(hire_date,'YYYY') BETWEEN '2003' AND '2005'
ORDER BY
    hire_date ASC;
    
-- Aufgabe 5

SELECT
    last_name
    || ', '
    || job_id "Employe and Job Title"
FROM
    employees
WHERE
    (
        job_id = 'SA_REP'
        OR    job_id = 'ST_CLERK'
    )
    AND   last_name LIKE '_a%';  
-- Aufgabe 6

SELECT
    last_name "Employee",
    salary "Monthly Salary"
FROM
    employees
WHERE
    ( salary * 12 >= 50000 )
    AND   ( salary * 12 <= 100000 )
    AND   department_id NOT IN (
        20,
        50,
        80
    )
ORDER BY
    last_name ASC;
-- Aufgabe 7

SELECT DISTINCT
    job_id,
    department_id,
    location_id
FROM
    employees
    JOIN departments USING ( department_id )
WHERE
    department_id = 80;
-- Aufgabe 8

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
    AND   city = 'Toronto';
-- Aufgabe 9
SELECT
    w.last_name "Mitarbeiter",
    w.employee_id "Mit#",
    m.last_name "Chef",
    m.employee_id "Chef#"
FROM
    employees w
    left OUTER JOIN employees m ON ( w.manager_id = m.employee_id );
-- Aufgabe 10
SELECT
    e.last_name,
    e.job_id,
    d.department_name,
    e.salary,
    grade_level
FROM
    employees e
    JOIN departments d ON ( e.department_id = d.department_id )
    JOIN job_grades j ON ( e.salary BETWEEN j.lowest_sal AND j.highest_sal );

-- Aufgabe 11
SELECT 
    department_id,
    MIN(salary) gehalt
FROM
    employees
WHERE
    department_id IS NOT NULL
GROUP BY
    department_id
HAVING department_id IS NOT NULL
       AND MIN(salary) >= 6000
ORDER BY
    gehalt DESC;

-- Aufgabe 12
SELECT
    d.department_name "Department Name",
    d.location_id "Location",
    COUNT(*) "Number of People",
    round(AVG(e.salary),2) "Average Salary"
FROM
    employees e
    JOIN departments d ON ( e.department_id = d.department_id )
GROUP BY
    e.department_id,
    d.department_name,
    d.location_id;
-- Aufgabe 13
SELECT
    last_name,
    department_id,
    salary
FROM
    employees
WHERE
    salary > ANY (
        SELECT
            min(salary) average
        FROM
            employees
    )
    ;
    
SELECT
    last_name,
    department_id, 
    salary
FROM
    employees
WHERE
    department_id = ANY (
        SELECT
            department_id
        FROM
            employees
        WHERE
            salary = ( select min(salary) 
            from employees)
    );

-- Aufgabe 14
UPDATE employees
    SET
        salary = ( salary * 1.1 )
WHERE
    ( salary * 12 ) < 50000;

-- Aufgabe 15
DELETE FROM departments
WHERE
    department_id NOT
in

( SELECT DISTINCT
    department_id
  FROM
    departments
  WHERE
    department_id IS NOT NULL
);

-- Aufgabe 16

INSERT INTO departments (
    department_id,
    department_name,
    location_id
) VALUES (
    departments_seq.NEXTVAL,
    'Public Relations',
    1500
);

select * from departments;


-- Aufgabe 17

CREATE OR REPLACE VIEW emp_view AS
    SELECT
        employee_id,
        first_name,
        last_name,
        hire_date,
        salary,
        department_name,
        city
    FROM
        employees
        LEFT OUTER JOIN departments d USING ( department_id )
        LEFT OUTER JOIN locations USING ( location_id );

SELECT
    *
FROM
    emp_view;
