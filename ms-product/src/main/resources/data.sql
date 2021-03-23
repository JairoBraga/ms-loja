INSERT INTO tb_category (name) VALUES ('eletronicos');
INSERT INTO tb_category (name) VALUES ('informatica');
INSERT INTO tb_category (name) VALUES ('vestuario');


INSERT INTO tb_product (name, price) VALUES ('computador', 2000.00);
INSERT INTO tb_product (name, price) VALUES ('celular', 3000.00);
INSERT INTO tb_product (name, price) VALUES ('camiseta', 70.00);


INSERT INTO tb_product_category (product_id, category_id) VALUES (1, 2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (1, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (3, 3);