package com.javarush.task.task35.task3508;

import java.util.List;

/* 
extends vs super
*/

public abstract class Solution {
    public abstract <T> void one(List<T> destination, List<T> source);

    public abstract <T> void two(List<T> destination, List<? extends T> source);

    public abstract <T> void three(List<? super T> destination, List<T> source);

    public abstract <T> void four(List<? super T> destination, List<? extends T> source);
}
