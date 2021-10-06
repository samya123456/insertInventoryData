select * from t_product order by 1 desc;
select * from product_seq order by 1 desc;
select * from t_company order by 1 desc;
select * from t_product_company order by 1 desc;
select * from t_product_company_details order by 1 desc;

==========================================

truncate table product_seq;
drop table product_seq;

update t_product_company  t set t.product_company_quantity =0 where product_company_id =2002;