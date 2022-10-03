/*
    11. Use record to create an immutable represent of student(name, id, age)
    and use its  constructor for initialization, equals to compare 2 students methods.
    Also keep a static counter to keep the count of objects created.
 */

package Java9_17;

import java.util.Objects;

record student(String name, int id, int age)
{
    static int count = 0;
    static void callCount()
    {
        count++;
    }
    student
    {
        Objects.requireNonNull(name);
        Objects.requireNonNull(id);
        Objects.requireNonNull(age);
        callCount();
    }
}

public class Ques11
{
    public static void main(String[] args)
    {
        student s1 = new student("Shazad",6555,25);
        student s2 = new student("Shazad",6555,25);
        student s3 = new student("Nafees",6592,22);
        student s4 = new student("Riya",6504,23);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println(s1.equals(s2));
        System.out.println(student.count);
    }
}
