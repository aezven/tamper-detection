import java.io.File;


/**
 * Approach 1: Time-stamp difference. Check creation time of file, modification times, and name of user that modified
 */


public class Protector {
    public static void main(String[] args) {
        File directory = new File("/Users/azven/Programming");
        File[] files = directory.listFiles();



        FileSystem fs = FileSystem.getInstance("this is a test dir");
        System.out.println(fs.getPath());


     //   FileSystem fs2 = FileSystem.getInstance("arthuruhuhdfjadhfajkldfhlajdfhajkl");
     //   System.out.println(fs2.getPath());
/*


        for (File currentFile : files) {
            if (currentFile.isDirectory()) {
                System.out.println("Directory: "  + currentFile.toString());
            }

            if (currentFile.isFile()) {
                System.out.println("File: " + currentFile.toString());
            }
        } */
    }
}
