import java.io.*;
import java.lang.Object;

public class ReaderFileFullPath {
    private boolean doWehaveFile;

    public ReaderFileFullPath(){

    }


    public void readUserFileInputAndReturnTrueOrFalse()throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean doWeHaveAFile = false;

        try {
            System.out.println("Please insert entire file path:");
            File directoryPath = new File(reader.readLine());
            System.out.println(doWeHaveAFile = directoryPath.isFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
