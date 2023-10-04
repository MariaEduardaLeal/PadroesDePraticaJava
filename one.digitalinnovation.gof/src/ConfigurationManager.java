// Classe Singleton para gerenciar as configurações do sistema
public class ConfigurationManager {
    private static ConfigurationManager instance;

    private ConfigurationManager() {
        // Inicialize as configurações aqui
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Métodos para acessar configurações
    public String getPaymentGateway() {
        return "PayPal"; // Exemplo: retorno fixo para o PayPal
    }
}