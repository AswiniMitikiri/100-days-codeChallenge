# Write your MySQL query statement below
Select product_name, year, price from Sales as S
left join Product as P
on S.product_id = P.product_id;