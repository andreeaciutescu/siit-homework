package homework_4_phone;

public interface Services {
    void addContact(Contact contact);

    void listContacts();

    void sendMessage(String contact, String message);

    void listMessages(String phone);

    void call(String phone);

    void viewHistory();


}
