select round(sum(a.tiv_2016),2)as tiv_2016
from 
Insurance a
where concat(a.lat,a.lon) IN (select concat(lat,lon) as location
from Insurance
group by location
having count(concat(lat,lon)) =1) AND 
tiv_2015 IN (select tiv_2015 
    from Insurance group by tiv_2015 having count(tiv_2015)>1 )
