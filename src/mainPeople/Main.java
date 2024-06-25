package mainPeople;

public class Main {
    public static void main (String[] args){
        //new Object
        People people = new People(-1,1,"Egor", "Ivanenko");
        //fields
        people.setAge(-1);
        people.setGrowth(1);
        people.setName("Egor");
        people.setSecondName("Ivanenko");
        //methods
        people.nameAndSecondName();
        people.age();
        people.growth();

    }
}
