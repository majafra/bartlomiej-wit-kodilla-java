package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;


import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 =new Book("Gabriel Marquez","Love in the time of Cholera",2000,"123");
        Book book2 = new Book("Lauren W.","The Devil wears Prada",1995,"345");
        Book book3 = new Book("Celeste G.", "Everything",1990,"678");
        Book book4 = new Book("S.Twardoch","Krol",2015,"789");
        Book book5 = new Book("S.Twardoch","Opowiadania",2010,"789");

        Set<Book> booksSet = new HashSet<Book>();
        booksSet.add(book1);
        booksSet.add(book2);
        booksSet.add(book3);
        booksSet.add(book4);
        booksSet.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int medianOfBooks = medianAdapter.publicationYearMedian(booksSet);
        //Then
        System.out.println(medianOfBooks);
        assertEquals(medianOfBooks, 2000);
    }
}