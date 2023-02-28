package HomeWork.HomeWork4;
// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.


import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;




public class task1 {
    public static void main(String[] args) {

        String [] list = new String[]{"Япония","Греция","Сербия","ЮАР","Австралия","Франция","Самоа","Чили","Российская Федерация","Эстония","Гаити"};

        Queue <String> newlist = new LinkedList<>();
        Deque <String> dq = new LinkedList<>();
        
        Add(list,newlist);
        Revers(list,dq);
     
    }

    public static Queue <String>  Add(String [] list,Queue <String> newlist) {
        for (int i = 0; i < list.length; i++) {
            newlist.add(list[i]);            
        }
        System.out.println(newlist);
        return newlist;
    }
        
    
    public static  void Revers(String [] list,Deque <String> dq) {
        for (int i = 0; i < list.length; i++) {
            dq.addFirst(list[i]);
        }
        System.out.println(dq);
    }


}
  
    


        
        
    
        
            
        

        
    
