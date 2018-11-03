package com.manish.controller;

import com.manish.model.Order;
import com.manish.repository.OrderDAO;
import com.manish.specification.SearchCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ashok.maurya on 27/10/18.
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderDAO orderDAO;

//    @RequestMapping("/get/{id}")
//    public Order findById(@PathVariable(value = "id") Long id){
//        Optional<Order> optionalOrder = orderRepository.findById(id);
//        return optionalOrder.get();
//    }

    @RequestMapping(method = RequestMethod.GET,value = "/orders")
    @ResponseBody
    public List<Order> findByQuery(@RequestParam(value = "search") String searchTerms){
        List<SearchCriteria> searchCriteriaList = new ArrayList<>();

        if (searchTerms != null) {
            Pattern pattern = Pattern.compile("(\\w+?)(:|<|>|=)(\\w+?),");
            Matcher matcher = pattern.matcher(searchTerms + ",");
            while (matcher.find()) {
                searchCriteriaList.add(new SearchCriteria(matcher.group(1), matcher.group(2), matcher.group(3)));
            }
        }

        return orderDAO.searchOrders(searchCriteriaList);
    }


}
