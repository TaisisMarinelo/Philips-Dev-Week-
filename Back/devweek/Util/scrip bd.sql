-- Criando DB;
create database dbcancerdemama;
show databases;
use dbcancerdemama;
show tables;


-- criando user para o projeto;
create user 'DioPhilips'@'localhost' identified by 'Passw123!@';
grant all privileges on *.* to 'DioPhilips'@'localhost';


-- criando o banco;
create table regiao (id INT auto_increment primary key, regiao varchar(20), total_exames int );
create table faixa_etaria (id INT auto_increment primary key, faixa_i int, faixa_n int, descricao varchar(50));
create table incidencia_exame (id INT auto_increment primary key, regiao_id int, mes int, faixa_id int, qnt_exames int);

alter table incidencia_exame add constraint fk_incidencia_exame foreign key (regiao_id) references regiao (id);
alter table incidencia_exame add constraint fk_faixa_etaria foreign key (faixa_id) references faixa_etaria (id);

-- populando o banco;
INSERT INTO regiao (regiao,total_exames) VALUES ('Norte','5');
INSERT INTO regiao (regiao,total_exames) VALUES ('Nordeste','245');
INSERT INTO regiao (regiao,total_exames) VALUES ('Sudeste','706');
INSERT INTO regiao (regiao,total_exames) VALUES ('Sul','0');
INSERT INTO regiao (regiao,total_exames) VALUES ('Centro-Oeste','266');

INSERT INTO faixa_etaria (Faixa_i,Faixa_n,Descricao) VALUES ('0','10','Até 10 anos');
INSERT INTO faixa_etaria (Faixa_i,Faixa_n,Descricao) VALUES ('11','14','Entre 11 e 14 anos');
INSERT INTO faixa_etaria (Faixa_i,Faixa_n,Descricao) VALUES ('15','19','Entre 15 e 19 anos');
INSERT INTO faixa_etaria (Faixa_i,Faixa_n,Descricao) VALUES ('20','24','Entre 20 e 24 anos');
INSERT INTO faixa_etaria (Faixa_i,Faixa_n,Descricao) VALUES ('25','29','Entre 25 e 29 anos');
INSERT INTO faixa_etaria (Faixa_i,Faixa_n,Descricao) VALUES ('30','34','Entre 30 e 34 anos');
INSERT INTO faixa_etaria (Faixa_i,Faixa_n,Descricao) VALUES ('35','39','Entre 35 e 39 anos');
INSERT INTO faixa_etaria (Faixa_i,Faixa_n,Descricao) VALUES ('40','44','Entre 40 e 44 anos');
INSERT INTO faixa_etaria (Faixa_i,Faixa_n,Descricao) VALUES ('45','49','Entre 45 e 49 anos');
INSERT INTO faixa_etaria (Faixa_i,Faixa_n,Descricao) VALUES ('50','54','Entre 50 e 54 anos');
INSERT INTO faixa_etaria (Faixa_i,Faixa_n,Descricao) VALUES ('55','59','Entre 55 e 59 anos');
INSERT INTO faixa_etaria (Faixa_i,Faixa_n,Descricao) VALUES ('60','64','Entre 60 e 64 anos');
INSERT INTO faixa_etaria (Faixa_i,Faixa_n,Descricao) VALUES ('65','69','Entre 65 e 69 anos');
INSERT INTO faixa_etaria (Faixa_i,Faixa_n,Descricao) VALUES ('70','150','Acima de 70');

-- jun/2015
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (1,6,3,1);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (1,6,8,1);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (1,6,9,1);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (1,6,11,1);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (1,6,12,1);


INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,6,2,1);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,6,3,5);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,6,5,5);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,6,6,4);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,6,7,16);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,6,8,28);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,6,9,24);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,6,10,17);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,6,11,11);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,6,12,3);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,6,13,7);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,6,14,4);


INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,6,1,1);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,6,2,2);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,6,3,10);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,6,4,14);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,6,5,15);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,6,6,30);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,6,7,43);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,6,8,36);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,6,9,41);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,6,10,36);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,6,11,24);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,6,12,14);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,6,13,14);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,6,14,10);


INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,6,3,8);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,6,4,12);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,6,5,20);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,6,6,12);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,6,7,12);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,6,8,9);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,6,9,18);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,6,10,10);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,6,11,11);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,6,12,5);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,6,13,3);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,6,14,12);

-- jul/2015
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,7,3,4);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,7,4,1);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,7,5,4);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,7,6,18);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,7,7,29);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,7,8,16);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,7,9,19);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,7,10,11);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,7,11,10);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,7,12,4);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,7,13,2);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (2,7,14,2);


INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,7,2,2);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,7,3,15);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,7,4,21);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,7,5,48);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,7,6,57);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,7,7,51);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,7,8,54);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,7,9,58);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,7,10,36);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,7,11,23);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,7,12,19);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,7,13,6);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (3,7,14,21);


INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,7,3,4);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,7,4,10);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,7,5,12);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,7,6,9);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,7,7,6);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,7,8,30);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,7,9,21);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,7,10,16);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,7,11,10);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,7,12,6);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,7,13,5);
INSERT INTO incidencia_exame (regiao_id, Mes, faixa_id, qnt_exames) VALUES (5,7,14,5);


select * from regiao;
select * from faixa_etaria;


-- excluindo db;
drop database dbcancerdemama;

-- excluindo o user;
drop user 'DioPhilips'@'localhost' ;