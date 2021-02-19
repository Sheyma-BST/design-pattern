package main;

public class Header implements IRequeteHttp {
    private String[] headers = { };

    public String getHeaders() {
        return this.headers[0] + this.headers[1];
    }
    public void setHeaders(String[] h) {
    	this.headers = h;
    }

    public Header(String h[]) {
        this.setHeaders(h);
    }

    public void afficher() {
        System.out.println(this.getHeaders());
    }
}
