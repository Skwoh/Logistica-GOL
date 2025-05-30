import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {

    List<String> nome = new ArrayList<>();
    List<String> cpf = new ArrayList<>();

    public Cliente(){
    }

    public void setCadastro(String nome, String cpf){
        this.nome.add(nome);
        this.cpf.add(cpf);
    }

    public List<String> getNome(){
        return nome;
    }

    public List<String> getCpf(){
        return cpf;
    }

}
