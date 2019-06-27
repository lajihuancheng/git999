package ddd;/**
 * Description
 * ProjectName ggggit
 * Created by liubo on 2019/6/3 16:39.
 * Version 1.0
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @liubo
 * @create 2019-06-03 16:39
 **/
public class DataFormate {
    public static void main(String[] args) {
        String  str = "FH0016819050700248,FH0016819042700123,FH0016819042700126,FH0016819050400020,FH0016819052201016,FH0016819051900053";
        String[] split = str.split(",");
        for (int i = 0; i <split.length ; i++) {
            System.out.println("\'" + split[0]+ "\',");
        }
        String a= "2019-06-05";
        String b= "2019-06-06";
        int i = a.compareTo(b);
        System.out.println();


        List<String> strings = Arrays.asList("11", "22", "33");

        try {
            int i1 = 1 / 0;
        }catch (Exception e){
            System.out.println(e.getCause().getMessage());
        }

    }
}
