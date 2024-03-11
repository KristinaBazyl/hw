package ru.createfile;

import ru.createfile.datepackege.Datefile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class CreateFile {
    /***
     *
     * @param pathFile путь к файлу
     * @param text текст файла
     */

    public static void newFile(String pathFile, String text){
         /*
          * здесь должен быть комментарий
          *
          */
         try {
             FileWriter file = new FileWriter(pathFile, true);
             BufferedWriter b = new BufferedWriter(file);
             b.write(String.valueOf(Datefile.fixing()) + " -> ");
             b.write(text );
             b.write("\n");
             b.close();

         }  catch (IOException e) {
             System.out.println("Ошибка при создании файла");
             e.printStackTrace();
         }
     };

}
