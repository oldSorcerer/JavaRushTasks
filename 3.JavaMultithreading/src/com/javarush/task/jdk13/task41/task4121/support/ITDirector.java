package com.javarush.task.jdk13.task41.task4121.support;

public class ITDirector extends  TechSupport{
    @Override
    public void solve(String problem) {
        if (problem.matches(".*(договор поставки|аутсорс|аутстафф|корпоратив|премия).*")) {
            System.out.println("\t+ Директор департамента ИТ все рассмотрел и согласовал.");
        } else {
            System.out.println("\t- Директор департамента ИТ решил отправить весь департамент на курсы повышения квалификации.");
        }
    }
}
