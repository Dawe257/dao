select product_name from orders left join customers c on c.id = orders.customer_id
where c.name ILIKE ?;