package FileClassLesson;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("/Users/travis/Developer/code/java/src/FileClassLesson/secret_message.txt");

        if (file.exists()) {
            System.out.println("That file exists! :O");
            System.out.println(file.getPath());
            file.delete();
        }
        else {
            System.out.println("That file doesn't exist! :c");
        }

    }
}
