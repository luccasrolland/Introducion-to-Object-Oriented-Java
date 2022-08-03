public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaSteffany = new Conta();
        System.out.println(contaDaSteffany.getSaldo());

        contaDaSteffany.titular = new Cliente();
        System.out.println(contaDaSteffany.titular);

        contaDaSteffany.titular.nome = "Steffany Santana";
        System.out.println(contaDaSteffany.titular.nome);
    }
}
