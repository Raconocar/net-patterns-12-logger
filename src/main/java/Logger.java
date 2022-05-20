import java.time.LocalDateTime;
import java.util.Date;

public class Logger {
    protected int num = 1;
    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        return (logger == null) ? new Logger() : logger;
    }

    public void log(String msg) {

        System.out.println("[" + LocalDateTime.now() +"   № "+ num++ + "] " + msg);//неоптимальный момент
        num++;
    }

    @Override
    public String toString() {
        return "Logger start at " + num;
    }
}