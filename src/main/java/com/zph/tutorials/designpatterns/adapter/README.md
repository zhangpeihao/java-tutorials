# 适配器模式（Adapter）

将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。

## Demo案例

我们定义了一个`ICar`接口，这个接口定义了汽车的`run`方法。我们认为，所有汽车都可以开得飞快。

但是，某一天，我们需要把拖拉机也作为汽车来处理。可是拖拉机只能慢慢地爬，无法提供`run`方法。

这时，我们可以选择为拖拉机也增加`run`方法来实现`ICar`接口。但是，这破坏了拖拉机类的正确性。拖拉机根本没办法开得飞快。

我们也可以选择创建一个拖拉机类的子类，并提供`run`方法来实现`ICar`接口。这样可以避免破坏拖拉机类的正确性。
但是这个子类除了`ICar`接口，还对外暴露了拖拉机类的接口，使得这个子类的目的性不明确。

使用适配器模式，将拖拉机类封装起来，对外只提供需要的`ICar`接口，这样既能避免对拖拉机类的侵入，也不会对外暴露拖拉机类的接口。
因为没有暴露其他方法，调用方在使用`TractorAdapter`适配器时，能够很明确地将它作为一个普通`ICar`实现类，而不会有其他迷惑。

## Dubbo中Adapter的使用案例 - LoggerAdapter

Dubbo定义了自己的`Logger`接口，接口提供了`trace`, `debug`, 'info', 'warn', 'error'等级别的日志输出功能。
Dubbo提供了基于`log4j`, `slf4j`, `jdk`, `jcl`几种日志输出库的`Logger`接口实现类。
这些实现类实际就是适配器，封装了各种日志输出库的日志实例，并根据各种输出库的API提供`Logger`接口需要的方法。
例如：

```
public class Log4jLogger implements Logger {

	private static final String FQCN = FailsafeLogger.class.getName();

	private final org.apache.log4j.Logger logger;

	public Log4jLogger(org.apache.log4j.Logger logger) {
		this.logger = logger;
	}

	public void trace(String msg) {
		logger.log(FQCN, Level.TRACE, msg, null);
	}

	public void trace(Throwable e) {
		logger.log(FQCN, Level.TRACE, e == null ? null : e.getMessage(), e);
	}

	// ...
}
```

同样，构造这些`Logger`实例的Factory工厂类也各不相同。
Dubbo为每一种`Logger`实现提供了对应的工厂类的适配。
这种工厂类的适配与实例类的适配同样实现了接口的统一，但是工厂类的适配并没有封装实例，或者说，工厂类的适配不是针对特定实例的封装，而是针对一组API的封装。
例如：

```
public class Slf4jLoggerAdapter implements LoggerAdapter {

	public Logger getLogger(String key) {
		return new Slf4jLogger(org.slf4j.LoggerFactory.getLogger(key));
	}

    public Logger getLogger(Class<?> key) {
        return new Slf4jLogger(org.slf4j.LoggerFactory.getLogger(key));
    }

    private Level level;

    private File file;

    public void setLevel(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

}
```
