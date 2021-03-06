package com.moving.admin.dao.sys;

import com.moving.admin.entity.sys.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface PermissionDao extends JpaRepository<Permission, Long>, JpaSpecificationExecutor<Permission> {
    List<Permission> findByIdIn(List<Long> permissionIdList);

    List<Permission> findByTypeAndStatusOrderBySortOrder(Integer type, Integer status);

    List<Permission> findByTitle(String title);

    List<Permission> findByParentIdOrderBySortOrder(Long parentId);

    List<Permission> findByLevelOrderBySortOrder(Integer level);

}
