# Write your MySQL query statement below
select Score,(select count(distinct Score) from Scores where Score >= s.Score ) as rank from Scores s order by rank;
