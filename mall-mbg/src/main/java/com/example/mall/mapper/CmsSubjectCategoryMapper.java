package com.example.mall.mapper;

import com.example.mall.model.CmsSubjectCategory;
import com.example.mall.model.CmsSubjectCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsSubjectCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    long countByExample(CmsSubjectCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByExample(CmsSubjectCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insert(CmsSubjectCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int insertSelective(CmsSubjectCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    List<CmsSubjectCategory> selectByExample(CmsSubjectCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    CmsSubjectCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExampleSelective(@Param("record") CmsSubjectCategory record, @Param("example") CmsSubjectCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByExample(@Param("record") CmsSubjectCategory record, @Param("example") CmsSubjectCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKeySelective(CmsSubjectCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_subject_category
     *
     * @mbg.generated Tue Sep 21 22:51:24 CST 2021
     */
    int updateByPrimaryKey(CmsSubjectCategory record);
}