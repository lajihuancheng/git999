package kkk;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MyTest {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("tom", "bb", "cc", 100l));
        users.add(new User("tom", "bb", "cc", 50l));
        users.add(new User("jerry", "dd", "ee", 30l));
        users.add(new User("jerry", "dd", "ee",40l));

        users.stream()
                .collect(Collectors
                        .groupingBy(
                                user -> new User(user.name, user.phone, user.address), 
                                Collectors.summarizingLong(user -> user.scope)
                        )
                )
                .forEach((k,v) -> {
                    k.scope = v.getSum();
                    System.out.println(k);
                });
    }
}