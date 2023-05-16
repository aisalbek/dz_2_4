import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {


        ArrayList<User> a = new ArrayList<>();
        ArrayList<User> b = new ArrayList<>();
        ArrayList<User> c = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            a.add(new User("A" + i));
            b.add(new User("B" + i));
        }
        System.out.println(a);
        System.out.println(b);
        Collections.reverse(b);

        for (int i = 0; i < a.size(); i++) {
            c.add(a.get(i));
            c.add(b.get(i));
        }
        System.out.println(c);

        String [] names = {"Aisalbek", "Doni", "Nurdoolot", "Jon", "Syimyk", "Nurik"};
        Comparator<String> stringLengthComparator = new StringLengthSort();
        for(String str : names){
            System.out.println(str);
        }
        Arrays.sort(names, stringLengthComparator); // применяем сортировку
        System.out.println("\nотсортировано\n");
        for(String str : names){
            System.out.println(str);
        }
    }
}