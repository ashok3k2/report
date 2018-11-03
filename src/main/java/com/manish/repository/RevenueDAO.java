package com.manish.repository;

import com.manish.model.Revenue;
import com.manish.specification.SearchCriteria;

import java.util.List;

/**
 * Created by ashok.maurya on 03/11/18.
 */
public interface RevenueDAO {

    List<Revenue> searchOrders(List<SearchCriteria> params);
}
