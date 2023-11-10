/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab;

import java.util.ArrayList;


public abstract class Facebook extends SocialClass implements Commentable {
    private ArrayList <Comment> comentarios;
    
    public Facebook(String username) {
        super(username);
        this.comentarios = new ArrayList<>();
    }
    
    @Override
    public boolean addComment(Comment comment) {
        int postID = comment.getPostId();

        if (postID >= 0 && postID < posts.size()) {
            comentarios.add(comment);
            return true;
        } else {
            System.out.println("PostID no válido");
            return false;
        }
//        if (comment.getPostId()>= 0 && comment.getPostId() < posts.size()) {
//            comentarios.add(comment);
//            return true;
//        }
//        return false;
    }
    
    public void timeline() {
        for (int i = 0; i < posts.size(); i++) {
            System.out.println("POST " + (i + 1));
            System.out.println(posts.get(i));

            for (Comment comment : comentarios) {
                if (comment.getPostId() == i + 1) {
                    System.out.println(comment);
                }
            }
        }
    }
   @Override
    public String getUsername(){
        return super.getUsername();
    }
      
    }

    

