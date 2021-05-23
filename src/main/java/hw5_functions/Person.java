package hw5_functions;

/**
 * A class to represent a person.
 */
public class Person {
    private int nrOfSales;
    private int quota;

    public Person(int nrOfSales, int quota) {
        this.nrOfSales = nrOfSales;
        this.quota = quota;
    }

    public int getNrOfSales() {
        return nrOfSales;
    }


    public int getQuota() {
        return quota;
    }

    /**
     *Used to print person details in main()
     */
    @Override
    public String toString() {
       return "Person{" +
                "nrofsales=" + nrOfSales +
                ", quota='" + quota + '\'' +
                '}';


    }


}
