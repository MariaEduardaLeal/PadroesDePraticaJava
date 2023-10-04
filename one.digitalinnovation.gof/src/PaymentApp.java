// Exemplo de uso do sistema
public class PaymentApp {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        configManager.getPaymentGateway();

        PaymentFacade paymentFacade = new PaymentFacade();
        paymentFacade.processPayment(100.0);
    }
}
