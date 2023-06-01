package com.javarush.task.jdk13.task41.task4109;

/* 
Протоклоны
*/

public class Solution {

    public static void main(String[] args) {
        CguRequisition prototype = new CguRequisition();
        prototype.id = 31;
        prototype.user = new User();
        prototype.user.displayName = "anonymous";

        CguRequisition requisitionClone = (CguRequisition) prototype.clone();
        System.out.println("Users should be different objects:");
        System.out.println(prototype.user + " - user");
        System.out.println(requisitionClone.user + " - cloned user");
        System.out.println(prototype.user.displayName);
        System.out.println(requisitionClone.user.displayName);
    }
}
