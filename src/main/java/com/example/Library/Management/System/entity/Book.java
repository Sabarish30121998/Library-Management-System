package com.example.Library.Management.System.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Book")
public class Book {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO);
    @Column(name = "id")
    private long id;

    @Column(name = "book_name")
    private  String book_Name;

    @Column(name = "author_name")
    private String author_Name;

    @Column(name = "pages")
    private  int pages;

    public Book(long id, String book_Name, String author_Name, int pages) {
        this.id = id;
        this.book_Name = book_Name;
        this.author_Name = author_Name;
        this.pages = pages;
    }
   /* try{
        object id=1;
        if(id.ispresent())
        {
            get
        }
        else
        {
            System.out.println("cannot have id in the data");
        }
    }
    catch{

    }*/

}

