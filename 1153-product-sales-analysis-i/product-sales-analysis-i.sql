# Write your MySQL query statement below

select u.product_name,t.year,t.price from sales t
left join product u
on t.product_id = u.product_id;