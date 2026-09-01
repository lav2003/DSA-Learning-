SELECT ROUND( AVG(CASE WHEN DATEDIFF(customer_pref_delivery_date, order_date) = 0 THEN 1 ELSE 0 END) * 100, 2) AS immediate_percentage
FROM Delivery d
WHERE order_date = (
    SELECT MIN(order_date)
    FROM Delivery
    WHERE customer_id = d.customer_id
);