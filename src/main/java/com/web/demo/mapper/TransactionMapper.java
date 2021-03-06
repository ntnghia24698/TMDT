package com.web.demo.mapper;

import com.web.demo.model.Transaction;
import com.web.demo.model.TransactionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransactionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sat Mar 23 15:08:44 ICT 2019
     */
    long countByExample(TransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sat Mar 23 15:08:44 ICT 2019
     */
    int deleteByExample(TransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sat Mar 23 15:08:44 ICT 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sat Mar 23 15:08:44 ICT 2019
     */
    int insert(Transaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sat Mar 23 15:08:44 ICT 2019
     */
    int insertSelective(Transaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sat Mar 23 15:08:44 ICT 2019
     */
    List<Transaction> selectByExample(TransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sat Mar 23 15:08:44 ICT 2019
     */
    Transaction selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sat Mar 23 15:08:44 ICT 2019
     */
    int updateByExampleSelective(@Param("record") Transaction record, @Param("example") TransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sat Mar 23 15:08:44 ICT 2019
     */
    int updateByExample(@Param("record") Transaction record, @Param("example") TransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sat Mar 23 15:08:44 ICT 2019
     */
    int updateByPrimaryKeySelective(Transaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sat Mar 23 15:08:44 ICT 2019
     */
    int updateByPrimaryKey(Transaction record);
}