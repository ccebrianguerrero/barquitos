import org.jetbrains.annotations.NotNull;

public class Flota {
    private Barco[] barcos;          // <<R>>

    public Flota(@NotNull int[] longitudes) {
        barcos = new Barco[longitudes.length];
        for (int i = 0; i < longitudes.length; i++) {
            barcos[i] = new Barco(longitudes[i]);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
