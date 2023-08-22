package com.javarush.task.task38.task3805;

/* 
Улучшения в Java 7 (multiple exceptions)
*/

public class Solution {
    private final Connection connection;

    public Solution() throws SolutionException {
        try {
            connection = new ConnectionMock();
            connection.connect();
        } catch (WrongDataException | ConnectionException e) {
            throw new SolutionException(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    public void write(Object data) throws SolutionException {
        try {
            connection.write(data);
        } catch (WrongDataException | ConnectionException e) {
            throw new SolutionException(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    public Object read() throws SolutionException {
        try {
            return connection.read();
        } catch (WrongDataException | ConnectionException e) {
            throw new SolutionException(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    public void disconnect() throws SolutionException {
        try {
            connection.disconnect();
        } catch (WrongDataException | ConnectionException e) {
            throw new SolutionException(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    public static void main(String[] args) {

    }
}
