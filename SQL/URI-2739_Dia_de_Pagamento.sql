/*-------------------*
| Rodrigo CavanhaMan |
| URI 2739           |
| Dia de Pagamento   |
*--------------------*
nomes e o dia do mês que cada cliente deve pagar sua parcela.
Obrigatoriamente o dia do mês precisa ser um inteiro.
*/
select name, CAST((EXTRACT(DAY FROM payday)) AS int) as day
    from loan;

/*
-- Syntax for CAST:  
CAST ( expression AS data_type [ ( length ) ] )  

-- Syntax for CONVERT:  
CONVERT ( data_type [ ( length ) ] , expression [ , style ] ) 

SELECT  CAST(10.6496 AS int) as trunc1,
 */
