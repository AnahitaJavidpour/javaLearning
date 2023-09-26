import javax.imageio.IIOException;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class FileCreating {
    public static void main(String[] args) throws IOException {

//        try {
//            File myFile = new File("my file");
//            if (myFile.createNewFile()) {
//                System.out.println("the file has successfully created");
//            } else {
//                System.out.println("can't creat");
//            }
//        } catch (IOException e) {
//            System.out.println("error");
//        }
      try {
            FileWriter myFileWriting = new FileWriter("my file2.txt",true);
            myFileWriting.append("\n first time writing!");
            myFileWriting.close();
            System.out.println("has successfully writed");
        } catch (Exception e ) {
            System.out.println("error");

        }

//        try {
//            FileWriter fw = new FileWriter("my file2.txt", true);
//            BufferedWriter bw =  new BufferedWriter(fw);
//            PrintWriter pw = new PrintWriter(bw);
//            pw.println("Shane");
//            pw.println("Root");
//            pw.println("Ben");
//            System.out.println("Data Successfully appended into file");
//            pw.flush();
//        } finally {
//            try {
//                pw.close();
//                bw.close();
//                fw.close();
//            } catch (IOException io) {// can't do anything } }
//            }
////
////        }
        }
    }


