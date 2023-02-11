package com.javarush.task.pro.task10.task1023;

public class HologramProjector {
    private String lens;
    private String matrix;
    private String condenser;
    private String lamp;
    private String prism;
    private String mirror;

    public HologramProjector(String lens, String matrix, String condenser, String lamp, String prism, String mirror) {
        this.lens = lens;
        this.matrix = matrix;
        this.condenser = condenser;
        this.lamp = lamp;
        this.prism = prism;
        this.mirror = mirror;
    }

    @Override
    public String toString() {
        return "HologramProjector{" +
                "lens='" + lens + '\'' +
                ", matrix='" + matrix + '\'' +
                ", condenser='" + condenser + '\'' +
                ", lamp='" + lamp + '\'' +
                ", prism='" + prism + '\'' +
                ", mirror='" + mirror + '\'' +
                '}';
    }
}
