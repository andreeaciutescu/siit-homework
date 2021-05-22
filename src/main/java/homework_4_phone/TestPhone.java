package homework_4_phone;


public class TestPhone {
    public static void main(String[] args) {

        SamsungGalaxy6 phone = new SamsungGalaxy6("Samsung", "S6", "red", "plastic", "1309949389");
        iPhone phone1 = new iPhone("iPhone", "11", "black", "plastic", "73478733839");


        phone.addContact(new Contact("Andrei", "0773478433"));
        phone.addContact(new Contact("Alina", "0773475467"));
        phone.listContacts();


        phone.sendMessage("Andrei", "Buna!");
        phone.listMessages("0773478433");


        phone.call("0773475467");
        phone.viewHistory();

        phone1.addContact(new Contact("Dan", "0277287282"));
        phone1.addContact(new Contact("Ileana", "0765357278"));
        phone1.listContacts();

        phone1.sendMessage("Dan", "Salut!");
        phone1.listMessages("0277287282");

        phone1.call("0765357278");
        phone1.viewHistory();


    }
}
