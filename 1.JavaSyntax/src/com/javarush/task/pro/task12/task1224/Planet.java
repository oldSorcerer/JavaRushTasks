package com.javarush.task.pro.task12.task1224;

import java.util.Random;

public class Planet {
    public OrbitalStation[] stations;
    private final String name;

    public Planet(String name) {
        this.name = name;
    }

    public static class OrbitalStation {
        public ControlSystem controlSystem = new ControlSystem();
        private final String name;

        public OrbitalStation(String name) {
            this.name = name;
        }

        public static class ControlSystem {
            private final Interface[] interfaces;

            private ControlSystem() {
                interfaces = new Interface[100500];
                for (int i = 0; i < interfaces.length; i++) {
                    interfaces[i] = new Interface(new Boolean(i % 2 == 0));
                }
                int random = new Random().nextInt(interfaces.length);
                interfaces[random].answer = Boolean.TRUE;
            }

            public Integer getInterfacesNumber() {
                return interfaces.length;
            }

            public Boolean connect(Integer index) {
                return interfaces[index].answer;
            }

            public static class Interface {
                private Boolean answer;

                public Interface(Boolean answer) {
                    this.answer = answer;
                }
            }
        }
    }
}
