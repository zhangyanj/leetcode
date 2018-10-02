SELECT dep.Name as Department, emp.Name as Employee, emp.Salary 
from Department dep, Employee emp 
where emp.DepartmentId=dep.Id 
and (select count(distinct e1.Salary) from Employee e1 where e1.Salary > emp.Salary and e1.DepartmentId = emp.DepartmentId) < 3 order by dep.Id,emp.Salary desc;
