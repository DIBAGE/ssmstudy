

/**
 * @author : linchao
 * @date : 2017/7/7.
 * @description :
 */
package com.linchao.dao;

import com.linchao.po.UserPO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserPO record);

    int insertSelective(UserPO record);

    UserPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPO record);

    int updateByPrimaryKey(UserPO record);

    List<UserPO> getUserByPage(@Param("currentPage") int currentPage, @Param("pageSize") int pageSize);
}