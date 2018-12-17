package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Score> scores;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        scores = new ArrayList<>();
    }

    public void addScore(Score score) {
        score.setUser(this);
        scores.add(score);
    }

    public void removeScore(Score score) {
        scores.remove(score);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }
}
