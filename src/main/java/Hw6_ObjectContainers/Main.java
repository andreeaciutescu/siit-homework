package Hw6_ObjectContainers;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Address> address1 = new ArrayList<>();
        Address a1 = new Address("Carpati", "Corabia", "Romania");
        Address a2 = new Address("Flowers", "Batley", "England");


        address1.add(a1);
        address1.add(a2);

        List<Address> address2 = new ArrayList<>();
        Address a3 = new Address("Lake", "Auburn", "USA");
        address2.add(a3);

        List<Address> address3 = new ArrayList<>();
        Address a4 = new Address("Dunarii", "Caracal", "Romania");
        address3.add(a4);


        List<Hobby> hobbyList1 = new ArrayList<>();
        List<Hobby> hobbyList2 = new ArrayList<>();
        List<Hobby> hobbyList3 = new ArrayList<>();
        Hobby h1 = new Hobby("cyclicing", 3, address1);
        Hobby h2 = new Hobby("swimming", 5, address2);
        Hobby h3 = new Hobby("gym", 7, address3);

        hobbyList1.add(h1);
        hobbyList2.add(h1);
        hobbyList2.add(h3);
        hobbyList3.add(h1);
        hobbyList3.add(h2);
        hobbyList3.add(h3);

        TreeSet<Persoana> persoanaTreeSet = new TreeSet<>(new PersoanaNameComparator());
        Persoana p1 = new Somer("Dan", 30);
        Persoana p2 = new Angajat("Ilie", 26);
        Persoana p3 = new Student("Ana", 20);
        Persoana p4 = new Student("Ilae", 26);
        Persoana p5 = new Angajat("Andreea", 22);
        Persoana p6 = new Angajat("Aca", 20);
        Persoana p7 = new Angajat("Ilbe", 26);

        persoanaTreeSet.add(p1);
        persoanaTreeSet.add(p2);
        persoanaTreeSet.add(p3);
        persoanaTreeSet.add(p4);
        persoanaTreeSet.add(p5);
        persoanaTreeSet.add(p6);
        persoanaTreeSet.add(p7);

        HashMap<Persoana, List<Hobby>> person = new HashMap<>();
        person.put(p1, hobbyList1);
        person.put(p2, hobbyList2);
        person.put(p3, hobbyList3);

        for (Map.Entry<Persoana, List<Hobby>> entry : person.entrySet()) {
            if (entry.getKey().getName().equals("Dan")) {
                for (Hobby get : entry.getValue())
                    System.out.println(get.getName() + " " + get.getAddresses());
            }
        }
    }
}







