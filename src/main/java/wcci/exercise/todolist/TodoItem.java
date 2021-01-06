package wcci.exercise.todolist;

public class TodoItem {

    private TodoListOwner owner;
    private String name;
    private int timeLimit;


    public TodoItem(TodoListOwner owner, String name, int timeLimit) {
        this.owner = owner;
        this.name = name;
        this.timeLimit = timeLimit;
    }

    public String getName() {
        return name;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public TodoListOwner getOwner() {
        return owner;
    }
}
