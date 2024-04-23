import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class findStringFile {
    public static void main(String[] args) throws FileNotFoundException {
        String findThis=new String("world");
        File file= new File("src/sample.txt");
        System.out.println(findString(file.getAbsolutePath(),findThis));
    }
    public static boolean findString(String file, String findThis) {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            if (line.contains(findThis)) {
                scanner.close();
                return true;
            }
        }
            scanner.close();
            return false;
    }
}
