import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;


public class Armazenagem {

    List<String> conteudo = new ArrayList<>();
    List<String> idPacote = new ArrayList<>();
    List<String> historico = new ArrayList<>();
    List<LocalDateTime> data = new ArrayList<>();

    public List<String> getIdPacote(){

        return idPacote;
    }

    public List<String> getConteudo(){

        return conteudo;
    }

    public List<LocalDateTime> getData(){
        return data;
    }



    public Armazenagem(){
        this.conteudo = conteudo;
        this.idPacote =  idPacote;
    }

    public void pacoteCadastro(String input4, String input5) {
        idPacote.add(input4);
        conteudo.add(input5);
        historico.add(input4);
        data.add(LocalDateTime.now());
    }

    public boolean historicoArmazem(String input6){
        return historico.contains(input6);
    }

    public void mostrarConteudo(){;

        for(int i = 0; i < idPacote.size(); i++){
            System.out.println(idPacote.get(i) + " <-------> " + conteudo.get(i));
        }
    }

}

