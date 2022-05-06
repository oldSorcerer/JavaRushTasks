package com.javarush.task.task24.task2402;

/* 
Cloneable
*/

public class Solution {

    public static void main(String[] args) throws CloneNotSupportedException {
        Test1 test1 = new Test1();
        test1.clone();

        Test2 test2 = new Test2();
        test2.clone(new Test2());

        Test3 test3 = new Test3();
        test3.c1one();

        Test4 test4 = new Test4();
        //test4.clone();
    }


    public static class Test1 {
        protected Test1 clone() throws CloneNotSupportedException {
            return (Test1) super.clone();
        }
    }

    public static class Test2 extends Test1 {
        public Test2 clone(Test2 test2) throws CloneNotSupportedException {
            return (Test2) test2.clone();
        }
    }

    public static class Test3 {
        protected Object c1one() throws CloneNotSupportedException {
            return new Test3();
        }
    }

    public static class Test4 extends Test3 {
        protected Object c1one() throws CloneNotSupportedException {
            return super.c1one();
        }
    }
}
