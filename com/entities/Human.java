package com.entities;

public class Human
{
    protected String name;
    protected int age;
    protected boolean disability;

    public Human()
    {
        this.name = "";
        this.age = -1;
        this.disability = false;
    }
    public Human(String name, int age, boolean disability)
    {
        this.name = name;
        this.age = age;
        this.disability = disability;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDisability() {
        return this.disability;
    }

    public void setDisability(boolean disability) {
        this.disability = disability;
    }
}
