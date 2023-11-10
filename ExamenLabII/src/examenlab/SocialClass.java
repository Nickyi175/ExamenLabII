/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab;

import java.util.ArrayList;
import java.util.List;

public abstract  class SocialClass {

    protected static List<String> friends;
    protected static List<String> posts;
    protected String username;

    public SocialClass(String username) {
        this.friends = new ArrayList<>();
        this.posts = new ArrayList<>();
        this.username = username;
    }

    public boolean addFriend(String user) {
        if (!friends.contains(user) && user != null && !user.equals(this.username)) {
            friends.add(user);
            return true;
        } 
        return false;

    }

    public void addPost(String msg) {
        posts.add(msg);

    }

    public abstract void timeline();

    public void myProfile() {
        System.out.println("Username: " + username);
        System.out.print("");
        timeline();
        System.out.println("Friends: ");
        
        int ami = 0;
        for (String friend : friends) {
            System.out.println(friend + "\t ");
            ami++;

            if (ami == 10) {
                System.out.println();
                ami =0;
            }

        }
        System.out.println();
    }
    
    
    
    public String getUsername(){
        return username;
    }

    public List<String> getFriends() {
        return friends;
    }

    public List<String> getPosts() {
        return posts;
    }
    
}
