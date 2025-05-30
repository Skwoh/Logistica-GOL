import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Envio {

    public void enviarPacotes(Armazenagem armazem, String input6) throws InterruptedException {

        List<String> id = armazem.getIdPacote();
        List<String> con = armazem.getConteudo();
        List<LocalDateTime> tempo = armazem.getData();

        long minutos = 0;
        if (id.contains(input6)) {

            int index = id.indexOf(input6);

            LocalDateTime horaCadastro = tempo.get(index);
            LocalDateTime agora = LocalDateTime.now();
            Duration duracao = Duration.between(horaCadastro, agora);
            minutos = duracao.toMinutes();

            System.out.println("O Pacote " + input6 + " está conosco!");
            System.out.println("Conteúdo: " + con.get(index));
            Thread.sleep(1000);
            System.out.println("...");
            Thread.sleep(1000);
            System.out.println("...");
            Thread.sleep(1000);
            System.out.println("...");
            Thread.sleep(1000);

            id.remove(index);
            con.remove(index);

            System.out.println("Pacote enviado com sucesso!");
            System.out.println("Horário da postagem: " + agora);

        } else if (armazem.historicoArmazem(input6)) {
            System.out.println("Pacote enviado há: " + minutos + " minutos.");
        }
    }

}