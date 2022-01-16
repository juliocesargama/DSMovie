# DSMovie - Semana Spring React
#### Status Front-End:Em andamento.
#### Status Back-End: Concluído.

Projeto de uma aplicação para avaliação de filmes a partir da opinião dos usuários de acordo com uma lista estabelecida, bem como a quantidade de avaliações dos usuários e sua respectiva média.

## Tecnologias:
- React com Typescript no Front-End;
- Java no ecossistema Spring Boot no Back-End;
- Banco de dados relacional em memória H2;
- Postgres, para banco de dados relacional local;
- Heroku CLI para deploy em produção;
- Heroku Postgres para banco de dados relacional em produção.

## Características:

No Back-End: 
- Gerenciador Maven;
- Dependências Spring: Web, JPA, H2 (ambiente de testes), Postgres (ambiente de desenvolvivmento) e Security;
- Pageable;
- Padrão de camadas com: Repositories, DTOs, Services e Controllers conforme esquema abaixo:
![padrao-camadas](https://user-images.githubusercontent.com/70298438/149643649-14435609-c508-42aa-a4cf-ad175408ab31.png)

No Front-End: 
- React Router DOM;
- Estilização das páginas HTML com Bootstrap.

#### Modelo Conceitual das Entidades:

![dsmovie-dominio](https://user-images.githubusercontent.com/70298438/149643575-c5e94184-5fee-40f1-a039-bfd0d1e973c2.png)


## Instruções para a Instalação:
Visualização do projeto em funcionamento no [Netlify](https://jcgama-dsmovie.netlify.app/).

Para rodar o projeto no Back-End:

```sh
./mvnw spring-boot:run
```
Para rodar o projeto no Front-End:

```sh
yarn start
```

> Ter a versão 16 do NodeJS e a versão 11 do Java JDK é necessária para executar este projeto.

## Referências:
Evento [Semana Spring React](https://devsuperior.com.br/evento-sds) da escola [Dev Superior](https://devsuperior.com.br/).
