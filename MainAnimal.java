public class MainAnimal {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        Cachorro c1 = new Cachorro(1L, "Luck", "Yorkishire", "Pequeno", 2.5);
        Cachorro c2 = new Cachorro(2L, "Bob", "Maltês", "Pequeno", 3.0);
        Cachorro c3 = new Cachorro(3L, "Mel", "Pincher", "Pequeno", 2.0);
        c.criar(c1);
        c.criar(c2);
        c.criar(c3);
        for(Cachorro item: c.listar()) {
            System.out.println("Id: "+item.getId()+" - Raça: "+item.getRaca()+ " - Nome: "+item.getNome()+" = Porte: "+item.getPorte()+" - Peso: "+item.getPeso());
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Excluir o cachorro de id igual a 2");
        c.excluir(2L);
        for(Cachorro item: c.listar()) {
            System.out.println("Id: "+item.getId()+" - Raça: "+item.getRaca()+ " - Nome: "+item.getNome()+" = Porte: "+item.getPorte()+" - Peso: "+item.getPeso());
        }

    if(c.buscar(3L) == null)
    System.out.println("Cachorro não encontrado");
    else {
        System.out.println("Cachorro encontrado!");
    if(c.buscar(5L) == null)
    System.out.println("Cachorro não encontrado");
    else {
        System.out.println("Cachorro encontrado!");
    }
 }

        Gato g = new Gato();
        Gato g1 = new Gato(1L, "Siamés", "Miau", "10/12/2023", 2.3);
        Gato g2 = new Gato(2L, "Persa", "Mimi", "08/06/2022", 2.5);
        Gato g3 = new Gato(3L, "Ragdoll", "Lili", "24/05/2019", 3.0);
        g.criar(g1);
        g.criar(g2);
        g.criar(g3);
        for(Gato item: g.listar()) {
            System.out.println("Id: "+item.getId()+" - Raça: "+item.getRaca()+ " - Nome: "+item.getNome()+" = Data nascimento: "+item.getDataNascimento()+" - Peso: "+item.getPeso());
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Excluir o gato de id igual a 2");
        g.excluir(2L);
        for(Gato item: g.listar()) {
            System.out.println("Id: "+item.getId()+" - Raça: "+item.getRaca()+ " - Nome: "+item.getNome()+" = Data nascimento: "+item.getDataNascimento()+" - Peso: "+item.getPeso());
        }

    if(g.buscar(3L) == null)
    System.out.println("Gato não encontrado");
    else {
        System.out.println("Gato encontrado!");
    if(g.buscar(5L) == null)
    System.out.println("Gato não encontrado");
    else {
        System.out.println("Gato encontrado!");
    }
 }
}
}    

