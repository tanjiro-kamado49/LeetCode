# Write your MySQL query statement below
select u.name , sum(t.amount) as balance
from users u ,transactions t 
WHERE u.account = t.account
group by t.account
HAVING balance > 10000;
