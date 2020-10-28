public class Rectangle {

    double x;
    double y;
    private static int createdRectangles;
    private final static String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private final static String ENGLISH_CLASS_NAME = "Rectangle";

    // конструктор, который принимает на вход 2 аргумента
    Rectangle(double storonaA, double storonaB) {
        x = storonaA;
        y = storonaB;
        createdRectangles++;
    }

    // конструктор, который принимает на вход 1 аргумент и инициализирует им оба поля класса Rectangle (т. е. по факту это будет квадрат)
    Rectangle(double storonaKvadrata) {
        x = storonaKvadrata;
        y = storonaKvadrata;
        createdRectangles++;
    }

    // метод без параметров, который будет вычислять площадь данного прямоугольника и возвращать результат
    double calculateArea() {
        double ploshad = x * y;
        return ploshad;
    }

    //    метод без параметров, будет выводить в консоль площадь текущего прямоугольника, используя метод calculateArea
    void printArea() {
        double vivodVConsolArea = calculateArea();
        System.out.println(vivodVConsolArea);
    }

    //    метод без параметров, будет выводить в консоль “Это квадрат” или “Это прямоугольник” в зависимости от соотношения x и y
    void printRectangleKind() {
        if (x == y) {
            System.out.println("Это кватдат");
        } else if (x != y) {
            System.out.println("Это прямоугольник");
        }
    }


    //    метод isTheSameRectangle с единственным параметром типа Rectangle возвращающий тип boolean
//    Данный метод должен сравнить 2 прямоугольника (вызывающий и тот, который передан аргументом в метод)
//    на предмет равенства (прямоугольники равны, если равны их стороны)
    boolean isTheSameRectangle(Rectangle rectangle) {
        return (this.x == rectangle.x && this.y == rectangle.y) || ((this.x == rectangle.y && this.y == rectangle.x));

    }

    //    метод должен выводить значение переменной createdRectangles в формате “Всего было создано [n] прямоугольников” ([n] заменить на реальное число)
    static void printRectanglesCount() {
        System.out.println("Всего было создано " + createdRectangles + " прямоугольников");
    }

    //    статический метод printClassName с единственным аргументом типа boolean и названием printInRussian
//    Метод должен в зависимости от значения аргумента выводить название класса на русском или английском языке
    static void printClassName(boolean printInRussian) {
        if (printInRussian) {
            System.out.println(RUSSIAN_CLASS_NAME);
        } else {
            System.out.println(ENGLISH_CLASS_NAME);
        }
    }


    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4.78);
        Rectangle r2 = new Rectangle(29.45, 37.96);
        Rectangle r3 = new Rectangle(29.45, 37.96);

        r1.calculateArea();
        r1.printArea();
        r1.printRectangleKind();
        r1.isTheSameRectangle(r3);

        System.out.println();

        r2.calculateArea();
        r2.printArea();
        r2.printRectangleKind();
        r2.isTheSameRectangle(r1);

        System.out.println();

        r3.calculateArea();
        r3.printArea();
        r3.printRectangleKind();
        r3.isTheSameRectangle(r2);

    }


}
