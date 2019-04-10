package color.services;

public interface ColorService {
    default void define() {
        System.out.println(this.toString());
    }
}
