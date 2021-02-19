package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Body;
import main.Header;
import main.RequeteHttp;
import main.ServeurWebProxy;
import main.Url;

public class TestsProxy {


    @Test
    public void test200() {
    	String [] str = {"Header","Salut"};
        RequeteHttp requeteHttp = new RequeteHttp(new Url("super/lol/test"), new Body("BodyContent"), new Header(str));
        ServeurWebProxy proxy = new ServeurWebProxy();
        assertEquals(200, proxy.repondre(requeteHttp));
    }
    
    @Test
    public void test403() {
    	String [] str = {"Header","Salut"};
        RequeteHttp requeteHttp = new RequeteHttp(new Url("super/evilurl/test"), new Body("BodyContent"), new Header(str));
        ServeurWebProxy proxy = new ServeurWebProxy();
        assertEquals(403, proxy.repondre(requeteHttp));
    }

    @Test
    public void test500() {
        ServeurWebProxy proxy = new ServeurWebProxy();
        assertEquals(500, proxy.repondre(null));
    }
}
