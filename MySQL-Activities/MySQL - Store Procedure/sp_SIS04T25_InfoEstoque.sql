CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_InfoEstoque`()
BEGIN

SELECT ProductID AS 'ID DO PRODUTO',
ProductName AS 'NOME DO PRODUTO',
suppliers.SupplierName AS 'NOME DO FORNCEDOR',
suppliers.Phone AS 'TELEFONE DO FORNECEDOR',
suppliers.City AS 'CIDADE DO FORNECEDOR',
suppliers.Country AS 'PAÍS DO FORNECEDOR',
CategoryID AS 'ID DA CATEGORIA',
Unit AS 'UNIDADE'
FROM Products
JOIN suppliers ON suppliers.SupplierID = products.SupplierID
ORDER BY ProductID,ProductName,SupplierName ASC;

END