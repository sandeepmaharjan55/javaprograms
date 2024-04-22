import java.io.FileReader;
import java.io.IOException;

public class fileRead {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("sample.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close(); // Close the FileReader
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
