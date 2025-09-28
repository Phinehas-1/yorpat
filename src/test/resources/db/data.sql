drop table if exists users cascade ;
create table users (user_is_logged_in boolean not null, id uuid not null, first_name varchar(255) not null, last_name varchar(255) not null, phone_number varchar(255) not null unique, role varchar(255) not null, primary key (id));
INSERT INTO users (id, first_name, last_name, phone_number, role, user_is_logged_in) VALUES
  ('11111111-1111-1111-1111-111111111111', 'Phinehas', 'Amos', '07043759865', 'admin', false),
  ('22222222-2222-2222-2222-222222222222', 'Emmanuel', 'Ojuneku', '07043759866', 'admin', false),
  ('33333333-3333-3333-3333-333333333333', 'Victoria', 'Idowu', '07043759867', 'participant', false);
