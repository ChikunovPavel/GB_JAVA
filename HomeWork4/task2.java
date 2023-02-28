package HomeWork.HomeWork4;
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class task2 {
    public static void main(String[] args) {
        String [] list = new String[]{"Япония","Греция","Сербия","ЮАР","Австралия","Франция","Самоа","Чили","Российская Федерация","Эстония","Гаити"};

        Queue <String> newlist = new LinkedList<>();
        Deque <String> dq = new LinkedList<>();
        Add(list,newlist);
        System.out.println();
        System.out.println("-----помещает элемент в конец очереди-----");
        
        Enqueue(list,dq);
        System.out.println();
        System.out.println("-----возвращает первый элемент из очереди и удаляет его-----");
       
        Denqueue(list,dq);
        System.out.println();
        System.out.println("-----возвращает первый элемент из очереди, не удаляя-----");
        First(list,dq);
    }
    
    public static Queue <String>  Add(String [] list,Queue <String> newlist) {
        for (int i = 0; i < list.length; i++) {
            newlist.add(list[i]);            
        }
        System.out.println(newlist);
        return newlist;
    }
        
    public static  void Enqueue(String [] list,Deque <String> dq) {
        for (int i = 0; i < list.length; i++) {
            dq.addLast(list[i]);
        }
        
            dq.addLast(dq.getFirst());
            dq.remove(dq.getFirst());
            System.out.println(dq);
    }
            

    public static  void Denqueue(String [] list,Deque <String> dq) {
        System.out.println(dq.removeFirst());
    }
        
    public static  void First(String [] list,Deque <String> dq) {
        System.out.println(dq.peekFirst());
    }
       
}
       
       
        
        
        
        
           
    
            
    

        
        
       

        

        
        
        
    
    
    
    
    
    