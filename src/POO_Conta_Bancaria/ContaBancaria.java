package POO_Conta_Bancaria;

public class ContaBancaria {

    //Declarando atributos privados
    private String titular; //nome do dono da conta
    private int numeroConta; //Número da conta
    private double saldo; //valor atual da conta

// =============================================

    //Construtor
    public ContaBancaria(String titular, int numeroConta) {

        //Inicializando os atributos dentro do construtor
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;

    } //Final do Construtor

// =============================================

    //Implementando os métodos de GET e SET

    //Métodos - titular
    public String getTitular() {return titular;} //get
    public void setTitular(String titular) {this.titular = titular;} //set

    //Métodos - numeroConta
    public int getNumeroConta() {return numeroConta;} //get
    public void setNumeroConta(int numeroConta) {this.numeroConta = numeroConta;} //set


    //Métodos - saldo
    public double getSaldo() {return saldo;} //get
    //saldo não pode possuir set (instruções da atividade)

    //Fim da implementação de Métodos GET-SET

// =============================================

    //Implementando os Métodos

    //depositarValor(valor)
    public void depositarValor(double valor) {
        if (valor < 0) {
            System.out.println("\n[ERRO] Não é possivel realizar deposito de valores negativos!");
        } else if (valor == 0) {
            System.out.println("\n[ERRO] Não é possivel realizar um deposito sem valor!");
        } else {
            saldo += valor;
            System.out.println("\n=== Depósito Realizado ===");
            System.out.println("Um depósito de R$" + valor + " foi realizado com sucesso!" );
        }
    }

    //sacar(valor)
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("\n[ERRO] Não foi possivel realizar o saque, saldo insuficiente! Seu saldo atual é de: R$" + saldo);
        } else if (valor <= 0) {
            System.out.println("\n[ERRO] Impossível realizar um saque menor ou igual a zero! Insira um valor válido!");
        } else {
            saldo -= valor;
            System.out.println("\n === Saque Realizado ===");
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        }
    }

    //exibirInformacoes()
    public void exibirInformacoes() {
        System.out.println("\n===== Dados da Conta =====");
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo Atual: R$" + saldo);
        System.out.println("==========================\n");
    }

}
