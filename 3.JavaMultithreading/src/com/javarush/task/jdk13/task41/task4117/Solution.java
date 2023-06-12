package com.javarush.task.jdk13.task41.task4117;

/* 
Приветики в этом чате
*/

public class Solution {
    public static void main(String[] args) {
        UserDB db = new UserDB();
        Chat chat = new Chat(db);
        User user1 = new User(chat, 1, "Леша");
        User user2 = new User(chat, 2, "Боря");
        User user3 = new User(chat, 3, "Чингиз");
        User user4 = new User(chat, 4, "David");

        db.add(user1);
        db.add(user2);
        db.add(user3);
        db.add(user4);

        user1.send("Hello brian", 2);
        user2.send("Hey buddy", 1);
    }
}
