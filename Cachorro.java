import java.util.List;
import java.util.ArrayList;

public class Cachorro extends AnimalAbs implements AnimalInt<Cachorro> {
    private List<Cachorro> lista = new ArrayList<Cachorro>();
    private String porte;

    public Cachorro() {}

    public Cachorro(Long id, String nome, String raca, String porte, Double peso){
        this.setId(id);
        this.setNome(nome);
        this.setRaca(raca);
        this.setPorte(porte);
        this.setPeso(peso);
    }

    @Override
    public void criar(Cachorro animal) {
        System.out.println("Raça: " + animal.getRaca());
        this.lista.add(animal);
    }

    @Override
    public void modificar(Cachorro animal) {
        for(int i=0; i<this.lista.size(); i++) {
            if(this.lista.get(i).getId().equals(animal.getId())){
                this.lista.get(i).setRaca(animal.getRaca());
                this.lista.get(i).setPorte(animal.getPorte());
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
    public List<Cachorro> listar() {
        return this.lista;
    }
    
    @Override
    public Cachorro buscar(Long id) {
        for(int i=0; i<this.lista.size(); i++) {
            if(this.lista.get(i).getId().equals(id)) {
                return this.lista.get(i);
            }
        }
        return null;
    }

    public String getPorte() {
        return porte;
    }
    
    public void setPorte(String porte) {
        this.porte = porte;
    }

}


