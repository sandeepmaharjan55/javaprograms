public class dogBreed {
    public static void main(String[] args) {
        Dog hee=new Dog("Rahul","Japanese");
        hee.setName("Sandy");
        hee.setBreed("Bhusya");
        System.out.println(hee.name+" "+hee.breed);
    }
}

class Dog{
    String name;
    String breed;
    public Dog(String name, String breed){
        this.name=name;
        this.breed=breed;
    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }
}