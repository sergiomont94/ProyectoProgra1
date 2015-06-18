/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SergioAlejandro
 */
public class barcos {
    private String tipo;
    private int hp;
    
    
    public barcos(){
        
    }
    
    public barcos(String tipo){
        this.tipo = tipo;
        
        if (tipo.equals ("PA")) {
            hp = 5;
        }else if (tipo.equals("AZ")) {
            hp =4;
        }else if (tipo.equals ("SM")) {
            hp = 3;
        }else if (tipo.equals ("DT")){
            hp = 2;
        }
        
    }

    //getter

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
     




}