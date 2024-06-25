package mainHouse;

public class House {
    private int floor;
    private int room;
    private String street;
    private double price;
    //constructor
    public House (int floor, int room, String street, double price){
        this.floor = floor;
        this.room = room;
        this.street = street;
        this.price = price;
    }
    // GET and SET
    public int getFloor(){
        return floor;
    }
    public void setFloor(int newFloor){
        floor = newFloor;
        if (floor > 0){
        }else {
            System.out.println("don't correct count floor" + newFloor);
        }
    }
    public int getRoom(){
        return room;
    }
    public void setRoom(int newRoom){
        if (room>0){
        }else {
            System.out.println("don't correct count floor");
        }
        room = newRoom;
    }
    public String getStreet(){
        return street;
    }
    public void setStreet(String newStreet){
        street = newStreet;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double newPrice){
        price = newPrice;
        if (price<10000){
            System.out.println("don't correct price");
        } else if (price>10001) {
            System.out.println("correct price");
        }
    }
    //methods
    public void countFloor(){
        print("It have " + floor + " floors");
    }
    public void countRoom(){
        print("It have " + room + " rooms");
    }
    public void bestPrice(){
        print("It have the best price " + price + "!!!!");
    }
    //encapsulation
    private void print(String srt){
        System.out.println(srt);
    }




}
