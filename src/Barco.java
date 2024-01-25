import java.util.Arrays;

public class Barco {
    private Trozo[] trozos;       // <<R>>

    public Barco(int longitud){
        assert longitud>=1:
                String.format("La longitud debe ser mayor o igual que 1 (longitud=%d)", longitud);
        trozos = new Trozo[longitud];
        Arrays.fill(trozos, new Trozo(longitud));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
    }
}
