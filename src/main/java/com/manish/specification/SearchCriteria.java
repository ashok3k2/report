package com.manish.specification;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by ashok.maurya on 27/10/18.
 */
@Data
@AllArgsConstructor
public class SearchCriteria {

    private String key;
    private String operation;
    private Object value;

}