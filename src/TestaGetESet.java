public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 016);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente lucas = new Cliente();
        lucas.setNome("Lucas Roland");

        conta.setTitular(lucas);
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("Progamador");
    }
}
