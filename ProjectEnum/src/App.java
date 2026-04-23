public class App {
    public static void main(String[] args) throws Exception {
        
        DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;
        
        if (day == DaysOfTheWeek.MONDAY) {
            System.out.println("It's Monday, the start of the week!");
        } else if (day == DaysOfTheWeek.THURSDAY) {
            System.out.println("It's Thursday, almost the weekend!");
        } else {
            System.out.println("It's " + day + ", just another day.");
        }

        DaysOfTheWeek[] days = DaysOfTheWeek.values();
        
        for(DaysOfTheWeek d : days) {
            System.out.println(d);
        }


        System.out.println("The level of deliciousness of Cheerios is: " + Cereals.CHEERIOS.levelOfDeliciousness);
    }
}
