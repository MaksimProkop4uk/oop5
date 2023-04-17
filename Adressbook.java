import java.util.ArrayList;

public class Adressbook {
    ArrayList<Phonebook> pb=new ArrayList();
    
    public void Adressbook(){
        pb.add(new Phonebook("Иванов Иван Иванович","+375000000","Минск"));        
        pb.add(new Phonebook("Иванова Инна Ивановна","+375000001","Брест"));        
    }

    public void showAddressBook(){
        for(Phonebook i:pb){
            System.out.println(i.getName()+" "+i.getPhone()+" "+i.getCity());
        }
    }
}
