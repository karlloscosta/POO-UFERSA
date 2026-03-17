public class lista01questao13 {
    public static void main(String[] args) {
        int num = 1;
        int i = 0;
        int j = 0;
        for (i=0;i<6;i++){
            for (j=0;j<10;j++){
                System.out.printf("%02d ",num);
                num++;
            }
            System.out.println();
        }
    }
}
