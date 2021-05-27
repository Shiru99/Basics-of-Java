import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling{
    public static void main(String[] args) {
        File fileCreate = new File("fileHandling.txt");

        try {
            fileCreate.createNewFile();
        } catch (IOException e) {
            System.out.println("File cannot be created");
        }

        try {
            FileWriter fileWrite= new FileWriter("fileHandling.txt");

            fileWrite.write("Start of the file\n");
            String temp = "2nd sentence of the file";
            fileWrite.write(temp, 0, 12);

            fileWrite.append("\nEnd of the file :)\n");

            fileWrite.close(); // Compulsory, without close it won't write in file
            
        } catch (IOException e) {
            System.out.println("Cannot write in file");
        }

        

        File fileRead = new File("fileHandling.txt");
        try {
            Scanner sc = new Scanner(fileRead);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Can't be accessed");
        }



        File fileDelete = new File("fileHandling.txt");

        System.out.println(fileDelete.exists());
        System.out.println(fileDelete.getAbsolutePath());
        System.out.println(fileDelete.getParentFile());
        System.out.println(fileDelete.getName());

        if(fileDelete.exists()){
            fileDelete.delete();
        }
        

        File f = new File("Folder/InnerFolder");
        System.out.println(f.mkdir());      // can create only one folder e.g. "New Folder"
        System.out.println(f.mkdirs());  
        
        System.out.println(f.getName());
        System.out.println(f.getParent());

        f.delete(); // Deletes Inner folder as f is pointer for inner folder
    }
}
