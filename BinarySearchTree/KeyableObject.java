package BinarySearchTree;

//NBAPlayerKey
class NBAPlayerKey implements Keyed {

    private int jersey_number;
    private String team_name;

    public NBAPlayerKey(int _jersey_number, String _team_name) {
        jersey_number = _jersey_number;
        team_name = _team_name;
    }

    public int keyComp(Keyed object) {

        NBAPlayerKey other = null;
        if (object instanceof NBAPlayerKey)
            other = (NBAPlayerKey) object;

        int result = other.getTeamName().compareTo(team_name);
        if (result < 0)
            return 1;
        else if (result > 0)
            return -1;
            
        if (other.getJerseyNumber() < jersey_number)
            return 1;
        else if (other.getJerseyNumber() > jersey_number)
            return -1;
        return 0;
    }

    public String toKey() {
        return jersey_number + team_name.substring(0, 3);
    }

    public int getJerseyNumber() {
        return jersey_number;
    }

    public String getTeamName() {
        return team_name;
    }

    public String toString() {
        return jersey_number + " " + team_name;
    }
}

//NBAPlayer
class NBAPlayer extends NBAPlayerKey {

    private double scoring_average;
    private String player_name;

    public NBAPlayer(int _jersey_number, String _team_name, double _scoring_average, String _player_name) {
        super(_jersey_number, _team_name);
        scoring_average = _scoring_average;
        player_name = _player_name;
    }

    public double getScoringAverage() {
        return scoring_average;
    }

    public String getPlayerName() {
        return player_name;
    }
}