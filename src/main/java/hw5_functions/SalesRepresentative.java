/**
 * The SalesRepresentative program implements an applications that
 * sorts an array of objects in descending order.
 */


package hw5_functions;

import java.util.Collections;
import java.util.*;

public class SalesRepresentative {
    public static void main(String[] args) {

/**
 * Created a list of person
 */
        List<Person> lista = new ArrayList<>();
        Person person1 = new Person(20, 5500);
        Person person2 = new Person(40, 11100);
        Person person3 = new Person(6, 1000);

/**
 * Added person in list and scrolling to it
 */
        lista.add(person1);
        lista.add(person2);
        lista.add(person3);
        System.out.println("Unsorted:");

        for (Person value : lista)
            System.out.println(value);
        /**
         * Sorting a list of persons in descending order of
         * sales representative numbers using a Comparator that is reverse of
         * SortSalesRepresentative()
         */
        Comparator comparator = Collections.reverseOrder(new SortSalesRepresentative());
        Collections.sort(lista, comparator);

        /**
         * Scrolling to the list after the sorting is done and
         * displaying
         */
        System.out.println("Sorted by amount of revenue generated via sales: ");
        for (Person person : lista)
            System.out.println( person);




    }


}
