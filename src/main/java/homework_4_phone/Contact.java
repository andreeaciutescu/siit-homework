package homework_4_phone;

import java.util.ArrayList;
import java.util.List;


public class Contact {
    private String name;
    private String nrTelefon;
    private List<Message> messages = new ArrayList<>();

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", messages=" + messages +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(String message) {
        this.messages.add(new Message(message));
    }

    public Contact(String name, String nrTelefon) {
        this.name = name;
        this.nrTelefon = nrTelefon;
    }

}
