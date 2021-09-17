package com.example.Library.Management.System.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class BookDTO {

    private long id;
    private  String book_Name;
    private String author_Name;
    private  int pages;

}
