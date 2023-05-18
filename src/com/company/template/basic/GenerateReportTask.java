package com.company.template.basic;

public class GenerateReportTask {
    BasicLogger logger = new BasicLogger();
    BasicBookEntry entry = new BasicBookEntry();

    public void execute() {
        logger.log("Logging the task");
        System.out.println("Performing generate report operation");
        entry.entry("Making entry for generate report task");
    }

    public String taskName() {
        return "Report Generation";
    }
}
