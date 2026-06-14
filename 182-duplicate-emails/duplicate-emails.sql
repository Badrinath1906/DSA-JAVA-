# Write your MySQL query statement below
SELECT email
From Person
GROUP BY email
HAVING count(email)>1;