package biblioteca;
import java.util.Comparator;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String ti, String au, int an) {
        this.titulo = ti;
        this.autor = au;
        this.ano = an;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }
}

class CompararAutor implements Comparator<Livro> {
    public int compare(Livro l1, Livro l2) {
        return l1.getAutor().compareTo(l2.getAutor());
    }
}

class CompararTitulo implements Comparator<Livro>{
    public int compare(Livro l1, Livro l2){
        return l1.getTitulo().compareTo(l2.getTitulo());
    }
}

class CompararAno implements Comparator<Livro>{
    public int compare(Livro l1, Livro l2){
        return Integer.compare(l1.getAno(), l2.getAno());
    }
}

class CompararAnoAutorTitulo implements Comparator<Livro>{
    public int compare(Livro l1, Livro l2){
        int ano = Integer.compare(l1.getAno(), l2.getAno());
        if(ano != 0)
            return ano;
        int autor = l1.getAutor().compareTo(l2.getAutor());
        if(autor!=0)
            return autor;
        return l1.getTitulo().compareTo(l2.getTitulo());
    }
}