package prod.Weather;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private String mApi; //Api key
    public static void main(String[] args) {

    }

    public void getKey(){
        if(mApi.isEmpty()){
            try {
                Scanner scan = new Scanner(System.in);
                mApi = scan.next();
            }catch(InputMismatchException ime){
                System.out.printf("There was an exception thrown by Scanner object in getKey. Message: %s", ime);
            }catch(IllegalArgumentException iae){
                System.out.println(iae);
            }
        }
    }
}
