package com.phuongnt.dao;

import java.io.Serializable;
import java.util.List;

public interface InterfaceDao<T> {

	Serializable create(T entity);
	T readOne(Serializable id);
	List<T> readAll();
	void update (T entity);
	void delete (Serializable id);
	List<T> likeOperator(String fieldName, String value);
	<V> List<T> equalOperator(String field, V v);
	<Y extends Comparable<? super Y>> List<T> greaterThanOperator(String field, Y value);
	<Y extends Comparable<? super Y>> List<T> lessThanOperator(String field, Y value);
	
}
