package com.javarush.task.task30.task3005;

import java.util.ArrayList;
import java.util.List;

/* 
Такие хитрые исключения!
*/

public class Solution {
    public static void main(String[] args) {
        checkAFlag(new D());
    }

    public static void checkAFlag(D d) {
        if (d.cs.get(0).bs.get(0).as.get(0).flag) {
            System.out.println("A's flag is true");
        } else { //all other cases
            System.out.println("Oops!");
        }
    }

    static class A {
        boolean flag = true;
    }

    static class B {
        List<A> as = new ArrayList<>();

        {
            as.add(new A());
        }
    }

    static class C {
        List<B> bs = new ArrayList<>();

        {
            bs.add(new B());
        }
    }

    static class D {
        List<C> cs = new ArrayList<>();

        {
            cs.add(new C());
        }
    }
}
