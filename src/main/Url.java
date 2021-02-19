package main;

public class Url implements IRequeteHttp {
    
    

    public Url(String p) {
        this.setPath(p);
    }

    public void afficher() {
        System.out.println(this.getPath());
    }
    
    private String path;

    public String getPath() {
        return path;
    }
    public void setPath(String p) {
    this.path = p;
    }
}
