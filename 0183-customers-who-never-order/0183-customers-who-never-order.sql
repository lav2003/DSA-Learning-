-- select  c.name as  Customers from Customers as c 
-- join Orders as o on c.id = o.id
-- where o.customerId is null;

-- SELECT c.name AS Customers
-- FROM Customers c
-- LEFT JOIN Orders o
--     ON c.id = o.customerId
-- WHERE o.customerId IS NULL;


select name as Customers
from Customers
where id not in (select customerId from Orders);
