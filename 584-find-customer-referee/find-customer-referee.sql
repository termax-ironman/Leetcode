# Write your MySQL query statement below

select t.name from customer t 
where t.referee_id != 2 OR t.referee_id IS NULL;
