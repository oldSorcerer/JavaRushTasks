package com.javarush.task.jdk13.task41.task4121;

import com.javarush.task.jdk13.task41.task4121.support.*;

public class CRM {

    private TechSupport techSupport;

    public CRM() {
        techSupport = new CallCenter();
        techSupport.setNextLevel(new HelpDesk())
                .setNextLevel(new SysAdmin())
                .setNextLevel(new ITDirector());
    }

    public void register(String problem) {
        System.out.println(problem);
        techSupport.solve(problem.trim().toLowerCase());
    }
}
