# Write your MySQL query statement below
select MAX(salary) as SecondHighestSalary
from Employee
where salary<(select max(salary) from Employee);