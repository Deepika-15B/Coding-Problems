# Write your MySQL query statement below
SELECT e.name as Employee from employee e inner join employee m on  e.managerid = m.id where e.salary > m.salary

-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna