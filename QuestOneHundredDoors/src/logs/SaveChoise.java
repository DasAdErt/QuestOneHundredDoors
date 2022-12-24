package logs;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SaveChoise {
    public static void fileWriter(){

        //Writer
        try(FileWriter writer = new FileWriter("quest.txt", false))
        {
            String firstText = "1 часть программы.\n";
            writer.write(firstText);

            String text = "Текст";
            writer.write(text);
            
            String secondText = "Конец 1 части программы.\n";
            writer.write(secondText);

            writer.append('\n');
            writer.append("Делал: Студент КИ-25 Ткачёв Михаил Валерьевич");

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        //Reader
        try(FileReader reader = new FileReader("word.txt"))
        {
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
