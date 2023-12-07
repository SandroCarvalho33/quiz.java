package quiz.brenno;

import java.util.Scanner;

public class quiz {
    public String aluno;
    public String Professor;
    public String materia;
    public String Curso;
    public void escrevacabecalho() {


    }

    public static void main(String[] args) throws Exception {

        Cabecalho head = new Cabecalho();
        head.aluno = "Sandro Carvalho Jorge Almeida";
        head.Professor = "Brenno Pimenta";
        head.materia= "Algoritmo e programação II";
        head.curso = "Engenharia de Software";
        head.cabecalho();


        int numeroAcertos = 0;
        System.out.println("========================================================================================================");
        System.out.println("Iniciaremos agora o quiz de 15 questões sobre conhecimento gerais!");
        System.out.println("Primeira Pergunta!!");

        numeroAcertos += perguntaum();
        numeroAcertos += perguntadois();
        numeroAcertos += perguntatres();
        numeroAcertos += perguntaquatro();
        numeroAcertos += perguntacinco();
        numeroAcertos += perguntaseis();
        numeroAcertos += perguntasete();
        numeroAcertos += perguntaoito();
        numeroAcertos += perguntanove();
        numeroAcertos += perguntadez();
        numeroAcertos += perguntaonze();
        numeroAcertos += perguntadoze();
        numeroAcertos += perguntatreze();
        numeroAcertos += perguntaquatorze();
        numeroAcertos += perguntaquinze();



        System.out.println("Fim do Quiz! Parabéns... De 15 perguntas você acertou: " + numeroAcertos);
    }

    public static int perguntaum() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao1 = new Questao();
        questao1.setPergunta("1 - Qual o nome do famoso carro projetado pela Ford em 1966, com o intuito de vencer a campeã do ano anterior Ferrari nas 24 horas de Le Mans, cujo os 3 carros da equipe terminaram nas posições de 1º, 2º e 3º colocação?");
        questao1.setOpcaoA("A - Ford Mustang GT500" );
        questao1.setOpcaoB("B - Ford Maverick");
        questao1.setOpcaoC("C - Ford Del Rey");
        questao1.setOpcaoD("D - Ford Escort");
        questao1.setOpcaoE("E - Ford GT40");
        questao1.setCorreta("E");
        questao1.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao1.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }

    public static int perguntadois()  {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao2 = new Questao();
        questao2.setPergunta("2 - Por qual escuderia o piloto brasileiro Ayrton Senna correu dentre as seguintes opções?");
        questao2.setOpcaoA("A - Mclaren");
        questao2.setOpcaoB("B - Ferrari");
        questao2.setOpcaoC("C - Mercedes");
        questao2.setOpcaoD("D - Aston Martin");
        questao2.setOpcaoE("E - Red Bull");
        questao2.setCorreta("A");
        questao2.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao2.isCorreta(respostaUsuario) )  {
            cont++;
        }
        System.out.println("========================================================================");



        return cont;
    }

    public static int perguntatres()  {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao3 = new Questao();
        questao3.setPergunta("3 - Introduzido na Fórmula 1 a partir de 2018, o halo espécie de barra é uma de titânio que sustenta uma pressão de até 12 toneladas sendo hoje em dia um dos equipamentos fundamentais para o carro de Fórmula 1. O Halo é um equipamento de proteção lcoalizado onde?");
        questao3.setOpcaoA("A - Asas dianteiras");
        questao3.setOpcaoB("B - Asas traseiras");
        questao3.setOpcaoC("C - Rodas");
        questao3.setOpcaoD("D - Cockpit");
        questao3.setOpcaoE("E - Retrovisores");
        questao3.setCorreta("D");
        questao3.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao3.isCorreta(respostaUsuario) )  {
            cont++;
        }
        System.out.println("========================================================================");



        return cont;
    }


    public static int perguntaquatro()  {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao4 = new Questao();
        questao4.setPergunta("4 - Qual destes pilotos foram adversários diretos durante os campeonatos que Ayrton Senna competiu?");
        questao4.setOpcaoA("A - Max Verstappen e Lewis Hamilton");
        questao4.setOpcaoB("B - Michael Schumacher e Alain Prost");
        questao4.setOpcaoC("C - Alain Prost e Fernando Alonso ");
        questao4.setOpcaoD("D - Lando Norris e Charles Leclerc");
        questao4.setOpcaoE("E - Oscar Piastri e Sergio Pérez");
        questao4.setCorreta("B");
        questao4.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao4.isCorreta(respostaUsuario) )  {
            cont++;
        }
        System.out.println("========================================================================");



        return cont;
    }
    public static int perguntacinco() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao5 = new Questao();
        questao5.setPergunta("5 - Fundada em 1975 pelos Irmãos Emerson e Wilson Fittipaldi Jr, houve uma Única equipe Brasileira a ter participado da categoria mais veloz do automobilismo, o nome da equipe era:");
        questao5.setOpcaoA("A - Brazilian Racing Motors" );
        questao5.setOpcaoB("B - Copersucar");
        questao5.setOpcaoC("C - Brabham");
        questao5.setOpcaoD("D - Arrows");
        questao5.setOpcaoE("E - Shadow");
        questao5.setCorreta("B");
        questao5.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao5.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }public static int perguntaseis() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao6 = new Questao();
        questao6.setPergunta("6 - Quem foi o piloto, que em 2015 se tornou o mais jovem a disputar na Fórmula 1 a bordo de uma Toro Rosso?");
        questao6.setOpcaoA("A - Lando Norris");
        questao6.setOpcaoB("B - Charles Leclerc");
        questao6.setOpcaoC("C - Yuki Tsunoda");
        questao6.setOpcaoD("D - Max Verstappen");
        questao6.setOpcaoE("E - Logan Sargeant");
        questao6.setCorreta("D");
        questao6.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao6.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }public static int perguntasete() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao7 = new Questao();
        questao7.setPergunta("7 - Com Michael Schumacher e Lewis Hamilton liderando o ranking de pilotos mais vitoriosos da Fórmula 1, quantos títulos foram nescessário conquistarem cada um para se tornarem os maiores vencedores da categoria até o momento? ");
        questao7.setOpcaoA("A - 7 Títulos" );
        questao7.setOpcaoB("B - 6 Títulos");
        questao7.setOpcaoC("C - 9 Títulos");
        questao7.setOpcaoD("D - 12 Títulos");
        questao7.setOpcaoE("E - 4 Títulos");
        questao7.setCorreta("A");
        questao7.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao7.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }public static int perguntaoito() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao8 = new Questao();
        questao8.setPergunta("8 - Em 2017 o último piloto brasileiro a correr pela Fórmula 1, Felipe Massa, participou de sua última corrida por qual escuderia? ");
        questao8.setOpcaoA("A - Ferrari " );
        questao8.setOpcaoB("B - Mercedes");
        questao8.setOpcaoC("C - Mclaren");
        questao8.setOpcaoD("D - Haas");
        questao8.setOpcaoE("E - Williams");
        questao8.setCorreta("E");
        questao8.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao8.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }
    public static int perguntanove() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao9 = new Questao();
        questao9.setPergunta("9 - Em qual destes circuitos foi disputada o primerio Grande Prêmio de Formula 1?");
        questao9.setOpcaoA("A - Circuit de Monaco / Mônaco" );
        questao9.setOpcaoB("B - Circuit of the Americas / EUA");
        questao9.setOpcaoC("C - Silverstone / Inglaterra");
        questao9.setOpcaoD("D - Interlagos / Brasil");
        questao9.setOpcaoE("E - Circuit de Monza / Itália");
        questao9.setCorreta("C");
        questao9.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao9.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }
    public static int perguntadez() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao10 = new Questao();
        questao10.setPergunta("10 - Qual é a equipe com mais vitórias no campeonato de construtores da Fómula 1?");
        questao10.setOpcaoA("A - Lotus");
        questao10.setOpcaoB("B - Mclaren");
        questao10.setOpcaoC("C - Mercedes");
        questao10.setOpcaoD("D - Ferrari");
        questao10.setOpcaoE("E - Willians");
        questao10.setCorreta("D");
        questao10.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao10.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }public static int perguntaonze() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao11 = new Questao();
        questao11.setPergunta("11 - Durante o GP do Qatar a (...) fez o pit stop mais rápido da história da Formula 1 precisando de 1,80 segundos para efetuar a parada, quebrando o recorde anterior que pertencia a Red Bull com 1,82 segundos. Qual foi a equipe que quebrou o recorde de pit stop mais rápido da história da formula 1?");
        questao11.setOpcaoA("A - Mclaren" );
        questao11.setOpcaoB("B - Racing Point");
        questao11.setOpcaoC("C - Toro Rosso");
        questao11.setOpcaoD("D - Ferrari");
        questao11.setOpcaoE("E - Alpha Tauri");
        questao11.setCorreta("A");
        questao11.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao11.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }
    public static int perguntadoze() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao12 = new Questao();
        questao12.setPergunta("12 - As corridas feitas na chuva são um grande problema para os pilotos, dentre eles o acumulo e agua na pista e a aquaplanagem. Como é nomeado o processo da expulsão de água dos pneus durante uma corrida chuvosa que dificulta a visualização da pista para os carros que vem atrás? ?");
        questao12.setOpcaoA("A - Escorredor" );
        questao12.setOpcaoB("B - Resfriamento de discos");
        questao12.setOpcaoC("C - vácuo");
        questao12.setOpcaoD("D - Spray");
        questao12.setOpcaoE("E - condensamento");
        questao12.setCorreta("D");
        questao12.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao12.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }
    public static int perguntatreze() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao13 = new Questao();
        questao13.setPergunta("13 - Na Fórmula 1, existem diversas punições de acordo com as regras infringidas pelos pilotos ou equipes, sendo usadas para manter a segurança e que as regras pré definidas fossem seguidas a risca. Sendo assim, qual o piloto com mais punições na Fórmula 1 no mesmo ano?");
        questao13.setOpcaoA("A - Juan Fangio / 6 punições" );
        questao13.setOpcaoB("B - Lewis Hamilton /  8 punições");
        questao13.setOpcaoC("C - Pastor Maldonado / 10 punições");
        questao13.setOpcaoD("D - Max Verstappen / 12 punições");
        questao13.setOpcaoE("E - Nikita Mazepin / 14 punições");
        questao13.setCorreta("C");
        questao13.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao13.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }
    public static int perguntaquatorze() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao14 = new Questao();
        questao14.setPergunta("14 - Qual foi o único piloto a ser campeão por 4 equipes diferentes?");
        questao14.setOpcaoA("A - Felipe Massa" );
        questao14.setOpcaoB("B - Ayrton Senna");
        questao14.setOpcaoC("C - Michael Schumacher");
        questao14.setOpcaoD("D - Juan Fangio");
        questao14.setOpcaoE("E - Alain Prost");
        questao14.setCorreta("D");
        questao14.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao14.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }
    public static int perguntaquinze() {
        int cont = 0;
        String respostaUsuario = "";
        System.out.println("=========================================================================");
        Questao questao15 = new Questao();
        questao15.setPergunta("1 - No capeonato de 2020, foi registrado no GP da Itália a volta mais rápida da história da Fórmula 1. Com uma volta no tempo de 1m 18s 887, e uma média de 234,36 Km/h, quem foi o Autor desta volta?");
        questao15.setOpcaoA("A - Sebastian Vettel " );
        questao15.setOpcaoB("B - Carlos Sainz");
        questao15.setOpcaoC("C - Lewis Hamilton");
        questao15.setOpcaoD("D - Lance Stroll");
        questao15.setOpcaoE("E - Alexander Albos");
        questao15.setCorreta("C");
        questao15.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao15.isCorreta(respostaUsuario)) {
            cont++;
        }
        System.out.println("=========================================================================");



        return cont;

    }


    public static String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    public static boolean respostaValida(String resp) {
        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
            return true;
        }
        System.out.println("Resposta inválida ... ");
        return false;
    }

    public static class Questao {
        private String pergunta = "";
        private String opcaoA = "";
        private String opcaoB = "";
        private String opcaoC = "";
        private String opcaoD = "";
        private String opcaoE = "";
        private String correta = "";

        public boolean isCorreta(String resposta) {
            if (resposta.equalsIgnoreCase(this.correta)) {
                System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
                return true;
            } else {
                System.out.println("Resposta Errada!");
                System.out.println("A opção correta é a letra: " + this.correta);
                return false;
            }
        }

        public void escrevaQuestao() {
            System.out.println(this.pergunta);
            System.out.println();
            System.out.println(this.opcaoA);
            System.out.println(this.opcaoB);
            System.out.println(this.opcaoC);
            System.out.println(this.opcaoD);
            System.out.println(this.opcaoE);
            System.out.println();
        }

        public void setPergunta(String pergunta) {
            this.pergunta = pergunta;
        }

        public void setOpcaoA(String opcaoA) {
            this.opcaoA = opcaoA;
        }

        public void setOpcaoB(String opcaoB) {
            this.opcaoB = opcaoB;
        }

        public void setOpcaoC(String opcaoC) {
            this.opcaoC = opcaoC;
        }

        public void setOpcaoD(String opcaoD) {
            this.opcaoD = opcaoD;
        }

        public void setOpcaoE(String opcaoE) {
            this.opcaoE = opcaoE;
        }

        public void setCorreta(String correta) {
            this.correta = correta;
        }
    }



}