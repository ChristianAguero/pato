/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.pato.entidades;

import com.google.gson.Gson;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Christian
 */
public class Video {
    
    private String titulo;
    private String descripcion;
    private Date fecha;
    private Usuario usuario;
    private List<Comentario> comentarios;
    
    /**
     * Sirve para transformar un archivo json a objetos de java
     * @param json es el archivo json transformado a binario
     * @return el archivo ya transformado a objetos de java
     */
    public Video deserializar(String json){
        
        Video video = new Video();
        
        try{
            
            video = new Gson().fromJson(json, Video.class);
            
        }catch(Exception ex){
            
            System.err.print("siOcurrió un error: " + ex.getMessage());
            
        }
        
        return video;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
    
}
