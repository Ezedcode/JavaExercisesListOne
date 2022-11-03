package livro;

public class TestarLivro {
    public static void main(String[] args) {
        Livro livroFavorito = new Livro();

        livroFavorito.setTitulo("Game of Thrones");
        livroFavorito.setQtdPaginas(500);

        System.out.println("The "+livroFavorito.getTitulo()+ " book "+"has "+livroFavorito.getQtdPaginas()+" pages");

        livroFavorito.setPaginasLidas(50);
        livroFavorito.verificarProgress();

        livroFavorito.setPaginasLidas(250);
        livroFavorito.verificarProgress();

        Livro myBook = new Livro("Demon Slayer",195, 20);

        System.out.println("\n\nThe "+myBook.getTitulo()+ " book "+"has "+myBook.getQtdPaginas()+" pages");

        myBook.setPaginasLidas(50);
        myBook.verificarProgress();
    }
}
