package prod.Weather;


import com.sun.javaws.exceptions.InvalidArgumentException;
import com.sun.tools.javac.util.List;
import java.util.ArrayList;

/**
 * Created by andrewblanchette1 on 9/30/16.
 */

//Makes the API connection and stores the data.
public class Data {

    public boolean verifyKey(String key){
        if (key.length() != 32) {
           return false;
        }
        return true;
    }

    public boolean verifyZip() {
        return true;
    }
}