import java.util.Scanner;

public class Tarea {

    public static void main(String[] args) {
    	Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el primer codigo: ");
        String Codigo1 = entrada.nextLine();
        System.out.println("Ingresa el segundo codigo: ");
        String Codigo2 = entrada.nextLine();

        char[] C1 = Codigo1.toCharArray();
        char[] C2 = Codigo2.toCharArray();

        char igual[] = new char[50];
        char resultado[] = new char[50];

        int CadenaMenor = C1.length;
        if (C2.length < CadenaMenor) {
            CadenaMenor = C2.length;
        }
        int Comparacion = 0;
        int CantidadDeCaracteres = 0;
        for (int i = 0; i < C1.length; i++) {
            CantidadDeCaracteres = 0;
            for (int j = 0; j < C2.length; j++) {
                if (C1[i] == C2[j]) {
                    CantidadDeCaracteres = 0;
                    int CaracterC1 = i;
                    int CaracterC2 = j;
                    igual[CantidadDeCaracteres] = C1[i];
                    CantidadDeCaracteres++;
                    int m1 = CadenaMenor - i;
                    int m2 = CadenaMenor - j;
                    int inicio;
                    if (m1 >= m2) {
                        inicio = j;
                    } else {
                        inicio = i;
                    }
                    for (int k = inicio; k < (CadenaMenor - 1); k++) {
                        if (C1[CaracterC1 + 1] == C2[CaracterC2 + 1]) {
                            igual[CantidadDeCaracteres] = C1[CaracterC1 + 1];
                            CantidadDeCaracteres++;
                        } else {
                            if (CantidadDeCaracteres > Comparacion) {
                                Comparacion = CantidadDeCaracteres;
                                for (int z = 0; z < 10; z++) {
                                    resultado[z] = igual[z];
                                }
                            }
                            CantidadDeCaracteres = 0;
                        }
                        CaracterC1++;
                        CaracterC2++;
                    }
                }
            }
        }
        System.out.print("Secuencia mayor comun en ambos ADNs: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(resultado[i]);
        }
        System.out.println("");
	}
}
