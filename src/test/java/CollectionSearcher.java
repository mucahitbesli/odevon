import java.util.List;
import java.util.Optional;

public class CollectionSearcher {
    public static <T> T findElementInCollection(List<T> collection, T targetElement) {
        Optional<T> result = collection.stream()
                .filter(element -> element.equals(targetElement))
                .findFirst();

        return result.orElse(null);
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("apple", "banana", "orange", "grape");

        String targetElement = "orange";
        String result = findElementInCollection(stringList, targetElement);

        if (result != null) {
            System.out.println("Element found: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
