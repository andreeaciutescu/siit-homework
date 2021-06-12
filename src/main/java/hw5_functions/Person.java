package hw5_functions;

/**
 * A class to represent a person.
 */
public class Person {
    private int nrOfSales;
    private int quota;
    private int total;


    public Person(int nrOfSales, int quota) {
        this.nrOfSales = nrOfSales;
        this.quota = quota;
        this.total = nrOfSales * quota;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNrOfSales() {
        return nrOfSales;
    }


    public int getQuota() {
        return quota;
    }

    public void setNrOfSales(int nrOfSales) {
        this.nrOfSales = nrOfSales;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    /**
     *Used to print person details in main()
     */
    @Override
    public String toString() {
        return "Person{" +
                "nrOfSales=" + nrOfSales +
                ", quota=" + quota +
                ", total=" + total +
                '}';
    }
}
