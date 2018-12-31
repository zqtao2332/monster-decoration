<template>
    <div>
        <header class="bar bar-nav">
            <h1 class='title'>{{pageData.name}}</h1>
        </header>
        <div class="content">
            <div class="content-block">
                <p><a href="#" class="button"><router-link to="/info/template">工程模板</router-link></a></p>
                <p><a href="#" class="button"><router-link to="/info/templateImgs">工程模板图片</router-link></a></p>
                <p><a href="#" class="button"><router-link to="/info/skillCategory">技术类别</router-link></a></p>
                <p><a href="#" class="button"><router-link to="/info/workerCategory">工人类别</router-link></a></p>
                <p><a href="#" class="button"><router-link to="/info/worker">工人信息</router-link></a></p>
            </div>

        </div>
    </div>
</template>

<script>
    export default {
        name: "ManagerInfo",
        mounted: function(){
        },

        data() {
            return {
                pageData: {
                    name: '信息管理',
                },
                formInfo: {
                    workerCategoryName: '泥工',
                    priority: 3,
                    workerCategoryDesc: ""
                }

            }
        },
    }
</script>

<style scoped>

</style>
