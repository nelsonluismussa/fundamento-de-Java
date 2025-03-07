
public class EstruturadaCondicional {
        

public static void main(String[] args) {
		
    int horas = 0;
    
    if (horas <11) {
        System.out.println("Bom dia!");
    }else if(horas > 12 && horas <= 17) {
        System.out.println("Boa tarde!");
    }else if(horas >= 18) {
        System.out.println("Boa noite!");
    }
}

}