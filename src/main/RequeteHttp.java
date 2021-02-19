package main;

public class RequeteHttp implements IRequeteHttp {
    public Url getUrl() {
		return url;
	}

	public void setUrl(Url url) {
		this.url = url;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

    private Url url;
	private Body body;
    private Header header;

    public RequeteHttp(Url u, Body b, Header h) {
        this.setUrl(u);
        this.setBody(b);
        this.setHeader(h);
    }

    public void afficher() {
        this.getUrl().afficher();
        this.getBody().afficher();
        this.getHeader().afficher();
    }
}