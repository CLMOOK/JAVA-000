学习笔记

（待完善和补充）

### 串行GC:
```
java -XX:+UseSerialGC -Xms128m -Xmx128m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
java -XX:+UseSerialGC -Xms256m -Xmx256m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
java -XX:+UseSerialGC -Xms512m -Xmx512m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
java -XX:+UseSerialGC -Xms1024m -Xmx1024m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
java -XX:+UseSerialGC -Xms2048m -Xmx2048m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
```

最优为Xmx=512m时，年轻代gc次数和时间上都比较小，不会产生full gc, 没有OOM，创建的对象数也是最多的。


### 并行GC:
```
java -XX:+UseParallelGC -Xms128m -Xmx128m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
java -XX:+UseParallelGC -Xms256m -Xmx256m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
java -XX:+UseParallelGC -Xms512m -Xmx512m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
java -XX:+UseParallelGC -Xms1024m -Xmx1024m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
java -XX:+UseParallelGC -Xms2048m -Xmx2048m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
```

最优为Xmx1024m


### CMS GC:
```
java -XX:+UseConcMarkSweepGC -Xms128m -Xmx128m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
java -XX:+UseConcMarkSweepGC -Xms256m -Xmx256m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
java -XX:+UseConcMarkSweepGC -Xms512m -Xmx512m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
java -XX:+UseConcMarkSweepGC -Xms1024m -Xmx1024m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
java -XX:+UseConcMarkSweepGC -Xms2048m -Xmx2048m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
```

最优为Xmx2048m, 适合堆内存大的应用。

```
F:\eclipseWorkspace\jvm\src>java -XX:+UseConcMarkSweepGC -Xms2048m -Xmx2048m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis                                                                        
正在执行...                                                                                                                                                                                                            
2020-10-28T23:44:34.292+0800: [GC (Allocation Failure) 2020-10-28T23:44:34.294+0800: [ParNew: 272640K->34047K(306688K), 0.0776934 secs] 272640K->88320K(2063104K), 0.0811209 secs] [Times: user=0.13 sys=0.19, real
=0.08 secs]                                                                                                                                                                                                        
2020-10-28T23:44:34.528+0800: [GC (Allocation Failure) 2020-10-28T23:44:34.532+0800: [ParNew: 306687K->34047K(306688K), 0.1042159 secs] 360960K->172066K(2063104K), 0.1081672 secs] [Times: user=0.13 sys=0.23, rea
l=0.11 secs]                                                                                                                                                                                                       
2020-10-28T23:44:34.755+0800: [GC (Allocation Failure) 2020-10-28T23:44:34.758+0800: [ParNew: 306687K->34048K(306688K), 0.0844213 secs] 444706K->248612K(2063104K), 0.0884052 secs] [Times: user=0.30 sys=0.02, rea
l=0.09 secs]                                                                                                                                                                                                       
执行结束!共生成对象次数:3352                                                                                                                                                                                                  
Heap                                                                                                                                                                                                               
 par new generation   total 306688K, used 93360K [0x0000000080000000, 0x0000000094cc0000, 0x0000000094cc0000)                                                                                                      
  eden space 272640K,  21% used [0x0000000080000000, 0x00000000839ec048, 0x0000000090a40000)                                                                                                                       
  from space 34048K, 100% used [0x0000000092b80000, 0x0000000094cc0000, 0x0000000094cc0000)                                                                                                                        
  to   space 34048K,   0% used [0x0000000090a40000, 0x0000000090a40000, 0x0000000092b80000)                                                                                                                        
 concurrent mark-sweep generation total 1756416K, used 214564K [0x0000000094cc0000, 0x0000000100000000, 0x0000000100000000)                                                                                        
 Metaspace       used 2724K, capacity 4486K, committed 4864K, reserved 1056768K                                                                                                                                    
  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K                                                                                                                                       
```


### G1 GC:
```
java -XX:+UseG1GC -Xms128m -Xmx128m -XX:+PrintGC -XX:+PrintGCDateStamps week2.GCLogAnalysis
java -XX:+UseG1GC -Xms256m -Xmx256m -XX:+PrintGC -XX:+PrintGCDateStamps week2.GCLogAnalysis
java -XX:+UseG1GC -Xms512m -Xmx512m -XX:+PrintGC -XX:+PrintGCDateStamps week2.GCLogAnalysis
java -XX:+UseG1GC -Xms1024m -Xmx1024m -XX:+PrintGC -XX:+PrintGCDateStamps week2.GCLogAnalysis
java -XX:+UseG1GC -Xms2048m -Xmx2048m -XX:+PrintGC -XX:+PrintGCDateStamps week2.GCLogAnalysis
```

最优为Xmx2048m，适合堆内存大的应用，性能较CMS GC 要优秀。

```
F:\eclipseWorkspace\jvm\src>java -XX:+UseG1GC -Xms2048m -Xmx2048m -XX:+PrintGC -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
2020-10-28T23:45:52.447+0800: [GC pause (G1 Evacuation Pause) (young) 133M->47M(2048M), 0.0276629 secs]
2020-10-28T23:45:52.551+0800: [GC pause (G1 Evacuation Pause) (young) 156M->88M(2048M), 0.0272517 secs]
2020-10-28T23:45:52.663+0800: [GC pause (G1 Evacuation Pause) (young) 201M->119M(2048M), 0.0159066 secs]
2020-10-28T23:45:52.738+0800: [GC pause (G1 Evacuation Pause) (young) 231M->152M(2048M), 0.0190583 secs]
2020-10-28T23:45:52.815+0800: [GC pause (G1 Evacuation Pause) (young) 267M->190M(2048M), 0.0240079 secs]
2020-10-28T23:45:52.895+0800: [GC pause (G1 Evacuation Pause) (young) 302M->224M(2048M), 0.0199187 secs]
2020-10-28T23:45:52.971+0800: [GC pause (G1 Evacuation Pause) (young) 335M->259M(2048M), 0.0185543 secs]
2020-10-28T23:45:53.101+0800: [GC pause (G1 Evacuation Pause) (young) 429M->316M(2048M), 0.0354892 secs]
2020-10-28T23:45:53.215+0800: [GC pause (G1 Evacuation Pause) (young) 469M->360M(2048M), 0.0261120 secs]
执行结束!共生成对象次数:4066
```