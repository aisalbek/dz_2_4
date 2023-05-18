import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        System.out.println("Веедите 5 строк");
        for (int i = 0; i < 5; i++) {
            System.out.print(i+":");
            a.add(scanner.next());
        }
        System.out.println("Список А: " + a);

        ArrayList<String> b = new ArrayList<>();
        System.out.println("Веедите 5 строк");
        for (int i = 0; i < 5; i++) {
            System.out.print(i+":");
            b.add(scanner.next());
        }
        System.out.println("Список Б: " + b);

        ArrayList<String> c = new ArrayList<>();
        Collections.reverse(b);
        for (int i = 0; i < a.size(); i++) {
            c.add(a.get(i));
            c.add(b.get(i));
        }
        System.out.println("Список С: " + c);
        Comparator<String> stringLengthComparator = new StringLengthSort();
        for(String str : c){
            System.out.println(str);
        }
        Collections.sort(c, stringLengthComparator);
        System.out.println("\nотсортировано\n");
        for(String str : c) {
            System.out.println(str);
        }
    }
}