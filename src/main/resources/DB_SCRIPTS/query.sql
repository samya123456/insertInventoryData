select prod.product_id,prod.product_code,prod.product_name,comp.company_id ,comp.company_code,comp.company_name,prod_comp.product_company_quantity from t_product prod,t_company comp,t_product_company prod_comp where prod.product_id = prod_comp.product_id and comp.company_id = prod_comp.company_id;


select prod.product_id,prod.product_code,prod.product_name,comp.company_id 
 ,comp.company_code,comp.company_name,prod_comp.product_company_quantity from t_product prod,t_company comp,t_product_company prod_comp 
 where prod.product_id = prod_comp.product_id 
 and comp.company_id = prod_comp.company_id 
 and prod.product_id = ?;
 
select t1.product_company_branch_id ,t1.branch_product_company_quantity from t_product_company_branch t1 
