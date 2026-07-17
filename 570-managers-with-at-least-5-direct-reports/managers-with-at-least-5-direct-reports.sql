select e.name
from Employee as e
join Employee as ee
on
e.id=ee.managerId
group by ee.managerId
having count(*)>=5