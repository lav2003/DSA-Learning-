select s.user_id ,round (count(case when c.action='confirmed' then 1 end)/count(*),2)  as confirmation_rate from Signups as s left join Confirmations as c  on s.user_id = c.user_id 
GROUP BY s.user_id; 

-- SELECT user_id,
--        ROUND(
--            COUNT(CASE WHEN c.action = 'confirmed' THEN 1 END) / COUNT(*),
--            2
--        ) AS confirmation_rate
-- FROM Signups AS s
-- LEFT JOIN Confirmations AS c
--     ON s.user_id = c.user_id
-- GROUP BY s.user_id;
