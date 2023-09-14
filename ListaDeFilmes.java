package filmes.src;

public class ListaDeFilmes {

        private Filme[] filmes;
        private int tamanho;
    
        public ListaDeFilmes(int capacidade) {
            filmes = new Filme[capacidade];
            tamanho = 0;
        }
    
        public void adicionarFilme(Filme filme) {
            filmes[tamanho] = filme;
            tamanho++;
        }
    
        public void exibirFilmes() {
            for (int i = 0; i < tamanho; i++) {
                System.out.println("Título: " + filmes[i].getTitulo());
                System.out.println("Diretor: " + filmes[i].getDiretor());
                System.out.println("Ano de lançamento: " + filmes[i].getAnoLancamento());
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            ListaDeFilmes ListaDeFilmes = new ListaDeFilmes(10);
        
            Filme filme1 = new Filme("A bela e a Fera", "Bill Condon", 2017);
            Filme filme2 = new Filme("A Era do Gelo", "Carlos Saldanha", 2002);
            Filme filme3 = new Filme("O segredo dos animais", "Steve Oedekerk", 2006);
        
            ListaDeFilmes.adicionarFilme(filme1);
            ListaDeFilmes.adicionarFilme(filme2);
            ListaDeFilmes.adicionarFilme(filme3);
        
            ListaDeFilmes.exibirFilmes();
        }
        
    }
    

