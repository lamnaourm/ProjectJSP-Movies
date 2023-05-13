package com.ismo.crjj.dao;

import java.util.List;

public interface IDaoMovie<T> {

	List<T> getAll();
	T getOne(int id);
	
}
