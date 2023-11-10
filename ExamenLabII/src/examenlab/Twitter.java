/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab;


public abstract class Twitter extends SocialClass {
    
    public Twitter(String username) {
        super(username);
    }
    
    public void timeline() {
        System.out.println("Timeline de @" + username + ":");

        for (int i = 0; i < posts.size(); i++) {
            System.out.println("Tweet " + (i + 1) + ": " + posts.get(i));
        }
    }
    
    @Override
    public String getUsername(){
        return super.getUsername();
    }
}
