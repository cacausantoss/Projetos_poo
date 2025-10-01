
    import java.util.Scanner;
    public class Isotermica {

    public static void calcular  (Scanner sc) {
        System.out.println("Digite P1: ");
        double P1 = sc.nextDouble();
        System.out.println("Digite V1: ");
        double V1 = sc.nextDouble();
        System.out.println("Digite V2: ");
        double V2 = sc.nextDouble();

        double P2 = (P1 * V1) / V2;
        System.out.println("Resultado: P2 =" + P2);
    }
}


