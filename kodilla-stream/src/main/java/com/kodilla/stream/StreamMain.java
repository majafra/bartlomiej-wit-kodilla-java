package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.SaySomething;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
//        System.out.println("Welcome to module 7 - Stream");
//
//        SaySomething saySomething = new SaySomething();
//        saySomething.say();

//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        poemBeautifier.beautify("To jest tekst do upiekszenia", (a) -> ("ABC" + a + "ABC"));
//        poemBeautifier.beautify("To jest tekst do upiekszenia", (a) -> a.toUpperCase());
//        poemBeautifier.beautify("To jest tekst do upiekszenia", (a) -> a.replaceAll("jest", "juz nie jest"));
//        poemBeautifier.beautify("To jest tekst do upiekszenia", (a) -> a.substring(0, 14));
//        BookDirectory theBookDirectory = new BookDirectory();
//        theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .forEach(System.out::println);
        Forum forum= new Forum();
        Map<Integer, ForumUser> theResultForumUser=forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> ChronoUnit.YEARS.between(forumUser.getBirthDate(), LocalDate.now())>20)
                .filter(forumUser -> forumUser.getNumberOfPosts()>0)
                .collect(Collectors.toMap(ForumUser::getIdentifier, forumUser -> forumUser));

        System.out.println("# elements: " + theResultForumUser.size());
        theResultForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
