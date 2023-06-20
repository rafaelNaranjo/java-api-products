create extension "uuid-ossp";

DROP TABLE IF EXISTS public.products;

CREATE TABLE public.products(
    id uuid default gen_random_uuid() primary key,
    name varchar(100) not null,
    description TEXT
);