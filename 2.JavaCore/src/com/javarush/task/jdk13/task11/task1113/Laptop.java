package com.javarush.task.jdk13.task11.task1113;

public class Laptop {

    private final String name;
    private final OperationSystem os;

    public Laptop(String laptopName, String osName, String osVersion) {
        this.name = laptopName;
        os = new OperationSystem(osName, osVersion);
    }

    public String getName() {
        return name;
    }

    public void updateOs(String version) {
        os.setVersion(version);
    }

    public void printInfo() {
        System.out.println(getName() + " " + os.getName() + " " + os.getVersion());
    }
}
