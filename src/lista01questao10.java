import java.util.Scanner;

public class lista01questao10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a coordenada X do primeiro ponto: ");
        int x1 = sc.nextInt();
        System.out.println("Informe a coordenada Y do primeiro ponto: ");
        int y1 = sc.nextInt();
        System.out.println("Informe a coordenada X do segundo ponto");
        int x2 = sc.nextInt();
        System.out.println("Informe a coordenada Y do segundo ponto");
        int y2 = sc.nextInt();

        sc.close();

        if(x1<x2){
            System.out.println("O segundo ponto esta a direita no eixo das abississas");
        } else if (x1>x2) {
            System.out.println("O segundo ponto esta a esquerda no eixo das abississas");
        } else {
            System.out.println("O segundo ponto esta no mesmo local no eixo das abississas");
        }

        if(y1<y2){
            System.out.println("O segundo ponto esta acima no eixo das ordenadas");
        } else if (y1>y2) {
            System.out.println("O segundo ponto esta abaixo no das ordenadas");
        } else {
            System.out.println("O segundo ponto esta no mesmo local no eixo das ordenadas");
        }
    }
}
