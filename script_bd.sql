CREATE TABLE INGREDIENTES (
	id_ingrediente INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	nome_ingrediente VARCHAR(40) NOT NULL,
	data_ingrediente TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
)
;

CREATE TABLE RECEITAS (
	id_receita INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	nome_receita VARCHAR(40) NOT NULL,
	modo_preparo_receita VARCHAR(650) NOT NULL,
	data_receita TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
)
;

CREATE TABLE REL_RECEITA_INGREDIENTE(
	id_receita INT(6) UNSIGNED,	
	id_ingrediente INT(6) UNSIGNED,
	qtde VARCHAR(20) NOT NULL,
	PRIMARY KEY(id_ingrediente, id_receita)
)
;

INSERT INTO INGREDIENTES(nome_ingrediente) VALUES ('Pão');
INSERT INTO INGREDIENTES(nome_ingrediente) VALUES ('Carne moída');
INSERT INTO INGREDIENTES(nome_ingrediente) VALUES ('Pcte de macarrão (normal)');
INSERT INTO INGREDIENTES(nome_ingrediente) VALUES ('Pcte de macarrão (massa fresca)');
INSERT INTO INGREDIENTES(nome_ingrediente) VALUES ('Ovo');
INSERT INTO INGREDIENTES(nome_ingrediente) VALUES ('Molho de tomate');
INSERT INTO INGREDIENTES(nome_ingrediente) VALUES ('Cebola');
INSERT INTO INGREDIENTES(nome_ingrediente) VALUES ('Açúcar');
INSERT INTO INGREDIENTES(nome_ingrediente) VALUES ('Sal');


INSERT INTO RECEITAS(nome_receita, modo_preparo_receita) VALUES ('Macarronada à bolonhesa', 'Cozinhe o macarrão até ficar no ponto desejado. Prepare o molho em uma panela separada. Sirva-se.');
INSERT INTO RECEITAS(nome_receita, modo_preparo_receita) VALUES ('Pão com ovo', 'Frite o ovo. Corte o pão e coloque o ovo no meio. Sirva-se.');


INSERT INTO REL_RECEITA_INGREDIENTE (id_receita, id_ingrediente, qtde) VALUES(1,3,'1 pct de 500mg');
INSERT INTO REL_RECEITA_INGREDIENTE (id_receita, id_ingrediente, qtde) VALUES(1,2, 'Meio kg');
INSERT INTO REL_RECEITA_INGREDIENTE (id_receita, id_ingrediente, qtde) VALUES(1,7, '1 grande');
INSERT INTO REL_RECEITA_INGREDIENTE (id_receita, id_ingrediente, qtde) VALUES(1,6, '2 pct');

INSERT INTO REL_RECEITA_INGREDIENTE (id_receita, id_ingrediente, qtde) VALUES(2,1, '1 unidade');
INSERT INTO REL_RECEITA_INGREDIENTE (id_receita, id_ingrediente, qtde) VALUES(2,5, '1 unidade');


SELECT * FROM RECEITAS;
SELECT * FROM INGREDIENTES;
SELECT * FROM REL_RECEITA_INGREDIENTE;





select * from RECEITAS;


SELECT rec.nome_receita, ing.nome_ingrediente, rel.qtde
	FROM recipe_to_shopping_list_db.RECEITAS rec INNER JOIN recipe_to_shopping_list_db.INGREDIENTES ing INNER JOIN recipe_to_shopping_list_db.REL_RECEITA_INGREDIENTE rel
ON rel.id_receita = rec.id_receita 
	AND rel.id_ingrediente = ing.id_ingrediente
WHERE rec.id_receita = 1
ORDER BY rec.id_receita 
;


