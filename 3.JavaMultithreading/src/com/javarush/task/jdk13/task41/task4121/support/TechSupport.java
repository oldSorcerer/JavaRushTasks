package com.javarush.task.jdk13.task41.task4121.support;

public abstract class TechSupport {

    private TechSupport nextLevel;

    public TechSupport setNextLevel(TechSupport nextLevel) {
        this.nextLevel = nextLevel;
        return nextLevel;
    }

    protected void passAlongTheChain(String problem) {
        if (nextLevel != null) {
            nextLevel.solve(problem);
        }
    }

    public abstract void solve(String problem);
}