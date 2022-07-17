# Write your MySQL query statement below
select u.name , sum(t.amount) as balance
from users u ,transactions t 
WHERE u.account = t.account
group by u.account
HAVING balance > 10000;


# SELECT a.name, SUM(b.amount) balance
# FROM Users a
# JOIN Transactions b
# ON a.account = b.account
# GROUP BY a.account
# HAVING balance > 10000;