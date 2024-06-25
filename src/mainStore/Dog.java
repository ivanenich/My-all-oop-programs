package mainStore;

public class Dog {
    private String nameDog;
    private int ageDog;
    private String barkingDog;
    private String biteDog;
    private String emotionsDog;

    public Dog(String nameDog, int ageDog, String barkingDog, String biteDog, String emotionsDog){
        this.nameDog = nameDog;
        this.ageDog = ageDog;
        this.barkingDog = barkingDog;
        this.biteDog = biteDog;
        this.emotionsDog = emotionsDog;
    }

    public String getNameDog(){
        return nameDog;
    }
    public void setNameDog(String newName){
        nameDog = newName;
    }
    public int getAgeDog(){
        return ageDog;
    }
    public void setAgeDog(int newAge){
        ageDog = newAge;
        if(ageDog > 0){
        }else{
            System.out.println("Вы ввели не коректный "+ newAge +" возраст для собаки!");
        }
    }
    public String getBarkingDog(){
        return barkingDog;
    }
    public void setBarkingDog(String newBarkingDog){
        barkingDog = newBarkingDog;
    }
    public String getBiteDog(){
        return biteDog;
    }
    public void setBiteDog(String newBiteDog){
        biteDog = newBiteDog;
    }
    public String getEmotionsDog(){
        return emotionsDog;
    }
    public void setEmotionsDog(String newEmotionsDog){
        emotionsDog = newEmotionsDog;
    }

    public void name(){
        print("Her name is - " + nameDog);
    }
    public void age (){
        print("Her age is - " + ageDog);
    }
    public void barking(){
        print("She - " + barkingDog);
    }
    public void bite(){
        print("She - " + biteDog);
    }
    public void emotions(){
        print("She's feeling - " + emotionsDog);
    }
    private void print (String str){
        System.out.println(str);
    }

}
