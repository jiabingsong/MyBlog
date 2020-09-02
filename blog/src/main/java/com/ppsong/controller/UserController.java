package com.ppsong.controller;

import com.ppsong.domain.JsonResult;
import com.ppsong.domain.User;
import com.ppsong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: PPsong
 * @Description:
 * @Data: Created in 14:22 2020/6/6
 * @Modified By:
 */
@RestController
public class UserController{
    @Autowired
    private UserService userService;

    /**
     * 通过Id查询
     *
     * @param id
     * @return
     */
    @GetMapping(value = "user/query/{id}")
    public User getUserById(@PathVariable(value = "id") Integer id) {
        try {
            User user = userService.getUserById(id);
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 查询全部
     *
     * @return
     */
    @RequestMapping(value = "user/query", method = RequestMethod.GET)
    public List<User> getUserList() {
        try {
            List<User> users = userService.getUserList();
            return users;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @param user
     * @return
     */
    @RequestMapping(value = "user/add", method = RequestMethod.POST)
    public ResponseEntity<JsonResult> add(@RequestBody User user) {
        JsonResult r = new JsonResult();
        try {
            int orderId = userService.add(user);
            if (orderId < 0) {
                r.setResult(orderId);
                r.setStatus("failed");
            } else {
                r.setResult(orderId);
                r.setStatus("ok");
            }
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }

    /**
     * 删
     * @param id
     * @return
     */
    @RequestMapping(value = "user/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<JsonResult> delete(@PathVariable(value = "id") Integer id) {
        JsonResult r = new JsonResult();
        try {
            int delId = userService.delete(id);
            if (delId < 0) {
                r.setResult(delId);
                r.setStatus("failed");
            } else {
                r.setResult(delId);
                r.setStatus("ok");
            }
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }
    @RequestMapping(value = "user/update/{id}",method = RequestMethod.PUT)
    public ResponseEntity<JsonResult> update(@PathVariable(value = "id") Integer id,
                                             @RequestBody User user) {
        JsonResult r = new JsonResult();
        try {
            int ret = userService.update(id, user);
            if (ret < 0) {
                r.setResult(ret);
                r.setStatus("fail");
            } else {
                r.setResult(ret);
                r.setStatus("ok");
            }
        } catch (Exception e) {
            r.setResult(e.getClass().getName()+":"+e.getMessage());
            r.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }

}
