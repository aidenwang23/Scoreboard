public class Scoreboard {
    private String activeTeam;
    private String team1;
    private String team2;
    private int score1;
    private int score2;

    public scoreboard.Scoreboard(String team1, String team2){
        activeTeam = team1;
    }

    public void recordPlay(int points){
        if (points > 0 && activeTeam == team1){
            score1+=points;
        }
        if (points > 0 && activeTeam == team2){
            score2+=points;
        }
        if (points == 0){
            if (activeTeam == team1){
                activeTeam = team2;
            }
            else{
                activeTeam = team1;
            }
        }
    }

    public String getScore(){
        String score = score1 + " - " + score2 + " - " + activeTeam;
        return score;
    } 
}
