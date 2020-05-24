package PrezentacjaZadania.ex1;

class Circle {


    private static final double PI_DOUBLE = Math.PI;
    private final float radius;
    private static final float PI = 3.14f;

    Circle(float diameter) {
        this.radius = diameter / 2;
    }

    public float getCircumference() {
        return 2 * PI * radius;
    }

    public double getCircumferenceDouble() {
        return 2 * PI_DOUBLE * radius;
    }

    public float getArea() {
        return PI * radius * radius;

    }

    public double getAreaDouble() {
        return PI_DOUBLE * radius * radius;

    }

    public void testVarags(String powitanie, int... values) {
        System.out.println(powitanie);


        for (int inaczej : values) {
            System.out.println(inaczej);
        }
    }

    public static void main(String[] args) {


    }
}
