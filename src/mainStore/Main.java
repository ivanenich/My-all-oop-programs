package mainStore;

public class Main {
     public static void main (String[] args){
         //new object
         Dog dog = new Dog("Charly", -2, "isn't barking", "isn't biting", "good and happy");

         //import the fields
        dog.setNameDog("Charly");
        dog.setAgeDog (-2);
       dog.setBarkingDog ("isn't barking");
        dog.setBiteDog ("isn't biting");
        dog.setEmotionsDog ("good and happy");
         //methods
         dog.name();
         dog.age();
         dog.barking();
         dog.bite();
         dog.emotions();
     }
}
