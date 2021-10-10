public class App {
    public static void main(String[] args) throws Exception {
        Football football = new Football();
        football.setVisitingTeam("FCB");
        football.setHomeTeam("Real Madrid");
        football.startMatch();

        Hockey hockey = new Hockey();
        hockey.setHomeTeam("Hoho");
        hockey.setVisitingTeam("Ololo");
        hockey.startMatch();
    }
}
