/*
nome da pessoa e o valor que ela deve pagar para o governo com a precisão de duas casas decimais.

Rodrigo Cavanhaman
URI 2745
Taxas
 */
select name, round(salary*10/100,2) AS tax
    from people
    where salary>3000;
