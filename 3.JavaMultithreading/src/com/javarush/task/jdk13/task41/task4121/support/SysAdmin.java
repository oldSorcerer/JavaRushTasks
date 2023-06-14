package com.javarush.task.jdk13.task41.task4121.support;

public class SysAdmin extends TechSupport {
    @Override
    public void solve(String problem) {
        if (problem.matches(".*(системная ошибка|доменная политика|база данных|резервная копия|сервер).*")) {
            System.out.println("\t+ Бородатый админ выслушал проблему и от этого она решилась сама собой.");
        } else {
            System.out.println("\t- Сисадмин походил с бубном вокруг проблемы и продолжил плевать в потолок.");
            passAlongTheChain(problem);
        }
    }
}
