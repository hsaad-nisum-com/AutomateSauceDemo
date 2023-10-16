package Utils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class loggerHelper {
    private static boolean root = false;

    public static Logger getLogger(Class cls){

        if(root){
            return  Logger.getLogger(cls);
        }
        BasicConfigurator.configure();
        PropertyConfigurator.configure("Log4j.properties");
        root = true;
        return Logger.getLogger(cls);
    }

}
