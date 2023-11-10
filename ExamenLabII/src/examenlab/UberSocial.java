/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab;

import java.util.ArrayList;

/**
 *
 * @author josuc
 */
public class UberSocial {
    ArrayList <SocialClass> Cuentas;
    TipoRedSocial2 type;
    
    
    public UberSocial(TipoRedSocial2 type) {
        Cuentas = new ArrayList<>();
        this.type=type;
    }
    
    public SocialClass buscar(String username) {
         for (SocialClass cuentas : Cuentas) {
            if (cuentas.username.equals(username)) {
                return cuentas;
            }
        }
        return null;
    }
    public void agregarCuenta(String username, String tipo) {
        SocialClass account = null;
        if (type.tipoRed.equals("FACEBOOK")) {
            account = new Facebook(username) {};
        } else if (type.tipoRed.equals("TWITTER")) {
            account = new Twitter(username) {};
        }
        
        if (account != null) {
            Cuentas.add(account);
        }
    }
    
    public void agregarPost(String username, String post) {
        SocialClass cuenta = buscar(username);
        
        if (cuenta != null) {
            cuenta.addPost(post);
        }
    }
    
    public void agregarAmigo(String user1, String user2) {
        SocialClass cuenta1 = buscar(user1);
        SocialClass cuenta2 = buscar(user2);
        
        if (cuenta1 != null && cuenta2 != null && cuenta1.getClass().equals(cuenta2.getClass())) {
            ((Facebook) cuenta1).addFriends(user2);
            ((Facebook) cuenta2).addFriends(user1);
        }
    }
    
    public void agregarComment(String username, int postID, String autor, String comentario) {
        SocialClass cuenta = buscar(username);
        
        if (cuenta instanceof Facebook) {
            Comment nuevoComentario = new Comment(postID, autor, comentario);
            ((Facebook) cuenta).addComment(nuevoComentario);
        }
    }
    
    
    public void profileForm(String username) {
        
    }
}
