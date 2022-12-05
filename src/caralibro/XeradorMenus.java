
package caralibro;

import java.util.Scanner;


public class XeradorMenus {
    
    public void mostrarMenuInicial(){
        System.out.println("Crear un novo perfil");
        System.out.println("Iniciar sesión");
    }
    public void mostrarMenuPrincipal(Perfil p){
       int menu;
        System.out.println("Preme 1 para ver o estado actual.");
        System.out.println("Prema 2 para ver a tua biografía.");
        System.out.println("Prema 3 para ver as solicitudes de amizade.");
        System.out.println("Prema 4 para ver a lista de amigos");
        System.out.println("Prema 5 para ver as mensaxes.");
        System.out.println("Prema calquera outro numero para pechar sesión.");
        Scanner botonMenu= new Scanner(System.in);
        menu= botonMenu.nextInt();
        
        switch(menu){
            case 1:
                System.out.println("Estado actual");
            case 2:
                System.out.println("A túa biografía");
            case 3:
                System.out.println("Solicitude de amizade");
            case 4:
                System.out.println("Lista de amigos");
            case 5:
                System.out.println("Mensaxes");
            default:
                System.out.println("Pechar a sesión");
        }
    }
}
