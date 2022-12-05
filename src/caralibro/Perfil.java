package caralibro;

import java.util.ArrayList;
import java.util.Scanner;

public class Perfil {

    private String nome;
    private String contrasinal;
    private String estado;

    Scanner entradaTeclado = new Scanner(System.in);

    /*Constructor da clase perfil*/
    public Perfil(String nome, String contrasinal) {
        this.nome = nome;
        this.contrasinal = contrasinal;

    }

    public void engadirAmigo(Perfil perfil) {

    }

    public void engadirSolicitudeDeAmizade(Perfil perfilSolicitante) {

    }

    public void aceptarSolicitudeDeAmizade(Perfil perfilSolicitante) {

    }

    public void rexeitarSolicitudeDeAmizade(Perfil perfilSolicitante) {

    }

    public void engadirMensaxePrivada(Mensaxe m) {

    }

    public void eliminarMensaxe(Mensaxe m) {

    }
}
