package school.lec03;

public class Lec03Main {
    public static void main(String[] args) {
        printAgeIfPerson(new Child("",18));
    }
    public static void printAgeIfPerson(Object obj){
        if(obj instanceof school.lec01.Person){
            Person person = (Person) obj;
            System.out.println(person.getAge());
        }
    }
}
