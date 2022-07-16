# Write your MySQL query statement below
select u.name as 'name',
case 
when  u.id not in(select user_id from rides) then 0
else sum(r.distance)     
end as'travelled_distance'  
from users u left join rides  r on u.id=r.user_id
group by r.user_id 
order by travelled_distance desc, u.name;

# SELECT U.NAME AS 'name',
# CASE 
# WHEN U.ID NOT IN (SELECT USER_ID FROM RIDES) THEN 0
# ELSE
# 	SUM(R.DISTANCE) 
# END AS 'travelled_distance'
# FROM USERS U LEFT JOIN RIDES R ON U.ID = R.USER_ID
# GROUP BY R.USER_ID
# ORDER BY travelled_distance DESC,U.NAME