public class ConversorDeMoedas {
    private final ServicoDeTaxaDeCambio servicoDeTaxaDeCambio;

    public ConversorDeMoedas() {
        this.servicoDeTaxaDeCambio = new ServicoDeTaxaDeCambio();
    }

    public double converter(String moedaOrigem, String moedaDestino, double valor) throws Exception {
        double taxaDeCambio = servicoDeTaxaDeCambio.obterTaxaDeCambio(moedaOrigem, moedaDestino);
        return valor * taxaDeCambio;
    }
}

