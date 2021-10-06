create database App;  
use App;

CREATE TABLE t_product (
    product_id integer primary key,
    product_code varchar(255),
    product_name varchar(255),
	product_width integer,
	product_desc varchar(255),
    product_quantity integer,
	product_company_id integer,
    insert_date date
	
);


CREATE TABLE product_seq (
  next_val INT NOT NULL primary key,
  sequence_name varchar(255)
  
);

CREATE TABLE t_company(
company_id integer not null primary key,
company_code varchar(255),
company_name varchar(255),
company_address varchar(255),
insert_date date
);

CREATE TABLE t_product_company(
product_company_id integer not null primary key,
product_id integer,
company_id integer,
product_company_quantity integer,
insert_date date,
update_date date
);

CREATE TABLE t_product_company_details(
product_company_details_id integer not null primary key,
product_company_id integer ,
quantity_affected integer,
mode_of_operation varchar(255),
insert_date date
);


ALTER TABLE t_product_company ADD (

product_purchase_price integer,
product_purchase_currency varchar(5),
product_sale_min_price integer,
product_sale_max_price integer,
product_sale_currency varchar(5)
);
