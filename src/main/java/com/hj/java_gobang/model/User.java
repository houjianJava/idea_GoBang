package com.hj.java_gobang.model;

public class User {
    private int userId;
    private String username;
    private String password;
    private int score;
    private int totalCount;
    private int withCount;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getWithCount() {
        return withCount;
    }

    public void setWithCount(int withCount) {
        this.withCount = withCount;
    }
}
