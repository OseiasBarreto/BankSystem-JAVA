package banksystem;

public class Data {

    //atributos
    public int num_conta;
    protected String tipo_conta;
    private String user;
    private float saldo_conta;
    private boolean status_conta;
    //construct 

    public Data() {

        this.saldo_conta = 0;
        this.status_conta = false;
    }
    //Métodos personalizados
    public void estado_atual(){
        System.out.println("---------------------------------");
        System.out.println("Conta: " + this.getNum_conta());
        System.out.println("Tipo de conta: " + this.getTipo_conta());
        System.out.println("Dono: " + this.getUser());
        System.out.println("Saldo em conta: " + this.getSaldo_conta() + "R$");
        System.out.println("Status da conta: " + this.getStatus_conta());
        System.out.println("---------------------------------");
    }
    
    public void abrir_conta(String t){
        this.setTipo_conta(t);
        this.setStatus_conta(true);
        if (t == "cc") {
            this.setSaldo_conta(50);
        } else if (t == "cp") {
            this.setSaldo_conta(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fechar_conta(){
        if (this.getSaldo_conta() > 0){
            System.out.println("Retire o dinheiro antes de fechar a conta.");
    }else if(this.getSaldo_conta() < 0){
            System.out.println("Regularize o débito em conta"); 
    }else{
        this.setStatus_conta(false);
            System.out.println("Conta fechada com sucesso!");
    }
}   
        
    public void depositar(float v){
        if (this.getStatus_conta()){
            this.setSaldo_conta(this.getSaldo_conta() + v);
        System.out.println("Depósito realizado com sucesso");
    }else{
            System.out.println("Não foi possível realizar o depósito. Regularize o Status da conta!");
        }
    }
    
    public void sacar(float v){
        if (this.getStatus_conta()){
            if (this.getSaldo_conta() >= v){
            this.setSaldo_conta(this.getSaldo_conta() - v);
                System.out.println("Saque realizado sucesso!");               
            }else{
                System.out.println("Saldo insuficiente para saque.");
            }
        }else{
            System.out.println("Impossível sacar. Regularize o status da conta.");
        }
        
    }
    
    public void pagar_mensal(){
        int v = 0;
        if ("cc".equals(this.getTipo_conta())){ 
            v = 12;
        } else if ("cp".equals(this.getTipo_conta())) {
            v = 20;
        }
        if (this.getStatus_conta()){
            this.setSaldo_conta(this.getSaldo_conta() - v);
            System.out.println("Mensalidade paga com sucessso!");
        }else{
            System.out.println("Impossível pagar conta. Regularize o Status da conta!");
        }
        
    }
    
     //getters
    public int getNum_conta() {
        return num_conta;
    }

    public void setNum_conta(int num_conta) {
        this.num_conta = num_conta;
    }

    public String getTipo_conta() {
        return tipo_conta;
    }

    public void setTipo_conta(String tipo_conta) {
        this.tipo_conta = tipo_conta;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public float getSaldo_conta() {
        return saldo_conta;
    }

    public void setSaldo_conta(float saldo_conta) {
        this.saldo_conta = saldo_conta;
    }

    public boolean getStatus_conta() {
        return status_conta;
    }

    public void setStatus_conta(boolean status_conta) {
        this.status_conta = status_conta;
    }
    
    

    

}
