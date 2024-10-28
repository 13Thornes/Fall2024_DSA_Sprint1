public class User {
    private String userName;
    private TaskList toDoList;

    public User(String username) {
        this.userName = username;
        this.toDoList = new TaskList();
    }

    public void addTask(String taskDescription, int location){
        this.toDoList.addTask(taskDescription, location);
    }

    public void markTaskComplete(String taskDescription) {
        this.toDoList.markTaskComplete(taskDescription);
    }

    public void showAllTasks() {
        System.out.println(userName + "'s To Do List");
        this.toDoList.showAllTasks();
    }
}
