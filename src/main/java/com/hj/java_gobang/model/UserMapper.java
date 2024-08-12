package com.hj.java_gobang.model;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    //插入数据用于注册
    void insert(User user);
    //根据用户名,来查询用户的详细信息.
    User selectByName(String username);

    //总比赛场数+1,获胜场数 + 1,天梯分数+30
    void userWin(int userId);

    //总比赛场数+1,获胜场数不变,天梯分数-30
    void userLose(int userId);
}
