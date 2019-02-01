package com.ssafy.dao;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import com.ssafy.util.FoodNutritionSAXHandler;
import com.ssafy.util.FoodSAXHandler;
import com.ssafy.util.FoodSaxParser;
import com.ssafy.vo.Food;
import com.ssafy.vo.FoodPageBean;
import com.ssafy.vo.SafeFoodException;

public class FoodDaoImpl implements FoodDao{
	private List<Food> foods;
	public FoodDaoImpl() {
		foods = new LinkedList<Food>();
		loadData();
	}
	/**
	 * �떇�뭹 �쁺�뼇�븰 �젙蹂댁� �떇�뭹 �젙蹂대��  xml �뙆�씪�뿉�꽌 �씫�뼱�삩�떎.11111
	 */
	public void loadData() {
		
		//foods = //  FoodNutritionSaxPaser瑜� �씠�슜�븯�뿬 Food �뜲�씠�꽣�뱾�쓣 媛��졇�삩�떎
				
				
	}
	
	
	/**
	 * 寃��깋 議곌굔(key) 寃��깋 �떒�뼱(word)�뿉 �빐�떦�븯�뒗 �떇�뭹 �젙蹂�(Food)�쓽 媛쒖닔瑜� 諛섑솚. 
	 * web�뿉�꽌 援ы쁽�븷 �궡�슜. 
	 * web�뿉�꽌 �럹�씠吏� 泥섎━�떆 �븘�슂 
	 * @param bean  寃��깋 議곌굔怨� 寃��깋 �떒�뼱媛� �엳�뒗 媛앹껜
	 * @return 議고쉶�븳  �떇�뭹 媛쒖닔
	 */
	public int foodCount(FoodPageBean  bean){
		return foods.size();
	}
	
	/**
	 * 寃��깋 議곌굔(key) 寃��깋 �떒�뼱(word)�뿉 �빐�떦�븯�뒗 �떇�뭹 �젙蹂�(Food)瑜�  寃��깋�빐�꽌 諛섑솚.  
	 * @param bean  寃��깋 議곌굔怨� 寃��깋 �떒�뼱媛� �엳�뒗 媛앹껜
	 * @return 議고쉶�븳 �떇�뭹 紐⑸줉
	 */
	public List<Food> searchAll(FoodPageBean  bean){
		List<Food> finds = new LinkedList<Food>();
		if(bean !=null) {
			String key = bean.getKey();
			String word = bean.getWord();
			if(!key.equals("all") && word!=null && !word.trim().equals("")) {
				finds = new LinkedList<Food>();
				if(key.equals("name")) {
					for (Food food : foods) {
						if(food.getName().contains(word)) {
							finds.add(food);
						}
					}
				}

				
				
				//�젣議곗궗 寃��깋  援ы쁽
				
				
				// �썝�옱猷� 寃��깋 援ы쁽
				
				
				
				
				
				
				
			}else {
				finds = foods;
			}
		}else {
			finds = foods;
		}
		return finds;
	}
	
	/**
	 * �떇�뭹 肄붾뱶�뿉 �빐�떦�븯�뒗 �떇�뭹�젙蹂대�� 寃��깋�빐�꽌 諛섑솚. 
	 * @param code	寃��깋�븷 �떇�뭹 肄붾뱶
	 * @return	�떇�뭹 肄붾뱶�뿉 �빐�떦�븯�뒗 �떇�뭹 �젙蹂�, �뾾�쑝硫� null�씠 由ы꽩�맖
	 */
	public Food search(int code) {
		
		
		
		// 肄붾뱶�뿉 留욌뒗 �떇�뭹 寃��깋�븯�뿬 由ы꽩
		
		
		return null;
	}

	/**
	 * 媛��옣 留롮씠 寃��깋�븳 Food  �젙蹂� 由ы꽩�븯湲� 
	 * web�뿉�꽌 援ы쁽�븷 �궡�슜.  
	 * @return
	 */
	public List<Food> searchBest() {
		return null;
	}
	
	public List<Food> searchBestIndex() {
		return null;
	}
	
	public static void main(String[] args) {
		FoodDaoImpl dao = new FoodDaoImpl();
		dao.loadData();
		System.out.println(dao.search(1));
		System.out.println("===========================material濡� 寃��깋=================================");
		print(dao.searchAll(new FoodPageBean("material", "媛먯옄�쟾遺�", null, 0)));
		System.out.println("===========================maker濡� 寃��깋=================================");
		print(dao.searchAll(new FoodPageBean("maker", "鍮숆렇�젅", null, 0)));
		System.out.println("===========================name�쑝濡� 寃��깋=================================");
		print(dao.searchAll(new FoodPageBean("name", "�씪硫�", null, 0)));
		System.out.println("============================================================");
		print(dao.searchAll(null));
		System.out.println("============================================================");
	}
	
	public static void print(List<Food> foods) {
		for (Food food : foods) {
			System.out.println(food);
		}
	}
}
