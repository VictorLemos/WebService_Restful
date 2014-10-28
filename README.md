------------------------- WebService Restful + JSON ou XML -------------------------

 WebService simples que disponibiliza um JSON ou XML via Web....
 
 Link do serviço: http://localhost:8080/WebService_Produto_Restful/produto/listarTodos
 
 Banco de dados utilizado: MySQL
 
 Informações: pacote br.com.restful.factory/ classe ConnectionFactory, mudar Usuario e senha para o que você usa
 em seu MySQL....
 
 ------------------------- Banco de dados o que fazer ------------------------------
 
 create schema dahora;
 
 use dahora;
 
 CREATE TABLE PRODUTO
(
    COD_PRODUTO INT (5) AUTO_INCREMENT PRIMARY KEY,
    NM_PRODUTO VARCHAR(20) NOT NULL,
    DS_PRODUTO VARCHAR(50) NOT NULL,
    PRECO DECIMAL(9,2) NOT NULL,
    REF_PRODUTO VARCHAR(50) NOT NULL,
    LOGRADOURO VARCHAR(50) NOT NULL,
    NUMERO INT(6) NOT NULL,
    BAIRRO VARCHAR(25) NOT NULL
)ENGINE=MyISAM;

INSERT INTO PRODUTO (NM_PRODUTO, DS_PRODUTO, PRECO, REF_PRODUTO, LOGRADOURO, NUMERO, BAIRRO )
VALUES('Camisa Polo', '100% algodao', '90.00', 'Camisa Polo Abercrombie','Av marechal ', '3333', 'Longe' );

INSERT INTO PRODUTO (NM_PRODUTO, DS_PRODUTO, PRECO, REF_PRODUTO, LOGRADOURO, NUMERO, BAIRRO )
VALUES('Camiseta', '100% algodao', '45.00', 'Camisa gola careca','Av marechal ', '3333', 'Longe' );