public class Main {
    public static void main(String[] args) {

        //Criação do objeto aluno
        Aluno aluno1 = new Aluno("Maria", 20, "Sistemas de Informação");

        //Matricular o aluno
        aluno1.matricular();

        //Cadastrando notas
        aluno1.cadastrarNotas(8.5, 6.4);

        //Exibindo todas as informações
        aluno1.exibirInformacoes();

        //Mostrando a média e verificando aprovação
        aluno1.verificarAprovacao();

        //Cancelando matrícula e testando novamente
        aluno1.cancelarMatricula();
        aluno1.exibirInformacoes();
    }
}