CREATE DATABASE EcoStyle;

USE EcoStyle;


-- ATENÇÃO! EXPLICAÇÃO DE COMANDOS USADOS NO BANCO:
-- NOT NULL: Usado para indicar que o campo não pode receber valores NULL
-- DEFAULT NULL: Usado para indicar para que caso o campo não seja preenchido, o sistema preenche com valores NULL
-- BIGINT UNSIGNED: Usado para armazenar valores INTEIROS LONGOS
-- ENUM: Delimita que aquela coluna só pode receber os valores direcionados

CREATE TABLE IF NOT EXISTS Customers (
CustomerID BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
CustomerName VARCHAR (40) NOT NULL,
ContactName VARCHAR (40) NOT NULL,
Adress VARCHAR (70) NOT NULL,
City VARCHAR (20) NOT NULL,
PostalCode VARCHAR (10) NOT NULL
);

CREATE TABLE IF NOT EXISTS Categories (
CategoryID INT PRIMARY KEY AUTO_INCREMENT,
CategoryName VARCHAR (40) NOT NULL,
Description VARCHAR (300)
);

CREATE TABLE IF NOT EXISTS Employees (
EmployeeID BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
LastName VARCHAR (15) NOT NULL,
FirstName VARCHAR (15) NOT NULL,
BirthDate DATE NOT NULL,
Adress VARCHAR (50) NOT NULL,
Photo VARCHAR (150) DEFAULT NULL,
Notes VARCHAR (1000) NOT NULL
);

CREATE TABLE IF NOT EXISTS Shippers (
ShipperID INT PRIMARY KEY AUTO_INCREMENT,
ShipperName VARCHAR (25) NOT NULL,
Phone VARCHAR (15) NOT NULL
);

CREATE TABLE IF NOT EXISTS Orders (
OrderID BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
CustomerID BIGINT UNSIGNED NOT NULL,
EmployeeID BIGINT UNSIGNED NOT NULL,
OrderDate DATETIME NOT NULL,
ShipperID INT NOT NULL,
OrderStatus ENUM('ENTREGUE','PENDENTE','CONFIRMADO','ENVIADO','CANCELADO','DEVOLVIDO'),
FOREIGN KEY (EmployeeID) REFERENCES Employees (EmployeeID),
FOREIGN KEY (CustomerID) REFERENCES Customers (CustomerID),
FOREIGN KEY (ShipperID) REFERENCES Shippers (ShipperID)
);

CREATE TABLE IF NOT EXISTS Returns (

ReturnID BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
OrderID BIGINT UNSIGNED NOT NULL,
CustomerID BIGINT UNSIGNED NOT NULL,
RequestDate DATETIME NOT NULL, -- Data do pedido de devolução
ShipperID INT,
ReturnStatus ENUM('SOLICITADA','APROVADA','REJEITADA','AGUARDANDO_COLETA','EM_ANALISE','RECEBIDA','TROCA_REALIZADA')
NOT NULL DEFAULT 'SOLICITADA', -- Definindo status padrão como 'SOLICITADA' para o campo nunca ficar NULL
FOREIGN KEY (OrderID) REFERENCES Orders (OrderID),
FOREIGN KEY (CustomerID) REFERENCES Customers (CustomerID),
FOREIGN KEY (ShipperID) REFERENCES Shippers (ShipperID)
);

CREATE TABLE IF NOT EXISTS Suppliers (
SupplierID INT PRIMARY KEY AUTO_INCREMENT,
SupplierName VARCHAR (50) NOT NULL,
ContactName VARCHAR (50) NOT NULL,
Adress VARCHAR (50) NOT NULL,
City VARCHAR (25) NOT NULL,
PostalCode VARCHAR (10) NOT NULL,
Country VARCHAR (15) NOT NULL,
Phone VARCHAR (15) NOT NULL,
Description VARCHAR (1000) NOT NULL
);

CREATE TABLE IF NOT EXISTS Products (
ProductID BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
ProductName VARCHAR (40) NOT NULL,
SupplierID INT NOT NULL,
CategoryID INT NOT NULL,
Unit VARCHAR (25) NOT NULL,
Price DECIMAL DEFAULT NULL,
Description VARCHAR (1000) NOT NULL,
FOREIGN KEY (CategoryID) REFERENCES Categories (CategoryID),
FOREIGN KEY (SupplierID) REFERENCES Suppliers (SupplierID)
);


CREATE TABLE IF NOT EXISTS Inventory (
InventoryID BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
OrderID BIGINT UNSIGNED NOT NULL,
ProductID BIGINT UNSIGNED NOT NULL,
Quantity INT NOT NULL,
FOREIGN KEY (OrderID) REFERENCES Orders (OrderID),
FOREIGN KEY (ProductID) REFERENCES Products (ProductID)
);

CREATE TABLE IF NOT EXISTS Stock (
  StockID BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
  ProductID BIGINT UNSIGNED NOT NULL,
  QuantityAvailable INT NOT NULL DEFAULT 0,
  UpdatedAt DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, -- Mostra a ultima atualização realizada na table
  FOREIGN KEY (ProductID) REFERENCES Products (ProductID)
);

CREATE TABLE IF NOT EXISTS Logs (
LogID BIGINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
EmployeeID BIGINT UNSIGNED NOT NULL,
ProductID BIGINT UNSIGNED NOT NULL,
Actions VARCHAR (100) NOT NULL,
OldValue VARCHAR(255),
NewValue VARCHAR(255),
ActionDate DATETIME DEFAULT CURRENT_TIMESTAMP, -- Preenche automaticamente na criação do registro 
FOREIGN KEY (EmployeeID) REFERENCES Employees (EmployeeID),
FOREIGN KEY (ProductID) REFERENCES Products (ProductID)
);

-- Tabela INVENTORY foi alterada pois sua funcionalidade estava incorreta
RENAME TABLE Inventory TO OrderDetails;

ALTER TABLE OrderDetails 
ADD COLUMN UnitPrice DECIMAL(10,2) NOT NULL DEFAULT 0.00 
AFTER Quantity,
CHANGE COLUMN InventoryID OrderDetailID BIGINT UNSIGNED AUTO_INCREMENT;

-- DECIMAL (precisão,escala) Precisão: Delimita q qtd de digitoss de um numero (10)
-- Escala: Delimita a qtd de digitos depois da virgula (2) Ex: 99999999.99 
-- (8 antes) + (2 depois) = 10 dígitos no total.

ALTER TABLE Returns
ADD COLUMN UpdatedAt DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, 
-- o comando usado na coluna UpdatedAt serve para mostrar a ultima alteração realizada
MODIFY COLUMN RequestDate DATETIME DEFAULT CURRENT_TIMESTAMP NOT NULL;
-- Coluna alterada para mostrar automaticamente a data em que o cliente realizou o pedido de devolução

ALTER TABLE OrderDetails 
ADD CONSTRAINT uc_order_product UNIQUE (OrderID, ProductID);
-- regra criada para que OrderID e ProductID não se repitam

SELECT * FROM stock;



