select * from t_product order by 1 desc;
select * from product_seq order by 1 desc;
select * from t_company order by 1 desc;
select * from t_product_company order by 2 desc;
select * from t_product_company_details order by 1 desc;
select * from t_product_company_branch order by 1 desc;
select * from t_branch;
==========================================

truncate table t_product_company_branch;
drop table t_product_company_branch;

update t_product_company  t set t.product_company_quantity =0 where product_company_id =2002;