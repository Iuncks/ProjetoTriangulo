import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex14 {

    public static void main(String[] args) throws IOException {

    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(ir);

        int Nascinento, Atual, Idade;

        Nascinento = Integer.parseInt(in.readLine());
        Atual = Integer.parseInt(in.readLine());
        Idade = Atual - Nascinento;

        if (Nascinento <= Atual){ 
        System.out.printf("Valido e sua idade Ã©: %d" + " anos ", Idade);
        
        } else { 
        System.out.printf("Ã‰ Invalido nÃ£o existe %d" + " anos de idade ", Idade); 
        }
    
    }
}
