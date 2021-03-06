package clase2_sem3;

public class Contact {
    private String name;
    private String email;
    private String movil;
    private boolean topList;

    public Contact(){

    }
    public Contact(String name, String email, String movil, boolean topList) {
        this.name = name;
        this.email = email;
        this.movil = movil;
        this.topList = topList;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public boolean getIsTopList() {
        return topList;
    }

    public void setTopList(boolean topList) {
        this.topList = topList;
    }



    @Override
    public boolean equals(Object o) {

        if (toString().equals(o.toString())){

            return true;
        }else{
            return false;
        }

    }

    @Override

    public String toString() {
        return name+" "+email+" "+movil+" "+topList;
    }
    public String toString(char ceparar) {
        return this.name+ceparar+this.email+ceparar+this.movil+ceparar+this.topList;
    }
}
