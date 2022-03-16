# Philips Dev Week 

*Desenvolvimento do projeto Sistema de Consulta do Banco de dados de Tratamento de Câncer de Mama do SUS*



### Tabela de conteúdos

<!--ts-->

   * [Sobre](#Sobre)
   * [Pré-Requisitos](#pre-requisitos)
   * [Como usar](#como-usar)
      * [Banco de Dados](#banco-de-dados)
      * [Back-end](#back-end)
      * [Font-end](#Font-end)
   * [Testes](#testes)
   * [Tecnologias](#tecnologias)
<!--te-->



##  [Sobre](#Sobre)

A Philips Dev Week foi uma semana com aulas exclusivas para construir junto com experts um Sistema de Consulta para Tratamento de Câncer de Mama do SUS. Oferecido pela Philips e a Digital Innovation One. 

Com duração entre os dias 08/03 a 11/03.

O projeto consistiu em copiar os dados disponíveis do sistema [[Data SUS](http://tabnet.datasus.gov.br/cgi/deftohtm.exe?siscolo/sismama/DEF/BRCMAMA.def)] do período de Jul/2015 e Jun/2015. Implementar essas informações no banco de dados, construir um back-end da API para a tratativa e passagem das informações, e construir um front-end para exibição dessas informações em forma de listagem. 

Links disponibilizados pela instrutora do projeto com o github do que foi criado.

 https://github.com/julianazanelatto/devweek

https://github.com/julianazanelatto/frontangular

https://github.com/julianazanelatto/devWeekJavaTest




## [Pré-Requisitos](#pre-requisitos)

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:  [[Postman ](https://www.postman.com/?msclkid=73fcd4a4a56811ecba9fe94e4184434a)], [[ IntelliJ ](https://www.jetbrains.com/pt-br/idea/download/#section=windows)], [[Visual Studio Code ](https://code.visualstudio.com/?msclkid=8c3f8a3aa56811ecb7506a96f8c7dc4a)].

Além do  [[Java 11](https://www.oracle.com/java/technologies/downloads/?msclkid=b9cbf748a56811ecbee4356179aaa9ef)],  [[MySQL Workbench](https://dev.mysql.com/downloads/workbench/?msclkid=2bf33a25a56811ecb04959e892fac868)], [[Angular CLI](https://angular.io/cli)], [[Node.js](https://nodejs.org/en/?msclkid=4c3ba5b4a56811ec81cae9952949cf66)], [Git](https://git-scm.com) .




## [Como usar](#como-usar)

Para rodar a aplicação clone este repositório git  com o comando:

- Escolha uma pasta. 
- Botão da direita do mouse -  Git Bash Here

- git clone <https://github.com/>		complete com o endereço correto.
- Pronto siga os  próximos passos pra iniciar a aplicação.




## [Banco de Dados](#banco-de-dados)

Como esse treinamento tinha o objetivo de ser o mais direto possível, o BD foi todo criado  diretamente no Workbench. Abaixo segue o script está na pasta útil do back-end você deve começar criando o usuário do projeto e dando as permissões necessárias para a comunicação e alteração do mesmo. Após execute a criação do banco, a criação das tabelas e popular o banco com os dados do sistema DATA SUS todos já encontram-se no script.




## [Back-end](#back-end)

Após a realização do download,  abra a IDE Intelijj e importe o projeto em: Open -> Selecione o local que salvou o projeto ->  clique em ok.

Aguarde que a IDE realize toda a  implementação, como estamos usando o Intelijj o mesmo não tem suporte ao Spring Boot então ao concluir verifique o arquivo  src/main/java/resources/application.properties pois ser for seu primeiro uso do Spring no canto direito superior dentro do arquivo  application.properties será solicitado a instalação de um plug-in para o funcionamento da aplicação.

Após esse passo abra o arquivo, src/main/java/com.dio_class.devweek/ DevweekApplication.java e execute com o atalho:

- Shift+F10 -para execução do Intelijj.

A aplicação estará online após a exibição da mensagem: 

![image-20220316114447501](https://github.com/TaisisMarinelo/Philips-Dev-Week-/blob/main/Back/devweek/Util/imagens/image-20220316114447501.png)

Assim já e possível testar. Abra o aplicativo Postman, abaixo segue a lista de endpoints:

- Regiões 
  - GET :  http://localhost:8080/api/regioes  - Que retorna uma lista de regiões;
  - GETBYID:  http://localhost:8080/api/regioes/{id} - Que retorna o Id informado;
  - POST: http://localhost:8080/api/regioes/insert -  Que recebe um Body/raw/JSON passando apenas região e total exames e retorna status ok.  {\r\n\"regiao\": \"Centro\",\r\n\"totalExames\": 15\r\n}
  - DELETEBYID: http://localhost:8080/api/regioes/delete/{id} - Que deleta a informação de acordo com o Id informado;
- Faixa Etária
  - GET :  http://localhost:8080/api/faixa-etaria  - Que retorna uma lista de faixa etária;
  - GETBYID:   http://localhost:8080/api/faixa-etaria/{id} - Que retorna o Id informado;
  - POST:  http://localhost:8080/api/faixa-etaria/insert  -  Que recebe um Body/raw/JSON passando apenas faixa inicial e final e a descrição e retorna status ok.  {\r\n\"faixaI\": 170,\r\n\"faixaN\": 180,\r\n\"descricao\": \"De 170 a 180 anos\"\r\n}
  - DELETEBYID: http://localhost:8080/api/faixa-etaria/delete/{id} - Que deleta a informação de acordo com o Id informado;
- Incidências Exames
  - GET :  http://localhost:8080/api/ocorrencias  - Que retorna uma lista de incidências de exames;
  - GETBYID:   http://localhost:8080/api/ocorrencias/{id} - Que retorna o Id informado;
  - POST:  http://localhost:8080/api/ocorrencias/insert  -  Que recebe um Body/raw/JSON passando o ID da região, o mês o ID da faixa etária e a quantidade de exames e retorna status ok.  
  - {\r\n\"regiaoId\": 3,\r\n\"mes\": 6,\r\n\"faixaId\": 8,\r\n\"qntExames\": \"9\"\r\n}
  - DELETEBYID:http://localhost:8080/api/ocorrencias/delete/{id} - Que deleta a informação de acordo com o Id informado;




## [Font-end](#Font-end)

Para visualizar a listagem completa no frontend que foi o intuito do projeto, e necessário abrir a IDE Visual Studio. Vá em Arquivo -> Abrir pasta -> navegue até o local que salvou os arquivos-> selecione a pasta e clique em selecionar pasta.

Ao abrir a IDE irá perguntar se você confia nos autores. Escolha a opção Sim, confio nos autores os arquivos serão carregados. 

Na parte superior da IDE selecione Terminal-> Novo Terminal. E execute um dos comandos abaixo, para que o serviço do front seja iniciado utilizando o arquivo de configuração correto. 

-  ng serve --proxy-config proxy.config.js		ou  	 npm rum start

Após você receberá uma informação como a imagem a seguir:

![image-20220316171911684](https://github.com/TaisisMarinelo/Philips-Dev-Week-/blob/main/Back/devweek/Util/imagens/image-20220316171911684.png)

O próprio Angular irá informar o endereço copie e cole ele no navegador para ter acesso a lista com as informações como mostrado a seguir:

http://localhost:4200/

![image-20220316172119660](https://github.com/TaisisMarinelo/Philips-Dev-Week-/blob/main/Back/devweek/Util/imagens/image-20220316172119660.png)

![image-20220316172453304](https://github.com/TaisisMarinelo/Philips-Dev-Week-/blob/main/Back/devweek/Util/imagens/image-20220316172453304.png)

![image-20220316172542233](https://github.com/TaisisMarinelo/Philips-Dev-Week-/blob/main/Back/devweek/Util/imagens/image-20220316172542233.png)




## [Tecnologias](#tecnologias)

- JAVA11 JDK [[Java Downloads | Oracle](https://www.oracle.com/java/technologies/downloads/?msclkid=b9cbf748a56811ecbee4356179aaa9ef)]
- Workbench MySQL [[MySQL :: Download MySQL Workbench](https://dev.mysql.com/downloads/workbench/?msclkid=2bf33a25a56811ecb04959e892fac868)]
- Spring BOOT IO[www.start.spring.io ]
  - Project Maven, Languae Java, SpringBoot 2.6.4, JAR, JAVA11
  - Dependências : Data JPA, Boot Dev Tools, Spring Web, MySQL Driver
- Angular CLI [[Angular CLI](https://angular.io/cli)]
- Nodes JS [[Node.js (nodejs.org)](https://nodejs.org/en/?msclkid=4c3ba5b4a56811ec81cae9952949cf66)]
- MVNRepository [https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api/2.3.0]
- [Git](https://git-scm.com)

- Postman [[Postman API Platform | Sign Up for Free](https://www.postman.com/?msclkid=73fcd4a4a56811ecba9fe94e4184434a)]
- Intelijj [[Baixar IntelliJ IDEA: o Java IDE capaz e ergonômico da JetBrains](https://www.jetbrains.com/pt-br/idea/download/#section=windows)]
-  Visual Studio Code [[Visual Studio Code - Code Editing. Redefined](https://code.visualstudio.com/?msclkid=8c3f8a3aa56811ecb7506a96f8c7dc4a)]




## [Testes](#testes)

E possível executar os testes pela classe DevweekApplicationTests.java que esta em src/teste/java/com.dio_class.devweek. A mesma está executando testes de API, que validam os códigos HTTP de resposta dos endpoint. Para executar esses teste basta abrir a classe e utilizar o atalho:

- Shift+F10 -para execução do Intelijj.

O retorno dos testes e visto a seguir:

![image-20220316110906959](https://github.com/TaisisMarinelo/Philips-Dev-Week-/blob/main/Back/devweek/Util/imagens/image-20220316110906959.png)




###  Autor
---

<img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/86530227?s=400&u=0d9654e6e52418f574e3461f5b80681f320e1289&v=4" width="100px;" alt=""/>
<br />
<sub><b>Taisis Marinelo</b></sub></a> <a title="Rocketseat">🚀</a>


Feito com ❤️ por Taisis Marinelo.
👋🏽 Entre em contato!

[![ Linkedin Badge ](https://img.shields.io/badge/-TaisisMarinelo-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https:https://www.linkedin.com/in/taisis-marinelo/)](https://www.linkedin.com/in/taisis-marinelo/)
[![Selo do Gmail](https://img.shields.io/badge/-taisismarinelo@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:taisismarinelo@gmail.com)](mailto:taisismarinelo@gmail.com)
