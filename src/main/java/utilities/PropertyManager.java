package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {

    private static String url;
    private static String email;
    private static String password;
    private static String driverPath;
    private static String reg_email;
    private static String reg_password;
    private static String reg_first_name;
    private static String reg_last_name;
    private static String new_gallery_title;
    private static String new_gallery_description;
    private static String new_gallery_image_url;
    private static String edited_gallery_title;

    public static PropertyManager getInstance() {

        Properties prop = new Properties();
        PropertyManager instance = new PropertyManager();

        try {
            FileInputStream fi = new FileInputStream("src/main/resources/configuration.properties.properties");
            prop.load(fi);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        url = prop.getProperty("url");
        email = prop.getProperty("login_email");
        password = prop.getProperty("login_password");
        driverPath = prop.getProperty("driverPath");
        reg_email = prop.getProperty("reg_email");
        reg_password = prop.getProperty("reg_password");
        reg_first_name = prop.getProperty("reg_first_name");
        reg_last_name = prop.getProperty("reg_last_name");
        new_gallery_title = prop.getProperty("new_gallery_title");
        new_gallery_description = prop.getProperty("new_gallery_description");
        new_gallery_image_url = prop.getProperty("new_gallery_image_url");
        edited_gallery_title = prop.getProperty("edited_gallery_title");

        return instance;
    }

    public String getURL () {
        return url;
    }

    public String getDriverPath () {
        return driverPath;
    }

    public String getEmail () {
        return email;
    }

    public String getPassword () {
        return password;
    }

    public String getRegEmail () {
        return reg_email;
    }

    public String getRegPassword () {
        return reg_password;
    }

    public String getRegFirstName () {
        return reg_first_name;
    }

    public String getRegLastName () {
        return reg_last_name;
    }

    public String getNewGalleryTitle () {
        return new_gallery_title;
    }

    public String getNewGalleryDescription () {
        return new_gallery_description;
    }

    public String getNewGalleryImage() {
        return new_gallery_image_url;
    }

    public String getEditedGalleryTitle() {
        return edited_gallery_title;
    }

}


