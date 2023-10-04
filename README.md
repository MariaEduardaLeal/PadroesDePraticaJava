# Projeto de Processamento de Pagamento com Padrões de Projeto em Java

Este é um projeto Java de exemplo que demonstra o uso dos padrões de projeto Singleton, Strategy e Facade em um sistema de processamento de pagamento.

## Padrões de Projeto Utilizados

### Singleton
O padrão Singleton é usado para criar uma única instância da classe `ConfigurationManager`, que gerencia as configurações do sistema. Isso garante que haja apenas uma instância das configurações em todo o sistema.

### Strategy
O padrão Strategy é implementado com as classes `PaymentStrategy`, `CreditCardPayment`, e `PayPalPayment`. Ele permite que diferentes estratégias de pagamento sejam facilmente intercambiáveis, mantendo a mesma interface.

### Facade
A classe `PaymentFacade` atua como uma fachada simplificando o processo de pagamento para o usuário. Ela lida com a criação da estratégia de pagamento apropriada com base nas configurações do sistema.

## Estrutura do Projeto

- `ConfigurationManager.java`: Implementa o padrão Singleton para gerenciar configurações do sistema.
- `PaymentStrategy.java`: Define a interface para as estratégias de pagamento.
- `CreditCardPayment.java`: Implementa a estratégia de pagamento com cartão de crédito.
- `PayPalPayment.java`: Implementa a estratégia de pagamento com o PayPal.
- `PaymentFacade.java`: Implementa a fachada para simplificar o processo de pagamento.
- `PaymentApp.java`: Exemplo de uso do sistema.

## Como Usar

1. Clone o repositório para sua máquina local:
git clone https://github.com/seu-usuario/nome-do-repositorio.git


2. Navegue até o diretório do projeto:
cd nome-do-repositorio


3. Compile e execute o exemplo de aplicação:
javac PaymentApp.java
java PaymentApp

Isso executará o aplicativo de exemplo, que configura o método de pagamento com base nas configurações e processa um pagamento de exemplo.
