package main;

public class Body implements IRequeteHttp {
    private String content;

    public String getContent() {
        return content;
    }
    public void setContent(String c) {
    this.content = c;
    }

    public Body(String c) {
        this.setContent(c);
    }

    public void afficher() {
        System.out.println(this.content);
    }
}