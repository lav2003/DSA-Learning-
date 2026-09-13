select person_name
from 
    (select person_name, turn,SUM(weight) OVER (ORDER BY turn) AS running_weight
    from Queue
)t
where running_weight <= 1000
order by turn desc
limit 1;
