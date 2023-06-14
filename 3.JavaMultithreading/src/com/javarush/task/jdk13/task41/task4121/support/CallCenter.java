package com.javarush.task.jdk13.task41.task4121.support;

public class CallCenter extends  TechSupport{
    @Override
    public void solve(String problem) {
        if (problem.matches(".*(завис|зависло|глючит|глюк|тормозит|лагает|ничего не понимаю|спасити).*")) {
            System.out.println("\t+ Спокойный как удав оператор колл-центра помог решить проблему.");
        } else {
            passAlongTheChain(problem);
        }
    }
}
