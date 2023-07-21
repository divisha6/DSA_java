// package Data_Structures;

public class enumExamples {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        // these are called enum constants
        // they are all by default public, static, and final
        // they are final- therefore cannot create child enums

        // all of the objects have the type 'Week'
        

        Week() {
            System.out.println("Constructor called for enum " + this);
        }

    }


    public static void main(String[] args) {
        Week week ;
        week = Week.Monday;

        System.out.println(week);

        // ordinal gives the index at which the obj is places
        System.out.println(week.ordinal());


        for(Week day: Week.values()){
            System.out.println(day);
        }
    }
}
