public class JavaOopPerson{
    public static void main(String[] args) {
        Person hello = new Person("Ram", 23);
        System.out.println(hello.getName()+" "+ hello.getAge());
    }
}
class Person{
    String name;
    int age;
    public Person (String name, int num){
        this.name=name;
        this.age= num;
    }
    public String getName(){return name;}
    public int getAge(){return age;}
}