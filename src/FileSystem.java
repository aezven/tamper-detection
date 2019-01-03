import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchService;
import java.util.List;


/**
 *
 * What kind of files do I want to secure?
 * - text (.txt)
 * - bash script (.sh)
 * - java (.java)
 * - property (.properties)
 */

public class FileSystem {
    private static FileSystem fileSystemInstance = null;
    private Path path;

    private FileSystem(String path) {
        this.path = Paths.get(path);
    }

    public static FileSystem getInstance(String path) {
        if (path == null || path.isEmpty()) {
            path = "/Users/azven";
        }

        if (fileSystemInstance == null) {
            fileSystemInstance = new FileSystem(path);
        }

        return fileSystemInstance;
    }

    public String getPath() {
        return path;
    }

    public List getFilesInCurrentDirectory() {
      /*  for (File currentFile : files) {
            if (currentFile.isDirectory()) {
                System.out.println("Directory: "  + currentFile.toString());
            }

            if (currentFile.isFile()) {
                System.out.println("File: " + currentFile.toString());
            }

*/




        return null;
    }


    public void monitorDirectoryForFileCreation() {
        try {
            WatchService watchService = FileSystems.getDefault().newWatchService();
            WatchKey watchKe
        }

        catch (IOException e) {
            System.out.println("Unable to create a watch service: " + e.toString());
        }

    }

    public void monitorDirectoryForFileDeletion() {

    }

    public void monitorDirectoryForFileModification() {

    }

    public String getFileName() {
        return null;
    }

    public String getDirectoryName() {
        return null;
    }

    public List getTextFiles() {
        return null;
    }

    public List getShellScripts() {
        return null;
    }

    public List getJavaFiles() {
        return null;
    }

    public List getPropertyFiles() {
        return null;
    }
}