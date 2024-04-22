public class stringVowelMatches {
    public static void main(String[] args) {

        String vowelTest ="Apple";
        if(vowelTest.toLowerCase().matches(".*[aeiou].*")) System.out.println("it matches");
    }
}
