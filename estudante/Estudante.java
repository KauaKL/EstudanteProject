package estudante;

public class Estudante { // não executa, so segura informação e definições

    //declarando as variaveis gerais
    String nome;
    int idade;
    double frequencia;
    boolean transferido;
    char periodo; // manha, tarde, noite e integral;
    double nota;

    // Método para apresenatar estudante
    public void apresentarEstudante (){
        System.out.println("Olá, meu nome " + nome + ", tenho " + idade + " anos e estou no período, " + periodo + ". ");
        System.out.println();
    }

        // Método para mostrar as informações do estudante
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota: " + nota);
        System.out.println("Transferido: " + transferido);
        System.out.println("Período: " + periodo);
        System.out.println("Frequencia: " + frequencia);
        System.out.println();
    }

    // Método para adicionar 1.25 horas de aula
    public void responderChamada() {
        frequencia += 1.25;
    }

    // Método principal para rodar o programa
    
        /* Método principal para rodar o programa
        Estudante estudante = new Estudante(); // Criando um objeto da classe Estudante
       
        estudante.apresentarEstudante(); // apresenatar estudante

        estudante.responderChamada();  // Primeira chamada
        estudante.responderChamada();  // Segunda chamada

        estudante.mostrarInformacoes();  // Exibe todas as informações do estudante
    }*/
}