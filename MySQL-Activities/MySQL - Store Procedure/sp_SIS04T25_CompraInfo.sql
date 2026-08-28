CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_CompraInfos`()
BEGIN

SELECT customers.CustomerName AS 'NOME DO CLIENTE',
customers.Address AS 'ENDEREÇO DO CLIENTE',
customers.City AS 'CIDADE DO CLIENTE',
customers.Country AS 'PAÍS DO CLIENTE',
orders.OrderID AS 'ID DO PEDIDO',
orders.OrderDate AS 'DATA DO PEDIDO',
shippers.ShipperName AS 'NOME DA TRANSPORTADORA'
FROM orders
JOIN shippers ON shippers.ShipperID = orders.ShipperID
JOIN customers ON customers.CustomerID = orders.CustomerID;
END