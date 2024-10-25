package banksystem;

import java.util.Scanner;

public class BankSystem {


    public static void main(String[] args) {
        // TODO code application logic here
       Data p1 = new Data();
       p1.setNum_conta(255245);
       p1.setUser("User");
       p1.setStatus_conta(true);
       p1.depositar(50);
       p1.sacar(40);
       p1.setTipo_conta("cc");
       
       
       
       
       
       p1.estado_atual();
  
        
        
        
    }
}

           
        
     
