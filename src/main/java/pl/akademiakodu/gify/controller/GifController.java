package pl.akademiakodu.gify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.akademiakodu.gify.repository.CategoryRepository;
import pl.akademiakodu.gify.repository.CategoryStaticRepository;
import pl.akademiakodu.gify.repository.GifRepository;
import pl.akademiakodu.gify.repository.GifStaticRepository;


@Controller
public class GifController {
    private GifRepository repository= new GifStaticRepository();
    private CategoryRepository categoryRepository = new CategoryStaticRepository();
    @GetMapping("/")
    public String home(ModelMap modelMap
                       ){

        modelMap.put("gifs",repository.findAll());
        return "home";
    }
    @GetMapping("/categories")
    public String categories(ModelMap modelMap){
        modelMap.put("categories", categoryRepository.findAll());
        return "categories";
    }
    @GetMapping("/category/{id}")
    public String category(@PathVariable Integer id, ModelMap modelMap){
        modelMap.put("category", categoryRepository.getByID(id));
        modelMap.put("gifs",repository.findByCategoryID(id));
        return "category";
    }
    @GetMapping("/favorites")
    public String favorites(ModelMap modelMap){
                modelMap.put("gifs",
               repository.findFavorites());
      return "favorites";
    }

    @GetMapping("/gif/{gifname}")
    public String gif(@PathVariable String gifname, ModelMap modelMap){
        modelMap.put("gif",repository.findByName(gifname));
        return "gif-details";
    }

}
