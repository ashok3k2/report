package com.manish.repository.impl;

import com.manish.model.Revenue;
import com.manish.repository.RevenueDAO;
import com.manish.specification.SearchCriteria;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by ashok.maurya on 03/11/18.
 */
@Repository
public class RevenueDAOImpl implements RevenueDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Revenue> searchOrders(List<SearchCriteria> params) {
        final CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        final CriteriaQuery<Revenue> query = builder.createQuery(Revenue.class);
        final Root r = query.from(Revenue.class);

        Predicate predicate = builder.conjunction();

        for (final SearchCriteria param : params) {
            if (param.getOperation().equalsIgnoreCase(">")) {
                predicate = builder.and(predicate, builder.greaterThanOrEqualTo(r.get(param.getKey()), param.getValue().toString()));
            } else if (param.getOperation().equalsIgnoreCase("=")){
                predicate = builder.and(predicate,builder.equal(r.get(param.getKey()),param.getValue().toString()));
            } else if (param.getOperation().equalsIgnoreCase("<")) {
                predicate = builder.and(predicate, builder.lessThanOrEqualTo(r.get(param.getKey()), param.getValue().toString()));
            } else if (param.getOperation().equalsIgnoreCase(":")) {
                if (r.get(param.getKey()).getJavaType() == String.class) {
                    predicate = builder.and(predicate, builder.like(r.get(param.getKey()), "%" + param.getValue() + "%"));
                } else {
                    predicate = builder.and(predicate, builder.equal(r.get(param.getKey()), param.getValue()));
                }
            }
        }

        query.where(predicate);

        return entityManager.createQuery(query).getResultList();
    }
}
