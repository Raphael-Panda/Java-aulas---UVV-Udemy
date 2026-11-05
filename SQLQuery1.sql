---administrador
create login rflauzino with password = '123'
--login criado mas sem acesso a nenhum banco





--criar user(dar direitos ao usuario(rflauzino))
create user consulta for login rflauzino
--user consulta relacionado com o login rflauzino




--GRANT concede permissão
--DENY nega permissão
--REVOKE reseta as permissões



-- conceder acesso
grant select on pagar to consulta
-- conceder acesso a 1 coluna especifica
grant select (emp_razaosocial) on empresa to consulta

---------------------------------------------------------------------------------------------------------------------------------------

--Exercicio

create login login_vendas with password = '321'
create user usr_vendas for login login_vendas
grant update, delete on pagar to usr_vendas
deny insert on pagar to usr_vendas
deny delete on receber to usr_vendas
grant select (emp_razaosocial, emp_telefone) on empresa to usr_vendas