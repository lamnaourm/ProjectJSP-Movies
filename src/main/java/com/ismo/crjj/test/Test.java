package com.ismo.crjj.test;

import com.ismo.crjj.dao.DaoMovie;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DaoMovie d = new DaoMovie();
		
		System.out.println(d.getAll().size());

	}

}
