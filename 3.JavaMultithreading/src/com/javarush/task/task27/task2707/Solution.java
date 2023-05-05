package com.javarush.task.task27.task2707;

/* 
Определяем порядок захвата монитора
*/

public class Solution {
    public void someMethodWithSynchronizedBlocks(Object obj1, Object obj2) {
        synchronized (obj1) {
            synchronized (obj2) {
                System.out.println(obj1 + " " + obj2);
            }
        }
    }

    public static boolean isLockOrderNormal(final Solution solution, final Object o1, final Object o2) throws Exception {

        synchronized (o1) {
            Thread thread = new Thread(() -> {
                synchronized (o2) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            new Thread(() -> solution.someMethodWithSynchronizedBlocks(o1, o2)).start();
            thread.start();
            Thread.sleep(50);
            return thread.getState() != Thread.State.BLOCKED;
        }
    }

    public static void main(String[] args) throws Exception {
        final Solution solution = new Solution();
        final Object o1 = new Object();
        final Object o2 = new Object();

        System.out.println(isLockOrderNormal1(solution, o1, o2));
    }

    private static volatile boolean flag = false;
    private static volatile boolean isInnerThreadBlocked = false;

    public static boolean isLockOrderNormal1(final Solution solution, final Object o1, final Object o2) throws Exception {
        //do something here
        synchronized (o1) {
            Thread outerThread = new Thread(() -> {
                Thread innerThread = new Thread(() -> solution.someMethodWithSynchronizedBlocks(o1, o2));
                innerThread.start();

                while (innerThread.getState() != Thread.State.BLOCKED) ;
                isInnerThreadBlocked = true;
                synchronized (o2) {
                    flag = true;
                }
            });
            outerThread.setDaemon(true);
            outerThread.start();

            while (!isInnerThreadBlocked) {
                Thread.sleep(1);
            }
            while (outerThread.getState() != Thread.State.BLOCKED && outerThread.isAlive()) {
                Thread.sleep(1);
            }
        }
        return flag;
    }


}
