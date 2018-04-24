SELECT
    arb.last_name arbeiter,
    arb.hire_date arb_datum,
    mgr.last_name manager,
    mgr.hire_date mgr_datum
FROM
    employees arb
    JOIN employees mgr ON ( arb.manager_id = mgr.employee_id )
WHERE
    arb.hire_date < mgr.hire_date
ORDER BY
    1;