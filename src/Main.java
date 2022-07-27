import java.io.*;

public class Main {
    public static void main(String[] args) {
/*
        new WriteFile().writeAFileWithDirectoryAndFile();



        try {
            new ReaderFileDirectoryAndFile().readUserFileInputAndReturnTrueOrFalse();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

*/
        try {
            new ReaderFileFullPath().readUserFileInputAndReturnTrueOrFalse();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}