
public class AdvancedAstrology {

    public static void printStars(int number) {
        // first part of the exercise
        int i = 0;
        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i = 0;
        while (i < number) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int i = 1;
        while (size > 0) {
            printSpaces(size - 1);
            printStars(i);
            size--;
            i++;
        }

    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        // 40.3
        int space = (height) - 1;
        int star = 1;

        for (int i = 0; i < height; i++) {

            printSpaces(space);
            printStars(star);
            space--;
            star = star + 2;
        }

        for (int i = 0; i < 2; i++) {

            printSpaces((height) - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
