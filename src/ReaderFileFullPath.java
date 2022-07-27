import java.io.*;
import java.lang.Object;

public class ReaderFileFullPath {
    private boolean doWehaveFile;

    public ReaderFileFullPath(){

    }


    public boolean readUserFileInputAndReturnTrueOrFalse()throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean doWeHaveAFile = false;
        File file;

        try {
            System.out.println("Please insert entire file path:");
            File directoryPath = new File(reader.readLine());
            file = new File(directoryPath.getPath());

            System.out.println(doWeHaveAFile = file.isFile());
            return doWehaveFile;
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
