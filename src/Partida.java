import org.jetbrains.annotations.NotNull;

public class Partida {
    private Jugador[] jugadores;        // <<R>>
    private Jugador ganador;
    private int turno;
    private TableroPropio[] tablerosPropios;
    private TableroEnemigo[] tablerosEnemigos;
    private Flota[] flotas;


    public Partida(@NotNull String[] apodos){
        assert apodos.length == 2;
            String.format("El juego debe tener 2 jugadores (nº jugadores=%d)", apodos.length);

        setTurno(0);

        //Crear tableros propios
        tablerosPropios=new TableroPropio[2];
        for (int i = 0; i < tablerosPropios.length; i++) {
            tablerosPropios[i] = new TableroPropio();
        }

        //Crear tableros enemigos
        tablerosEnemigos=new TableroEnemigo[2];
        for (int i = 0; i < tablerosEnemigos.length; i++) {
            tablerosEnemigos[i] = new TableroEnemigo();
        }
        crearFlotas();


        //Crear jugadores
        jugadores=new Jugador[apodos.length];
        for (int i = 0; i < apodos.length; i++) {
            jugadores[i] = new Jugador(apodos[i], new Flota(), new TableroPropio(), new TableroEnemigo());
        }
    }



    private void setTurno(int turno){
        assert turno==0 || turno==1;
            String.format("El turno debe ser 0 o 1 (turno=%d)", turno);
        this.turno=turno;
    }

    private void crearFlotas(){
        flotas = new Flota[2];
        for (int i=0; i<flotas.length; i++){
            flotas[i] = new Flota(new int[] {4, 3, 2, 1});
        }

    }
    @Override
    public String toString() {
        return "Partida{" +
                "jugadores=" + jugadores +
                ", ganador=" + ganador +
                ", turno=" + turno +
                '}';
    }

}
