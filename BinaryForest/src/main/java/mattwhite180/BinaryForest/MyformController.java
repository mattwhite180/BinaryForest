package mattwhite180.BinaryForest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyformController {

  @GetMapping("/myform")
  public String myformForm(Model model) {
    model.addAttribute("greeting", new Greeting());
    return "myform";
  }

  @PostMapping("/myform")
  public String myformSubmit(@ModelAttribute Greeting greeting, Model model) {
    model.addAttribute("greeting", greeting);
    return "result";
  }

}