package com.example.mall.mapper;

import com.example.mall.model.CmsSubjectProductRelation;
import com.example.mall.model.CmsSubjectProductRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsSubjectProductRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    long countByExample(CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByExample(CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insert(CmsSubjectProductRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insertSelective(CmsSubjectProductRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    List<CmsSubjectProductRelation> selectByExample(CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    CmsSubjectProductRelation selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExampleSelective(@Param("record") CmsSubjectProductRelation record, @Param("example") CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExample(@Param("record") CmsSubjectProductRelation record, @Param("example") CmsSubjectProductRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKeySelective(CmsSubjectProductRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_product_relation
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKey(CmsSubjectProductRelation record);
}