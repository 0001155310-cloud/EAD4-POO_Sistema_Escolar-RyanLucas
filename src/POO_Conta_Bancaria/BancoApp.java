package POO_Conta_Bancaria;

public class BancoApp {
    public static void main(String[] args) {

        //Criando duas contas diferentes
        ContaBancaria conta1 = new ContaBancaria("Marcel Philippe", 12345);
        ContaBancaria conta2 = new ContaBancaria("Agostinho da Silva Junior", 67890);

        //Exibir informações iniciais
        conta1.exibirInformacoes();
        conta2.exibirInformacoes();

        //Realizar operações na conta 1
        conta1.depositarValor(18000);
        conta1.sacar(2000);
        conta1.exibirInformacoes();

        //Testar casos inválidos
        conta1.sacar(900); // saque maior que o saldo
        conta1.depositarValor(-50); // depósito negativo

        //Operações na conta 2
        conta2.depositarValor(24500);
        conta2.sacar(10000);
        conta2.exibirInformacoes();
    }
}

