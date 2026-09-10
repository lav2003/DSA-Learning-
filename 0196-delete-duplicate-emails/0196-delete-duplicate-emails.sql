DELETE p from Person  as p  join Person as d
on p.email = d.email
WHERE p.id > d.id ;
