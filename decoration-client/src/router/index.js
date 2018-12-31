import Vue from 'vue'
import Router from 'vue-router'
import Home from "../view/Home";
import Me from "../view/user/Me";
import SkillCategory from "../view/info/SkillCategory";
import WorkerCategory from "../view/info/WorkerCategory";
import Worker from "../view/info/Worker";
import Template from "../view/info/Template";
import ManagerInfo from "../view/manager/ManagerInfo";
import TemplateImgs from "../view/info/TemplateImgs";

Vue.use(Router);

export default new Router({
    routes: [
        {
            path: '/',
            name: 'home',
            component: Home
        },
        {
            path: '/me',
            name: 'me',
            component: Me
        },
        {
            path: '/managerInfo',
            name: 'ManagerInfo',
            component: ManagerInfo
        },
        {
            path: '/info/template',
            name: 'Template',
            component: Template
        },
        {
            path: '/info/templateImgs',
            name: 'TemplateImgs',
            component: TemplateImgs
        },
        {
            path: '/info/skillCategory',
            name: 'SkillCategory',
            component: SkillCategory
        },
        {
            path: '/info/workerCategory',
            name: 'WorkerCategory',
            component: WorkerCategory
        },
        {
            path: '/info/worker',
            name: 'Worker',
            component: Worker
        },

    ]
})
