import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

//1. Частота встречаемости букв в словах

public class Task_1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/data/data.txt"))){
            String s,c;
            do {
                s = br.readLine();
                if (s!=null)
                    for (int i = 0; i < s.length(); i++) {
                    c = s.substring(i, i + 1).toLowerCase();
                    if (c.matches("[a-z]")) {
                        map.put(c, map.getOrDefault(c, 0) + 1);
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
