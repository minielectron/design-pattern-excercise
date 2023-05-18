package com.company.template.demo;

import com.company.template.GenerateReportTask;
import com.company.template.MoneyTransferTask;
import com.company.template.Task;

public class BankingApplication {

    public static void main(String[] args) {
        Task task = new GenerateReportTask();
        task.execute();

        task = new MoneyTransferTask();
        task.execute();
    }
}
