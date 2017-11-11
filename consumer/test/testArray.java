import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by ldong on 2017/7/18.
 */
public class testArray {

    @Test
    public void test() {
        System.out.println("hello test");
        String str1 = "dddd-ffff-rfa-adf-zcxvz-zcv-zcxegghg-ldong";
        String[] strArray = str1.split("-");

        System.out.println(strArray);
        for(String iStr : strArray) {
            System.out.println(iStr);
        }


    }
}
