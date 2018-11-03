package com.manish.repository;

import com.manish.model.Order;
import com.manish.specification.SearchCriteria;

import java.util.List;

/**
 * Created by ashok.maurya on 27/10/18.
 */
public interface OrderDAO {

    List<Order> searchOrders(List<SearchCriteria> params);


}
