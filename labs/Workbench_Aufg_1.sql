SELECT quartal, umsatz,
	CASE	WHEN umsatz <5000000 THEN 'ROT'
			WHEN (umsatz >5000000) and (umsatz >12000000) then 'GRÜN'
            when umsatz >5000000  then 'GELB'
            
	END as 'Status Umsatz'
        
FROM `uebungsdatenbank`.`umsatz`;
