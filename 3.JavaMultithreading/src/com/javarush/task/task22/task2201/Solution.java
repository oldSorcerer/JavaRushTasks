package com.javarush.task.task22.task2201;

/* 
Строки нитей или строковые нити? Вот в чем вопрос
*/

public class Solution {
    public static void main(String[] args) {
        new Solution();
    }

    public static final String FIRST_THREAD_NAME = "1#";
    public static final String SECOND_THREAD_NAME = "2#";

    public Solution() {
        initThreads();
    }

    protected void initThreads() {
        Thread thread1 = new Thread(new Task(this, "A\tB\tC\tD\tE\tF\tG\tH\tI"), FIRST_THREAD_NAME);
        Thread thread2 = new Thread(new Task(this, "J\tK\tL\tM\tN\tO\tP\tQ\tR\tS\tT\tU\tV\tW\tX\tY\tZ"), SECOND_THREAD_NAME);
        Thread thread3 = new Thread(new Task(this, "\t\t"), "3#");

        Thread.setDefaultUncaughtExceptionHandler(new OurUncaughtExceptionHandler());

        thread1.start();
        thread2.start();
        thread3.start();
    }

    public synchronized String getPartOfString(String string, String threadName) {

        if (threadName.equals(FIRST_THREAD_NAME)) {
            throw new StringForFirstThreadTooShortException();
        } else if(threadName.equals(SECOND_THREAD_NAME)) {
            throw new StringForSecondThreadTooShortException();
        } else {
//            throw new RuntimeException();
        }

        String[] strings = threadName.split(string);
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i < strings.length; i++) {
            builder.append(strings[i]);
        }

        return builder.toString();
    }
}
