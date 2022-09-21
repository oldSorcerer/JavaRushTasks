package com.javarush.task.task23.task2304;

import java.util.List;
import java.util.Map;

/* 
Inner 3
*/

public class Solution {

    private List<Task> tasks;
    private List<String> names;

    private final DbDataProvider taskDataProvider = new TaskDataProvider();
    private final DbDataProvider nameDataProvider = new NameDataProvider();

    public void refresh() {
        Map taskCriteria = MockView.getFakeTaskCriteria();
        taskDataProvider.refreshAllData(taskCriteria);

        Map nameCriteria = MockView.getFakeNameCriteria();
        nameDataProvider.refreshAllData(nameCriteria);
    }

    private interface DbDataProvider<T> {
        void refreshAllData(Map criteria);
    }

    class Task {
    }

    private class TaskDataProvider implements DbDataProvider<Task> {

        @Override
        public void refreshAllData(Map criteria) {

        }
    }

    private class NameDataProvider implements DbDataProvider<String>{

        @Override
        public void refreshAllData(Map criteria) {

        }
    }


    public static void main(String[] args) {

    }
}
