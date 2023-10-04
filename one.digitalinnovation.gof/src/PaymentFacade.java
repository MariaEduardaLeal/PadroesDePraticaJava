// Classe Facade para simplificar o processo de pagamento
public class PaymentFacade {
    private PaymentStrategy paymentStrategy;

    public PaymentFacade() {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        String paymentGateway = configManager.getPaymentGateway();

        // Aqui, você pode configurar a estratégia de pagamento com base nas configurações
        if ("CartaoCredito".equalsIgnoreCase(paymentGateway)) {
            paymentStrategy = new CreditCardPayment();
        } else if ("PayPal".equalsIgnoreCase(paymentGateway)) {
            paymentStrategy = new PayPalPayment();
        } else {
            throw new IllegalArgumentException("Método de pagamento não suportado");
        }
    }

    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}