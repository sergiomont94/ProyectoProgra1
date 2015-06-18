/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.Scanner;
/**
 *
 * @author SergioAlejandro
 */
public class Juego {
    public static Scanner scan = new Scanner(System.in);
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
			//creacion de dos listas con el mismo tamano
		String lista_nombre[] = new String [10];
		String lista_password[] = new String [10];
		char resp = 's';
		while(resp == 's'){
				int op = menu();
			switch(op){
				case 1: 
					String name, password;
					System.out.print("Ingrese su username:\n>");
					name = scan.next();
					System.out.print("Ingrese su password:\n>");
					password = scan.next();
				
				for(int i=0; i < lista_nombre.length; i++){
						//aca se crea un nombre y password temporal por error que asaber
					/*
					sin usar algun temportal
					if(name.equals(lista_nombre[i])&& password.equals(lista_password[i])){
						System.out.println("Entro papi");
						//mandas a cargar menu principal
						menu_principal();
					}
					else
						System.out.println("Error");

						
						

					*/
					String nombre_tmp = lista_nombre[i];
					String password_tmp = lista_password[i];
					if(name.equals(nombre_tmp) && password.equals(password_tmp)){
						System.out.println("Entro papi");
						//mandas a cargar menu principal
						menu_principal();
					}
					else
						System.out.println("Error");
					}
						break;
				case 2:
					System.out.println("Ingrese su usuario: ");
					name = scan.next();
					System.out.println("Ingrese su password");
					password = scan.next();
					//solo se necesita un for ya que las lsitas toenen el mismo tamano 
					for (int i = 0; i < lista_nombre.length; i++){
						if(lista_nombre[i] == null){
							lista_nombre[i] = name;
							lista_password[i] = password;
						}
						else{
							System.out.println("Esta llena la lista D:");
						}
					}
					break;
		}//finn de switch
			System.out.print("Desea continuar? [S/N]:\n>");
			resp = scan.next().charAt(0);
		}
	}
	//tiene quye ser int el metodo menu()
	//este es el sub menu osea lo que pasa cuando selecciona login
	public static int menu(){
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Login\n" + "2. Crear Cuenta\n" + "3. Salir");

		int op = scan.nextInt();
		return op;
	}
	//creacion del metodo menu_principal para que nose vean tantos switch en los menu's 
	public static void menu_principal(){
		Scanner scan = new Scanner(System.in);
		char resp;
		do{
			System.out.println("1. Jugar Battleship\n"
								+ "2. Configuracion\n"
								+ "3. Reportes\n"
								+ "4. Mi Perfil\n"
								+ "5. Salir");
			int opcion = scan.nextInt();
			switch (opcion){
				case 1:
					System.out.println("Jugar");
					break;
				case 2: 
					//System.out.println("Config");
					System.out.println("a.	Dificultad\n"
									 + "b.	Modo de Juego\n"
									 + "c.	Regresar al Menú Principal");
					char weed = scan.next().charAt(0);
					switch(weed){
							case 'a':
								break;
							case 'b':
								break;
							case 'c': 
								break;
					}//fin de case 2 switch
					break;
				case 3: 
					//System.out.println("Reportes");
					System.out.println("a.	Descripción de mis ultimos 10 juegos.\n"
									 + "b.	Ranking de Jugadores\n"
									 + "c.	Regresar al Menú principal");
					int rep = scan.next().charAt(0);
					switch(rep){
						case 'a':
							break;
						case 'b':
							break;
						case 'c':
							break;
					}//fin de case 3
					break;
				case 4:
					//System.out.println("Mi Perfil");
					System.out.println("a.	Ver mis Datos\n"
									 + "b.	Modificiar mi datos\n"
									 + "c.	Eliminar mi cuenta\n"
									 + "d.	Regresar al Menú Principal");
					int per = scan.next().charAt(0); 
					switch(per){
						case 'a':
							break;
						case 'b':
							break;
						case 'c':
							break;
						case 'd':
							break;
					}//fin case 4
					break;
				
			}//fin de switch

			System.out.println("Desea continuar?");
			resp = scan.next().charAt(0);
		}while(resp == 's');
			 
		
	}//fin
        public static void printTablero(String [][] tablero){
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    System.out.println(tablero[i][j]);
                }
                System.out.println("");
            }
        }
        public static void getTablero(int modo){
            String[][] tablero = new String[8][8];
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero.length; j++) {
                    tablero[i][j] = "~";
                }
            }
            printTablero(tablero);
            System.out.println("////////////////////\n"+
                                "\nTipos de Barco:   "
                                +"\nPortaviones - 5 bombas - Codigo: PA"+
                                "\nAcorazado - 4 bombas - Codigo: AZ"
                                +"\nSubmarino - 3 Bombas - Codigo: SM"
                                +"\nDestructor - 2 Bombas - Codigo: DT");
            
            switch(modo){
                case 1:
                    System.out.println("Ingrese tipo de barco: ");
                    String tipo = scan.nextLine().toUpperCase();
                    barcos barco_1_jugador_1 = new barcos(tipo);
                    System.out.println("Ingrese tipo de barco: ");
                     tipo = scan.nextLine().toUpperCase();
                    barcos barco_2_jugador_1 = new barcos(tipo);
                    System.out.println("Ingrese tipo de barco: ");
                    tipo = scan.nextLine().toUpperCase();
                    barcos barco_3_jugador_1 = new barcos(tipo);
                    System.out.println("Ingrese tipo de barco: ");
                     tipo = scan.nextLine().toUpperCase();
                    barcos barco_4_jugador_1 = new barcos(tipo);
                    System.out.println("Ingrese tipo de barco: ");
                     tipo = scan.nextLine().toUpperCase();
                    barcos barco_5_jugador_1 = new barcos(tipo);
                    
                    System.out.println("Ingrese tipo de barco: ");
                     tipo = scan.nextLine().toUpperCase();
                    barcos barco_1_jugador_2 = new barcos(tipo);
                    System.out.println("Ingrese tipo de barco: ");
                     tipo = scan.nextLine().toUpperCase();
                    barcos barco_2_jugador_2 = new barcos(tipo);
                    System.out.println("Ingrese tipo de barco: ");
                     tipo = scan.nextLine().toUpperCase();
                    barcos barco_3_jugador_2 = new barcos(tipo);
                    System.out.println("Ingrese tipo de barco: ");
                     tipo = scan.nextLine().toUpperCase();
                    barcos barco_4_jugador_2 = new barcos(tipo);
                    System.out.println("Ingrese tipo de barco: ");
                     tipo = scan.nextLine().toUpperCase();
                    barcos barco_5_jugador_2 = new barcos(tipo);
                    break;
                case 2:
                    System.out.println("Ingrese tipo de barco: ");
                    tipo = scan.nextLine().toUpperCase();
                     barco_1_jugador_1 = new barcos(tipo);
                    System.out.println("Ingrese tipo de barco: ");
                     tipo = scan.nextLine().toUpperCase();
                     barco_2_jugador_1 = new barcos(tipo);
                    System.out.println("Ingrese tipo de barco: ");
                    tipo = scan.nextLine().toUpperCase();
                     barco_3_jugador_1 = new barcos(tipo);
                    System.out.println("Ingrese tipo de barco: ");
                     tipo = scan.nextLine().toUpperCase();
                     barco_4_jugador_1 = new barcos(tipo);
                    
                    System.out.println("Ingrese tipo de barco: ");
                     tipo = scan.nextLine().toUpperCase();
                     barco_1_jugador_2 = new barcos(tipo);
                    System.out.println("Ingrese tipo de barco: ");
                     tipo = scan.nextLine().toUpperCase();
                     barco_2_jugador_2 = new barcos(tipo);
                    System.out.println("Ingrese tipo de barco: ");
                     tipo = scan.nextLine().toUpperCase();
                     barco_3_jugador_2 = new barcos(tipo);
                    System.out.println("Ingrese tipo de barco: ");
                     tipo = scan.nextLine().toUpperCase();
                     barco_4_jugador_2 = new barcos(tipo);                     
                    break;
            }
            
        }
        public static String[][] agregar_al_tablero(String[][] tablero){
           int fila =0;
           int columna=0;
           String virgola = tablero[fila][columna];
           
            System.out.println("Tipo de barco?: ");
            String tipo = scan.nextLine().toUpperCase();
            
            if (virgola.equals("~")) {
                
            }
        }
}
/*
for(int i=0; i < Matrix.length; i++){
 Scanner in = new Scanner(System.in);
 System.out.println("Ingrese Nombre: ");
 String Nombre = in.nextLine();
 System.out.println("Ingrese Password: ");
 String Password = in.nextLine();
 //ingresando a arreglo
 Matrix[i][0] = Nombre;
 Matrix[i][1] = Password;
} */

