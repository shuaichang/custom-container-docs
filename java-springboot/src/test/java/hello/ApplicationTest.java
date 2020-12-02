package hello;

import org.junit.Test;
import java.util.Map;
import java.util.HashMap;

public class ApplicationTest {

    @Test
    public void testFCEventInvoke() {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("x-fc-request-id", "rid-testFCEventInvoke");
        Application app = new Application();
        String resp = app.fcEventInvoke(headers, "data");
        System.out.println("FC invoke response " + resp);
    }

    @Test
    public void testFCHome() {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("x-fc-request-id", "rid-testFCHome");
        Application app = new Application();
        String resp = app.fcHome(headers);
        System.out.println("FC invoke response " + resp);
    }

    @Test
    public void testFCEventInitialize() {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("x-fc-request-id", "rid-testFCEventInitialize");
        Application app = new Application();
        String resp = app.fcEventInitialize(headers);
        System.out.println("FC invoke response " + resp);
    }

    @Test
    public void testHome() {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("x-fc-request-id", "rid-testHome");
        Application app = new Application();
        String resp = app.home();
        System.out.println("FC invoke response " + resp);
    }

}