package pl.akademiakodu.gify.repository;

import pl.akademiakodu.gify.model.Category;

import java.util.List;

public interface CategoryRepository {
    int addCategory(String categoryName);
    Category getByID(int id);
    List<Category> findAll();
}
