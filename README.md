# Desvantagens do JDBC

- JDBC permite a integração entre aplicações
Java e banco de dados
- A forma de uso é a mesma para todos os
bancos de dados
- JDBC expõe a linguagem SQL ao
programador
- SQL nem sempre é padronizado
- Às vezes, as queries são complexas de montar


# Frameworks ORM

- Em aplicações orientadas a objetos,
normalmente são criadas classes para
representar conceitos existentes na
aplicação
- Estas classes são, no final das contas,
mapeadas para tabelas do banco de dados,
com o objetivo de persistir os dados
- Os frameworks do tipo Object-Relational
Mapping facilitam este mapeamento

# Hibernate

- O Hibernate é um framework ORM
- Gratuito e open source
- Site oficial : http://www.hibernate.org
- Pode ser utilizado em aplicações standalone
e aplicações web

# Entidades

- Entidades são classes Java que serão
mapeadas para tabelas no banco de dados
- As entidades são classes POJO (Plain Old Java Object)
- Devem ter uma ou mais propriedades que serão
utilizadas como chave na tabela
- Atributos e métodos getters e setters
- O Hibernate consegue mapear atributos sem getters
e/ou setters definidos, mas utilizá-los é mais
adequado
- Presença de um construtor sem argumentos

# Configurando o Hibernate

- Para que o Hibernate funcione
adequadamente, ele deve ser configurado
- Os JARs necessários devem ser colocados no
classpath
- Criação dos arquivos .hbm.xml
- Criação do arquivo hibernate.cfg.xml
- Define como o Hibernate será integrado com o banco
de dados da aplicação

# SessionFactory

- A SessionFactory é responsável por criar os
objetos Session


- O ideal é usar apenas um objeto
SessionFactory para toda a sua aplicação


# Session

- A Session é utilizada para executar operações,
que serão refletidas no banco de dados

- A session pode ser utilizada para executar
mais de uma operação

# Operações da Session

- save() -> Cria a entidade no banco de dados.
- update() -> Atualiza uma entidade existente no banco de dados.
- delete() -> Exclui uma entidade do banco de dados.
- load() -> Carrega uma entidade no banco de dados através do seu ID.
- createQuery() -> Cria um objeto Query a partir de uma expressão HQL, que possibilita executar queries no banco de dados.

# Associações

- O Hibernate gerencia também as
associações entre entidades, escondendo a
linguagem SQL usada no processo

## Tipos de associação

- Many-to-One (Muitos-para-Um)
- One-to-Many (Um-para-Muitos)
- One-to-One (Um-para-Um)
- Many-to-Many (Muitos-para-Muitos)
- Associações podem ser unidirecionais ou
bidirecionais

# HQL

- Hibernate Query Language
- Linguagem similar ao SQL
- A HQL usa os conceitos de orientação a
objetos

## Cláusulas from e as

- from : Seleciona o tipo da entidade a ser retornada
- as : alias para a entidade

## Cláusula select

- Filtra os resultados, trazendo apenas os
dados desejados das entidades

## Associações

- HQL é capaz de associar entidades automaticamente

## Joins

- HQL permite fazer joins entre entidades

### Tipos de joins suportados
- inner join
- left outer join
- right outer join

## Cláusula where

- Estipula condições sobre os dados que
devem ser selecionados pela query

## Funções de Agregação

- A HQL suporta algumas funções de agregação

# Considerações sobre a HQL

- Permite escrever queries de forma
orientada a objetos, sem pensar em termos
de bancos de dados
- A HQL é bastante extensa, e o que foi visto
aqui cobre o básico, que é o mais utilizado
- Para maiores informações, consulte a
documentação do Hibernate






