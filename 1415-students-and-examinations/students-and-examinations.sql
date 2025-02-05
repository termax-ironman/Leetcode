# Write your MySQL query statement below

select Students.student_id, student_name, subjects.subject_name, count(Examinations.subject_name) as attended_exams
from Students
join subjects
left join examinations
on Students.student_id = examinations.student_id
and subjects.subject_name = examinations.subject_name
group by 1,2,3
order by 1,3