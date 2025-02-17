package br.dev.joaquim.bank;

/**
 * Classe que representa uma conta bancária.
 *  @author Vinicius Gutierrez Gomes.
 */
public class BankAccount {
  private int accountNumber;
  private double balance;
  private String accountHolderName;

  /**
   * Construtor padrão.
   */
  public BankAccount() {
  }

  /**
   * Construtor com parâmetros.
   * 
   * @param accountNumber o número da conta
   * @param balance o saldo inicial
   * @param accountHolderName o nome do titular da conta
   */
  public BankAccount(int accountNumber, double balance, String accountHolderName) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.accountHolderName = accountHolderName;
  }

  /**
   * Obtém o número da conta.
   * 
   * @return o número da conta
   */
  public int getAccountNumber() {
    return accountNumber;
  }

  /**
   * Obtém o saldo da conta.
   * 
   * @return o saldo da conta
   */
  public double getBalance() {
    return balance;
  }

  /**
   * Obtém o nome do titular da conta.
   * 
   * @return o nome do titular da conta
   */
  public String getAccountHolderName() {
    return accountHolderName;
  }

  /**
   * Deposita um valor na conta.
   * 
   * @param value o valor a ser depositado
   * @throws IllegalArgumentException se o valor for negativo
   */
  public void deposit(double value) {
    if (value < 0) {
      throw new IllegalArgumentException("O valor precisa ser positivo, foi informado o valor R$ " + value);
    }
    this.balance += value;
  }

  /**
   * Saca um valor da conta.
   * 
   * @param value o valor a ser sacado
   * @throws InsufficientFundsException se o saldo for insuficiente
   * @throws IllegalArgumentException se o valor for negativo
   */
  public void withdraw(double value) throws InsufficientFundsException {
    if (value < 0) {
      throw new IllegalArgumentException("O valor precisa ser positivo, foi informado o valor R$ " + value);
    }
    if (value > this.balance) {
      throw new InsufficientFundsException("O valor R$ " + value + " é superior ao saldo [R$ " + this.balance + "]");
    }
    this.balance -= value;
  }

  /**
   * Retorna uma representação em string da conta.
   * 
   * @return uma string representando a conta
   */
  @Override
  public String toString() {
    return "Conta " + accountNumber + " de " + accountHolderName + " têm R$ " + balance + " de saldo";
  }
}