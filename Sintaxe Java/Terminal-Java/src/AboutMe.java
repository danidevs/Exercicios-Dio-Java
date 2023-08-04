
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobre nome");
            String sobreNome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Ola, meu nome " + " " + nome + " " + sobreNome);
            System.out.println("tenho" + " " + idade + " anos");
            System.out.println("minha altura " + " " + altura + " cm");
        }
    }
}
