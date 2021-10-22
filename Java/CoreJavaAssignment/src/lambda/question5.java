package lambda;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class question5 {
    public static void main(String[] args) {
        Consumer<StringBuilder>  PrintFirstLetter = (item->{
            System.out.print(item.charAt(0));
        });


        List<StringBuilder> list= new LinkedList<>();
        list.add(new StringBuilder("samsung"));
        list.add(new StringBuilder("nokia"));
        list.add(new StringBuilder("jio"));
        list.add(new StringBuilder("vivo"));
        
        list.forEach(PrintFirstLetter);
    }

}