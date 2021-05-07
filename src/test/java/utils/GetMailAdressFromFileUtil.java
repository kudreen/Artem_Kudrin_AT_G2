package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GetMailAdressFromFileUtil {


    public static String getEmailAdress() throws IOException {
        File file = new File("C:\\Users\\KudrinAR\\IdeaProjects\\Bubble\\tempEmailAdress.txt");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
       String line = reader.readLine();
        System.out.println(line);
        return line;
    }

}
