# Write your MySQL query statement below
select distinct l1.Num as ConsecutiveNums from Logs l1,Logs l2,Logs l3 where L2.Id = L1.Id-1 and L3.Id = L2.Id-1 and L1.Num = L2.Num and L2.Num = L3.Num;
