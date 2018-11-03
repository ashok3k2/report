package com.manish.controller;

import com.manish.model.Revenue;
import com.manish.repository.RevenueDAO;
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
 * Created by ashok.maurya on 03/11/18.
 */
@RestController
@RequestMapping("/revenue")
public class RevenueController {

    @Autowired
    private RevenueDAO revenueDAO;

    @RequestMapping(method = RequestMethod.GET,value = "/revenues")
    @ResponseBody
    public List<Revenue> findByQuery(@RequestParam(value = "search") String searchTerms){
        List<SearchCriteria> searchCriteriaList = new ArrayList<>();
        if (searchTerms != null) {
            Pattern pattern = Pattern.compile("(\\w+?)(:|<|>|=)(\\w+?),");
            Matcher matcher = pattern.matcher(searchTerms + ",");
            while (matcher.find()) {
                searchCriteriaList.add(new SearchCriteria(matcher.group(1), matcher.group(2), matcher.group(3)));
            }
        }
        return revenueDAO.searchOrders(searchCriteriaList);
    }
}
