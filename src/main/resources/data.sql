/*create table person
(
    id         integer      not null,
    name       varchar(255) not null,
    location   varchar(255),
    birth_date timestamp,
    primary key (id)
);
*/
INSERT INTO PERSON(ID,NAME,LOCATION,BIRTH_DATE) values(100001, 'Ola K', 'Oslo', now());
INSERT INTO PERSON(ID,NAME,LOCATION,BIRTH_DATE) values(100002, 'Ola F', 'Oslo', now());
INSERT INTO PERSON(ID,NAME,LOCATION,BIRTH_DATE) values(100003, 'Ola A', 'Oslo', now());