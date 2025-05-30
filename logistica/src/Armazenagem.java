import java.util.ArrayList;
import java.util.List;

public class Armazenagem {

    List<String> conteudo = new ArrayList<>();
    List<String> idPacote = new ArrayList<>();

    public List<String> getIdPacote(){
        return idPacote;
    }

    public List<String> getConteudo(){
        return conteudo;
    }

    public Armazenagem(){
        this.conteudo = conteudo;
        this.idPacote =  idPacote;
    }

    public void pacoteCadastro(String input4, String input5) {
        idPacote.add(input4);
        conteudo.add(input5);
    }

    public void mostrarConteudo(){;

        for(int i = 0; i < idPacote.size(); i++){
            System.out.println(idPacote.get(i) + " <-------> " + conteudo.get(i));
        }
    }

}

