# Write your MySQL query statement below
Select unique_id, name
from Employees as E 
Left join EmployeeUNI as EUNI
on E.id = EUNI.id