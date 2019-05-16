package ddd;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
 
/**
 * Created by zelei.fan on 2017/3/17.
 */
public class StreamTest {
 
    private List<TestStreamModel> getList(){
        List<TestStreamModel> list = new ArrayList<>();
        TestStreamModel testStreamModel = new TestStreamModel();
        testStreamModel.setId(1);/*主键*/
        testStreamModel.setName("张1");/*姓名*/
        testStreamModel.setClasses(1);/*班级*/
        testStreamModel.setGrade(1);/*年级*/
        testStreamModel.setScore(10);/*成绩*/
        list.add(testStreamModel);
        TestStreamModel testStreamMode2 = new TestStreamModel();
        testStreamMode2.setId(2);/*主键*/
        testStreamMode2.setName("张2");/*姓名*/
        testStreamMode2.setClasses(2);/*班级*/
        testStreamMode2.setGrade(1);/*年级*/
        testStreamMode2.setScore(20);/*成绩*/
        list.add(testStreamMode2);
        TestStreamModel testStreamMode3 = new TestStreamModel();
        testStreamMode3.setId(3);/*主键*/
        testStreamMode3.setName("张3");/*姓名*/
        testStreamMode3.setClasses(1);/*班级*/
        testStreamMode3.setGrade(2);/*年级*/
        testStreamMode3.setScore(30);/*成绩*/
        list.add(testStreamMode3);
        TestStreamModel testStreamMode4 = new TestStreamModel();
        testStreamMode4.setId(4);/*主键*/
        testStreamMode4.setName("张4");/*姓名*/
        testStreamMode4.setClasses(2);/*班级*/
        testStreamMode4.setGrade(2);/*年级*/
        testStreamMode4.setScore(40);/*成绩*/
        list.add(testStreamMode4);
        TestStreamModel testStreamMode5 = new TestStreamModel();
        testStreamMode5.setId(5);/*主键*/
        testStreamMode5.setName("张5");/*姓名*/
        testStreamMode5.setClasses(2);/*班级*/
        testStreamMode5.setGrade(2);/*年级*/
        testStreamMode5.setScore(50);/*成绩*/
        list.add(testStreamMode5);

        /*TestStreamModel testStreamModel1 = new TestStreamModel();
        testStreamModel1.setId(2);
        testStreamModel1.setName("李四");
        testStreamModel1.setClasses(1);
        testStreamModel1.setGrade(1);
        testStreamModel1.setScore(60);
        list.add(testStreamModel1);
 
        TestStreamModel testStreamModel2 = new TestStreamModel();
        testStreamModel2.setId(3);
        testStreamModel2.setName("王二麻子");
        testStreamModel2.setClasses(2);
        testStreamModel2.setGrade(1);
        testStreamModel2.setScore(90);
        list.add(testStreamModel2);
 
        TestStreamModel testStreamModel3 = new TestStreamModel();
        testStreamModel3.setId(4);
        testStreamModel3.setName("王五");
        testStreamModel3.setClasses(2);
        testStreamModel3.setGrade(1);
        testStreamModel3.setScore(59.5);
        list.add(testStreamModel3);
 
        TestStreamModel testStreamModel4 = new TestStreamModel();
        testStreamModel4.setId(8);
        testStreamModel4.setName("小明");
        testStreamModel4.setClasses(1);
        testStreamModel4.setGrade(2);
        testStreamModel4.setScore(79.5);
        list.add(testStreamModel4);
 
        TestStreamModel testStreamModel5 = new TestStreamModel();
        testStreamModel5.setId(5);
        testStreamModel5.setName("小红");
        testStreamModel5.setClasses(2);
        testStreamModel5.setGrade(2);
        testStreamModel5.setScore(99);
        list.add(testStreamModel5);
 
        TestStreamModel testStreamModel6 = new TestStreamModel();
        testStreamModel6.setId(7);
        testStreamModel6.setName("小黑");
        testStreamModel6.setClasses(2);
        testStreamModel6.setGrade(2);
        testStreamModel6.setScore(45);
        list.add(testStreamModel6);
 
        TestStreamModel testStreamModel7 = new TestStreamModel();
        testStreamModel7.setId(6);
        testStreamModel7.setName("小白");
        testStreamModel7.setClasses(1);
        testStreamModel7.setGrade(2);
        testStreamModel7.setScore(88.8);
        list.add(testStreamModel7);
 
        TestStreamModel testStreamModel8 = new TestStreamModel();
        testStreamModel8.setId(6);
        testStreamModel8.setName("小白");
        testStreamModel8.setClasses(1);
        testStreamModel8.setGrade(2);
        testStreamModel8.setScore(88.8);
        list.add(testStreamModel8);*/

        return list;
    }
 
    public static void main(String[] args) {
        StreamTest streamTest = new StreamTest();
        List<TestStreamModel> list = streamTest.getList();

        /*多重分组，一般多重分组后都是为了统计，比如说统计每个年级，每个班的总分数*/
        //Map<Integer, List<TestStreamModel>> collect = list.stream().collect(Collectors.groupingBy(t -> t.getGrade()));
        //Map<Integer, Map<Integer, List<TestStreamModel>>> collect = list.stream().collect(Collectors.groupingBy(t -> t.getGrade(), Collectors.groupingBy(t -> t.getClasses())));
        ArrayList<TestStreamModel> objects = new ArrayList<>();
        list.stream().collect(Collectors.groupingBy(t -> t.getGrade() + "=" + t.getClasses())).forEach(
                (k,v)->{
                    TestStreamModel testStreamModel = new TestStreamModel();
                    /*testStreamModel.setId(v.get(0).getId());
                    testStreamModel.setScore(v.stream().mapToDouble(t -> t.getScore()).sum());
                    System.out.println("Item : " + k + " Count : " + v.toString());
                    System.out.println("Item : " + k + " Count : " + testStreamModel.toString());*/
                    double a= 0.0;
                    for (TestStreamModel streamModel : v) {
                        a = a+streamModel.getScore();;
                    }
                    testStreamModel.setScore(a);
                    objects.add(testStreamModel);
                }
        );
//        /Map<String, List<TestStreamModel>> collect1 = list.stream().collect(Collectors.groupingBy(t -> t.getGrade() + "=" + t.getClasses()));
        /*Map<Integer, Map<Integer, List<TestStreamModel>>> collect = list.stream().collect(Collectors.groupingBy(t -> t.getGrade(), Collectors.groupingBy(t -> t.getClasses())));
        Map<String, List<TestStreamModel>> collect1 = list.stream().collect(Collectors.groupingBy(t -> t.getGrade() + "=" + t.getClasses()));
        System.out.println("取出一年级一班的总分："+collect1.get(1).get(1));*/


 
        /*去重，去除重复对象（每个属性的值都一样的），需要注意的是要先重写对象TestStreamModel的equals和hashCode方法*/
        System.out.println("去重前："+list);
        List<TestStreamModel> distinctList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("去重后："+distinctList);
 
        /*排序，按id升续排列，如果要降续则改成：(a, b) -> b.getId() - a.getId(); a和b都是变量名（可以按自己意愿取名字），都是list中的对象的实例*/
        System.out.println("排序前："+list);
        List<TestStreamModel> sortList = list.stream().sorted((a, b) -> a.getId() - b.getId()).collect(Collectors.toList());
        System.out.println("排序后"+sortList);
 
        /*过滤，按照自己的需求来筛选list中的数据，比如我筛选出不及格的（小于60分）的人,t为实例*/
        System.out.println("过滤后："+list);
        List<TestStreamModel> filterList = list.stream().filter(t -> t.getScore() < 60).collect(Collectors.toList());
        System.out.println("过滤后"+filterList);
 
        /*map, 提取对象中的某一元素，例子中我取的是每个人的name，注意list中类型对应，如果取的是id或者班级，就应该是integer类型*/
        System.out.println("提取前："+list);
        List<String> mapList = list.stream().map(t -> t.getName()).collect(Collectors.toList());
        System.out.println("提取后："+mapList);
 
        /*统计，统计所有人分数的和, 主要我设置的分数属性是double类型的，所以用mapToDouble，如果是int类型的，则需要用mapToInt*/
        double sum = list.stream().mapToDouble(t -> t.getScore()).sum();
        int count = list.stream().mapToInt(t -> t.getId()).sum();
 
        /*分组， 按照字段中某个属性将list分组*/
        Map<Integer, List<TestStreamModel>> map = list.stream().collect(Collectors.groupingBy(t -> t.getGrade()));
        System.out.println("按年级分组"+map);
        /*然后再对map处理，这样就方便取出自己要的数据*/
        for(Map.Entry<Integer, List<TestStreamModel>> entry : map.entrySet()){
            System.out.println("key:"+entry.getKey());
            System.out.println("value:"+entry.getValue());
        }
 
        /*多重分组，先按年级分组，再按班级分组*/
        Map<Integer/*年级id*/, Map<Integer/*班级id*/, List<TestStreamModel>>> groupMap = list.stream().collect(Collectors.groupingBy(t -> t.getGrade(), Collectors.groupingBy(t -> t.getClasses())));
        System.out.println("按照年级再按班级分组："+groupMap);
        System.out.println("取出一年级一班的list："+groupMap.get(1).get(1));
 
        /*多重分组，一般多重分组后都是为了统计，比如说统计每个年级，每个班的总分数*/
        /*Map<Integer*//*年级id*//*, Map<Integer*//*班级id*//*, Double>> sumMap = list.stream().collect(Collectors.groupingBy(t -> t.getGrade(), Collectors.groupingBy(t -> t.getClasses(), Collectors.summingDouble(t -> t.getScore()))));
        System.out.println(sumMap);
        System.out.println("取出一年级一班的总分："+sumMap.get(1).get(1));*/
 
        /*stream是链式的，这些功能是可以一起使用的，例如：计算每个年级每个班的及格人数*/
        Map<Integer/*年级*/, Map<Integer/*班级*/, Long/*人数*/>> integerMap = list.stream().filter(t -> t.getScore() >= 60).collect(Collectors.groupingBy(t -> t.getGrade(), Collectors.groupingBy(t -> t.getClasses(), Collectors.counting())));
        System.out.println("取出一年级一班及格人数："+integerMap.get(1).get(1));
    }
}