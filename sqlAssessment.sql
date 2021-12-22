--Create Languages Table
create sequence language_sequence start with 1 increment by 1;

create table languages(
id_language int primary key,
name_language varchar(100)
);

--Create countries table
create sequence countries_sequence start with 1 increment by 1;

create table countries(
id_country int primary key,
name_country varchar(100),
capital varchar(100),
population int,
id_language references languages(id_language)
);

--Inserts

insert into languages values(language_sequence.nextval, 'Spanish');
insert into languages values(language_sequence.nextval, 'English');
insert into countries values(countries_sequence.nextval, 'Mexico', 'Mexico City', 50,1);
insert into countries values(countries_sequence.nextval, 'United States', 'Washington DC', 50,2);

--Updates

update countries set population = 250000 where id_country = 1;

--Delete

delete from countries where population > 10000;

--Joining tables

select name_country,capital,population,name_language
from countries c
inner join languages l
on l.id_language = c.id_language;

--Group by

select count(id_country) "Number of Countries",name_language "Language Spoken"
from countries c
inner join languages l
on l.id_language = c.id_language
group by name_language;
