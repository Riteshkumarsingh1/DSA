-- # Write your MySQL query statement below
-- select 'Low Salary' as category,sum(case when income<20000 then 1 else 0 end) as accounts_count
-- from accounts
-- union all
-- select 'Average Salary' , sum(case when income>=20000 and income<=50000 then 1 else 0 end)
-- from accounts
-- union all 
-- select 'High Salary' , sum(case when income>50000 then 1 else 0 end)
-- from accounts

--  another method
with temp as (
    select 'High Salary' as category
    union all 
    select 'Low Salary'
    union all 
    select 'Average Salary'
)
select temp.category , coalesce(accounts_count,0) as accounts_count  from temp left join 
(select category, count(*) as accounts_count
from
 (select case
 when income <20000 then 'Low Salary'
 when income >= 20000 and income <=50000 then 'Average Salary'
 else 'High salary'
 end
 as category from accounts) d group by category) e 
 on temp.category = e.category;