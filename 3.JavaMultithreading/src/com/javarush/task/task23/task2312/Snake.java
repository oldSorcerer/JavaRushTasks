package com.javarush.task.task23.task2312;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс змея
 */
public class Snake {

    private final List<SnakeSection> sections; // Список кусочков змеи.
    private SnakeDirection direction; // Направление движения змеи
    private boolean isAlive; // Состояние - жива змея или нет.

    public Snake(int x, int y) {
        sections = new ArrayList<>();
        sections.add(new SnakeSection(x, y));
        isAlive = true;
    }

    public List<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    /**
     * Метод перемещает змею на один ход.
     * Направление перемещения задано переменной direction.
     */
    public void move() {
        if (!isAlive) return;

        switch (direction) {
            case UP -> move(0, -1);
            case RIGHT -> move(1, 0);
            case DOWN -> move(0, 1);
            case LEFT -> move(-1, 0);
        }
    }

    /**
     * Метод перемещает змею в соседнюю клетку.
     * Координаты клетки заданы относительно текущей головы с помощью переменных (dx, dy).
     */
    private void move(int dx, int dy) {
        // Создаем новую голову - новый "кусочек змеи".
        SnakeSection head = sections.get(0);
        head = new SnakeSection(head.getX() + dx, head.getY() + dy);

        // Проверяем - не вылезла ли голова за границу комнаты
        checkBorders(head);
        if (!isAlive) return;

        // Проверяем - не пересекает ли змея  саму себя
        checkBody(head);
        if (!isAlive) return;

        // Проверяем - не съела ли змея мышь.
        Mouse mouse = Room.game.getMouse();
        if (head.getX() == mouse.getX() && head.getY() == mouse.getY()) // съела
        {
            sections.add(0, head);                  // Добавили новую голову
            Room.game.eatMouse();                   // Хвост не удаляем, но создаем новую мышь.
        } else // просто движется
        {
            sections.add(0, head);                  // добавили новую голову
            sections.remove(sections.size() - 1);   // удалили последний элемент с хвоста
        }
    }

    /**
     * Метод проверяет - находится ли новая голова в пределах комнаты
     */
    private void checkBorders(SnakeSection head) {
        if ((head.getX() < 0 || head.getX() >= Room.game.getWidth())
                || head.getY() < 0 || head.getY() >= Room.game.getHeight()) {
            isAlive = false;
        }
    }

    /**
     * Метод проверяет - не совпадает ли голова с каким-нибудь участком тела змеи.
     */
    private void checkBody(SnakeSection head) {
        if (sections.contains(head)) {
            isAlive = false;
        }
    }
}
