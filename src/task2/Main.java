package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random()*10));
        }
        System.out.println(list );
        System.out.print("[") ;

        list.stream().
                map(x -> x * x).
                forEach((x) ->System.out.print( x + ", " ));

        System.out.print("]" + "\n") ;

        int result = list.stream() .
                map(x -> x * x).
                reduce((x,y)-> x+y).get();

        System.out.println(result );

    }
}
