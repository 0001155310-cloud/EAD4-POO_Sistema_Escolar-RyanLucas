package POO_Sistema_Escolar;

public class Aluno {

    // Declarando os atributos como privados
    private String nome;
    private int idade;
    private String curso;
    private boolean matriculado;
    private double nota1;
    private double nota2;

// =============================================

    // Construtor
    public Aluno(String nome, int idade, String curso) {

        //Inicializando os atributos dentro do construtor
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.matriculado = false;
        this.nota1 = 0.0;
        this.nota2 = 0.0;

    } //Final do Construtor

// =============================================

    //Implementando os métodos de GET e SET

    //Métodos - Nome
    public String getNome() {return nome;} //get
    public void setNome(String nome) {this.nome = nome;} //set

    //Métodos - idade
    public int getIdade() {return idade;} //get
    public void setIdade(int idade) {this.idade = idade;} //set

    //Métodos - Curso
    public String getCurso() {return curso;} //get
    public void setCurso(String curso) {this.curso = curso;} //set

    //Métodos - Matriculado
    public boolean isMatriculado() {return matriculado;} //is
        //(i) Quando algum valor é boolean, utilizamos o "isVariável" ao invés de GET!
    public void setMatriculado(boolean matriculado) {this.matriculado = matriculado;} // set (não muda)

    //Métodos - Nota1
    public double getNota1() {return nota1;} //get
    public void setNota1(double nota1) {this.nota1 = nota1;} // set

    //Métodos - Nota2
    public double getNota2() {return nota2;} //get
    public void setNota2(double nota2) {this.nota2 = nota2;} // set

    //Fim da implementação de Métodos GET-SET

// =============================================

    //Implementando os Métodos comportamentais

    //matricular()
    public void matricular() { //Criando metodo matricular()
        if (!matriculado) { //matriculado já começa sendo falso, logo "!matriculado" seria true
            matriculado = true; //Se o aluno não era matriculado, isso matricula o aluno
            System.out.println("POO_Sistema_Escolar.Aluno foi matriculado com sucesso!");

        } else { //caso o aluno já seja matriculado
            System.out.println("O aluno já está matriculado!");
        }
    }

    //cancelarMatricula()
    public void cancelarMatricula() { //criando metodo cancelarMatricula()
        if (matriculado) { //caso o aluno seja matriculado
            matriculado = false; //declara matriculado mo false
            System.out.println("A matrícula foi cancelada com sucesso!");
        } else { //caso o aluno já tenha a sua matricula cancelada
            System.out.println("O aluno já está com a matricula inativa!");
        }
    }

    //verificarMaioridade()
    public void verificarMaioridade() { //criando o metodo verificarMaioridade
        if (idade >= 18) { //se for maior de idade
            System.out.println("POO_Sistema_Escolar.Aluno é maior de idade e pode participar de cursos noturnos.");
        } else { //se for menor de idade
            System.out.println("POO_Sistema_Escolar.Aluno é menor de idade e possui restrições de horário.");
        }
    }

    //cadastrarNotas(double n1, double n2)
    public void cadastrarNotas(double n1, double n2) { //declara o metodo e as variáveis n1 e n2
        this.nota1 = n1; //n1 se torna a primeira nota
        this.nota2 = n2; //n2 se torna a segunda nota
        System.out.println("Notas cadastradas com sucesso!");
    }

    //calcularMedia()
    public double calcularMedia() { //declara o metodo
        if (nota1 == 0.0 && nota2 == 0.0) { //caso ambas as notas sejam 0.0, exibir a menssagem:
            System.out.println("Notas ainda não cadastradas");
            return 0.0; //Retorna o valor 0
        }
        return (nota1+nota2) / 2; //retorna o valor da media (sem criar a variavel)
    }

    //verificarAprovacao()
    public void verificarAprovacao() { //declara o metodo
        if (nota1 == 0.0 && nota2 == 0.0) { //caso ambas as notas sejam 0, exibir a menssagem:
            System.out.println("Notas não cadastradas.");
        } else { //caso contrário (se a nota for declarada)
            double media = calcularMedia();
            if (media >= 6.0) { //Caso estej aacima ou na média
                System.out.println("Aprovado! Média: " + media); //menssagem de aprovação
            } else { //caso esteja abaixo da média
                System.out.println("Reprovado. Média: " + media); //menssagem de reprovação
            }
        }
    }

    //exibirInformações()
    public void exibirInformacoes() { //declara o metodo
        System.out.println("\n===== Dados do POO_Sistema_Escolar.Aluno =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        System.out.println("Matriculado: " + matriculado);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);

        if (nota1 != 0.0 || nota2 != 0.0) { //caso pelo menos uma nota seja declarada
            System.out.println("Média: " + calcularMedia()); //exibir média a partir do chamado do metodo
        }
        System.out.println("==========================\n");
    }
}
