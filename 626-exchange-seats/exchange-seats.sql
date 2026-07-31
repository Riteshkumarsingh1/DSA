# Write your MySQL query statement below
select id,
case 
when id%2 =0 then lag(student) over (order by id)
WHEN id % 2 = 1 AND id != (SELECT MAX(id) FROM Seat) then lead(student) over (order by id)
else student
end as student
from Seat
order by id