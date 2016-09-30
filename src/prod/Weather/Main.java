package prod.Weather;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static String mApi; //Api key
    private static String mZip;
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Data dataObj = new Data();
        getKey(dataObj);
        if(mApi.isEmpty()){
            getKey(dataObj);
        }
    }

    private static void getKey(Data instData){
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your API key. If you don't have one, please visit http://openweathermap.org/appid:");
            mApi = scan.next();
            if(instData.verifyKey(mApi) == false){
                throw new IllegalArgumentException();
            }
        }catch(InputMismatchException ime){
            System.out.println("There has min an IM Exception thrown. Message: " + ime);
        }catch(IllegalArgumentException iae) {
            System.out.println("The key that you entered is not valid. Please try again.");
            mApi = "";
            getKey(instData);
        }
    }
}
