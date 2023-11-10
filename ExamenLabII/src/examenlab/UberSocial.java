
package examenlab;


import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UberSocial {
     ArrayList <SocialClass> Cuentas;
//    TipoRedSocial2 type;
    
    
    public UberSocial() {
        this.Cuentas = new ArrayList<>();
       
    }
    
    public SocialClass buscar(String username) {
//         for (SocialClass cuentas : Cuentas) {
//            if (cuentas.username.equals(username)) {
//                return cuentas;
//            }
//        }
//        return null;
        for (SocialClass account : Cuentas) {
            if (account.getUsername().equals(username)) {
                return account;
            }
        

        
//            if (account instanceof UberSocial) {
//                SocialClass result = ((UberSocial) account).buscar(username);
//                if (result != null) {
//                    return result;
//                }
//            }
        }

        return null;
    }
    public void agregarCuenta(String username, String tipo) {
        if (buscar(username) == null) {
            SocialClass nuevaCuenta;

            if (tipo.equals("FACEBOOK")) {
                nuevaCuenta = new Facebook(username) {};
                Cuentas.add(nuevaCuenta);
            } else if (tipo.equals("TWITTER")) {
                nuevaCuenta = new Twitter(username) {};
                Cuentas.add(nuevaCuenta);
            } else {
                System.out.println("Tipo de cuenta no válido");
                return;
            }

            Cuentas.add(nuevaCuenta);
            System.out.println("Cuenta agregada exitosamente: " + username);
        } else {
            System.out.println("El username ya está en uso. Por favor, elige otro.");
        }

//        if (buscar(username) == null) {
//            SocialClass nuevaCuenta;
//
//            if (tipo.equals("FACEBOOK")) {
//                nuevaCuenta = new Facebook(username);
//            } else if (tipo.equals("TWITTER")) {
//                nuevaCuenta = new Twitter(username);
//            } else {
//                System.out.println("Tipo de cuenta no válido");
//                return;
//            }
//
//            Cuentas.add(nuevaCuenta);
//            System.out.println("Cuenta agregada exitosamente: " + username);
//        } else {
//            System.out.println("El username ya está en uso. Por favor, elige otro.");
//        }

//        if(tipo.equalsIgnoreCase("FACEBOOK")){
//            Facebook face = new Facebook(username) {};
//            Cuentas.add(face);
//        } else if (tipo.equalsIgnoreCase("TWITTER")){
//            Twitter twit = new Twitter(username) {};
//            Cuentas.add(twit);
//        }


//        if(buscar(username)==null){
//            if(tipo.equals("FACEBOOK")){
//                redes.add(new Facebook(username));
//                        JOptionPane.showMessageDialog(null, "Agregado exitosamente");
//            } else{
//                redes.add(new Twitter(username));
//                JOptionPane.showMessageDialog(null, "Agregado exitosamente");
//            }
//        }else {
//                    JOptionPane.showMessageDialog(null, "Nombre de usuario no valido.");
//
//        }
//        SocialClass account = null;
//        if (type.tipoRed.equals("FACEBOOK")) {
//            account = new Facebook(username) {};
//        } else if (type.tipoRed.equals("TWITTER")) {
//            account = new Twitter(username) {};
//        }
//        
//        if (account != null) {
//            Cuentas.add(account);
//        }
    }
    
    public void agregarPost(String username, String post) {

        SocialClass account = buscar(username);

        if (account != null) {
            account.addPost(post);
            System.out.println("Post agregado por " + username);
        } else {
            System.out.println("Usuario no encontrado.");
        }
        
//        SocialClass account = buscar(username);
//
//        if (account != null) {
//            account.addPost(post);
//            System.out.println("Post agregado por " + username);
//        } else {
//            System.out.println("Usuario no encontrado.");
//        }


//        SocialClass cuenta = buscar(username);
//        
//        if (cuenta != null) {
//            cuenta.addPost(post);
//        }
    }
    
    public boolean agregarAmigo(String user1, String user2) {
        SocialClass cuenta1 = buscar(user1);
        SocialClass cuenta2 = buscar(user2);
        
        if (cuenta1 != null && cuenta2 != null && cuenta1.getClass().equals(cuenta2.getClass())) {
            ((Facebook) cuenta1).addFriend(user2);
            ((Facebook) cuenta2).addFriend(user1);
        }
    return false;
            }
    
//    public void agregarAmigo(String user1, String user2) {
//         if(buscar(user1)!=null && buscar(user2)!=null){
//            for(SocialClass usuario1: Cuentas){
//                if(usuario1.getUsername().equals(user1)){
//                    for(SocialClass usuario2: Cuentas){
//                        if(usuario2.getUsername().equals(user2)){
//                            if((usuario1 instanceof Twitter && usuario2 instanceof Twitter) || (usuario1 instanceof Facebook && usuario2 instanceof Facebook)){
//                                usuario1.addFriend(user2);
//                                usuario2.addFriend(user1);
//                                JOptionPane.showMessageDialog(null, "Agregado exitosamente");
//                                break;
//                            }
//                        }
//                    }
//                }
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "No se pudo completar la accion.");
//        }
//    }
    
    public void agregarComment(String username, int postID, String autor, String comentario) {
        SocialClass account = buscar(username);
        if (account != null && account instanceof Facebook) {
            Facebook facebookAccount = (Facebook) account;
            Comment nuevoComentario = new Comment(postID, autor, comentario);
            if (facebookAccount.addComment(nuevoComentario)) {
                System.out.println("Comentario agregado por " + autor);
            } else {
                System.out.println("PostID no válido.");
            }
        } else {
            System.out.println("Usuario no encontrado o no es una cuenta de FACEBOOK.");
        }
    }
    
    
    public void profileForm(String username) {
        SocialClass account = buscar(username);
        if (account != null) {
            account.myProfile();
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }
}
