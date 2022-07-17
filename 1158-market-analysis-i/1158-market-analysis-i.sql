# Write your MySQL query statement below
select u.user_id as buyer_id,u.join_date,
case
   when u.user_id in(select buyer_id from orders) then count(o.order_date)
   else 0
  end as orders_in_2019 
  from  users as u left join orders as o
  on u.user_id=o.buyer_id and o.order_date like'2019%'
group by u.user_id;
