/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SergioAlejandro
 */
public class Jugador {
    private String username;
    private String password;
    private int puntos;

    public Jugador(){
      puntos = 0;
    }
    
    public Jugador(String username,String password){
        
        this.username = username;
        this.password = password;
        this.puntos = 0;
    }
    
    //mutadores
    //getters
    public String getUsername(){
        return this.username;
               
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public int getPuntos(){
        return this.puntos;
    }
    
    //setters
    
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setPuntos(int puntos){
        this.puntos = puntos;
    }
    @Override
    public String toString(){
        return "Username: "+username+"\nPassword: "+password+"\nPuntos: "+puntos;
    }
    



}



