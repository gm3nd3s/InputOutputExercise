import java.io.*;

public class ReaderFileDirectoryAndFile {
    private boolean doWehaveFile;

    public ReaderFileDirectoryAndFile(){

    }


    public boolean readUserFileInputAndReturnTrueOrFalse()throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = null;
        boolean doWeHaveAFile = false;

        try {
            System.out.println("Please insert path:");
            File directoryPath = new File(reader.readLine());
            File[] filesList = directoryPath.listFiles();
            writer = new BufferedWriter(new FileWriter("directory/listOfFiles.txt"));

            for (File file: filesList){
                writer.write(file.getName() + "\n");
                System.out.println("File name: " + file.getName());
            }

            BufferedReader readerFile = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please insert file:");

            File filePath = new File(reader.readLine());
            String entireFilePath = directoryPath.getName().concat("/").concat(filePath.getName());

            for (File file: filesList){
                if(file.getPath().equalsIgnoreCase(entireFilePath)) {
                    doWeHaveAFile = true;
                }

            }
            System.out.println(doWeHaveAFile);
            return doWehaveFile;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                writer.close();
                reader.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
