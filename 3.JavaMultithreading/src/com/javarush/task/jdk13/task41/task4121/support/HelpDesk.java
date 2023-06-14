package com.javarush.task.jdk13.task41.task4121.support;

public class HelpDesk extends TechSupport {
    @Override
    public void solve(String problem) {
        if (problem.matches(".*(мышь|мышка|клавиатура|монитор|принтер|картридж|катридж|гудит|жужжит|скрипит).*")) {
            System.out.println("\t+ Юркие хелпдески в полевых условиях исправили все что сломалось.");
        } else {
            System.out.println("\t- Ребятам из хелпдеска не удалось побороть проблему.");
            passAlongTheChain(problem);
        }
    }
}
