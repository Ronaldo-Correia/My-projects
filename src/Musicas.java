import java.util.ArrayList;
import java.util.List;

public class Musicas{

    private String titulo;
    private String artista;
    private double duracao;

public Musicas(String titulo,String artista,double duracao){
this.titulo=titulo;
this.artista=artista;
this.duracao=duracao;
}

public String getTitulo(){
    return titulo;
}
public String getArtista(){
    return artista;
}
public double getDuracao(){
    return duracao;
}

public void setTitulo(String titulo){
    this.titulo=titulo;
}
public void setArtista(String artista){
    this.artista=artista;
}
public void setDuracao(double duracao){
    this.duracao=duracao;
}
@Override
public String toString{
    return "Titulo:"+titulo+",Artista"+artista+",Duracao"+duracao+;
}


}
