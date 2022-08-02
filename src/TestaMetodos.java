public class TestaMetodos {
    public static void main(String[] args) {
        Conta contaDoLucas = new Conta ();
        contaDoLucas.saldo = 2000;
        contaDoLucas.deposita(375);
        System.out.println(contaDoLucas.saldo);

    }
}
