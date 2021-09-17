package com.example.Library.Management.System.Repository;

import com.example.Library.Management.System.entity.Book;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
@EnableAutoConfiguration

public interface BookRepo extends CrudRepository<Book,Long> {

}
