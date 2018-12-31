package cn.zqtaotao.monster.decoration_server.web;

import cn.zqtaotao.monster.decoration_server.model.entity.SkillCategoryEntity;
import cn.zqtaotao.monster.decoration_server.model.entity.TemplateEntity;
import cn.zqtaotao.monster.decoration_server.model.entity.WorkerCategoryEntity;
import cn.zqtaotao.monster.decoration_server.model.entity.WorkerEntity;
import cn.zqtaotao.monster.decoration_server.model.more.Resp;
import cn.zqtaotao.monster.decoration_server.service.SkillCategoryService;
import cn.zqtaotao.monster.decoration_server.service.TemplateService;
import cn.zqtaotao.monster.decoration_server.service.WorkerCategoryService;
import cn.zqtaotao.monster.decoration_server.service.WorkerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: zqtao
 * @description:
 * @version: 1.0
 */
@RestController
@Slf4j
@RequestMapping(value = "/info")
public class InfoInputController {

    private final WorkerCategoryService workerCategoryService;

    private final SkillCategoryService skillCategoryService;

    private final TemplateService templateService;

    private final WorkerService workerService;

    @Autowired
    public InfoInputController(WorkerCategoryService workerCategoryService,
                               SkillCategoryService skillCategoryService,
                               TemplateService templateService, WorkerService workerService) {
        this.workerCategoryService = workerCategoryService;
        this.skillCategoryService = skillCategoryService;
        this.templateService = templateService;
        this.workerService = workerService;
    }

    @RequestMapping(value = "/addWorker")
    public Resp addWorker(@RequestBody WorkerEntity entity){
        log.info("Controller addWorker");

        int effNum = workerService.addWorker(entity);
        if (effNum == 0) return Resp.error("failed");
        return Resp.ok("success");
    }

    @RequestMapping(value = "/addTemplate")
    public Resp addTemplate(@RequestBody TemplateEntity entity){
        log.info("Controller addTemplate");

        int effNum = templateService.addTemplate(entity);
        if (effNum == 0) return Resp.error("failed");
        return Resp.ok("success");
    }

    @RequestMapping(value = "/addWorkerCategory")
    public Resp addWorkerCategory(@RequestBody WorkerCategoryEntity entity){
        log.info("Controller addWorkerCategory");

        int effNum = workerCategoryService.addWorkerCategory(entity);
        if (effNum == 0) return Resp.error("failed");
        return Resp.ok("success");
    }

    @RequestMapping(value = "/addSkillCategory")
    public Resp addSkillCategory(@RequestBody SkillCategoryEntity entity){
        log.info("Controller addSkillCategory");

        int effNum = skillCategoryService.addSkillCategory(entity);
        if (effNum == 0) return Resp.error("failed");
        return Resp.ok("success");
    }

}
