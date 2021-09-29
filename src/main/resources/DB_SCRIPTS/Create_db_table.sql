create database App;  
use App;

CREATE TABLE t_product (
    product_id integer primary key,
    product_code varchar(255),
    product_name varchar(255),
	product_width integer,
	product_desc varchar(255),
    product_quantity integer,
	product_company_id integer
	
);


CREATE TABLE product_seq (
  next_val INT NOT NULL,
  sequence_name varchar(255),
  PRIMARY KEY (next_val)
)
