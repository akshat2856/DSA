# Write your MySQL query statement below
select name,bonus 
from Employee as e
left join
Bonus as bo
on e.empId = bo.empId
where 
bo.bonus<1000 or bo.bonus is null;