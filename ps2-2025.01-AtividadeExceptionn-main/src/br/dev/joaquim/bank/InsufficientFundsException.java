package br.dev.joaquim.bank;
/*
@author Vinicius Gutierrez Gomes.
*/
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}