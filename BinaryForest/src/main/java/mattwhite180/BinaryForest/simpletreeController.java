package mattwhite180.BinaryForest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class simpletreeController {

  @GetMapping("/simpletree")
  public String greetingForm(Model model) {
    model.addAttribute("simpletree", new SimpleTree());
    return "simpletree";
  }

  @PostMapping("/simpletree")
  public String greetingSubmit(@ModelAttribute SimpleTree simpletree, Model model) {
    model.addAttribute("simpletree", simpletree);
    return "treeresult";
  }

}
