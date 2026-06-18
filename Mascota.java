import java.util.*;

public class Mascota {

    private String nombre;

    private String color;
    private int edad;
    private float altura;

    private float peso;
    private boolean vacunado;
    private boolean desparasitado;

    public Mascota(float altura, String nombre, float peso, String color, int edad) {

        this.altura = altura;
        this.nombre = nombre;
        this.peso = peso;
        this.color = color;
        this.edad = edad;

    }

    public class perro extends Mascota {
        private String pelaje;
        private String raza;

        public Perro(float altura, String nombre, float peso,
                 String color, int edad,
                 String raza, String pelaje) {

        super(altura, nombre, peso, color, edad);

        this.raza = raza;
        this.pelaje = pelaje;
    }
    }

    public class gato extends Mascota {
        private Boolean vacunado;
        private Boolean desparacitado;

        public gato(float altura, String nombre, float peso,
                String color, int edad,
                Boolean vacunado, Boolean desparacitado) {

            super(altura, nombre, peso, color, edad);

            this.vacunado = vacunado;
            this.desparacitado = desparacitado;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public float getAltura() {
        return altura;
    }

    public void setNombre(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public Boolean getvacunado() {
        return vacunado;
    }

    public void setvacunado(Boolean vacunado) {
        this.vacunado = vacunado;
    }

    public Boolean getDesparacitado() {
        return desparacitado;
    }

    public int getEdad() {
        return edad;
    }

    public void setRaza(int edad) {
        this.edad = edad;
    }

    public void setDesparaitado(boolean desparacitado) {
        this.desparacitado = desparacitado;
    }

    public void ladrar() {

        System.out.println("ruff ruff");

    }

    public static void mostrarDatos() {
        System.out.println("La Raza es: " + raza);
        System.out.println("La altura es: " + altura);
        System.out.println("El nombre es: " + nombre);
        System.out.println("El peso es: " + peso);
        System.out.println("El color es: " + color);
        System.out.println("La edad es: " + edad);
        System.out.println("el " + vacunado + "vacunado");
        System.out.println("el " + desparacitado + "desparacitado");
        System.out.println("la raza es: " + raza);
        System.out.println("Su pelaje es: " + pelaje);

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de su mascota");
        String nombre = sc.next();

        System.out.println("Ingrese el color");
        String color = sc.next();

        System.out.println("Ingrese el peso");
        float peso = sc.nextFloat();

        System.out.println("Ingrese la altura");
        float altura = sc.nextFloat();

        System.out.println("Ingrese la edad");
        int edad = sc.nextInt();

        System.out.println("esta vaunado?");
        Boolean vacunado = sc.nextBoolean();

        System.out.println("esta desparacitado?");
        Boolean desparacitado = sc.nextBoolean();

        System.out.println("como es su pelaje?");
        String pelaje = sc.nextLine();

        System.out.println("que raza es?");
        String raza = sc.nextLine();

        Mascota C = new Mascota(altura, nombre, peso, color, edad);
        Perro c = new perro()

        C.mostrarDatos();

        sc.close();
    }
}