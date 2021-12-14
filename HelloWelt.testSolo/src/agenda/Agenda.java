package agenda;

public class Agenda {
    private String name;
    private Contact[] contacts;

    public Agenda(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Contact[] getContacts() {
        return contacts;
    }
    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }
}
