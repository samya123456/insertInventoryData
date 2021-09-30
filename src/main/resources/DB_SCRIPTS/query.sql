select * from t_product prod,t_company comp,t_product_company prod_comp
where prod.product_id = prod_comp.product_id
and comp.company_id = prod_comp.company_id
and prod.product_id = 1002