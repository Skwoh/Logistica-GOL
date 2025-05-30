import java.util.List;

public class Envio {

    public void enviarPacotes(Armazenagem armazem, String input6) throws InterruptedException{

        List<String> id = armazem.getIdPacote();
        List<String> con = armazem.getConteudo();

        if(id.contains(input6)){

            int index = id.indexOf(input6);
            System.out.println("O Pacote " + input6 + " está conosco!");
            System.out.println("Conteúdo: " + con.get(index));

            id.remove(index);
            con.remove(index);

        } else if(!id.contains(input6)){
            Thread.sleep(1000);
            System.out.println("Pacote enviado para o destino!");
        }
    }

}