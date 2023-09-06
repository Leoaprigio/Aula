import java.util.Scanner;

public class aula2 {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua Idade");
        int idade = sc.nextInt();
        System.out.println(idade >= 18 ? "Pode Dirigir" : "Não pode Dirigir");
        sc.close();



    }    
}
