package Ex3;

import java.io.File;

public class Ex3 {
    public static void main(String[] args) {
        String path = "C:\\Users\\Daniel Pham\\OneDrive\\Desktop\\data algrithsm";
        String filename = "test.txt";
        find(path, filename);
    }
    public static void find(String path, String filename) {
        File dir = new File(path);
        if (!dir.exists()) {
            System.out.println("Path does not exist");
            return;
        }
        if(dir.isFile()) {
            if (dir.getName().equals(filename)) {
                System.out.println("Found: " + dir.getAbsolutePath());
            }
            return;
        }

        File[] files = dir.listFiles();
        if(files != null) {
            for (File f : files) {
                find(f.getAbsolutePath(), filename);
            }
        }
    }
}
