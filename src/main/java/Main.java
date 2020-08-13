import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Map<String, Person> persons = new HashMap<>();

        Person person1 = new Person("Иванов", 25, "муж");
        Person person2 = new Person("Иванов", 25, "муж");
        Person person3 = new Person("Иванова", 27, "жен");
        Person person4 = new Person("Петров", 32, "муж");
        Person person5 = new Person("Сидоров", 22, "муж");

        persons.put("1", person1);
        persons.put("2", person1);
        persons.put("3", person3);
        persons.put("4", person4);
        persons.put("5", person5);

        removeTheDuplicates(persons);

        System.out.println(persons);

    }

    public static void removeTheDuplicates(Map<String, Person> person) {

        Map<Person, Integer> bufferMap = new HashMap<>();

        for (Person p : person.values()) {
            if (bufferMap.get(p)==null){
                    bufferMap.put(p, 1);
                } else {
                    bufferMap.put(p, bufferMap.get(p)+ 1);
                }
        }
        for (Map.Entry<Person, Integer> fEntry : bufferMap.entrySet()) {
            if (fEntry.getValue() != 1) {
                removeItemFromMapByValue(person, fEntry.getKey());
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, Person> map, Person value) {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
