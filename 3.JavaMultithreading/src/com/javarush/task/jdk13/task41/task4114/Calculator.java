package com.javarush.task.jdk13.task41.task4114;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private final Map<String, Operation> operationMap = new HashMap<>();

    public Calculator() {
        Processor processor = new Processor();
        operationMap.put("+", processor::plus);
        operationMap.put("-", processor::minus);
        operationMap.put("*", processor::multiply);
        operationMap.put("/", processor::divide);
    }
    public void calculate(int operand1, String operationSign, int operand2) {
        Operation operation = operationMap.get(operationSign);
        if (operation == null) {
            throw new IllegalStateException("no operation registered for '%s'".formatted(operationSign));
        }
        operation.execute(operand1, operand2);
    }

//    public void calculate1(int operand1, String operationSign, int operand2) {
//        if (operationMap.containsKey(operationSign)) {
//            for (Map.Entry<String, Operation> entry : operationMap.entrySet()) {
//                if (entry.getKey().equals(operationSign)) {
//                    Operation operation = entry.getValue();
//                    operation.execute(operand1, operand2);
//                }
//            }
//        } else {
//            throw new IllegalStateException("no operation registered for '%s'".formatted(operationSign));
//        }
//    }
}
