package cn.oauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.oauth.entity.Book;
import cn.oauth.service.impl.BookServiceImpl;

/**
 * Created by Irving on 2014/7/23.
 */

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookServiceImpl booksService;

    @RequestMapping()
    public String index(Model model) {
        //   model.addAttribute("list", booksService.getBooks());
        return "/books_list";
    }

    /*保存数据对象 */
    @RequestMapping(value="/save", method = RequestMethod.GET)
    public String save(Model model, Book books){
        booksService.save(books);
        return "redirect:/book/list";
    }

    /*列出数据对象列表 */
    @RequestMapping(value="/list",method = RequestMethod.GET)
    public String list(Model model,Book books) {
        model.addAttribute("list", booksService.queryResult(books));
        model.addAttribute("entity",books);
        return "/books_list";
    }

    /*根据主键更新对象 */
    @RequestMapping(value="/edit/{id}",method = RequestMethod.GET)
    public String edit(Model model,@PathVariable("id") Integer id) {
        model.addAttribute("entity", booksService.getBooks(id));
        return "/books_edit";
    }

    /*根据主键删除对象 */
    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
    public String delete(Model model, @PathVariable("id") Integer id){
        booksService.delete(id);
        return "redirect:/book/list";
    }

    @RequestMapping("/books_add")
    public String books_add(){
        return "/books_add";
    }

    @RequestMapping("/books_list")
    public String books_list(){
        return "/books_list";
    }
}

