package class01;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderTest {
    /*
verify the login functionality for wrong credentials with the correct error messages
                {"Admin", "12345", "Invalid credentials"},
                {"ABCD", "Hum@nhrm123", "Invalid credentials"},
                {"Admin", "", "Password cannot be empty"},
                {"", "Hum@nhrm123", "Username cannot be empty
                "}
 */

    //    declare the data
    @DataProvider(name="cred")
    public Object[][] data (){
        Object[][] loginData = {
                {"Admin", "12345", "Invalid credentials"},
                {"ABCD", "Hum@nhrm123", "Invalid credentials"},
                {"Admin", "", "Password cannot be empty"},
                {"", "Hum@nhrm123", "Username cannot be empty"}
        };
        return loginData;
    }

    @Test(dataProvider = "cred")
    public void loginTest(String username, String pass , String Message){
        System.out.println(username);
        System.out.println(pass);
        System.out.println(Message);
    }




}
