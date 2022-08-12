package com.javarush.task.jdk13.task41.task4121;

import com.javarush.task.jdk13.task41.task4121.support.TechSupport;

public class CRM {

    private TechSupport techSupport;

    public CRM() {
        this.techSupport = new TechSupport();
    }

    public void register(String problem) {
        System.out.println(problem);
        techSupport.solve(problem.trim().toLowerCase());
    }
}
