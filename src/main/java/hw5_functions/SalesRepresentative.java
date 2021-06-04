/**
 * The SalesRepresentative program implements an applications that
 * sorts an array of objects in descending order.
 */


package hw5_functions;

import java.util.ArrayList;
import java.util.List;

public class SalesRepresentative {


    public static void main(String[] args) {

/**
 * Created a list of person
 */
        List<Person> lista = new ArrayList<>();
        Person person1 = new Person(3, 550);
        Person person2 = new Person(5, 200);
        Person person3 = new Person(6, 1000);
        Person person4 = new Person(2, 1500);

/**
 * Added person in list and scrolling to it
 */
        lista.add(person1);
        lista.add(person2);
        lista.add(person3);
        lista.add(person4);

        System.out.println("Unsorted-----------------");

        for (Person value : lista)
            System.out.println(value);
        /**
         * Sorting a list of persons in descending order of
         * sales representative numbers using a Comparator that is reverse of
         * SortSalesRepresentative()
         */
      //  Comparator comparator = Collections.reverseOrder(new SortSalesRepresentative());
      //  Collections.sort(lista, comparator);

        /**
         * Scrolling to the list after the sorting is done and
         * displaying
         */


//        System.out.println("Sorted by amount of revenue generated via sales: ");
//        for (Person person : lista)
//           System.out.println( person);
        System.out.println("Sorted ---------------------");
        final List<Person> people = sortDescending(lista);
        for (Person lista1: people) {
            System.out.println(lista1);
        }

    }
    public static List<Person> sortDescending(List<Person> lista){
        Person person;
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size() - i -1; j++) {
                if (lista.get(j).getTotal() < lista.get(j + 1).getTotal()) {
                    person = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, person);

                }

            }

        }
        return lista;
    }

}
