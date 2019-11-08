select t.Request_at Day,ROUND(sum((case when t.Status like 'cancelled%' then 1 else 0 end))/count(*),2) as'Cancellation Rate'  
from Trips t  
inner join Users u on u.Users_Id = t.Client_Id and u.Banned = 'No'
inner join Users u1 on u1.Users_Id = t.Driver_Id and u1.Banned = 'No'  
where t.Request_at between '2013-10-01'and'2013-10-03' group by t.Request_at;
