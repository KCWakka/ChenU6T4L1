public class Main {
    public static void main(String[] args) {
        // TEST constructor & getter methods
        System.out.println("--- TEST CONSTRUCTOR ---");
        Fibonacci fib0 = new Fibonacci(2);
        int[] seq0 = fib0.getSequence();
        System.out.println(ArrayPrinter.printableString(seq0));

        Fibonacci fib1 = new Fibonacci(6);
        int[] seq1 = fib1.getSequence();
        System.out.println(ArrayPrinter.printableString(seq1));

        Fibonacci fib2 = new Fibonacci(15);
        int[] seq2 = fib2.getSequence();
        System.out.println(ArrayPrinter.printableString(seq2));

        // TEST getIndexOf method
        System.out.println("--- TEST getIndexOf ---");
        System.out.println(fib2.getIndexOf(1));
        System.out.println(fib2.getIndexOf(13));
        System.out.println(fib2.getIndexOf(144));
        System.out.println(fib2.getIndexOf(987));
        System.out.println(fib2.getIndexOf(100));
        System.out.println(fib2.getIndexOf(600));

        // TEST extendBy method
        System.out.println("--- TEST extendBy ---");
        fib0.extendBy(3);
        System.out.println(ArrayPrinter.printableString(fib0.getSequence()));
        fib1.extendBy(5);
        System.out.println(ArrayPrinter.printableString(fib1.getSequence()));
        fib2.extendBy(2);
        System.out.println(ArrayPrinter.printableString(fib2.getSequence()));
        fib2.extendBy(3);
        System.out.println(ArrayPrinter.printableString(fib2.getSequence()));

        // TEST fibonacciString method
        System.out.println("--- TEST fibonacciString ---");
        System.out.println(fib0.fibonacciString());
        System.out.println(fib1.fibonacciString());
        System.out.println(fib2.fibonacciString());

        Fibonacci fib3 = new Fibonacci(5);
        System.out.println(fib3.fibonacciString());

        int[] seq3 = fib3.getSequence();
        seq3[0] = 100;

        System.out.println(fib3.fibonacciString());

        Fibonacci[] fibonaccis = {fib0, fib1, fib2};

        for (Fibonacci fibonacci : fibonaccis) {
            System.out.println(fibonacci.getSequence().length);
        }

        System.out.println("----- TESTING Point class -----");
        // TEST distance method
        Point p1 = new Point(5, 10);
        Point p2 = new Point(-6, 17);
        Point p3 = new Point(18, 4);
        System.out.println(p1.distanceTo(p2));
        System.out.println(p2.distanceTo(p3));
        System.out.println(p1.distanceTo(p3));

        Point p4 = new Point(-1, 4);
        Point p5 = new Point(4, 0);
        Point p6 = new Point(-1, 0);
        System.out.println(p4.distanceTo(p5));
        System.out.println(p5.distanceTo(p6));
        System.out.println(p4.distanceTo(p6));

        System.out.println("\n----- TESTING Triangle class -----");
        // TEST Triangle constructor, perimeter, toString methods
        Triangle tri1 = new Triangle(p1, p2, p3);
        System.out.println(tri1.triangleInfo());
        System.out.println(tri1.perimeter());

        Triangle tri2 = new Triangle(p4, p5, p6);
        System.out.println(tri2.triangleInfo());
        System.out.println(tri2.perimeter());

        System.out.println("\n----- TESTING TriangleCollection class -----");
        // TEST TriangleCollection constructor and toString methods
        TriangleCollection collection1 = new TriangleCollection(6, 4, 7);
        System.out.println("collection 1's Triangles:");
        System.out.println(collection1.triangleCollectionInfo());

        TriangleCollection collection2 = new TriangleCollection(10, 7, 3);
        System.out.println("\ncollection 2's Triangles:");
        System.out.println(collection2.triangleCollectionInfo());

        // TEST TriangleCollection totalPerimeter method
        System.out.println("collection 1 total perim = " + collection1.totalPerimeter());
        System.out.println("collection 2 total perim = " + collection2.totalPerimeter());

        // TEST TriangleCollection shiftTriangles method
        collection1.shiftTriangles(5);
        System.out.println("\ncollection 1's Triangles after shift:");
        System.out.println(collection1.triangleCollectionInfo());

        collection2.shiftTriangles(10);
        System.out.println("collection 2's Triangles after shift:");
        System.out.println(collection2.triangleCollectionInfo());

    }
}