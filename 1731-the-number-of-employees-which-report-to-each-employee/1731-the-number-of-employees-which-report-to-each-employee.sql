select m.employee_id,  m.name,  count(e.employee_id) AS reports_count, 
round(avg(e.age), 0) AS average_age
from Employees m
join Employees e on m.employee_id = e.reports_to
group by m.employee_id
order by m.employee_id;
