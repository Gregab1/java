package clase2_sem3;

import java.util.ArrayList;

public class ContactBook extends Contact{
    private String nameCB;
    ArrayList<Contact> contacBook=new ArrayList();

    public ContactBook(){

    }
    public ContactBook(String name) {

        this.nameCB = name;
    }

    public String getName() {
        return nameCB;
    }

    public void setName(String n) {
        this.nameCB = nameCB;
    }

    public void addContact(Contact c) {
        Contact p1=new Contact("enzo","enzo@.com","1234",true);
        contacBook.add(p1);

        contacBook.add(c);
    }

    public void delContact(Contact c) {
        for(int i=0;i<contacBook.size();i++){
            if (contacBook.get(i).equals(c)==true){

                contacBook.remove(i);
            }
        }

    }

    public boolean isTheContact(Contact c) {
        return false;
    }

    public ArrayList<Contact> mostrar(){
        return  contacBook;

    }

    @Override
    public String toString() {
        return nameCB;
    }

    public String toString(char barita) {
        String names="";
        for(int i=0;i< contacBook.size();i++){
            names=names+barita+contacBook.get(i).toString('#');
        }
        return names;
    }
}
