# Write your MySQL query statement below
select e.name
from Employee as e
join Employee ee
on e.id = ee.managerId
group by ee.managerId
having count(*) >= 5;
