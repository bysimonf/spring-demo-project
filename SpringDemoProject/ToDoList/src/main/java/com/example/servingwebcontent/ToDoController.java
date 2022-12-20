package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;


@Controller
public class ToDoController {

    ArrayList<ToDo> toDoList = new ArrayList();

    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("todolist", toDoList);

        return "index";

    }

    @GetMapping("/todoform")
    public String addToDo(Model model) {

        ToDo newToDo = new ToDo();

        model.addAttribute("newtodo", newToDo);

        return "todoform";
    }

    @PostMapping("/todoform")
    public String submitToDo(@ModelAttribute("newtodo") ToDo newToDo, Model model) {
        toDoList.add(newToDo);
        model.addAttribute("newtodo", newToDo);

        return "submitsuccess";
    }

    @PostMapping("/todochange")
    public String todoChange(@ModelAttribute ToDo finishedTask, Model model) {

            for (int i = 0; i < toDoList.size(); i++) {
                if (toDoList.get(i).getTask().equals(finishedTask.getTask())) {
                    toDoList.get(i).setStatusDone(true);
                }
            }

        return "redirect:/";
    }
}


