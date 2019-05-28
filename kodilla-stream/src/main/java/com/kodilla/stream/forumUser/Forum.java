package com.kodilla.stream.forumUser;

import java.util.ArrayList;
import java.util.List;


public class Forum {
    private final List<ForumUser>forumUserList = new ArrayList<>();

   public Forum(){
       forumUserList.add(new ForumUser(10, "Karol Pietka",'M',1985,11,3,10));
       forumUserList.add(new ForumUser(20, "Michael Jordan",'M',1975,10,15, 1));
       forumUserList.add(new ForumUser(30, "Grzegorz Paw",'M',1973,5,12, 30));
       forumUserList.add(new ForumUser(40, "Przesław Gołębiwski",'M',2000,3,2, 0));
       forumUserList.add(new ForumUser(50, "Marta Trepka",'F',2002,12,29, 16));
       forumUserList.add(new ForumUser(60, "Dominika Stafira",'F',1969,1,1, 26));
       forumUserList.add(new ForumUser(70, "Monika Leśniewska",'F',1990,8,17, 3));
       forumUserList.add(new ForumUser(20, "Alicja Janosz",'F',2001,6,5, 54));
   }
    public List<ForumUser> getList() {
        return new ArrayList<>(forumUserList);
    }
}
