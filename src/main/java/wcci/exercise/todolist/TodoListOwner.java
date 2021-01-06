package wcci.exercise.todolist;

import java.util.Collection;

public class TodoListOwner {

    private String ownerName;
    private Collection<TodoItem> tasks;

    public TodoListOwner(String ownerName, Collection<TodoItem> tasks) {
        this.ownerName = ownerName;
        this.tasks = tasks;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public Collection<TodoItem> getTasks() {
        return tasks;
    }
}
