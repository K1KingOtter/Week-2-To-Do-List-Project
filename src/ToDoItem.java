public class ToDoItem {
    private String description;
    private boolean isDone;

    // TODO Now:
    public ToDoItem(String newDescription){
        this.description = newDescription;
        isDone = false;
    }
    // Add getters and setters for each field
    //Getters
    public String GetDescription(){
        return description;
    }
    public boolean GetStatus(){
        return isDone;
    }

    //Setters
    public void SetDescription(String newDescription){
        description = newDescription;
    }

    public void SetStatus(boolean newStatus){
        isDone = newStatus;
    }
}
