package pkg7a;

import java.util.Random;

public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;

    public Luta(Lutador desafiado, Lutador desafiante, int round, boolean aprovada) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.round = round;
        this.aprovada = aprovada;
    }

    Luta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public void marcarLuta(Lutador l1,Lutador l2){
        if(l1.getCategoria() == l2.getCategoria()){
            if(l1 != l2){
                this.setAprovada(true);
                this.setDesafiado(l1);
                this.setDesafiante(l2); 
            }
            else{
                this.setAprovada(false);
                this.setDesafiado(null);
                this.setDesafiante(null);
            }
    }
    
   
    public void lutar(){
            
            if(this.getAprovada()){
               System.out.println("### Desafiado ###");
               this.desafiado.apresentar();
               System.out.println("### Desafiante ###");
               this.desafiante.apresentar(); 
               /*int vencedor =(int) (0 + Math.random() * (3 - 0));
               switch(vencedor){
                   
                   case 0 : System.out.println("Empatou! ");
                   
                   case 1 : System.out.println("Ganhou desafiado! ");
                   
                   case 2: System.out.println("Ganhou desafiante! ");
               }*/
                Random aleatorio = new Random();
                int vencedor = aleatorio.nextInt(3);
                switch(vencedor){
                     
                   case 0 : 
                        System.out.println("Empatou! ");
                        this.desafiado.empatarLuta();
                        this.desafiante.empatarLuta();
                        break;
                   
                   case 1 : 
                        System.out.println("Ganhou desafiado! ");
                        System.out.println("Nome: " + this.desafiado.getNome());
                        this.desafiado.ganharLuta();
                        this.desafiante.perderLuta();
                        break;
                   
                   case 2: 
                        System.out.println("Ganhou desafiante! ");
                        System.out.println("Nome: " + this.desafiante.getNome());
                        this.desafiado.perderLuta();
                        this.desafiante.ganharLuta();
                        break;
               }
            }
            else{
                System.out.println("Luta não vai acontecer! ");
            }
        }
            
  
}
