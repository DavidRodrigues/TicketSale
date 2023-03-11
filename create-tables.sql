CREATE TABLE public.bilhete (
id bigserial,
numero_bilhete varchar,
passageiro_id bigint,
voo_id bigint ,
CONSTRAINT bilhete_pkey PRIMARY KEY (id)
);

CREATE TABLE public.passageiro (
id bigserial,
nome varchar,
email varchar,
telefone varchar,
CONSTRAINT passageiro_pkey PRIMARY KEY (id)
);


CREATE TABLE public.voo (
id bigserial,
numero_voo varchar,
codigo_aeroporto_partida varchar,
codigo_aeroporto_chegada varchar,
data_hora_partida timestamp,
data_hora_chegada timestamp,
total_assento integer,
total_assento_vendido integer,
preco float,
CONSTRAINT voo_pkey PRIMARY KEY (id)
);