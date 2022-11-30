import java.util.Scanner;

public class teste {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o mês:");
        int mes = leitor.nextInt();
        String console = null;

        switch (mes){
            case 1 :
                System.out.println("Janeiro");
                break;
            case 2 :
                System.out.println("Fevereiro");
                break;
            case 3 :
                System.out.println("Março");
                break;
            case 4 :
                System.out.println("Abril");
                break;

        }

        for (int i = 1; i <= 4 ; i++){
            if (i <= 4)
                return;


        }


        System.out.println(mes);
    }
}
