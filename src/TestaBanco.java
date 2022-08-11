//"""creating class and testing the features."""

public class TestaBanco {
    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        lucas.setNome("Lucas Roland");
        lucas.setCpf("000.000.000-00");
        lucas.setProfissao("Gerente Administrativo/Programador");

        Conta contaDoLucas = new Conta(1337, 016);
        contaDoLucas.deposita(2750);



    }
}
