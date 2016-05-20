package club.crazypenguin.mapper;

import java.util.List;

import club.crazypenguin.entity.UserFormMap;
import club.crazypenguin.mapper.base.BaseMapper;


public interface UserMapper extends BaseMapper {

	public List<UserFormMap> findUserPage(UserFormMap userFormMap);
	
}
