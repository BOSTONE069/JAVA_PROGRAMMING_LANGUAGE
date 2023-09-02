import java.util.Scanner;

class Triangle {
    /**
     * Calculates the perimeter of a triangle.
     *
     * @param side1 the length of side 1
     * @param side2 the length of side 2
     * @param side3 the length of side 3
     * @return the perimeter of the triangle
     */
    public int calculatePerimeter(int side1, int side2, int side3) {
        return side1 + side2 + side3;
    }

    /**
     * Calculates the area of a triangle.
     *
     * @param base   the length of the base
     * @param height the height of the triangle
     * @return the area of the triangle
     */
    public int calculateArea(int base, int height) {
        return (base * height) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();

        // Input values for calculatePerimeter method
        System.out.print("Enter the value of side 1: ");
        int side1 = scanner.nextInt();
        System.out.print("Enter the value of side 2: ");
        int side2 = scanner.nextInt();
        System.out.print("Enter the value of side 3: ");
        int side3 = scanner.nextInt();

        // Input values for calculateArea method
        System.out.print("Enter the value of base: ");
        int base = scanner.nextInt();
        System.out.print("Enter the value of height: ");
        int height = scanner.nextInt();

        int perimeter = triangle.calculatePerimeter(side1, side2, side3);
        int area = triangle.calculateArea(base, height);

        System.out.println("Perimeter of the triangle is: " + perimeter);
        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }
}