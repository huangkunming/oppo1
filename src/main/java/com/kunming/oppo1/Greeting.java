package com.kunming.oppo1;


import org.springframework.stereotype.Component;


//泛指各种组件，就是说当我们的类不属于各种归类的时候,把普通pojo实例化到spring容器中
//不属于@Controller、@Services等的时候），我们就可以使用@Component来标注这个类。
//@controller 控制器（注入服务）,用于标注控制层，相当于struts中的action层
//@repository（实现dao访问）,用于标注数据访问层，也可以说用于标注数据访问组件，即DAO组件.
//@service 服务（注入dao）,用于标注服务层，主要用来进行业务的逻辑处理

//被@controller 、@service、@repository 、@component 注解的类，都会把这些类纳入进spring容器中进行管理

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
