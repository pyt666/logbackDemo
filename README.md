# 根据官方文档配置logback配置文件

## statusListener logback状态监听

```xml

<configuration debug="true"></configuration>
```

等同于

```xml

<statusListener class="ch.qos.logback.core.status.OnConsoleStatusListener"/>
```

## scan 配置文件自动扫描

配置配置文件自动扫描，默认每分钟扫描一次变化

```xml

<configuration scan="true"></configuration>

```

指定扫描周期 

周期单位：milliseconds, seconds, minutes, hours

```xml

<configuration scan="true" scanPeriod="30 seconds"></configuration>

```



