public class TestePOOCompleto {
    public static void main(String[] args) {

        Filme f1 = new Filme("Interestelar", 2014, 169, "Christopher Nolan");
        Musica m1 = new Musica("Imagine", 1971, 3.1, "John Lennon");

        System.out.println("\n=== TESTE 1: Reproduzir Itens (Polimorfismo) ===");

        ItemMidia[] lista = new ItemMidia[2];
        lista[0] = f1;
        lista[1] = m1;

        for (ItemMidia item : lista) {
            item.reproduzir();
        }

        System.out.println("\n=== TESTE 2: Avaliação (Polimorfismo com Interface) ===");

        Avaliavel a = f1;
        a.receberAvaliacao(10);

        a = m1;
        a.receberAvaliacao(5);

        System.out.println("\n=== TESTE 3: Teste Setter de duração ===");
        f1.setDuracao(-50); 
    }
}
