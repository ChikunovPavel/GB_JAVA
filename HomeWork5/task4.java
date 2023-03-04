package HomeWork.HomeWork5;

import java.util.HashMap;
import java.util.Map;

public class task4 {
    public static void main(String[] args) {
        String [] name = new String[] {"Иван","Светлана","Анна","Анна","Иван","Петр","Мария","Петр","Мария","Мария","Светлова","Мария"};
        String [] so = new String[] {"Иванов","Петрова","Белова","Мусина","Крутова","Юрин","Лыков","Чернов","Чернышов","Федорова","Светлова","Савина"};
        Map <String,String> map = new HashMap<>();
        Map <Integer,String> map1 = new HashMap<>();
        has(map,name,so);
        Decoder(map1,name);
        System.out.println(map1);
    }
    
    public static void has(Map<String,String> map,String [] name,String [] so) {
        for (int i = 0; i < name.length; i++) {
            map.put(so[i],name[i]);
        }
        System.out.println(map);
    }
   
    public static void Decoder(Map <Integer,String> map1, String [] list) {
        int count = 0;
        int countMax = 0;
        for (int i = 0; i < list.length; i++) {
            boolean f = map1.containsValue((list[i]));
            System.out.println( f);

            if(f != true)
                map1.put(null,list[i]);
                count = 0;
            for (int j = 0; j < list.length; j++) {
                if (map1.containsValue(list[i])) {
                    count++;
                    if(count > countMax);
                    countMax = count;
                }
            }
            if(f != true)
                map1.put(countMax,null);
                 
        }
    }
}
            
