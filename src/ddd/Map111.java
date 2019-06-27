package ddd;/**
 * Description
 * ProjectName ggggit
 * Created by liubo on 2019/6/26 17:52.
 * Version 1.0
 */

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @liubo
 * @create 2019-06-26 17:52
 **/
public class Map111 {
    public static void main(String[] args) {
        Map map1 = new HashMap();      //定义Map集合对象
        map1.put("apple", "新鲜的苹果");     //向集合中添加对象
        map1.put("computer", "配置优良的计算机");
        map1.put("book", "堆积成山的图书");
        System.out.println("第一个Map集合大小为："+map1.size()); //输出集合长度
        Map map2 = new HashMap();      //定义Map集合map2
        map2.put("apple2", "新鲜的苹果");     //向集合中添加对象
        map2.put("computer2", "配置优良的计算机");
        map2.put("book", "堆积成山的图书");
        System.out.println("第二个Map集合大小为："+map2.size()); //输出集合长度
        System.out.println("把第二个Map集合添加到第一个Map集合中");
        map1.putAll(map2);        //将map2中的对象添加到map1中
        System.out.println("整合后的第一个Map集合大小为："+map1.size());



    }
}
