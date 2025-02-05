# Write your MySQL query statement below

select u.unique_id,t.name from employees t
left join employeeuni u
on t.id = u.id;