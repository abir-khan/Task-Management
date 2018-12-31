package com.example.noor.taskmanagement;

public class TaskModel {
    @Override
    public String toString() {
        return "TaskModel{" +
                "taskTitle='" + taskTitle + '\'' +
                ", targetScore='" + targetScore + '\'' +
                ", kRA=" + kRA +
                ", kPI=" + kPI +
                ", priority=" + priority +
                ", status=" + status +
                ", taskType=" + taskType +
                ", project=" + project +
                ", submissionDate='" + submissionDate + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", estimatedHour=" + estimatedHour +
                ", completion=" + completion +
                '}';
    }

    public TaskModel() {
    }

    public TaskModel(String taskTitle, String targetScore, int kRA, int kPI, int priority, int status, int taskType, int project, String submissionDate, String dueDate, int estimatedHour, int completion) {

        this.taskTitle = taskTitle;
        this.targetScore = targetScore;
        this.kRA = kRA;
        this.kPI = kPI;
        this.priority = priority;
        this.status = status;
        this.taskType = taskType;
        this.project = project;
        this.submissionDate = submissionDate;
        this.dueDate = dueDate;
        this.estimatedHour = estimatedHour;
        this.completion = completion;
    }

    public String getTaskTitle() {

        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTargetScore() {
        return targetScore;
    }

    public void setTargetScore(String targetScore) {
        this.targetScore = targetScore;
    }

    public int getkRA() {
        return kRA;
    }

    public void setkRA(int kRA) {
        this.kRA = kRA;
    }

    public int getkPI() {
        return kPI;
    }

    public void setkPI(int kPI) {
        this.kPI = kPI;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getTaskType() {
        return taskType;
    }

    public void setTaskType(int taskType) {
        this.taskType = taskType;
    }

    public int getProject() {
        return project;
    }

    public void setProject(int project) {
        this.project = project;
    }

    public String getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public int getEstimatedHour() {
        return estimatedHour;
    }

    public void setEstimatedHour(int estimatedHour) {
        this.estimatedHour = estimatedHour;
    }

    public int getCompletion() {
        return completion;
    }

    public void setCompletion(int completion) {
        this.completion = completion;
    }

    String taskTitle;
    String targetScore;
    int kRA, kPI;
    int priority, status, taskType, project;
    String submissionDate, dueDate;
    int estimatedHour,completion;
}
