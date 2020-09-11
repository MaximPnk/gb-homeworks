package course3.homework4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        //1
        Searchable searchable = (n, list) -> {
            for (int i = 0; i < list.length; i++) {
                if (n == list[i]) {
                    return i;
                }
            }
            return -1;
        };

        Searchable searchable1 = (n, list) -> IntStream.range(0, list.length).filter(i -> list[i] == n).findFirst().orElse(-1);

        //2
        Reversable reversable = s -> {
            String rev = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                rev = rev + s.charAt(i);
            }
            return rev;
        };

        Reversable reversable1 = s -> String.valueOf(new StringBuilder(s).reverse());

        //3
        Maxable maxable = arr -> {
            if (arr.length == 0) {
                throw new IllegalArgumentException();
            }
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        };

        Maxable maxable1 = arr -> Arrays.stream(arr).max().orElseThrow(IllegalArgumentException::new);

        //4
        Averagable averagable = list -> {
            if (list.size() == 0) {
                throw new IllegalArgumentException();
            }
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            return (double) sum/list.size();
        };

        Averagable averagable1 = list -> list.stream().mapToInt(i -> i).average().orElseThrow(IllegalArgumentException::new);

        //5
        Filterable filterable = list -> {
            List<String> newList = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).charAt(0) == 'a' && list.get(i).length() == 3) {
                    newList.add(list.get(i));
                }
            }
            return newList;
        };

        Filterable filterable1 = list -> list.stream().filter(a -> a.charAt(0) == 'a' && a.length() == 3).collect(Collectors.toList());


    }
}
