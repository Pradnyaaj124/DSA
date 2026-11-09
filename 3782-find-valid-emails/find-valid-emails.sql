# Write your MySQL query statement below
SELECT *
FROM Users
WHERE email REGEXP '^[A-Za-z0-9_]+@[A-Za-z]+\\.com$'
ORDER BY user_id ASC;