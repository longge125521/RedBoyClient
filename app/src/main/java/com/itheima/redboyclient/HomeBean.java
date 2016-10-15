package com.itheima.redboyclient;

import java.util.List;

/**
 * Created by wjL on 2016/10/14 0014.
 */

public class HomeBean {



    public String response;
    /**
     * id : 130
     * pic : /images/home/topic1.jpg
     * title : 活动
     */

    public List<HomeTopicBean> homeTopic;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public List<HomeTopicBean> getHomeTopic() {
        return homeTopic;
    }

    public void setHomeTopic(List<HomeTopicBean> homeTopic) {
        this.homeTopic = homeTopic;
    }

    public static class HomeTopicBean {
        private int id;
        private String pic;
        private String title;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
