package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        User u = new User("Arun", 22);

        Field nameField = u.getClass().getDeclaredField("name");
        Method getAgeMethod = u.getClass().getDeclaredMethod("getAge");
        Method setAgeMethod = u.getClass().getDeclaredMethod("setAge", int.class);

        nameField.setAccessible(true);
        getAgeMethod.setAccessible(true);
        setAgeMethod.setAccessible(true);

        System.out.println(nameField.get(u));
        setAgeMethod.invoke(u, 33);
        System.out.println("Age : " + getAgeMethod.invoke(u));

    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }
}
