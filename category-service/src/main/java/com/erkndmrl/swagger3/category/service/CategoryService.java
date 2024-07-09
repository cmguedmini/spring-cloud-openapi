package com.erkndmrl.swagger3.category.service;

import com.erkndmrl.swagger3.category.model.entity.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {


    public List<Category> getAllCategories() {

        List<Category> list = new ArrayList<>();
        Category cat1 = new Category("1", "name1");
        Category cat2 = new Category("2", "name2");
        list.add(cat1);
        list.add(cat2);
        return list;
    }

    public Category getCategoryById(String id) {
        return new Category("1", "name1");
    }


    public void deleteCategory(String id) {

    }


}
