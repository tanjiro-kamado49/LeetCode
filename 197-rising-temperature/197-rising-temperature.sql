# Write your MySQL query statement below
select w1.id from weather as w1 join weather as w2 on datediff(w1.recordDate,w2.recordDate)=1 and
w1.temperature>w2.temperature;


# SELECT
#     W1.id
# FROM Weather W1
# JOIN Weather W2
# ON DATEDIFF(W1.recordDate,W2.recordDate) = 1
# where W1.temperature > W2.temperature 