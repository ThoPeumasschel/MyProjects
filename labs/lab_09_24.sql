

INSERT INTO my_employee VALUES (
    '&Nr.',
    '&&Lastname',
    '&&Firstname',
    lower(substr('&Firstname',1,1) )
    || lower(substr('&Lastname',1,7) ),
    '&Gehalt'
);


UNDEFINE last_name

UNDEFINE first_name