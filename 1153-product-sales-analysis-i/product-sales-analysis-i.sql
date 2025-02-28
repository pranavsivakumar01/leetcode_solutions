SELECT product_name, year, price 
FROM sales AS t1 
inner JOIN product AS t2 
ON t1.product_id = t2.product_id;
