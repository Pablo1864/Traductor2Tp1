package com.app.traductor;

import java.io.Serializable;

public class Palabra implements Serializable {

private int foto;

 private String palabraEsp,palabraEng;


    public Palabra(int foto,String palabraEng,String palabraEsp) {
        this.foto = foto;
        this.palabraEsp=palabraEsp;
        this.palabraEng=palabraEng;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getPalabraEsp() {
        return palabraEsp;
    }

    public void setPalabraEsp(String palabraEsp) {
        this.palabraEsp = palabraEsp;
    }

    public String getPalabraEng() {
        return palabraEng;
    }

    public void setPalabraEng(String palabraEng) {
        this.palabraEng = palabraEng;
    }
}
