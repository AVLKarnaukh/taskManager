package ru.netology.javaqa;

public class Meeting extends Task {
    protected String topic;
    protected String project;
    protected String start;


    public MeetingTask(int id, String topic) {
        super(id); // вызов родительского конструктора
        this.topic = topic; // заполнение своих полей
        this.project = project;
        this.start = start;
    }


    public String getTopic() {
        return topic;
    }
    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            return true;
        }
        if (project.contains(query)) {
            return true;
        }
        return false;
    }
}
