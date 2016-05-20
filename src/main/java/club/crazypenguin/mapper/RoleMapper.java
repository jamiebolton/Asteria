package club.crazypenguin.mapper;

import java.util.List;

import club.crazypenguin.entity.RoleFormMap;
import club.crazypenguin.mapper.base.BaseMapper;

public interface RoleMapper extends BaseMapper {
	public List<RoleFormMap> seletUserRole(RoleFormMap map);
	
	public void deleteById(RoleFormMap map);
}
