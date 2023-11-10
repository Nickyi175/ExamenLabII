
package examenlab;
//Nicole

import java.text.SimpleDateFormat;
import java.util.Calendar;

public final class Comment {
    private int postId;
    private String autor,comentario;
    private Calendar fecha;
    
    public Comment(int postId,String autor,String comentario){
        this.postId=postId;
        this.autor=autor;
        this.comentario=comentario;
        fecha=Calendar.getInstance();
    }
    
    public void print(){
         SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String Fecha = date.format(fecha.getTime());
        System.out.println(autor+"-"+Fecha+"\nComentario: "+comentario);
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }
    
    
}
