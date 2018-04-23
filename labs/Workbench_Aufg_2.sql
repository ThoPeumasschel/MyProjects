select  
	CASE	when geschlecht = 'm' then 'Herr'
			when geschlecht = 'w' then 'Frau'
	end as 'Anrede',
    Vorname, Name, Geschlecht
    
from mitarbeiter;