<template>
    <div>
        <header class="bar bar-nav">
            <h1 class='title'>{{pageData.name}}</h1>
        </header>

        <div class="content feedback">

            <div class="list-block">
                <div class="feedback-label">
                    <span style="color:red">&nbsp *</span> 类别信息：
                </div>

                <ul>
                    <!-- Text inputs -->
                    <li>
                        <div class="item-content">
                            <div class="item-media"><i class="icon icon-form-name"></i></div>
                            <div class="item-inner">
                                <div class="item-title label">类别名</div>
                                <div class="item-input">
                                    <input v-model="formInfo.skillCategoryName" type="text" placeholder="请输入类别名">
                                </div>
                            </div>
                        </div>
                    </li>

                    <li>
                        <div class="item-content">
                            <div class="item-media"><i class="icon icon-form-gender"></i></div>
                            <div class="item-inner">
                                <div class="item-title label">优先级</div>
                                <div class="item-input">
                                    <select v-model="formInfo.priority">
                                        <option>0</option>
                                        <option>1</option>
                                        <option>3</option>
                                        <option>4</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                    </li>

                </ul>
            </div>

            <!-- 描述 -->
            <div class="content-block">
                <div class="feedback-label">
                    <span style="color:red">*</span> {{pageData.name}}描述内容：
                </div>
                <div class="item-input">
                    <textarea v-model="formInfo.skillCategoryDesc" rows="7" placeholder="请输入技术类别描述，不得少于五个字"></textarea>
                </div>
            </div>

            <!-- button -->
            <div class="content-block">
                <div class="row">
                    <div class="col-50"><a href="#" @click="cancel" class="button button-big button-fill button-danger">取消</a></div>
                    <div class="col-50"><a href="#" @click="add()" class="button button-big button-fill button-success">提交</a></div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import axios from 'axios'
    export default {
        name: "WorkerCategory",
        mounted: function(){
        },

        data() {
            return {
                pageData: {
                    name: '技术类别',
                },
                formInfo: {
                    skillCategoryName: '泥工',
                    priority: 3,
                    skillCategoryDesc: "456456"
                }

            }
        },

        methods: {
            add() {
                axios({
                    method: 'post',
                    url: '/info/addSkillCategory',
                    data: this.formInfo
                }).then(resp => {
                    var data = resp.data;
                    $.toast(data.msg);
                })
            },
            cancel() {
                this.formInfo = {
                    priority: 0
                };
            }
        }
    }
</script>

<style scoped>
    @import "../../assets/css/form.css";
</style>
