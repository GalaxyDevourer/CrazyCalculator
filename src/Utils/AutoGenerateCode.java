package Utils;

import java.io.FileWriter;
import java.io.IOException;

public class AutoGenerateCode {
    public void generateCodeForSecond(int from, int to, String filename) {

        try(FileWriter writer = new FileWriter(filename, false))
        {
            // else if (first == 0 && second == 0) {
            //    return 1;
            // }

            for (int i = from; i < to; i++) {
                String pattern = "        else if (first == 0 && second == " + i + ") {" + "\n           return " + i + ";" + "\n        }\n";
                writer.write(pattern);
            }

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }

}
