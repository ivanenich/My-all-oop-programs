package mainPeople;

public class People {
    private int age;
    private double growth;
    private String name;
    private String secondName;

    public People(int age, double growth, String name, String secondName){
        this.age = age;
        this.growth = growth;
        this.name = name;
        this.secondName = secondName;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int newAge){
        age = newAge;
        if (age > 0){
        }else {
            System.out.println("incorrect age " + age);
        }
    }
    public double getGrowth(){
        return growth;
    }
    public void setGrowth(double newGrowth){
        growth = newGrowth;
        if (growth > 4.0){
        } else if (growth > 15.0) {
        } else {
            System.out.println("incorrect growth " + growth);
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public String getSecondName(){
        return secondName;
    }
    public void setSecondName(String newSecondName){
        secondName = newSecondName;
    }
    public void nameAndSecondName(){
        System.out.println("My name is " + name + " and my second name is " + secondName);
    }
    public void age(){
        System.out.println("My age is " + age);
    }
    public void growth(){
        System.out.println("My growth is " + growth);
    }
    private void print(String srt){
        System.out.println(srt);
    }
}
