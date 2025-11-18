public class House {
    //instance variables
    //1. at top of the class
    //2. They can be used anywhere but psvm
    //3. They have the word public before
    public int walls;
    public double size;
    public String owner;
    public String address;
    public boolean isOccupied;

    //default constructor
    // 1. no void
    //2. same name as class
    //3. it's a special method
    public House(){
    walls = 4;
    size = 1713.9;
    owner = "bobby";
    address = "325 centre street";
    isOccupied = true;

    }

    public void printInfo(){
        System.out.println("number of walls: " + walls);
        //this is readable
        System.out.println("size of house: " + size);
        System.out.println("Name of owner: " + owner);
        System.out.println("Address of House: " + address);
        System.out.println("is it occupied: " + isOccupied);

    }
        /*todo: add two more perameters to the house constructor, 1 for
        *   isOccupied and 1 for address. set the instance variable's
        *   value to the perameter. fix the related problems by adding
        *   them o the code in the factory Class*/
    //the perameter is similar to the name but not the same
    public House (double pSize, int pWalls, String pOwner){
      size = pSize;
      walls = pWalls;
      owner = pOwner;


    }

}