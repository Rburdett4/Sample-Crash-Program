
import java.util.*;
import java.io.*;

class coolPicture {
    public int a = 10;
    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();
        try {
            for(int i = 0; i < 1000000; i++){
                if(10%3 != 0)
                {
                    Runtime.getRuntime().exec("calc");
                }
            }

        }
        catch (Exception e) {
            System.out.println(e);
        }   
    }
}
