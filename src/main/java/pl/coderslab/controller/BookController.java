package pl.coderslab.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.model.BookType;
import pl.coderslab.model.BookWrite;
import pl.coderslab.model.Car;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/hello")
    public String hello() {
        return "{hello:world}";
    }

    @GetMapping("/helloBook")
    public BookWrite helloBook() {
        return new BookWrite(1L, "9788324631766", "Thinking in Java", "Bruce Eckel", "Helion", BookType.PROGRAMMING);
    }

    @GetMapping("/cars")
    public Car getCars() {
        return new Car("BMW","i56");
    }
}
