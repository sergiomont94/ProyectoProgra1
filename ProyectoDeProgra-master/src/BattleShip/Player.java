/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BattleShip;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Player {
    
//********************************Atributos*************************************

    public String username;
    public String password;
    public int score;
    Player user[] = new Player[100];
    public int codigo;
    
//******************************Constructores***********************************
    
    public Player(String a, String b){
        username=a;
        password=b;
        score=0;
    }    

    
    //**********************************Funciones*******************************
    
    public boolean crearUser(){
        Scanner lea = new Scanner(System.in);
        for(int cont=0; cont<100; cont++){
            if(user[cont]==null){
                System.out.println("Username: ");
                String a = lea.next();
                for (int i = 0; i < 10; i++) {
                    if(user[i]==null){
                        System.out.println("Password: ");
                        String b = lea.next();                        
                        user[cont] = new Player(a, b);
                        return true;
                    }else if(user[i].username.equals(a)){
                        System.out.println("Este usuario ya existe.");
                        return false;
                    }
                } 
            }else if(cont==99){
                System.out.println("Memoria llena.");
                return false;
            }
        }
        return false;
    }
    
    public boolean loginUser(){
        Scanner lea = new Scanner(System.in);
        System.out.println("Username: ");
        String a = lea.next();
        for (int i = 0; i < 100; i++) {
            if(user[i]==null){
                System.out.println("Usuario no existe.");
                return false;
            }else if(user[i].username.equals(a)){
                System.out.println("Password: ");
                String b = lea.next();
                if(b.equals(user[i].password)){
                    codigo=i;
                    return true;
                }else{
                    System.out.println("Contrasena incorrecta.");
                    return false;
                }
            }
        }
        return false;
    }
    

   
    public void printInfo(){
        System.out.println("Username: "+user[codigo].username+"\nPassword: "+user[codigo].password+"\nScore: "+user[codigo].score);
    }
    public void editInfo(){
        Scanner lea = new Scanner(System.in);
        System.out.println("Cual es el nuevo username?");
        String a = lea.next();
        System.out.println("Cual es la password nueva?");
        String b = lea.next();
        user[codigo].username = a;
        user[codigo].password = b;
    }
    public void deleteUser(){
        user[codigo] = null;
    }
}
