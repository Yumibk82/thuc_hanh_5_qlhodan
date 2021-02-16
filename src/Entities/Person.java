package Entities;

public class Person {

    private int identity;
    private String name;
    private String DOB;
    private String job;

    public Person(){

    }

    public Person(int identity,String name, String DOB, String job) {
        this.identity = identity;
        this.name = name;
        this.DOB = DOB;
        this.job = job;
    }

    public int getIdentity(){
        return identity;
    }
    public void setIdentity(int identity){
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "identity='"+identity+
                "name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
