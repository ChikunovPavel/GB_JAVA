package HomeWork.HomeWork2;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;



// Дана строка (получение через обычный текстовый файл!!!)


// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class task2 {
    public static void main(String[] args) throws Exception {
 
        String content = readFile("text.txt", StandardCharsets.UTF_8);
        System.out.println(content);
        finish(content);
        
    }
    
    
    public static String readFile(String path, Charset encoding) 
    throws IOException 
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
    
    
    public static void finish(String content) {
        StringBuilder sb = new StringBuilder(content);
        sb.replace(0, 11, "Студент ");
        sb.replace(14, 26," получил ");
        sb.replace(24, 37," по предмету ");
        sb.replace(47, 48,"");

        System.out.println(sb);
    }
       
  
            
            
            
}
        
       
        
        
        
    
  
    


    


        
   


        
        
    