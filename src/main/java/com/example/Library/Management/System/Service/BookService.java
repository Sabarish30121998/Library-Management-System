package com.example.Library.Management.System.Service;

import com.example.Library.Management.System.DTO.BookDTO;
import com.example.Library.Management.System.Repository.BookRepo;
import com.example.Library.Management.System.entity.Book;
import lombok.Data;

import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class BookService {

    @Autowired
    public BookRepo bookRepo;


    public String create(BookDTO bookDTO)
    {
         Book book = new Book();
         book.setId(bookDTO.getId());
         book.setBook_Name(bookDTO.getBook_Name());
         book.setAuthor_Name(bookDTO.getAuthor_Name());
         book.setPages(bookDTO.getPages());
         bookRepo.save(book);
         return "book statement is saved";
    }



}
