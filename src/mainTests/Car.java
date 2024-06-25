package mainTests;

public class Car {
    private String type;
    private String markCar;
    private String color;
    private double maxSpeed;

    public Car (String type, String markCar, String color, double maxSpeed){
        this.type = type;
        this.markCar = markCar;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public String getType(){
        return type;
    }
    public void setType(String newType){
        type = newType;
    }
    public String getMarkCar(){
        return markCar;
    }
    public void setMarkCar(String newMarkCar){
        markCar = newMarkCar;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public double getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed(double newMaxSpeed){
        maxSpeed = newMaxSpeed;
    }

    public void speed (){
        print("My max speed is " + maxSpeed);
    }
    public void name (){
        print("My mark is " + markCar);
    }
    public void famousColor (){
        print("My famous color is " + color);
    }

    private void print (String srt){
        System.out.println(srt);
    }

}
