package packages;

import java.io.Serializable;

public class Note implements Serializable{
    private String title; 
    private String content;
    
    public Note(String title, String content) {
        this.title = title;
        this.content = content;
        
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(){
        this.title = title;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setConent(){
        this.content = content;
    }
    
}
