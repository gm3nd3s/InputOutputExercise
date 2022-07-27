import java.io.*;

public class WriteFile {
    BufferedWriter writer = null;
    BufferedReader reader = null;
    public WriteFile() {
    }

    public void writeAFileFullPath() {


        try {
            System.out.println("Please insert path:");
            reader = new BufferedReader(new InputStreamReader(System.in));
            File filePath = new File(reader.readLine());
            writer = new BufferedWriter(new FileWriter(filePath));
            System.out.println(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void writeAFileWithDirectoryAndFile() {
        try {

            reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Please insert directory:");
            File directory = new File(reader.readLine());
            System.out.println(directory);


            System.out.println("Please insert file:");
            File file = new File(reader.readLine());
            System.out.println(file);
            String filePath = directory.getName().concat("/").concat(file.getName());
            writer = new BufferedWriter(new FileWriter(filePath));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
