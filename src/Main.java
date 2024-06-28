import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> states = new TreeSet();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");
        states.add("Great Britain");
        System.out.println(states);

        System.out.println("получим первый - самый меньший элемент: " + (String)states.first());
        System.out.println("получим последний - самый больший элемент: " + (String)states.last() + "\n");

        SortedSet<String> set = states.subSet("Germany", "Italy");
        System.out.println("получим поднабор от одного элемента до другого: " + String.valueOf(set) + "\n");
        String greater = (String)states.higher("Germany");
        System.out.println("greater: " + greater + "\n");
        String lower = (String)states.lower("Germany");
        System.out.println("lower: " + lower + "\n");

        NavigableSet<String> navSet = states.descendingSet();
        System.out.println("набор в обратном порядке: " + String.valueOf(navSet) + "\n");
        SortedSet<String> setLower = states.headSet("Germany");
        System.out.println("набор в котором все элементы меньше текущего: " + String.valueOf(setLower) + "\n");
        SortedSet<String> setGreater = states.tailSet("Germany");
        System.out.println("набор в котором все элементы больше текущего: " + String.valueOf(setGreater));
    }
}