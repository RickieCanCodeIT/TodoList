package wcci.exercise.todolist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;

@Controller
public class TodoListController {

    @RequestMapping("todolist-with-dog")
    public String getTodoItem(Model inModel) {
        TodoListOwner tempOwner = new TodoListOwner("Jordan", Collections.EMPTY_LIST);
        TodoItem tempItem = new TodoItem(tempOwner, "Feed the Dog", 15);
        inModel.addAttribute("TodoItem", tempItem);
        return "todolist-template";
    }
}
