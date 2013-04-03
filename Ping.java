import java.io.IOException;

public class Ping {

    public static boolean isReachable(String host) throws IOException, InterruptedException {
        String cmd = "cmd /c ping -n 1 " + host + " | find \"TTL\"";
        Process proc = Runtime.getRuntime().exec(cmd);
        int exit = proc.waitFor();
        if (exit == 0) {
            return true;
        } else {
            return false;
        }
    }
}
