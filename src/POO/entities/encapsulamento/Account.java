package POO.entities.encapsulamento;

public class Account {

    private int number;
    private String holder;
    private double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit); // Chamar a operação de depósito, passando o argumento do construtor. A regra de negócio foi encapsulada dentro do método, para facilitar possíveis alterações.
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    //Operação que faz o depósito
    public void deposit(double amount) {
        balance += amount; //acrescentada a quantia de dinheiro no saldo
    }

    //Operação que faz o saque
    public void widhdr(double amount) {
        balance -= amount + 5.00; //abatendo a quantia a ser sacada do saldo, com a taxa de 5 reais.
    }

    @Override
    public String toString() {
        return "Account " +
                number +
                ", Holder: '" + holder +
                ", Balance: $ " +
                String.format("%.2f", balance);
    }
}
