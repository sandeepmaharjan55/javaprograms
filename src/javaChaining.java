class mero{
    private String name;
    private int intData;
    mero(){
        System.out.println("Running mero constructor here....");
    }
    public mero getIntData(int paji) {
        this.intData=paji;
        return this;
    }

    public mero getName(String naam) {
        this.name=naam;
        return this;
    }
    public void sabaiData(){
        System.out.println(name+" naam "+intData);
    }
}
public class javaChaining {
    public static void main(String[] args) {
        new mero().getIntData(10).getName("sandy").sabaiData();
    }
}
