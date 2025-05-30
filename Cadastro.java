import java.util.List;

public class Cadastro {

    public void mostrarCadastro(Cliente cliente){

        List<String> nome = cliente.getNome();
        List<String> cpf = cliente.getCpf();

        }

        public void mostrarClientes(Cliente cliente){

            List<String> nome = cliente.getNome();
            List<String> cpf = cliente.getCpf();

            for(int i = 0; i < nome.size(); i++){
                System.out.println(nome.get(i) + " <----------> " + cpf.get(i));
            }

        }
}
