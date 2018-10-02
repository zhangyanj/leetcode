# Write your MySQL query statement below
select e.name as Employee from Employee e left join Employee on e.ManagerId = Employee.Id where e.Salary > Employee.Salary;
