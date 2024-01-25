public class Trozo {
    private boolean tocado;

    public Trozo(int longitud) {
        this.tocado = false;
    }

    public boolean estaToado() {
        return this.tocado;
    }

    public void tocar() {

    }

    @Override
    public String toString() {
        return tocado ? "|T|" : "| |";
    }
}

