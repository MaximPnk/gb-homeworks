package course3.homework4;

import java.util.List;

@FunctionalInterface
public interface Filterable {
    List<String> search(List<String> list);
}
