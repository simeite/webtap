package com.webtap.web.api;

import com.webtap.comm.Const;
import com.webtap.comm.aop.LoggerManage;
import com.webtap.domain.entity.Organization;
import com.webtap.domain.entity.User;
import com.webtap.domain.entity.Role;
import com.webtap.domain.result.ExceptionMsg;
import com.webtap.domain.result.Response;
import com.webtap.service.OrganizationService;
import com.webtap.service.RoleService;
import com.webtap.service.UserService;
import com.webtap.utils.DateUtils;
import com.webtap.web.BaseController;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RolesController extends BaseController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/roles", method = RequestMethod.GET)
    public ResponseEntity<List<Role>> getRoles() {
        List<Role> roles = roleService.findAll();
        if (roles.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Role>>(roles, HttpStatus.OK);
    }

    @RequestMapping(value = "/roles/{id}", method = RequestMethod.GET)
    public ResponseEntity<Role> getRoleById(@PathVariable(value = "id") Long id) {
        Role role = roleService.getById(id);
        if (role == null) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<Role>(role, HttpStatus.OK);
    }

    @RequestMapping(value = "/roles/save", method = RequestMethod.POST)
    @LoggerManage(description = "save user")
    public Response saveRole(@RequestBody Role role) {
        try {
            roleService.update(role);
            logger.info("更新成功");
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
        return result(ExceptionMsg.SUCCESS);
    }

    @RequestMapping(value = "/roles/add", method = RequestMethod.POST)
    @LoggerManage(description = "add user")
    public Response addRole(@RequestBody Role role) {
        try {
            roleService.save(role);
            logger.info("新增成功");
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
        return result(ExceptionMsg.SUCCESS);
    }

    @RequestMapping(value = "/roles/remove/{id}", method = RequestMethod.DELETE)
    public Response deleteRole(@PathVariable(value = "id") Long id) {
        try {
            roleService.delete(id);
            logger.info("删除成功");
        } catch (Exception ex) {
            logger.error(ex.getMessage());
        }
        return result(ExceptionMsg.SUCCESS);
    }

    @RequestMapping(value = "/test",  method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String test() {

        return "test";
    }
}
