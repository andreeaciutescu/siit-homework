package homework_4_phone;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone implements Services {

    private List<Contact> contacts = new ArrayList<>();
    private List<Message> messages = new ArrayList<>();
    private List<CallHistory> callHistories = new ArrayList<>();


    public void addContact(Contact contact) {
        contacts.add(contact);

    }

    public void listContacts() {
        for (Contact contact : this.contacts) {
            System.out.println(contact);
        }

    }

    public void sendMessage(String contact, String message) {
        for (Contact contact1 : contacts) {
            if (contact1.getName().equals(contact)) {
                if (message.length() > 500) {
                    System.out.println("Mesajul este prea lung.");
                } else {
                    contact1.setMessages(message);
                    System.out.println("Mesajul s-a trimis catre " + contact1.getName());

                }

            }
        }
    }

    public void listMessages(String phone) {
        for (Contact contact1 : contacts) {
            if (contact1.getNrTelefon().equals(phone)) {
                for (Message message : contact1.getMessages()) {
                    System.out.println(message.getText());
                }

            }


        }
    }

    public void call(String phone) {
        for (Contact contact1 : contacts) {
            if (contact1.getNrTelefon().equals(phone)) {
                System.out.println(contact1.getName() + " called");
                callHistories.add((new CallHistory(contact1)));

            }

        }
    }

    public void viewHistory() {
        for (CallHistory callHistory : callHistories) {
            System.out.println(callHistory);
        }
    }
}

