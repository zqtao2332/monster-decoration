<template>
    <div class="page-group">
        <div class="page page-current">
            <!-- 工具栏 -->
            <nav class="bar bar-tab">

                <a class="tab-item external active" href="#">
                    <span class="icon icon-home"></span>
                    <span class="tab-label"><router-link to="/">首页</router-link></span>
                </a>

                <a class="tab-item external" href="#">
                    <span class="icon icon-me"></span>
                    <span class="tab-label"><router-link to="/managerInfo">管理</router-link></span>
                </a>

                <!--<a class="tab-item external" href="#">-->
                    <!--<span class="icon icon-me"></span>-->
                    <!--<span class="tab-label"><router-link to="/template">工程模板</router-link></span>-->
                <!--</a>-->

                <!--<a class="tab-item external" href="#">-->
                    <!--<span class="icon icon-me"></span>-->
                    <!--<span class="tab-label"><router-link to="/skillCategory">技术类别</router-link></span>-->
                <!--</a>-->

                <!--<a class="tab-item external" href="#">-->
                    <!--<span class="icon icon-me"></span>-->
                    <!--<span class="tab-label"><router-link to="/workerCategory">工人类别</router-link></span>-->
                <!--</a>-->

            </nav>
            <router-view></router-view>
        </div>
    </div>
</template>

<script>
    export default {
        name: 'App',
        components: {},
        data() {
            return {
                isActive: true
            }
        }
    }

</script>

<style>
    #app {
        font-family: 'Avenir', Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        text-align: center;
        color: #2c3e50;
        margin-top: 60px;
    }
</style>
