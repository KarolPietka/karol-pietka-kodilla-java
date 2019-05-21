package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class StatisticsCalculationTestSuite {

    private Statistics statisticsMock = mock(Statistics.class);
    private StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statisticsMock);
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test //#1#
    public void testEmptyForumUsersList(){
        //Given
        List<String> forumUsers = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(forumUsers);

        //When
        int quantityOfForumUsers = statisticsCalculation.getNumberOfUsers();
        //System.out.println(quantityOfForumUsers);

        //Then
        Assert.assertEquals(0, quantityOfForumUsers);
    }
    @Test //#2#
    public void testForumUsersList(){
        //Given
        List<String> forumUsers = new ArrayList<>();

        for (int i=0; i<100; i++){
            forumUsers.add("User " + i + "\n");
        }
        when(statisticsMock.usersNames()).thenReturn(forumUsers);

        //When
        int quantityOfForumUsers = statisticsCalculation.getNumberOfUsers();
        //System.out.println(quantityOfForumUsers);
        //System.out.println(forumUsers);

        //Then
        Assert.assertEquals(100, quantityOfForumUsers);
    }
    @Test //#3#
    public void testEmptyForumPostsList(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        int quantityPosts = statisticsCalculation.getPostsCount();
        //System.out.println(quantityPosts);

        //Then
        Assert.assertEquals(0, quantityPosts);
    }
    @Test //#4#
    public void testForumPostsCount1000(){
        //Given
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        int quantityPosts = statisticsCalculation.getPostsCount();
        //System.out.println(quantityPosts);

        //Then
        Assert.assertEquals(1000, quantityPosts);
    }
    @Test //#5#
    public void testEmptyForumCommentList(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        int quantityComments = statisticsCalculation.getCommentsCount();
        //System.out.println(quantityComments);

        //Then
        Assert.assertEquals(0, quantityComments);
    }
    @Test //#6#
    public void testForumCommentList(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        int quantityComments = statisticsCalculation.getCommentsCount();
        //System.out.println(quantityComments);

        //Then
        Assert.assertEquals(1000, quantityComments);
    }
    @Test // #7#
    public void testPostPerUserEmptyList(){
        //Given
        List<String> forumUsers = new ArrayList<>();

        //When
        double averagePostPerUser = statisticsCalculation.averagePostPerUser();
        //System.out.println(averagePostPerUser);

        //Then
        Assert.assertEquals(0, averagePostPerUser, 0.01);
    }

    @Test // #8#
    public void testAveragePostPerUser(){
        //Given
        List<String> forumUsers = new ArrayList<>();
        for(int i = 0; i<500; i++){
            forumUsers.add("User " + i + "\n");
        }
        when(statisticsMock.usersNames()).thenReturn(forumUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        double averagePostPerUser = statisticsCalculation.averagePostPerUser();
        //System.out.println(averagePostPerUser);

        //Then
        Assert.assertEquals(2, averagePostPerUser, 0.01);
    }

    @Test // #9#
    public void testCommentPerUserEmptyList(){
        //Given
        List<String> forumUsers = new ArrayList<>();

        //When
        double averageCommentsPerUser = statisticsCalculation.averageCommentPerUser();
        System.out.println(averageCommentsPerUser);

        //Then
        Assert.assertEquals(0, averageCommentsPerUser, 0.01);
    }
    @Test // #10#
    public void testAverageLessCommentPerPost(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(200);

        //When
        double averageCommentsPost = statisticsCalculation.averageCommentPerPost();
        //System.out.println(averageCommentsPost);

        //Then
        Assert.assertEquals(0.5, averageCommentsPost, 0.01);
    }
    @Test
    public void testAverageMoreCommentPerPost(){
        //Given
        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.postsCount()).thenReturn(100);

        //When
        double averageCommentsPerPost = statisticsCalculation.averageCommentPerPost();
        //System.out.println(averageCommentsPerPost);

        //Then
        Assert.assertEquals(2, averageCommentsPerPost, 0.01);
    }
}
