# Write your MySQL query statement below
select s.user_id,ROUND(ifnull(sum(co.action='confirmed')/count(co.action),0),2) as confirmation_rate
from Signups  as s
left join Confirmations as co
on s.user_id = co.user_id
group by s.user_id;