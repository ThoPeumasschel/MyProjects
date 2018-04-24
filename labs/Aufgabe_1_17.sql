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