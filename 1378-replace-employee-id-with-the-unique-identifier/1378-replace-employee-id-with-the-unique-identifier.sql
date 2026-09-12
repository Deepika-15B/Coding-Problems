# Write your MySQL query statement below
SELECT u.unique_id,e.name FROM Employees e
LEFT JOIN EmployeeUNI u ON u.id = e.id;


-- Synced seamlessly with LeetHub Pro
-- Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
-- Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna