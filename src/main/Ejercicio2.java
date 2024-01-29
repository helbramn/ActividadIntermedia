public class Ejercicio2 {

    private float radio;
    private float area;
    private float volumen;

    public Ejercicio2(float radio) {
        this.radio = radio;
        this.calcularArea();
        this.calcularVolumen();
        this.mostrarResultados();
    }

    public void calcularArea() {
        this.area = (float) (Math.PI * Math.pow(radio, 2));
    }

    public void calcularVolumen() {
        this.volumen = (float) ((4.0 / 3.0) * Math.PI * Math.pow(radio, 3));
    }

    private void mostrarResultados() {
        System.out.println("El área del círculo y el volumen de la esfera de 2 metros son:");
        this.mostrarResultado("El área del círculo:  ", this.area);
        this.mostrarResultado("El volumen de la esfera:  ", this.volumen);
    }

    private void mostrarResultado(String mensaje, float resultado) {
        System.out.println(mensaje + resultado);
    }

    public float getArea() {
        return area;
    }

    public float getVolumen() {
        return volumen;
    }

    public static void main(String[] args) {
        new Ejercicio2(2.0f);
    }
}
