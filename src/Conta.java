//"""creating class, defining attributes and access methods."""

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public Conta (int agencia, int numero) {
        Conta.total++;
        System.out.println("o total de contas e" + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("estou criando uma conta" + this.numero);
    //"""creating constructor that returns the number of accounts created and which one was created respectively.""
    }

    public void deposita(double valor) {
        this.saldo += valor;
    //"""creating the deposit method"""
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    //"""creating the withdrawal method."""
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    //""creating the transfer method."""
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("nao pode valor menor ou igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("nao pode valor menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    //"""creating methods to access private attributes."""

    public static int getTotal() {
        return total;
    }
    //"""creating methods to access static attributes."""

}
