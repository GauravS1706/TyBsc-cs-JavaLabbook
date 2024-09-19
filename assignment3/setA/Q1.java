/*
        Set A:
            a) Write a program for multilevel inheritance such that country is inherited from continent.
               State is inherited from country. Display the place, state, country and continent.
 */



package assignment3.setA;
class Contient{
    String contientName;
    public Contient(String contientName)
    {
        this.contientName=contientName;
    }
    public void displayContient(){
        System.out.println("Contient : "+contientName);
    }
}

class Country extends Contient{
    String countryName;
    public Country(String contientName,String countryName) {
        super(contientName);
        this.countryName=countryName;
    }


    public void displayCountry() {
        displayContient();
        System.out.println("Country : "+countryName);
    }
}

class State extends Country{
    String stateName;

    public State(String contientName, String countryName, String stateName) {
        super(contientName, countryName);
        this.stateName=stateName;
    }
    public  void displayState()
    {
        displayCountry();
        System.out.println("State : "+stateName);
    }
}

class Place extends State{
    String place ;

    public Place(String contientName, String countryName, String stateName,String place) {
        super(contientName, countryName, stateName);
        this.place=place;
    }
    public void displayPlace()
    {
        displayState();
        System.out.println("Place : "+place);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Place p= new Place("Asia","India","Maharashtra","Pcmc");
        p.displayPlace();
    }


}
