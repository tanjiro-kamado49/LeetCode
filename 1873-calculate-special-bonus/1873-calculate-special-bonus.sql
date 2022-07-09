# Write your MySQL query statement below

SELECT employee_id,
CASE 
WHEN employee_id%2<>0 and name NOT like'M%' THEN salary
ELSE 0 END as bonus
from employees
order by employee_id;