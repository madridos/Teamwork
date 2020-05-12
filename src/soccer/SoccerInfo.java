package soccer;

public class  SoccerInfo {
   public static String teamName;
   public static int founded ;
   private static String coach;
   private static String country ;
   private static boolean professinal;

    public SoccerInfo() {
    }


public SoccerInfo(String teamName){

}

public SoccerInfo(String teamName,int founded){

}
public SoccerInfo(String teamName,int founded,String coach){

}

    public static String getTeamName() {
        return teamName;
    }

    public static void setTeamName(String teamName) {
        SoccerInfo.teamName = teamName;
    }

    public static String getCoach() {
        return coach;
    }

    public static void setCoach(String coach) {
        SoccerInfo.coach = coach;
    }

    public static int getFounded() {
        return founded;
    }

    public static void setFounded(int founded) {
        SoccerInfo.founded = founded;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        SoccerInfo.country = country;
    }
    public static void knowHistory(){

    }
    public static int seeTile(){

        return 20;
    }
}

