package pl.akademiakodu.gify.repository;

import pl.akademiakodu.gify.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryStaticRepository implements CategoryRepository {
    static List<Category> categories = new ArrayList<>();
    static int counter = 0;

    @Override
    public int addCategory(String categoryName) {
        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(i).getName().equals(categoryName))
                return categories.get(i).getId();
        }
        categories.add(new Category(counter, categoryName));
        return counter++;
    }

    @Override
    public Category getByID(int id) {
        for (Category category : categories) {
            if (category.getId()==id)
                return category;
        }
        return null;
    }

    @Override
    public List<Category> findAll() {
        List<Category> result = new ArrayList<>(categories);
        return result;
    }

}