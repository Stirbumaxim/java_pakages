public class Box{


    public int lenght;
    public  int width;
    public int height;

    public Box(int a, int b, int c) {
        lenght = a;
        width = b;
        height = c;

        System.out.println("Area = " + a * b * c);
    }
}
