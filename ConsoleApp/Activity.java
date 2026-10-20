package ConsoleApp;
import java.io.*;

/**
 * needs to talk to upload client. and pass it the png to be uplodaed i guess.
 * 
 * activty just needs dirname private string 
 * 
 * it needs a main to call on create
 * on create does system.out.pringln (new uploadclient().uploadfile);
 * 
 * so we have to change the thing. 
 */
public class Activity {

   public static void main(String[] args) throws IOException {
      new Activity().onCreate();
    }

   public Activity() {
   }

   public void onCreate() {
      System.out.println(new UploadClient().uploadFile());
   }

}  