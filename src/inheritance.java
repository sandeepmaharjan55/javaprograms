class Inheritance {
    String hawa ="Ram";
    String tawa ="tawa";
    void mera(){
        System.out.println(hawa);
    }
    void mera(String kiss){
        System.out.println(tawa+" "+kiss);
    }
}
class Rama extends Inheritance{
    public static void main(String[] args) {
        Rama test = new Rama();
        test.mera();
        test.mera("Sandeep ");
    }
}
