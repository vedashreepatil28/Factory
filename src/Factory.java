public class Factory {
    /*instance variables: they are at top of the class,
    they have public in front of them, and they can be used anywhere except the psvm*/
    public int yearFounded;
    public boolean isOpen;
    public double earnings;
    //^is a double, and it can be a decimal.

    public String products;
    // ^a string is the same as what we put in system.out.println


    /*this is a psvm and the only thing that should
    really be in there is a constructor call*/
    public static void main(String[] args) {
        System.out.println("Welcome to Vedashree's factory");

        new Factory();

    }

    /*this is a constructor, they are a special type of method, they don't have "void"
    and they have the same name as the class. When we use a constructor we always have
    to say new _____*/
    public Factory(){
        yearFounded = 1998;
        isOpen = false;
        earnings = 1.1;
        products = "houses";
        factoryInfo();

        //type varName = value;
        //this is a complex variable that we call object. h1 is the object of our house class
        House h1 = new House();
        h1.owner = "Mr. Kim";
        System.out.println("The owner is: " + h1.owner);
        h1.address = "Milton MA";
        System.out.println("the address is: " + h1.address);
        h1.isOccupied = true;
        System.out.println("is this house occupied: " + h1.isOccupied);
        h1.walls = 4;
        System.out.println("How many walls are there: " + h1.walls);
        h1.size = 500;
        System.out.println("what is the area in sq meters: " + h1.size);

        House h2 = new House();

        System.out.println(h2.size);
        h2.printInfo();

        House myHouse = new House();
        myHouse.printInfo();

        System.out.println("My custom house: ");
        House customHouse = new House(200.24,8,"Ms.Blair", "375 Randolph Ave", true);
        customHouse.printInfo();

    }

    //a method called factoryInfo
    public void factoryInfo(){
        System.out.println("this is factory info:");
        System.out.println("what we sell:" + products);
        System.out.println("the earnings (in millions):" + earnings);
        System.out.println("the year founded:" + yearFounded);



    }

}
