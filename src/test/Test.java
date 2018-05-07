package test;

import javax.tools.Tool;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Dimension ss = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(ss.height);
        System.out.println(ss.width);
    }

    public void hello()
    {
        System.out.println("Hello World");
    }
}
