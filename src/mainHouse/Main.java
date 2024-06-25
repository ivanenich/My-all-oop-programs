package mainHouse;

public class Main {
    public static void main (String[] args){
        //new object
        House house = new House(-1,0,"Brown street", 9999.99);
        //fields
        house.setFloor(-1);
        house.setRoom(0);
        house.setStreet("Brown street");
        house.setPrice(9999.99);
        //methods
        house.countFloor();
        house.countRoom();
        house.bestPrice();

    }
}
