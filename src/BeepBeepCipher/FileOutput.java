import java.io.*;

public class FileOutput {
    private  static FileOutputStream fos;
    private  static PrintWriter pw;

    public FileOutput(FileOutputStream fos, PrintWriter pw){
        this.fos = fos;
        this.pw = pw;
    }
    public static void print(String str, File f) throws IOException {
        fos = new FileOutputStream(f);
        pw = new PrintWriter(fos);
            pw.write(str + "\r\n");

            pw.flush();
            fos.close();
            pw.close();
    }
}
