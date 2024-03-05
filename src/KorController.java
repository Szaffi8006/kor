public class KorController {

    public KorController() {
        start();
    }

    private void start() {

        int choose = getCalculateMode();
        if (choose == 1) {

            getPher();
        } else {
            getArea();
        }

    }

    private int getCalculateMode() {

        OwnData inData = new OwnData();
        int choose = inData.getInt("Kerület[1], Terület[2]\n Válassz: ");
        System.out.println(choose);

        return choose;
    }

    private void getPher() {
        OwnData inData = new OwnData();
        double radius = inData.getDouble("A kör sugara: ");

        KorChecker checker = new KorChecker();
        boolean ok = checker.isPositiv(radius);
        if (ok) {

            Count calc = new Count();
            double pher = calc.getPher(radius);
            System.out.printf("A kerület: %10.3f", pher);

        } else {
            System.out.println("Nem jó az adat!");
        }
    }

    private void getArea() {
        OwnData inData = new OwnData();
        double radius = inData.getDouble("A kör sugara: ");

        KorChecker checker = new KorChecker();
        boolean ok = checker.isPositiv(radius);
        if (ok) {

            Count calc = new Count();
            double area = calc.getArea(radius);
            System.out.printf("A terület: %10.3f", area);

        } else {
            System.out.println("Nem jó az adat!");
        }
    }

}
