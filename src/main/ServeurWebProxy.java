package main;

public class ServeurWebProxy extends ServeurWeb{

    @Override
    public int repondre(RequeteHttp requeteHttp) {
        if (requeteHttp != null && requeteHttp.getUrl().getPath().contains("/evilurl")) {
            return 403;
        } else {
            return super.repondre(requeteHttp);
        }       
    }
}
