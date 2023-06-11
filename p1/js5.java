import java.util.LinkedList; 

public class js5 {
    public static void main(String[] args) { 
        LinkedList file = new LinkedList();
        file.add(2);
        file.add(3);
        file.add(5);
        System.out.println(file);
        file.addFirst(11); 
        file.addLast(20);
        System.out.println(file);
    }   
}    