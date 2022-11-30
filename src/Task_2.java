import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//Количество слов, начинающихся на определенную букву (от 'a' до 'z')

public class Task_2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/data/data.txt"))){
            String s;
            do {
                s = br.readLine();
                if (s!=null) {
                    s = s.substring(0, 1).toLowerCase();
                    if (s.matches("[a-z]")) {
                        map.put(s, map.getOrDefault(s, 0) + 1);
                    }
                }
            }
            while (s!= null);
            for (Map.Entry<String, Integer> line : map.entrySet()) {
                System.out.println(line.getKey() + " : " + line.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
