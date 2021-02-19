package main;

public class ServeurWeb {
    public int repondre(RequeteHttp requeteHttp) {
        if (requeteHttp != null) {
            return 200;
        } else {
            return 500;
        }
    }
}
