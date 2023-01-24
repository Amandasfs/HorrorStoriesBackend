/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author amand
 */
public class Story {
    
    private Integer idSto;
    private String title; 
    private String text;  

    public Story() {
        super();
    }

    public Story(Integer idSto, String title, String text) {
        this.idSto = idSto;
        this.title = title;
        this.text = text;
    }

    public Integer getIdSto() {
        return idSto;
    }

    public void setIdSto(Integer idSto) {
        this.idSto = idSto;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
