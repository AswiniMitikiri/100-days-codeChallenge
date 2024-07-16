# Write your MySQL query statement below
SELECT P.project_id, ROUND(AVG(E.experience_years), 2) AS average_years 
FROM Project AS P
LEFT JOIN Employee as E
ON E.employee_id = P.employee_id
GROUP BY project_id;

