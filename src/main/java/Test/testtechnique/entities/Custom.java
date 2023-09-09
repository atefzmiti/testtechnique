package Test.testtechnique.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Custom {

    @Id
    @GeneratedValue
    private Long id;


    private int level;

    private int sergn;

    private int mny;

    private int score;


    public Custom() {
    }

    public Custom(Long id, int level, int sergn, int mny, int score) {
        this.id = id;
        this.level = level;
        this.sergn = sergn;
        this.mny = mny;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSergn() {
        return sergn;
    }

    public void setSergn(int sergn) {
        this.sergn = sergn;
    }

    public int getMny() {
        return mny;
    }

    public void setMny(int mny) {
        this.mny = mny;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
