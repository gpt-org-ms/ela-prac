package com.ohgiraffers.elaprac.controller;

import com.ohgiraffers.elaprac.dto.MenuDTO;
import com.ohgiraffers.elaprac.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

    @GetMapping("health")
    public String healthCheck() {
        return "fine!@#@$@#";
    }

    @GetMapping("menus/{menuCode}")
    public MenuDTO findMenuByMenuCode(@PathVariable("menuCode") int menuCode) {

        MenuDTO menu = menuService.findMenuByMenuCode(menuCode);

        return menu;
    }
}
