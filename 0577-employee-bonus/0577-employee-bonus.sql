Select e.name , b.bonus from Employee as e left join Bonus as b 
on e.empId = b.empId Where b.bonus < 1000 || b.bonus IS null;
