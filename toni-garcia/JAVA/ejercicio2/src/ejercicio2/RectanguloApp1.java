package ejercicio2; 
public class RectanguloApp1 {
     public static void main(String[] args) {
        Rectangulo rect1=new Rectangulo(10, 20, 40, 80);
        Rectangulo rect2=new Rectangulo(40, 80);
        Rectangulo rect3=new Rectangulo();
 	int medidaArea=rect1.calcularArea();
	System.out.println("El �rea del rect�ngulo es: " + medidaArea +" cm2");

 	rect2.desplazar(10, 20);

        if(rect1.estaDentro(20,30)){
	        System.out.println("El punto est� dentro del rect�ngulo");
        }else{
	        System.out.println("El punto est� fuera del rect�ngulo");
        }
    }
}