package com.company.template;

public abstract class Task {
    TaskLogger logger = new TaskLogger();
    BookEntry entry = new BookEntry();

    public void execute(){
        logger.logTask(this);
        doExecute();
        entry.makeEntry(this);
    }
    
    /**
     * This is template provided by Task class which will be filled by the concrete tasks. 
     * We can also make it non-abstract and keep it empty, in that case this method will be a 
     * hook for the user to implement[We also call this hook pattern]. 
     * */
    abstract protected void doExecute();
    abstract protected String taskName();

    @Override
    public String toString() {
        return taskName();
    }
}
