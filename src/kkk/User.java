package kkk;

import java.util.Objects;

class User {
    String name;
    String phone;
    String address;
    Long scope;

    public User(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public User(String name, String phone, String address, Long scope) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.scope = scope;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", scope=" + scope +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(phone, user.phone) &&
                Objects.equals(address, user.address) &&
                Objects.equals(scope, user.scope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, address);
    }
}