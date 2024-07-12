# Write your MySQL query statement below
#Select name from Customer where id NOT IN (SELECT id FROM Customer where referee_id = 2)

Select name from Customer where referee_id != 2 OR referee_id IS NULL;