public class checkVowel {
    public static void main(String args[]){
        System.out.println(stringHasVowel("Ram"));
    }

    private static boolean stringHasVowel(String ram) {
        return ram.toLowerCase().matches(".*[aeiou].*");
    }
}
