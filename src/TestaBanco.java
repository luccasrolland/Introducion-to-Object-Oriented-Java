public class TestaBanco {
    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        lucas.nome = "Lucas Roland";
        lucas.cpf = "000.000.000-00";
        lucas.profissao = "Gerente Administrativo/Programador";

        Conta contaDoLucas = new Conta();
        contaDoLucas.deposita(2750);

        contaDoLucas.titular = lucas;
        System.out.println(contaDoLucas.titular);

    }
}
