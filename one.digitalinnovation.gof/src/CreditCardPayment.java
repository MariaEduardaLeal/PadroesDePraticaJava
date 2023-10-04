// Implementações das estratégias de pagamento
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento com cartão de crédito de $" + amount);
    }
}