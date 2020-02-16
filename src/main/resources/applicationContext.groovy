import me.freedom4live.medium.spring.guts.bean.impl.MySpringBeanImpl
import me.freedom4live.medium.spring.guts.context.ContextDisplayRunner

beans {
    mySpringBeanImp(MySpringBeanImpl) { bean ->
        bean.initMethod = "init"
        bean.destroyMethod = "preDestroy"
    }
    contextDisplayRunner(ContextDisplayRunner)
}
