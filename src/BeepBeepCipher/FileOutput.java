package BeepBeepCipher;
import java.io.*;

public class FileOutput {
    public static void print(String str) throws IOException {
        File f = new File("Output.txt");
        FileOutputStream fos = new FileOutputStream(f);
        PrintWriter pw = new PrintWriter(fos);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        pw.write(str);
        pw.flush();
        fos.close();
        pw.close();
    }
}
