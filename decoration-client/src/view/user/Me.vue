<template>
    <div>
        <header class="bar bar-nav">
            <h1 class='title'>个人中心</h1>
        </header>

        <div class="content">
            <div class="content-block">
                <div class="row">
                    <div class="col-50">
                        <a href="#"
                           class="button button-big button-fill button-danger">
                            <router-link to="/me/register">注册</router-link>
                        </a>

                    </div>
                </div>
            </div>

            <input type="text" id='picker'/>

        </div>


    </div>
</template>

<script>
    export default {
        name: "Me",
        mounted: function() {
            this.initpage();
        },
        methods: {
            initpage: function () {

                $("#picker").picker({
                    toolbarTemplate: '<header class="bar bar-nav">\
                      <button class="button button-link pull-left">按钮</button>\
                      <button class="button button-link pull-right close-picker">确定</button>\
                      <h1 class="title">标题</h1>\
                      </header>',
                                        cols: [
                                            {
                                                textAlign: 'center',
                                                values: ['iPhone 4', 'iPhone 4S', 'iPhone 5', 'iPhone 5S', 'iPhone 6', 'iPhone 6 Plus', 'iPad 2', 'iPad Retina', 'iPad Air', 'iPad mini', 'iPad mini 2', 'iPad mini 3']
                                            }
                                        ]
                                    });

            }
        }
    }

    $("#picker").picker({
        toolbarTemplate: '<header class="bar bar-nav">\
    <button class="button button-link pull-left">按钮</button>\
    <button class="button button-link pull-right close-picker">确定</button>\
    <h1 class="title">标题</h1>\
    </header>',
        cols: [
            {
                textAlign: 'center',
                values: ['iPhone 4', 'iPhone 4S', 'iPhone 5', 'iPhone 5S', 'iPhone 6', 'iPhone 6 Plus', 'iPad 2', 'iPad Retina', 'iPad Air', 'iPad mini', 'iPad mini 2', 'iPad mini 3']
            }
        ]
    });
</script>

<style scoped>

</style>
