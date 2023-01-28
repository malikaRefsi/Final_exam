package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.Properties;
public class Utility {

    public static String path = System.getProperty("user.dir");
    public static Properties getProperties(){
        Properties prop = new Properties();
        try {
<<<<<<< HEAD
            InputStream inputStream = new FileInputStream(path + File.separator +"config.properties");
            prop.load(inputStream);
=======
            //InputStream inputStream = new FileInputStream("C:\\Users\\nabil\\IdeaProjects\\projectframework\\config.properties");
            InputStream inputStream = new FileInputStream("C:\\Users\\12016\\eclipse-workspace\\Final_exam\\config.properties");
            prop.load(inputStream);//load the content of the file in the object prop
>>>>>>> dc8a0364be15c0eb9648b87446b3a49672b519d1
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop;
    }
    public static String decode(String key){
        byte[] decodeBytes = Base64.getDecoder().decode(key);
        return new String(decodeBytes);
    }

    public static void main(String[] args) {
//    //     we proceed in decoding
//        String toEncode = "savcKMWcbFXKst8Ysv6H";
//        String encoded = Base64.getEncoder().encodeToString(toEncode.getBytes());
//        System.out.println(encoded);
//        System.out.println(decode(encoded));

        String sep = File.separator;
        String path = System.getProperty("user.dir");
        System.out.println(path);
    }
}

