# Write your MySQL query statement below

select t.name,t.population,t.area from world t
where t.area >= 3000000 or t.population >= 25000000;