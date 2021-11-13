package pkg7a;
public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Pretty boy", "EUA", 31, 1.79f, 78.5f, 11, 2, 5);
        l[0].apresentar();
        l[0].status(); 
        l[0].ganharLuta();
       
       l[1] = new Lutador("Putscript", "Brasil", 34, 1.80f, 65.6f, 10, 3, 4);
       l[1].status();
       l[1].ganharLuta();
       l[1].perderLuta();
        
       Luta UFC01 = new Luta();
       UFC01.marcarLuta(l[0], l[1]);
       
       
    }
    
}
