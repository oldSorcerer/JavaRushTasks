package com.javarush.task.jdk13.task35.task3506;

import java.util.List;

/* 
extends vs super
*/

public abstract class Solution {
    public abstract <T> void one(List destination, List source);

    public abstract <T> void two(List destination, List source);

    public abstract <T> void three(List destination, List source);

    public abstract <T> void four(List destination, List source);
}
