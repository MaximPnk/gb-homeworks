package homework8.task5;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "Particular unaffected projection sentiments no my. Music marry as at cause party worth weeks. Saw how marianne graceful dissuade new outlived prospect followed. Uneasy no settle whence nature narrow in afraid. At could merit by keeps child. While dried maids on he of linen in. \n" + "\n" + "By impossible of in difficulty discovered celebrated ye. Justice joy manners boy met resolve produce. Bed head loud next plan rent had easy add him. As earnestly shameless elsewhere defective estimable fulfilled of. Esteem my advice it an excuse enable. Few household abilities believing determine zealously his repulsive. To open draw dear be by side like. \n" + "\n" + "Good draw knew bred ham busy his hour. Ask agreed answer rather joy nature admire wisdom. Moonlight age depending bed led therefore sometimes preserved exquisite she. An fail up so shot leaf wise in. Minuter highest his arrived for put and. Hopes lived by rooms oh in no death house. Contented direction september but end led excellent ourselves may. Ferrars few arrival his offered not charmed you. Offered anxious respect or he. On three thing chief years in money arise of. ";
        text = text.toLowerCase();

        ArrayList<Integer> charArray = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            charArray.add((int) text.charAt(i));
        }

        Map<Character, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < charArray.size(); i++) {
            if (charArray.get(i) >= 97 && charArray.get(i) <= 122) { //кидаем только a-z
                int count = Collections.frequency(charArray, charArray.get(i));
                resultMap.put((char) ((int) charArray.get(i)), count);
            }
        }

        for (Map.Entry<Character, Integer> pair : resultMap.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
