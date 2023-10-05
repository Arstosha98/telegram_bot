-- liquibase formatted sql

-- changeset ars: create table
create table notification_task(
    id big serial primary key,
    chat_id int8 not null,
    message text not null,
    exec_date timestamp not null
)