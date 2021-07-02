package Hw6_ObjectContainers;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class PersoanaNameComparator implements Comparator<Persoana> {

@Override
   public int compare(Persoana p1, Persoana p2) {
    Integer x1 = p1.getAge();
    Integer x2 = p2.getAge();
    int compare = x1.compareTo(x2);

    if(compare != 0){
      return compare;
    }

    String x3 = p1.getName();
    String x4 = p2.getName();
    return x3.compareTo(x4);
}


}
