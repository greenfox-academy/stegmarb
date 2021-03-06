package com.greenfox.Controller;

import com.greenfox.doubled.Doubled;
import com.greenfox.doubled.ErrorMessage;
import com.greenfox.greeter.Student;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage someException(MissingServletRequestParameterException e) {
    String name = e.getParameterName();
    return new ErrorMessage("Please provide an input!");
  }

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public Doubled returnDouble(@RequestParam(value = "input") int input) {
    Doubled instance = new Doubled(input);
    instance.doubleValue();
    return instance;
  }
}
