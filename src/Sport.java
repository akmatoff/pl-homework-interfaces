interface Sport {
    void setHomeTeam(String name);
    void setVisitingTeam(String name);    
}

class Football implements Sport {
    String homeTeamName;
    String visitingTeamName;

    @Override
    public void setHomeTeam(String name) {
        this.homeTeamName = name;
    }

    @Override
    public void setVisitingTeam(String name) {
        this.visitingTeamName = name;
    }

    public void startMatch() {
        System.out.printf("The match between %s and %s has started. \n", homeTeamName, visitingTeamName);
    }

}

class Hockey implements Sport {
    String homeTeamName;
    String visitingTeamName;

    @Override
    public void setHomeTeam(String name) {
        this.homeTeamName = name;
    }

    @Override
    public void setVisitingTeam(String name) {
        this.visitingTeamName = name;
    }

    public void startMatch() {
        System.out.printf("The match between %s and %s has started. \n", homeTeamName, visitingTeamName);
    }
}