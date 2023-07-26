alter table event
    add foreign key (user_id)
        references users (id);