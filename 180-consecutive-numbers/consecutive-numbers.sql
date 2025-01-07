# Write your MySQL query statement below

SELECT DISTINCT num as ConsecutiveNums
FROM (
    SELECT num, LEAD(num) OVER (ORDER BY id) as next_num, LAG(num) OVER (ORDER BY id) as prev_num
    FROM Logs
) temp
WHERE num = next_num AND num = prev_num;