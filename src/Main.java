import java.util.*;

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
        Scanner scanner = new Scanner(System.in);
      ArrayList <String> names = new ArrayList<>();
      boolean b1 =true;
      while (b1){
          System.out.println("для остановки просеса нажмите х ");
          System.out.print("ведите имя : ");
          String strig = scanner.nextLine();
          if (strig.equals("x")){
              b1=false;
          }else {
              names.add(strig);
          }
      }
        Comparator<String> stringLengthComparator = new StringLengthSort();
        for(String str : names){
            System.out.println(str);
        }
       Collections.sort(names, stringLengthComparator); // применяем сортировку
        System.out.println("\nотсортировано\n");
        for(String str : names){
            System.out.println(str);
        }
    }
}