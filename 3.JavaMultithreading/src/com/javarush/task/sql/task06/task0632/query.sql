alter table event
    add foreign key (user_id)
        references users (id)
    on update cascade
    on delete set null;

