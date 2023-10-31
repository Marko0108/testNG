package class01;

import org.testng.annotations.Test;

public class priority {
    @Test
    public void Atest(){
        System.out.println("i am TestA");
    }
    @Test
    public void Ctest(){
        System.out.println("i am TestC");
    }
    @Test
    public void Btest(){
        System.out.println("i am TestB");
    }
}
