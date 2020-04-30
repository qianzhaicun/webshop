package com.wego.webstore.validator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.wego.webstore.exception.ProductNotFoundException;


public class CategoryValidator implements ConstraintValidator<Category, String> {
	
	private List<String> allowedCategories;
	public void initialize(Category constraintAnnotation) {
// intentionally left blank; this is the place toinitialize the constraint annotation for any sensibledefault values.
	}
	
	CategoryValidator(){
		allowedCategories = new ArrayList<>(Arrays.asList("Smart Phone","Laptop","Tablet"));
		
	}
	
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean bool ;
		try {
			bool = allowedCategories.contains(value);
		} catch (ProductNotFoundException e) {
			return false;
		}
		if (bool) {
			return true;
		}
		return false;
	}
}