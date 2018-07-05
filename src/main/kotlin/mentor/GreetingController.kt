package mentor

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.CrossOrigin

import java.util.concurrent.atomic.AtomicLong


@RestController
@CrossOrigin(maxAge = 3600)
class GreetingController {

    val counter = AtomicLong()

//    @CrossOrigin(origins = arrayOf("*"))
    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
            Greeting(counter.incrementAndGet(), "Hello, $name")

}
