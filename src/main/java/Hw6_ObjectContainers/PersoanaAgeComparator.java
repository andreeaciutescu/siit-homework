package Hw6_ObjectContainers;

import java.util.Comparator;

public class PersoanaAgeComparator implements Comparator<Persoana> {
    @Override
    public int compare(Persoana p1, Persoana p2) {
        //return o1.getAge() - o2.getAge();
        if (p1.getAge() > p2.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }
}


