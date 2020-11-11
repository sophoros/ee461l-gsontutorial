import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    static class Student {
        String name;
        int age;
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Gson gson = new Gson();
        Student bob = new Student("Bob", 20);

        String bob_json = gson.toJson(bob);
        System.out.println(bob_json);

        Student bob_copy = gson.fromJson(bob_json, Student.class);
    }
}
