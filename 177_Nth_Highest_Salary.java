CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    Declare M INT;
    set M=N-1;
  RETURN (
      # Write your MySQL query statement below.
      select IFNULL((select distinct Salary from Employee order by Salary desc limit M, 1), null) as getNthHighestSalary
  );
END
