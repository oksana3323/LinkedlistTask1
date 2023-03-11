import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Character> characters=new LinkedList<>();
        for (char c  ='Z'; c >'A' ; c--) {
            characters.add(c);
        }

        System.out.println(characters);
   LinkedList<Integer> integers=new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        System.out.println(integers);

        ArrayList<Character> characters1=new ArrayList<>();
        for (char c  ='Z'; c >'A' ; c--) {
            characters.add(c);
        }
        System.out.println(characters1);

        }



    }




 /*   Эки LinkedList ачыныз, биринчисин англиcче алфавиттин
        тамгалары менен жана экинчисин сандар толтурунуз. (кол
        менен ар бирин жазбаш керек).
        Мисалы ( A, B, C ........ Z);
        (1, 2, 3 .... 10)
        Биринчи LinkedList тин маанилерин жаны ArrayList ачып ошого
        кочуруп алыныз.
        ArrayList менен LinkedList тин маанилерин башынан эн
        акырынан баштап чыгарыныз консолго.*/