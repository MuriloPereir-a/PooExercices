package programm;

public class Contact {
    private String name;
    private String telNumber;
    private String email;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTelNumber() {
        return telNumber;
    }
    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String obterInfo(){
        return  name+", "+
                " (15)"+telNumber+"."+"\n"+
                " E-mail: "+email;
    }
}
