package fun.dqgs.easycode.controller;

import fun.dqgs.easycode.entity.Items;
import fun.dqgs.easycode.service.ItemsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Items)表控制层
 *
 * @author makejava
 * @since 2019-06-28 14:55:13
 */
@RestController
@RequestMapping("items")
public class ItemsController {
    /**
     * 服务对象
     */
    @Resource
    private ItemsService itemsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Items selectOne(Integer id) {
        return this.itemsService.queryById(id);
    }

}