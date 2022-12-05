package com.example.task_01;

public class Greeting {

    private String name;
    public String timeOfDay;

    public Greeting(String name, String timeOfDay){
        this.timeOfDay = timeOfDay;
        this.name = name;
    }

    public Greeting(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}
