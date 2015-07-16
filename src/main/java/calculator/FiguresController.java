package calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Controller of calculation procedures
 */
@RestController
public class FiguresController {

    private final AtomicLong counter = new AtomicLong();

    @Autowired
    @Qualifier(FiguresService.NAME)
    FiguresService figuresService;

    @RequestMapping(value = "/sum", method = RequestMethod.POST)
    @ResponseBody public ResponseEntity<SumEntity> sum(@RequestParam(value = "first", defaultValue = "0") int first, @RequestParam(value = "second", defaultValue = "0") int second) {
        int result = figuresService.sum(first, second);
        SumEntity sum = new SumEntity(counter.incrementAndGet(), result);
        return new ResponseEntity<>(sum, HttpStatus.OK);
    }

    @RequestMapping(value = "/subtract", method = RequestMethod.POST)
    @ResponseBody public ResponseEntity<SubtractEntity> subtract(@RequestParam(value = "first", defaultValue = "0") int first, @RequestParam(value = "second", defaultValue = "0") int second) {
        int result = figuresService.difference(first, second);
        SubtractEntity subtract = new SubtractEntity(counter.incrementAndGet(), result);
        return new ResponseEntity<>(subtract, HttpStatus.OK);
    }

    @RequestMapping(value = "/multiply", method = RequestMethod.POST)
    @ResponseBody public ResponseEntity<MultiplyEntity> multiply(@RequestParam(value = "first", defaultValue = "0") int first, @RequestParam(value = "second", defaultValue = "0") int second) {
        int result = figuresService.multiply(first, second);
        MultiplyEntity multiply = new MultiplyEntity(counter.incrementAndGet(), result);
        return new ResponseEntity<>(multiply, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Figures> allOperations(@RequestParam(value = "first", defaultValue = "0") int first, @RequestParam(value = "second", defaultValue = "0") int second) {
        int sum = figuresService.sum(first, second);
        int subtract = figuresService.difference(first, second);
        int multiply = figuresService.multiply(first, second);
        Figures figures = new Figures(counter.incrementAndGet(), first, second, sum, subtract, multiply);
        return new ResponseEntity<>(figures, HttpStatus.OK);
    }
}