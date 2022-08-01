package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.CategoryBean;
import com.bean.SubCategoryBean;

@Repository
public class SubCategoryDao {

	@Autowired
	JdbcTemplate stmt;
	
	public void addSubCategory(SubCategoryBean subcategoryBean) {
		stmt.update("insert into subcategory(categoryid,subcategoryname,userid) values(?,?,?)", subcategoryBean.getCategoryId(),subcategoryBean.getSubcategoryName(),
		subcategoryBean.getUserId());
	}
}
