# Write your MySQL query statement below
#SELECT P.project_id, ROUND(AVG(E.experience_years), 2) AS average_years 
#FROM EMPLOYEE AS E
#LEFT JOIN Project as P
#ON E.employee_id = P.employee_id
#GROUP BY P.project_id;


select p.project_id,Round(sum(e.experience_years)/count(project_id),2) as average_years
 from Project p left join Employee e 
on p.employee_id=e.employee_id
group by project_id;