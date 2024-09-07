import java.util.ArrayList;
import java.util.List;

public class Gato extends AnimalAbs implements AnimalInt<Gato> {
    private List<Gato> lista = new ArrayList<Gato>();
    private String dataNascimento;

    public Gato() {}

    public Gato(Long id, String nome, String raca, String dataNascimento, Double peso){
        this.setId(id);
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
        this.setRaca(raca);
        this.setPeso(peso);
    }
    
    @Override
    public void criar(Gato animal) {
        System.out.println("Data de Nascimento: "+ animal.getDataNascimento());
        System.out.println("Espécie: " +animal.getRaca());
        this.lista.add(animal);
    }

    @Override
    public void modificar(Gato animal) {
        for(int i=0; i<this.lista.size(); i++) {
            if(this.lista.get(i).getId().equals(animal.getId())){
                this.lista.get(i).setDataNascimento(animal.getDataNascimento());
                this.lista.get(i).setRaca(animal.getRaca());
                this.lista.get(i).setNome(animal.getNome());
                this.lista.get(i).setPeso(animal.getPeso());
                break;
            }
        }
    }

    @Override
    public void excluir(Long id) {
        for(int i=0; i<this.lista.size(); i++) {
            if(this.lista.get(i).getId().equals(id)) {
                this.lista.remove(i);
                break;
            }
        }
    }

    @Override
    public List<Gato> listar() {
        return this.lista;

    }

    @Override
    public Gato buscar(Long id) {
        for(int i=0; i<this.lista.size(); i++) {
            if(this.lista.get(i).getId().equals(id)) {
                return this.lista.get(i);
            }
        }
        return null;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


}
