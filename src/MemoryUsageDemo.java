import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class MemoryUsageDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        LinkedList<SomeObject> data = new LinkedList<>();

        scanner.nextLine();
        for (int i = 0; i < 1_000_000; i++) {
            data.add(new SomeObject(i, "Object " + i));
            if (random.nextInt(3) == 1) { //периодически удаляем некоторые объекты
                data.remove(random.nextInt(data.size()));
            }
        }

    }
}
