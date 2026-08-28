CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_TotalPedidosTransportadora`()
BEGIN

SELECT shippers.ShipperName AS 'NOME DA TRANSPORTADORA',
COUNT(orders.OrderID) AS 'TOTAL DE PEDIDOS'
FROM shippers
LEFT JOIN orders ON orders.ShipperID = shippers.ShipperID
GROUP BY shippers.ShipperID, shippers.ShipperName;
END