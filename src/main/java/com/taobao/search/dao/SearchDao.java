package com.taobao.search.dao;

import org.apache.solr.client.solrj.SolrQuery;

import com.taobao.search.pojo.SearchResult;

public interface SearchDao {

	SearchResult search(SolrQuery query) throws Exception;
}
