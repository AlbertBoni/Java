public class Escola {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        aluno1.setNome("Albert");
        aluno1.setIdade(24);

        System.out.println("Nome: " + aluno1.getNome() + " Idade: " + aluno1.getIdade());
    }
}
