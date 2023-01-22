package com.javarush.task.sql.task14.task1403;

import jakarta.persistence.*;

@Entity
@Table(name = "statistic_view")
public class StatisticView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Column(name = "action_type", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private ActionType type;

    @Column(name = "message", nullable = true)
    private String message;

    @Column(name = "data", nullable = true)
    private Integer data;

    public static enum ActionType {
        UNKNOWN,

        SIGN_UP,
        SIGN_IN,
        TASK_IN_PROGRESS,
        TASK_SOLVED,
        LESSON_UP,
        LEVEL_UP,

        TASK_HELP,
        FRIEND_ADDED,
        INTERNSHIP_START,
        INTERNSHIP_FINISH,
        JOB_SEARCH_START,
        JOB_SEARCH_FINISH,

        QUEST_UP,

        ACHIEVEMENT_AVAILABLE,
        ACHIEVEMENT_IN_PROGRESS,
        ACHIEVEMENT_ACHIEVED,

        RESET_PROGRESS,
    }


    public int getId() {
        return id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public StatisticView.ActionType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public Integer getData() {
        return data;
    }
}
