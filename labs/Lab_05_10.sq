SELECT
    COUNT(*) "Anzahl Mitarbeiter",
    SUM(DECODE(TO_CHAR(hire_date,'YYYY'),2005,1,0) ) "2005",
    SUM(DECODE(TO_CHAR(hire_date,'YYYY'),2006,1,0) ) "2006",
    SUM(DECODE(TO_CHAR(hire_date,'YYYY'),2007,1,0) ) "2007",
    SUM(DECODE(TO_CHAR(hire_date,'YYYY'),2008,1,0) ) "2008"
FROM
    employees;