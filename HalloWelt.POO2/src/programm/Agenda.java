package programm;

import java.util.Arrays;

public class Agenda {
    private String name;
    private Contact[] contacts;


    public Agenda(){

   }
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
    public String obterInfo(){
        String info = "Schedule name: "+name+"\n";
        if(contacts != null){
            for(Contact read: contacts){
                info += read.obterInfo() + "\n";
            }
        }
        return info;
    }

}

