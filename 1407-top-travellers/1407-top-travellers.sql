# Write your MySQL query statement below
select u.name as 'name',
case 
when  u.id not in(select user_id from rides) then 0
else sum(r.distance)     
end as'travelled_distance'  
from users u left join rides  r on u.id=r.user_id
group by r.user_id 
order by travelled_distance desc, u.name;
