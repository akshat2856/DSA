# Write your MySQL query statement below
SELECT c.name As Customers
FROM Customers c
LEFT JOIN Orders o
on c.id = o.customerId
WHERE o.customerId is NULL