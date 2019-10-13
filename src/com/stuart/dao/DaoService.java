package com.stuart.dao;

import java.util.List;

/**
 *
 * @author 
 * Kafka Febianto Agiharta - 1772012
 * Jonathan Bernad - 1772004
 * @param <T>
 */
public interface DaoService <T> {
    int addData(T object);
    int updateData(T object);
    int removeData(T object);
    List<T> getAllData();
}
