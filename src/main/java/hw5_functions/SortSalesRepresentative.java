package hw5_functions;

import java.util.Comparator;

public class SortSalesRepresentative implements Comparator<Person> {

    /**
     *Used this methode for sorting in descending order
     * the amount of revenue generated via sales
     *
     */
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getQuota() - o2.getQuota();
    }


}
