package class01;

import org.testng.annotations.Test;

public class dependsOn {
    @Test
    public void login() {
        System.out.println(6 / 0);    //fail ("6/0")  pass
    }

    @Test(dependsOnMethods = {"login"})
    public void dashBoardVerification() {
        System.out.println("i am dashboard verification");
    }
}
