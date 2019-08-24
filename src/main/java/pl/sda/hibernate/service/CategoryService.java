package pl.sda.hibernate.service;

import pl.sda.hibernate.dao.CategoryDAO;
import pl.sda.hibernate.entity.Category;

public class CategoryService {

    private CategoryDAO categoryDAO;

    public CategoryService(){
        categoryDAO = new CategoryDAO();
    }

    public void save(Category category){
        //walidacja
        categoryDAO.openSession();
        categoryDAO.save(category);
        categoryDAO.closeCurrentSession();
    }


}
