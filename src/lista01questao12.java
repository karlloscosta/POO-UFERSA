import java.util.Scanner;

public class lista01questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o dia");
        int dia = sc.nextInt();
        sc.close();

        int resultado = (dia - 1)%7;

        switch (resultado){
            case 0:
                System.out.println("domingo"); break;
            case 1:
                System.out.println("Segunda-feira"); break;
            case 2:
                System.out.println("Terça-feira"); break;
            case 3:
                System.out.println("Quarta-feira"); break;
            case 4:
                System.out.println("Quinta-feira"); break;
            case 5:
                System.out.println("Sexta-feira"); break;
            case 6:
                System.out.println("Sábado"); break;
            default:
                System.out.println("data invalida");
        }
    }
}
