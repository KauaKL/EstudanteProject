package estudante;

public class TesteEstudante {

    public static void main(String[] args) {
        // Criando dois objetos de estudantes
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        
        // Definindo os dados do estudante Leonardo
        estudante1.nome = "Leonardo";
        estudante1.idade = 17;
        estudante1.nota = 9.5;
        estudante1.transferido = true;
        estudante1.periodo = 'M'; // M = manhã, T = tarde, N = noite, I = integral
        estudante1.frequencia = 14.0;

        // Definindo os dados do estudante Kauã
        estudante2.nome = "Kauã";
        estudante2.idade = 18;
        estudante2.nota = 9.5;
        estudante2.transferido = false;
        estudante2.periodo = 'T'; // M = manhã, T = tarde, N = noite, I = integral
        estudante2.frequencia = 15.0;

        // Apresentando e registrando chamadas para Kauã
        estudante2.apresentarEstudante();  // Apresentando Kauã
        estudante2.responderChamada();    // Registrando chamada para Kauã
        estudante2.mostrarInformacoes();   // Mostrando informações de Kauã

        // Apresentando e registrando chamadas para Leonardo
        estudante1.apresentarEstudante();
        estudante1.responderChamada();
        estudante1.mostrarInformacoes();
    }
}