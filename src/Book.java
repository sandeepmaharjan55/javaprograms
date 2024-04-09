import java.util.ArrayList;

public class Book {

    public static void main(String[] args) {
        Bookharu newq=new Bookharu("sandy","sanddep","123123");
        Bookharu newK=new Bookharu("ads","dasa","23432432");
        System.out.println(newq.getAuthor());
        Bookharu.addBook(newq);
        Bookharu.addBook(newK);

        ArrayList <Bookharu> list=Bookharu.getList();
        System.out.println(" book list : "+list);
        Bookharu.removeBook(newK);
        System.out.println(" book list : "+list);
    }
}
class Bookharu{
    private String title;
    private String author;
    private String ISBN;
    private static ArrayList<Bookharu> list = new ArrayList<Bookharu>();
    public Bookharu(String title, String author, String ISBN){
        this.title= title;
        this.author=author;
        this.ISBN=ISBN;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getIsbn(){
        return ISBN;
    }
    public static void addBook(Bookharu book){
        list.add(book);
    }
    public static void removeBook(Bookharu book){
        list.remove(book);
    }
    public static ArrayList<Bookharu> getList() {
        return list;
    }
}
