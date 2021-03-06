package com.dbumama.market.service.api;

import com.jfinal.plugin.activerecord.Page;
import com.dbumama.market.model.WeappAudit;
import io.jboot.db.model.Columns;

import java.util.List;

public interface WeappAuditService  {

    /**
     * find model by primary key
     *
     * @param id
     * @return
     */
    public WeappAudit findById(Object id);


    /**
     * find all model
     *
     * @return all <WeappAudit
     */
    public List<WeappAudit> findAll();


    /**
     * delete model by primary key
     *
     * @param id
     * @return success
     */
    public boolean deleteById(Object id);


    /**
     * delete model
     *
     * @param model
     * @return
     */
    public boolean delete(WeappAudit model);


    /**
     * save model to database
     *
     * @param model
     * @return id value if save success
     */
    public Object save(WeappAudit model);


    /**
     * save or update model
     *
     * @param model
     * @return id value if save or update success
     */
    public Object saveOrUpdate(WeappAudit model);


    /**
     * update data model
     *
     * @param model
     * @return
     */
    public boolean update(WeappAudit model);


    /**
     * page query
     *
     * @param page
     * @param pageSize
     * @return page data
     */
    public Page<WeappAudit> paginate(int page, int pageSize);


    /**
     * page query by columns
     *
     * @param page
     * @param pageSize
     * @param columns
     * @return page data
     */
    public Page<WeappAudit> paginateByColumns(int page, int pageSize, Columns columns);


    /**
     * page query by columns
     *
     * @param page
     * @param pageSize
     * @param columns
     * @param orderBy
     * @return page data
     */
    public Page<WeappAudit> paginateByColumns(int page, int pageSize, Columns columns, String orderBy);


}