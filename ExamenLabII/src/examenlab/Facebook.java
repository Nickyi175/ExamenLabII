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
public abstract class Facebook extends SocialClass implements Commentable {
    private ArrayList <Comment> comentarios;
    
    public Facebook(String username) {
        super(username);
        comentarios = new ArrayList<>();
    }
    
    @Override
    public boolean addComment(Comment comment) {
        if (comment.getPostId() >= 0 && comment.getPostId() < posts.size()) {
            comentarios.add(comment);
            return true;
        }
        return false;
    }
    
    @Override
    public void timeline() {
        
    }
}
