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
        System.out.println("we make houses");
        yearFounded = 2025;
        isOpen = false;
        earnings = 1.1;
        products = "houses";
        factoryInfo();

        //todo: change the value of the yearFounded and isOpen
        //todo: call factoryInfo

    }

    //a method called factoryInfo
    public void factoryInfo(){
        System.out.println("this is factory info:");
        System.out.println("what we sell:" + products);
        System.out.println("the earnings:" + earnings);
        System.out.println("the year founded:" + yearFounded);

    }

}
