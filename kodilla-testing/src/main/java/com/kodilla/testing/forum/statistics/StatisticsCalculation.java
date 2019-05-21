package com.kodilla.testing.forum.statistics;

public class StatisticsCalculation {
    Statistics statistics;

    public StatisticsCalculation(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getNumberOfUsers() {
        return statistics.usersNames().size();
    }

    public int getPostsCount() {
        return statistics.postsCount();
    }

    public int getCommentsCount() {
        return statistics.commentsCount();
    }

    public double averagePostPerUser() {
        if (getNumberOfUsers() == 0 || getPostsCount() == 0) {
            return  0.0;
        } else {
            return (double) getPostsCount() / (double) getNumberOfUsers();
        }
    }

    public double averageCommentPerUser() {
        if (getNumberOfUsers() == 0 || getCommentsCount() == 0) {
            return (double) 0.0;
        }
        return (double) getCommentsCount() / (double) getNumberOfUsers();
    }

    public double averageCommentPerPost() {
        if (getPostsCount() == 0 || getCommentsCount() == 0) {
            return 0.0;
        }
        return (double) getCommentsCount() / (double) getPostsCount();
    }
}


