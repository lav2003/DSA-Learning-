select class from Courses
group by class
HAVING COUNT(*) >= 5;
