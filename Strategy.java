/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitwars;

/**
 *
 * @author lyx
 */
public class Strategy implements Comparable<Strategy> {

    private String name;
    private int score;

    public Strategy(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addScore(int addScore) {
        this.score += addScore;
    }

    @Override
    public int compareTo(Strategy o) {
        return o.getScore() - this.getScore();
    }

}
