public class TestaGerente {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setNome("Ruan Éric");
        f.setSalario(1000.0);

        Gerente g = new Gerente();
        g.setNome("Éric Ruan");
        g.setSalario(5000.0);
        g.setSenha(3733);

        System.out.println("Funcionário.....: " + g.getNome());
        System.out.println("Salário Funcionário.....: " + g.getSalario());
        
        System.out.println("Gerente.....: " + g.getNome());
        System.out.println("Salário Gerente.....: " + g.getSalario());
        System.out.println("Bonificação Gerente.....: " + g.getBonificacao());
    }
}
