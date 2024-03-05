public class Count {

    public Count(){}

    public double getPher(double radius){

        double sum = 2 * radius * Math.PI;

        return sum;
    }


    public double   getArea(double radius){

        double sum = Math.pow(radius, 2) * Math.PI;

        return sum;
    }

}
