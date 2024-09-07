public abstract class AnimalAbs {
    private Long id;
    private String raca;
    private String nome;
    private Double peso;

    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id=id;
    }
    public String getRaca() {
        return this.raca;
    }
    public void setRaca (String raca) {
        this.raca=raca;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome=nome;
    }
    public Double getPeso() {
        return this.peso;
    }
    public void setPeso(Double peso) {
        this.peso=peso;
    }

}
