# Write your MySQL query statement below
Select customer_id, count(V.visit_id) as count_no_trans
from Visits as V
Left join Transactions as T
on V.visit_id = T.visit_id where T.visit_id IS NULL
group by customer_id;


