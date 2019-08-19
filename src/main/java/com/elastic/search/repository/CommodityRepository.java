package com.elastic.search.repository;

import com.elastic.search.entity.Commodity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: zhouheng
 * @Created: with IntelliJ IDEA.
 * @Description:
 * @Date: 2019-08-14
 * @Time: 22:40
 */
@Repository
public interface CommodityRepository extends ElasticsearchRepository<Commodity, String> {


}
