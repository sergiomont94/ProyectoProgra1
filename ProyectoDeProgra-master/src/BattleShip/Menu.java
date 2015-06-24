package BattleShip;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Menu {
    public static void main(String[] args) {
        //***************************VARIABLES**********************************       
        boolean juego=false;
        String question="YES";
        String option1;
        int option2, dificultad=4;
        char option5, option3;
        Scanner lea = new Scanner(System.in);
        Player gamer = new Player("Jugadores", "Contrasenas");
        Game play = new Game();
        //*************************INSTRUCCIONES********************************
        do{
        //************************MENU DE INICIO********************************
        option1 = JOptionPane.showInputDialog(null, "1. Login\n2. Crear Player\n3. Salir");
        switch(Integer.parseInt(option1)){
            case 1:
                if(gamer.loginUser()==true){
                    juego=true;
                }
            break;
            case 2:
                if(gamer.crearUser()==true){
                    juego=true;
                }
            break;   
        }
        //*************************MENU PRINCIPAL*******************************
        while(juego==true){
            System.out.println("1. Jugar BattleShip\n2. Configuracion\n3. Reportes\n4. Mi Perfil\n5. Salir");
            option2 = lea.nextInt();
            
            switch(option2){
                case 1:
                    do{
                    if(gamer.loginUser()==true){
                        play.startPosPlayer1();
                        play.startPosPlayer2();
                        do{
                        play.printMapPlayer1();                            
                        if(play.attackPlayer1()==true){
                        play.printDamage();
                        play.printMapPlayer2();                        
                        play.attackPlayer2();
                        play.printDamage();
                        }
                        }while(true);
                    }else{
                        System.out.println("Salir? Si o No?");
                        question = lea.next().toUpperCase();
                    }
                    }while(question.equals("NO")); 
                   
                case 2:
                    do{
                        System.out.println("A. Dificultad\nB. Modo de Juego\nC. Regresar al Menu Principal");
                        option3 = lea.next().toUpperCase().charAt(0);
                        switch(option3){
                            case 'A':
                                System.out.println("1. Easy\n2. Normal\n3. Expert\n4. Genius");
                                int op = lea.nextInt();
                                switch(op){
                                    case 1:
                                        dificultad=5;
                                        break;
                                    case 2:
                                        dificultad=4;
                                        break;
                                    case 3:
                                        dificultad=2;
                                        break;
                                    case 4:
                                        dificultad=1;
                                        break;
                                }
                                play.setDificultad(dificultad);
                                break;
                            case 'B':
                                
                        }
                    }while(option3!='C');
                    break;
                case 3:
                    
                case 4:
                    do{
                    System.out.println("A. Ver mis datos\nB. Modificar mis Datos\nC. Eliminar mi cuenta\nD. Regresar al menu principal");
                    option5 = lea.next().toUpperCase().charAt(0);
                    switch(option5){
                        case 'A':
                            gamer.printInfo();
                            break;
                        case 'B':
                            gamer.editInfo();
                            break;
                        case 'C':
                            gamer.deleteUser();
                            juego=false;
                            option5='D';
                            break;
                    }
                    }while(option5!='D');
                    break;
                case 5:
                    juego=false;
            }
        }    
        }while(Integer.parseInt(option1)!=3);
    }
}
