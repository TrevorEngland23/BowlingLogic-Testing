public class Game {
    
    private Integer _score = 0;
    public void roll(int pins){
        _score += pins;
    }

    public int score(){
        return _score;
    }
}
