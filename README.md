# Tomcat---JSF---Spring-Security---JPA
Um mini projeto utilizando Tomcat - JSF - Spring Security - JPA 


Editar o META-INF/context.xml para a sua base . 

e por na sua base : 

create table usuario_permissao(
usuario int,
permissao varchar(50),
foreign key (usuario) references usuario(idUsuario));


create table usuario (
idUsuario int primary key auto_increment,
login varchar(30) unique,
senha varchar(30), 
ativo boolean );


insert into usuario( login, senha , ativo) values ( "user", "123", 1 );
insert into usuario( login, senha , ativo) values ( "admin", "123", 1 );

insert into usuario_permissao(usuario, permissao) values (1, "ROLE_USUARIO");
insert into usuario_permissao(usuario, permissao) values (2, "ROLE_ADMINISTRADOR");
