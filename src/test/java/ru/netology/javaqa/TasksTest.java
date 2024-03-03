package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {
    @Test
    public void testSimpleTaskMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSimpleTaskNoMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Написать");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMeetingMatches() {
        Meeting meeting = new Meeting(5, "Все о космосе", "Запуск ракеты", "12.04.2024");

        boolean actual = meeting.matches("космосе");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMeetingNoMatches() {
        Meeting meeting = new Meeting(5, "Все о космосе", "Запуск ракеты", "12.04.2024");

        boolean actual = meeting.matches("Луна");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMeetingMatches2() {
        Meeting meeting = new Meeting(5, "Все о космосе", "Запуск ракеты", "12.04.2024");

        boolean actual = meeting.matches("Запуск");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testEpicMatches() {
        String[] subtasks = { "Заключить договор", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Заключить");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testEpicNoMatches() {
        String[] subtasks = { "Заключить договор", "Яйца", "Хлеб" };
        Epic epic = new Epic(55, subtasks);

        boolean actual = epic.matches("Позвонить");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }


}
