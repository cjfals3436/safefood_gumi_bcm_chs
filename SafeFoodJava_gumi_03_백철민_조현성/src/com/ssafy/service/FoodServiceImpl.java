package com.ssafy.service;

import java.util.ArrayList;
import java.util.List;

import com.ssafy.dao.FoodDao;
import com.ssafy.dao.FoodDaoImpl;
import com.ssafy.vo.Food;
import com.ssafy.vo.FoodPageBean;

public class FoodServiceImpl implements FoodService{
	private FoodDao dao;
	private String[] allergys={"대두","땅콩","우유","게","새우","참치","연어","쑥","소고기","닭고기","돼지고기","복숭아","민들레","계란흰자","원유"};

	public FoodServiceImpl() {
		 dao =new FoodDaoImpl();
	}
	public List<Food> searchAll(FoodPageBean bean) {
		return dao.searchAll(bean);
	}
	public Food search(int code) {

		Food food = dao.search(code);
		
		ArrayList<String> list = new ArrayList<>();
		String[] str = food.getMaterial().split(",");
		for(String allergy : allergys) {
			for(String material : str) {
				if(material.contains(allergy) && !list.contains(allergy)) {
					list.add(allergy);
				}
			}
		}
		String s="";
		for(String ss : list) {
			s += ss + " ";
		}
		food.setAllergy(s);
		return food;
	}
	public List<Food> searchBest() {
		return dao.searchBest();
	}
	public List<Food> searchBestIndex() {
		return dao.searchBestIndex();
	}
}
