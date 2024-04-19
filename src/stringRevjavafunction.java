public class stringRevjavafunction {
    public static void main(String[] args) {
        String originalString = "Sandy";
        StringBuilder newString= new StringBuilder();
        newString.append(originalString);
        newString.reverse();
        System.out.println(newString);
    }
}
