package homework_4_phone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CallHistory {
    private Contact contact;
    private LocalDateTime localDateTime;

    public CallHistory(Contact contact) {
        this.contact = contact;
        this.localDateTime = LocalDateTime.now();

    }

    @Override
    public String toString() {
        return
                "contact = name: " + contact.getName() + ", phone: " + contact.getNrTelefon() +
                        ", date: " + localDateTime.format(DateTimeFormatter.ofPattern("EEE, d MMM yyyy HH:mm:ss")) +
                        '}';
    }
}
