package ru.netology.javaqa;

public class Epic extends Task {
    protected String[] subtasks = new String[0];

    public EpicTask(int id, String[] subtasks) {
        super(id); // вызов родительского конструктора
        this.subtasks = subtasks; // заполнение своих полей
    }

    public String [] subtasks() {
        return subtasks;
    }
}
