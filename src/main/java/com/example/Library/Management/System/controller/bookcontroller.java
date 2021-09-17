package com.example.Library.Management.System.controller;

import com.example.Library.Management.System.DTO.BookDTO;
import com.example.Library.Management.System.Repository.BookRepo;
import com.example.Library.Management.System.Service.BookService;
import com.example.Library.Management.System.entity.Book;
import lombok.Data;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Data
@RestController
@RequestMapping("/book")
public class bookcontroller {

    @Autowired
    BookRepo bookRepo;

    private  BookDTO bookDTO;
    @Autowired
    private BookService bookService;

    @PostMapping("/post")
    private String  creation(@RequestBody BookDTO bookDTO)
    {
        return bookService.create(bookDTO);
    }

    @PutMapping("/put")
    private String put(@RequestBody BookDTO bookDTO)
    {

        Book sabari;
        sabari = bookRepo.findById(bookDTO.getId()).orElse(null);
        sabari.setBook_Name(bookDTO.getBook_Name());
        sabari.setAuthor_Name(bookDTO.getAuthor_Name());
        sabari.setPages(bookDTO.getPages());
        bookRepo.save(sabari);
        return "successfully PUT updated" ;
    }
    @PatchMapping("/patch")
    private  String patch(@RequestBody BookDTO bookDTO)
    {
        Boolean bool;
        Book sabari;
        sabari = bookRepo.findById(bookDTO.getId()).orElse(null);

        if(bookDTO.getBook_Name()!= null)
            sabari.setBook_Name(bookDTO.getBook_Name());
        if(bookDTO.getBook_Name()!=null)
            sabari.setAuthor_Name(bookDTO.getAuthor_Name());
        if(bookDTO.getPages()!=0)
            sabari.setPages(bookDTO.getPages());
        bookRepo.save(sabari);
        return "Patch operation is successful";
    }



    @GetMapping("/get")
    private Iterable<Book> getter()
    {
        Iterable<Book> saba = bookRepo.findAll();
        return saba;
    }

    @GetMapping("/gettingbyid/{id}")
    private Optional<Book> getbyid(@PathVariable(value = "id")long id)
    {
        Optional<Book> sabari = bookRepo.findById(id);
        return sabari;
    }


    @DeleteMapping("/delete/{id}")
    private String deletion(@PathVariable(value = "id")long id)
    {
        bookRepo.deleteById(id);
        return  "Deleted Successfully";
    }

}
