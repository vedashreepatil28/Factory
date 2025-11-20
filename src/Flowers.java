public class Flowers {
    String flowerType;
    boolean isBloomed;
    int howTall;
    String color;

    public Flowers(){
        flowerType = "Daisy";
        isBloomed = true;
        howTall = 17;
        color = "blue";

    }

    public void printInfo(){
        System.out.println("What type of flower is it: " + flowerType);
        //this is readable
        System.out.println("The flower is bloomed: " + isBloomed);
        System.out.println("the flower is " + howTall + "cm tall.");
        System.out.println("The flower is " + color);

    }

    public Flowers (String vflowerType,int vhowTall, String vcolor, boolean visBloomed) {
        flowerType = vflowerType;
        howTall = vhowTall;
        color = vcolor;
        isBloomed = visBloomed;
    }
}
