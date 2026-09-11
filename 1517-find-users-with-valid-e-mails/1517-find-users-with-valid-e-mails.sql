SELECT *
FROM Users
WHERE REGEXP_LIKE(mail,'^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode[.]com$','c');



-- SELECT *
-- FROM Users
-- WHERE mail REGEXP '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode[.]com$'
--   AND mail NOT REGEXP '@leetcode[.]COM$';