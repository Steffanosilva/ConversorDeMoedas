import java.util.Scanner;

public class AppConversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorDeMoedas conversor = new ConversorDeMoedas();

        while (true) {
            System.out.println("\nEscolha a moeda que deseja converter:");
            System.out.println();
            System.out.println("**************************************");
            System.out.println("1. Dólar (USD) para Real (BRL)");
            System.out.println("2. Euro (EUR) para Real (BRL)");
            System.out.println("3. Libra (GBP) para Real (BRL)");
            System.out.println("4. Iene (JPY) para Real (BRL)");
            System.out.println("5. Dólar Canadense (CAD) para Real (BRL)");
            System.out.println("6. Real (BRL) para Dólar (USD)");
            System.out.println("7. Franco Suíço (CHF) para Real (BRL)");
            System.out.println("8. Dólar Australiano (AUD) para Real (BRL)");
            System.out.println("9. Yuan Chinês (CNY) para Real (BRL)");
            System.out.println("10. Peso Mexicano (MXN) para Real (BRL)");
            System.out.println("0. Sair");
            System.out.println("**************************************");
            System.out.println();
            System.out.print("Escolha uma das opção digitando o número correspondente: ");
            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo do conversor...");
                break;
            }

            System.out.print("Digite o valor a ser convertido: ");
            double valor = scanner.nextDouble();
            String moedaOrigem = "";
            String moedaDestino = "BRL";

            switch (opcao) {
                case 1: moedaOrigem = "USD"; break;
                case 2: moedaOrigem = "EUR"; break;
                case 3: moedaOrigem = "GBP"; break;
                case 4: moedaOrigem = "JPY"; break;
                case 5: moedaOrigem = "CAD"; break;
                case 6: moedaOrigem = "BRL"; moedaDestino = "USD"; break;
                case 7: moedaOrigem = "CHF"; break;
                case 8: moedaOrigem = "AUD"; break;
                case 9: moedaOrigem = "CNY"; break;
                case 10: moedaOrigem = "MXN"; break;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            try {
                double valorConvertido = conversor.converter(moedaOrigem, moedaDestino, valor);
                System.out.println();
                System.out.printf("Resultado: %.2f %s = %.2f %s%n", valor, moedaOrigem, valorConvertido, moedaDestino);
            } catch (Exception e) {
                System.out.println("Erro ao converter moeda: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
