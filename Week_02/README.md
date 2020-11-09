学习笔记

对于4种GC实验的总结记录。
因每次随机生成不同大小的对象，因此相同堆内存设置每次生成对象次数也会不同，对于测试不同的gc或者应该让其生成同样大小的对象来减少可变项。


### 串行GC:
```
F:\eclipseWorkspace\jvm\src>java -XX:+UseSerialGC -Xms128m -Xmx128m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
2020-11-09T21:23:12.233+0800: [GC (Allocation Failure) 2020-11-09T21:23:12.235+0800: [DefNew: 34944K->4351K(39296K), 0.0177973 secs] 34944K->10852K(126720K), 0.0210325 secs] [Times: user=0.01 sys=0.00, real=0.02 secs]
2020-11-09T21:23:12.289+0800: [GC (Allocation Failure) 2020-11-09T21:23:12.292+0800: [DefNew: 38955K->4344K(39296K), 0.0246112 secs] 45456K->22386K(126720K), 0.0292208 secs] [Times: user=0.03 sys=0.00, real=0.03 secs]
2020-11-09T21:23:12.345+0800: [GC (Allocation Failure) 2020-11-09T21:23:12.348+0800: [DefNew: 39182K->4345K(39296K), 0.0282880 secs] 57224K->36165K(126720K), 0.0319151 secs] [Times: user=0.01 sys=0.02, real=0.03 secs]
2020-11-09T21:23:12.401+0800: [GC (Allocation Failure) 2020-11-09T21:23:12.405+0800: [DefNew: 39289K->4344K(39296K), 0.0201119 secs] 71109K->48004K(126720K), 0.0250214 secs] [Times: user=0.00 sys=0.01, real=0.03 secs]
2020-11-09T21:23:12.453+0800: [GC (Allocation Failure) 2020-11-09T21:23:12.458+0800: [DefNew: 39138K->4351K(39296K), 0.0176794 secs] 82798K->58177K(126720K), 0.0228627 secs] [Times: user=0.00 sys=0.02, real=0.02 secs]
2020-11-09T21:23:12.498+0800: [GC (Allocation Failure) 2020-11-09T21:23:12.504+0800: [DefNew: 38826K->4351K(39296K), 0.0179525 secs] 92652K->68846K(126720K), 0.0254906 secs] [Times: user=0.00 sys=0.01, real=0.03 secs]
2020-11-09T21:23:12.548+0800: [GC (Allocation Failure) 2020-11-09T21:23:12.557+0800: [DefNew: 39295K->4346K(39296K), 0.0211849 secs] 103790K->82286K(126720K), 0.0320063 secs] [Times: user=0.00 sys=0.02, real=0.03 secs]
2020-11-09T21:23:12.604+0800: [GC (Allocation Failure) 2020-11-09T21:23:12.608+0800: [DefNew: 39290K->39290K(39296K), 0.0118042 secs]2020-11-09T21:23:12.623+0800: [Tenured: 77940K->87257K(87424K), 0.0512400 secs] 117230K->88022K(126720K), [Metaspace: 2719K->2719K(1056768K)], 0.0732876 secs] [Times: user=0.03 sys=0.00, real=0.07 secs]
2020-11-09T21:23:12.704+0800: [Full GC (Allocation Failure) 2020-11-09T21:23:12.707+0800: [Tenured: 87339K->87275K(87424K), 0.0435244 secs] 126635K->99785K(126720K), [Metaspace: 2719K->2719K(1056768K)], 0.0485311 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
2020-11-09T21:23:12.771+0800: [Full GC (Allocation Failure) 2020-11-09T21:23:12.773+0800: [Tenured: 87275K->86726K(87424K), 0.0517505 secs] 126417K->106727K(126720K), [Metaspace: 2719K->2719K(1056768K)], 0.0575035 secs] [Times: user=0.05 sys=0.00, real=0.06 secs]
2020-11-09T21:23:12.843+0800: [Full GC (Allocation Failure) 2020-11-09T21:23:12.845+0800: [Tenured: 87150K->87227K(87424K), 0.0596225 secs] 126446K->108391K(126720K), [Metaspace: 2719K->2719K(1056768K)], 0.0646044 secs] [Times: user=0.06 sys=0.00, real=0.07 secs]
2020-11-09T21:23:12.919+0800: [Full GC (Allocation Failure) 2020-11-09T21:23:12.921+0800: [Tenured: 87227K->87227K(87424K), 0.0175029 secs] 126435K->114144K(126720K), [Metaspace: 2719K->2719K(1056768K)], 0.0233741 secs] [Times: user=0.02 sys=0.00, real=0.02 secs]
2020-11-09T21:23:12.952+0800: [Full GC (Allocation Failure) 2020-11-09T21:23:12.955+0800: [Tenured: 87245K->87245K(87424K), 0.0193445 secs] 126537K->117361K(126720K), [Metaspace: 2719K->2719K(1056768K)], 0.0243016 secs] [Times: user=0.02 sys=0.00, real=0.03 secs]
2020-11-09T21:23:12.985+0800: [Full GC (Allocation Failure) 2020-11-09T21:23:12.992+0800: [Tenured: 87245K->87245K(87424K), 0.0150580 secs] 126465K->119441K(126720K), [Metaspace: 2719K->2719K(1056768K)], 0.0236428 secs] [Times: user=0.02 sys=0.00, real=0.03 secs]
2020-11-09T21:23:13.025+0800: [Full GC (Allocation Failure) 2020-11-09T21:23:13.027+0800: [Tenured: 87245K->87320K(87424K), 0.0543573 secs] 126259K->118108K(126720K), [Metaspace: 2719K->2719K(1056768K)], 0.0590677 secs] [Times: user=0.05 sys=0.00, real=0.06 secs]
2020-11-09T21:23:13.091+0800: [Full GC (Allocation Failure) 2020-11-09T21:23:13.093+0800: [Tenured: 87320K->87320K(87424K), 0.0209069 secs] 126529K->120486K(126720K), [Metaspace: 2719K->2719K(1056768K)], 0.0259837 secs] [Times: user=0.01 sys=0.00, real=0.03 secs]
2020-11-09T21:23:13.122+0800: [Full GC (Allocation Failure) 2020-11-09T21:23:13.124+0800: [Tenured: 87320K->87320K(87424K), 0.0217059 secs] 126573K->122300K(126720K), [Metaspace: 2719K->2719K(1056768K)], 0.0346172 secs] [Times: user=0.01 sys=0.00, real=0.04 secs]
执行结束!共生成对象次数:1585
Heap
 def new generation   total 39296K, used 35232K [0x00000000f8000000, 0x00000000faaa0000, 0x00000000faaa0000)
  eden space 34944K, 100% used [0x00000000f8000000, 0x00000000fa220000, 0x00000000fa220000)
  from space 4352K,   6% used [0x00000000fa660000, 0x00000000fa6a83b0, 0x00000000faaa0000)
  to   space 4352K,   0% used [0x00000000fa220000, 0x00000000fa220000, 0x00000000fa660000)
 tenured generation   total 87424K, used 87320K [0x00000000faaa0000, 0x0000000100000000, 0x0000000100000000)
   the space 87424K,  99% used [0x00000000faaa0000, 0x00000000fffe60b8, 0x00000000fffe6200, 0x0000000100000000)
 Metaspace       used 2726K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K

F:\eclipseWorkspace\jvm\src>java -XX:+UseSerialGC -Xms256m -Xmx256m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
2020-11-09T21:26:12.107+0800: [GC (Allocation Failure) 2020-11-09T21:26:12.109+0800: [DefNew: 69934K->8704K(78656K), 0.0298702 secs] 69934K->21857K(253440K), 0.0324044 secs] [Times: user=0.01 sys=0.02, real=0.03 secs]
2020-11-09T21:26:12.195+0800: [GC (Allocation Failure) 2020-11-09T21:26:12.197+0800: [DefNew: 78656K->8703K(78656K), 0.0486273 secs] 91809K->47849K(253440K), 0.0517418 secs] [Times: user=0.00 sys=0.03, real=0.05 secs]
2020-11-09T21:26:12.290+0800: [GC (Allocation Failure) 2020-11-09T21:26:12.292+0800: [DefNew: 78647K->8703K(78656K), 0.0412303 secs] 117794K->71450K(253440K), 0.0447039 secs] [Times: user=0.01 sys=0.02, real=0.05 secs]
2020-11-09T21:26:12.388+0800: [GC (Allocation Failure) 2020-11-09T21:26:12.390+0800: [DefNew: 78578K->8693K(78656K), 0.0343261 secs] 141326K->93836K(253440K), 0.0373860 secs] [Times: user=0.03 sys=0.00, real=0.04 secs]
2020-11-09T21:26:12.472+0800: [GC (Allocation Failure) 2020-11-09T21:26:12.474+0800: [DefNew: 78645K->8697K(78656K), 0.0404450 secs] 163788K->122131K(253440K), 0.0437075 secs] [Times: user=0.02 sys=0.03, real=0.04 secs]
2020-11-09T21:26:12.561+0800: [GC (Allocation Failure) 2020-11-09T21:26:12.563+0800: [DefNew: 78034K->8702K(78656K), 0.0369535 secs] 191468K->145739K(253440K), 0.0404611 secs] [Times: user=0.02 sys=0.02, real=0.04 secs]
2020-11-09T21:26:12.644+0800: [GC (Allocation Failure) 2020-11-09T21:26:12.646+0800: [DefNew: 78382K->8696K(78656K), 0.0407038 secs] 215419K->173027K(253440K), 0.0438701 secs] [Times: user=0.02 sys=0.01, real=0.04 secs]
2020-11-09T21:26:12.739+0800: [GC (Allocation Failure) 2020-11-09T21:26:12.742+0800: [DefNew: 78648K->78648K(78656K), 0.0021789 secs]2020-11-09T21:26:12.744+0800: [Tenured: 164330K->170796K(174784K), 0.0851411 secs] 242979K->170796K(253440K), [Metaspace: 2718K->2718K(1056768K)], 0.0932105 secs] [Times: user=0.06 sys=0.00, real=0.09 secs]
2020-11-09T21:26:12.877+0800: [GC (Allocation Failure) 2020-11-09T21:26:12.880+0800: [DefNew: 69952K->69952K(78656K), 0.0124403 secs]2020-11-09T21:26:12.893+0800: [Tenured: 170796K->174574K(174784K), 0.0887660 secs] 240748K->182307K(253440K), [Metaspace: 2718K->2718K(1056768K)], 0.1097213 secs] [Times: user=0.08 sys=0.00, real=0.11 secs]
执行结束!共生成对象次数:2424
Heap
 def new generation   total 78656K, used 10879K [0x00000000f0000000, 0x00000000f5550000, 0x00000000f5550000)
  eden space 69952K,  15% used [0x00000000f0000000, 0x00000000f0a9ff68, 0x00000000f4450000)
  from space 8704K,   0% used [0x00000000f4cd0000, 0x00000000f4cd0000, 0x00000000f5550000)
  to   space 8704K,   0% used [0x00000000f4450000, 0x00000000f4450000, 0x00000000f4cd0000)
 tenured generation   total 174784K, used 174574K [0x00000000f5550000, 0x0000000100000000, 0x0000000100000000)
   the space 174784K,  99% used [0x00000000f5550000, 0x00000000fffcb850, 0x00000000fffcba00, 0x0000000100000000)
 Metaspace       used 2725K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K

F:\eclipseWorkspace\jvm\src>java -XX:+UseSerialGC -Xms512m -Xmx512m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
2020-11-09T21:26:29.867+0800: [GC (Allocation Failure) 2020-11-09T21:26:29.869+0800: [DefNew: 139776K->17472K(157248K), 0.0609928 secs] 139776K->45940K(506816K), 0.0646938 secs] [Times: user=0.02 sys=0.02, real=0.06 secs]
2020-11-09T21:26:30.017+0800: [GC (Allocation Failure) 2020-11-09T21:26:30.020+0800: [DefNew: 157130K->17471K(157248K), 0.0805837 secs] 185598K->93865K(506816K), 0.0843119 secs] [Times: user=0.08 sys=0.00, real=0.09 secs]
2020-11-09T21:26:30.177+0800: [GC (Allocation Failure) 2020-11-09T21:26:30.178+0800: [DefNew: 157247K->17471K(157248K), 0.0620419 secs] 233641K->139884K(506816K), 0.0650671 secs] [Times: user=0.03 sys=0.02, real=0.07 secs]
2020-11-09T21:26:30.324+0800: [GC (Allocation Failure) 2020-11-09T21:26:30.325+0800: [DefNew: 157247K->17472K(157248K), 0.0595136 secs] 279660K->182231K(506816K), 0.0616901 secs] [Times: user=0.05 sys=0.02, real=0.06 secs]
2020-11-09T21:26:30.471+0800: [GC (Allocation Failure) 2020-11-09T21:26:30.474+0800: [DefNew: 156832K->17472K(157248K), 0.0667998 secs] 321592K->228944K(506816K), 0.0699360 secs] [Times: user=0.03 sys=0.05, real=0.07 secs]
2020-11-09T21:26:30.614+0800: [GC (Allocation Failure) 2020-11-09T21:26:30.617+0800: [DefNew: 157062K->17472K(157248K), 0.0620810 secs] 368534K->272118K(506816K), 0.0659350 secs] [Times: user=0.02 sys=0.03, real=0.07 secs]
执行结束!共生成对象次数:3199
Heap
 def new generation   total 157248K, used 23584K [0x00000000e0000000, 0x00000000eaaa0000, 0x00000000eaaa0000)
  eden space 139776K,   4% used [0x00000000e0000000, 0x00000000e05f82c8, 0x00000000e8880000)
  from space 17472K, 100% used [0x00000000e8880000, 0x00000000e9990000, 0x00000000e9990000)
  to   space 17472K,   0% used [0x00000000e9990000, 0x00000000e9990000, 0x00000000eaaa0000)
 tenured generation   total 349568K, used 254646K [0x00000000eaaa0000, 0x0000000100000000, 0x0000000100000000)
   the space 349568K,  72% used [0x00000000eaaa0000, 0x00000000fa34d9c8, 0x00000000fa34da00, 0x0000000100000000)
 Metaspace       used 2725K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K

F:\eclipseWorkspace\jvm\src>java -XX:+UseSerialGC -Xms1024m -Xmx1024m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
2020-11-09T21:26:51.601+0800: [GC (Allocation Failure) 2020-11-09T21:26:51.604+0800: [DefNew: 279616K->34944K(314560K), 0.1074604 secs] 279616K->90699K(1013632K), 0.1112784 secs] [Times: user=0.06 sys=0.05, real=0.11 secs]
2020-11-09T21:26:51.878+0800: [GC (Allocation Failure) 2020-11-09T21:26:51.880+0800: [DefNew: 314560K->34943K(314560K), 0.1270441 secs] 370315K->168470K(1013632K), 0.1309055 secs] [Times: user=0.03 sys=0.09, real=0.13 secs]
2020-11-09T21:26:52.170+0800: [GC (Allocation Failure) 2020-11-09T21:26:52.171+0800: [DefNew: 314559K->34943K(314560K), 0.0994494 secs] 448086K->240091K(1013632K), 0.1018092 secs] [Times: user=0.08 sys=0.03, real=0.10 secs]
执行结束!共生成对象次数:3141
Heap
 def new generation   total 314560K, used 46372K [0x00000000c0000000, 0x00000000d5550000, 0x00000000d5550000)
  eden space 279616K,   4% used [0x00000000c0000000, 0x00000000c0b293e8, 0x00000000d1110000)
  from space 34944K,  99% used [0x00000000d3330000, 0x00000000d554fff0, 0x00000000d5550000)
  to   space 34944K,   0% used [0x00000000d1110000, 0x00000000d1110000, 0x00000000d3330000)
 tenured generation   total 699072K, used 205147K [0x00000000d5550000, 0x0000000100000000, 0x0000000100000000)
   the space 699072K,  29% used [0x00000000d5550000, 0x00000000e1da6d10, 0x00000000e1da6e00, 0x0000000100000000)
 Metaspace       used 2725K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K

F:\eclipseWorkspace\jvm\src>java -XX:+UseSerialGC -Xms2048m -Xmx2048m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
2020-11-09T21:27:39.882+0800: [GC (Allocation Failure) 2020-11-09T21:27:39.884+0800: [DefNew: 559232K->69888K(629120K), 0.1169606 secs] 559232K->148999K(2027264K), 0.1192280 secs] [Times: user=0.03 sys=0.08, real=0.12 secs]
执行结束!共生成对象次数:3862
Heap
 def new generation   total 629120K, used 579876K [0x0000000080000000, 0x00000000aaaa0000, 0x00000000aaaa0000)
  eden space 559232K,  91% used [0x0000000080000000, 0x000000009f209398, 0x00000000a2220000)
  from space 69888K, 100% used [0x00000000a6660000, 0x00000000aaaa0000, 0x00000000aaaa0000)
  to   space 69888K,   0% used [0x00000000a2220000, 0x00000000a2220000, 0x00000000a6660000)
 tenured generation   total 1398144K, used 79111K [0x00000000aaaa0000, 0x0000000100000000, 0x0000000100000000)
   the space 1398144K,   5% used [0x00000000aaaa0000, 0x00000000af7e1df8, 0x00000000af7e1e00, 0x0000000100000000)
 Metaspace       used 2726K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K

```

串行GC耗时都比较短（128M/256M堆内存时每次仅10ms)，可见gc的效率都比较高，但随着堆内存的增加，gc的时间也在增加(>=512M时增加尤其明显，虽然没有了full gc，但每次young gc耗时都>50ms)，
由此可知串行GC回收内存效率高，适合小堆内存应用。


### 并行GC:
```
F:\eclipseWorkspace\jvm\src>java -XX:+UseParallelGC -Xms128m -Xmx128m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
2020-11-09T21:48:51.905+0800: [GC (Allocation Failure) [PSYoungGen: 33280K->5109K(38400K)] 33280K->14377K(125952K), 0.0205742 secs] [Times: user=0.00 sys=0.05, real=0.02 secs]
2020-11-09T21:48:51.961+0800: [GC (Allocation Failure) [PSYoungGen: 37744K->5115K(38400K)] 47013K->24697K(125952K), 0.0211349 secs] [Times: user=0.02 sys=0.01, real=0.02 secs]
2020-11-09T21:48:52.012+0800: [GC (Allocation Failure) [PSYoungGen: 38045K->5112K(38400K)] 57627K->35938K(125952K), 0.0202766 secs] [Times: user=0.03 sys=0.02, real=0.02 secs]
2020-11-09T21:48:52.052+0800: [GC (Allocation Failure) [PSYoungGen: 37953K->5108K(38400K)] 68779K->48910K(125952K), 0.0462398 secs] [Times: user=0.05 sys=0.02, real=0.05 secs]
2020-11-09T21:48:52.123+0800: [GC (Allocation Failure) [PSYoungGen: 38388K->5111K(38400K)] 82190K->60422K(125952K), 0.0146167 secs] [Times: user=0.00 sys=0.06, real=0.02 secs]
2020-11-09T21:48:52.157+0800: [GC (Allocation Failure) [PSYoungGen: 37926K->5108K(19968K)] 93237K->70493K(107520K), 0.0244567 secs] [Times: user=0.00 sys=0.02, real=0.02 secs]
2020-11-09T21:48:52.194+0800: [GC (Allocation Failure) [PSYoungGen: 19877K->6836K(29184K)] 85262K->73553K(116736K), 0.0084048 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-11-09T21:48:52.213+0800: [GC (Allocation Failure) [PSYoungGen: 21599K->8788K(29184K)] 88316K->77487K(116736K), 0.0077588 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-11-09T21:48:52.230+0800: [GC (Allocation Failure) [PSYoungGen: 23635K->11461K(29184K)] 92333K->81764K(116736K), 0.0172127 secs] [Times: user=0.03 sys=0.00, real=0.02 secs]
2020-11-09T21:48:52.259+0800: [GC (Allocation Failure) [PSYoungGen: 26028K->8495K(29184K)] 96331K->85817K(116736K), 0.0438971 secs] [Times: user=0.06 sys=0.00, real=0.04 secs]
2020-11-09T21:48:52.304+0800: [Full GC (Ergonomics) [PSYoungGen: 8495K->0K(29184K)] [ParOldGen: 77321K->80493K(87552K)] 85817K->80493K(116736K), [Metaspace: 2718K->2718K(1056768K)], 0.0625356 secs] [Times: user=0.16 sys=0.00, real=0.06 secs]
2020-11-09T21:48:52.378+0800: [Full GC (Ergonomics) [PSYoungGen: 14671K->0K(29184K)] [ParOldGen: 80493K->83779K(87552K)] 95164K->83779K(116736K), [Metaspace: 2718K->2718K(1056768K)], 0.0671985 secs] [Times: user=0.16 sys=0.00, real=0.07 secs]
2020-11-09T21:48:52.453+0800: [Full GC (Ergonomics) [PSYoungGen: 14720K->1278K(29184K)] [ParOldGen: 83779K->87124K(87552K)] 98500K->88403K(116736K), [Metaspace: 2718K->2718K(1056768K)], 0.0386421 secs] [Times: user=0.08 sys=0.00, real=0.04 secs]
2020-11-09T21:48:52.500+0800: [Full GC (Ergonomics) [PSYoungGen: 14775K->5259K(29184K)] [ParOldGen: 87124K->87363K(87552K)] 101899K->92622K(116736K), [Metaspace: 2718K->2718K(1056768K)], 0.0465796 secs] [Times: user=0.12 sys=0.00, real=0.05 secs]
2020-11-09T21:48:52.553+0800: [Full GC (Ergonomics) [PSYoungGen: 14460K->8754K(29184K)] [ParOldGen: 87363K->86838K(87552K)] 101823K->95593K(116736K), [Metaspace: 2718K->2718K(1056768K)], 0.0235754 secs] [Times: user=0.05 sys=0.00, real=0.02 secs]
2020-11-09T21:48:52.583+0800: [Full GC (Ergonomics) [PSYoungGen: 14546K->9569K(29184K)] [ParOldGen: 86838K->87316K(87552K)] 101385K->96886K(116736K), [Metaspace: 2718K->2718K(1056768K)], 0.0528716 secs] [Times: user=0.09 sys=0.00, real=0.05 secs]
2020-11-09T21:48:52.641+0800: [Full GC (Ergonomics) [PSYoungGen: 14777K->11211K(29184K)] [ParOldGen: 87316K->87113K(87552K)] 102094K->98325K(116736K), [Metaspace: 2718K->2718K(1056768K)], 0.0405502 secs] [Times: user=0.08 sys=0.00, real=0.04 secs]
2020-11-09T21:48:52.688+0800: [Full GC (Ergonomics) [PSYoungGen: 14641K->12043K(29184K)] [ParOldGen: 87113K->87113K(87552K)] 101755K->99157K(116736K), [Metaspace: 2718K->2718K(1056768K)], 0.0320659 secs] [Times: user=0.02 sys=0.00, real=0.03 secs]
2020-11-09T21:48:52.725+0800: [Full GC (Ergonomics) [PSYoungGen: 14802K->12419K(29184K)] [ParOldGen: 87113K->87303K(87552K)] 101915K->99723K(116736K), [Metaspace: 2718K->2718K(1056768K)], 0.0424129 secs] [Times: user=0.05 sys=0.00, real=0.04 secs]
2020-11-09T21:48:52.771+0800: [Full GC (Ergonomics) [PSYoungGen: 14751K->13775K(29184K)] [ParOldGen: 87303K->87303K(87552K)] 102054K->101079K(116736K), [Metaspace: 2718K->2718K(1056768K)], 0.0157490 secs] [Times: user=0.00 sys=0.00, real=0.02 secs]
2020-11-09T21:48:52.791+0800: [Full GC (Ergonomics) [PSYoungGen: 14470K->14384K(29184K)] [ParOldGen: 87303K->87303K(87552K)] 101774K->101687K(116736K), [Metaspace: 2718K->2718K(1056768K)], 0.0154636 secs] [Times: user=0.00 sys=0.01, real=0.02 secs]
2020-11-09T21:48:52.810+0800: [Full GC (Ergonomics) [PSYoungGen: 14848K->13863K(29184K)] [ParOldGen: 87303K->87276K(87552K)] 102151K->101140K(116736K), [Metaspace: 2718K->2718K(1056768K)], 0.0556895 secs] [Times: user=0.06 sys=0.00, real=0.06 secs]
执行结束!共生成对象次数:1262
Heap
 PSYoungGen      total 29184K, used 14270K [0x00000000fd580000, 0x0000000100000000, 0x0000000100000000)
  eden space 14848K, 96% used [0x00000000fd580000,0x00000000fe36fb08,0x00000000fe400000)
  from space 14336K, 0% used [0x00000000ff200000,0x00000000ff200000,0x0000000100000000)
  to   space 14336K, 0% used [0x00000000fe400000,0x00000000fe400000,0x00000000ff200000)
 ParOldGen       total 87552K, used 87276K [0x00000000f8000000, 0x00000000fd580000, 0x00000000fd580000)
  object space 87552K, 99% used [0x00000000f8000000,0x00000000fd53b2f8,0x00000000fd580000)
 Metaspace       used 2725K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K

F:\eclipseWorkspace\jvm\src>java -XX:+UseParallelGC -Xms256m -Xmx256m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
2020-11-09T21:50:01.828+0800: [GC (Allocation Failure) [PSYoungGen: 65342K->10743K(76288K)] 65342K->19967K(251392K), 0.0227932 secs] [Times: user=0.01 sys=0.05, real=0.02 secs]
2020-11-09T21:50:01.899+0800: [GC (Allocation Failure) [PSYoungGen: 76279K->10745K(76288K)] 85503K->44191K(251392K), 0.0674434 secs] [Times: user=0.06 sys=0.08, real=0.07 secs]
2020-11-09T21:50:02.008+0800: [GC (Allocation Failure) [PSYoungGen: 76223K->10746K(76288K)] 109669K->66126K(251392K), 0.0458917 secs] [Times: user=0.05 sys=0.05, real=0.05 secs]
2020-11-09T21:50:02.089+0800: [GC (Allocation Failure) [PSYoungGen: 76282K->10738K(76288K)] 131662K->86115K(251392K), 0.0352716 secs] [Times: user=0.06 sys=0.02, real=0.04 secs]
2020-11-09T21:50:02.152+0800: [GC (Allocation Failure) [PSYoungGen: 76274K->10741K(76288K)] 151651K->110542K(251392K), 0.0400794 secs] [Times: user=0.05 sys=0.02, real=0.04 secs]
2020-11-09T21:50:02.227+0800: [GC (Allocation Failure) [PSYoungGen: 76277K->10740K(40448K)] 176078K->134059K(215552K), 0.0359351 secs] [Times: user=0.08 sys=0.01, real=0.04 secs]
2020-11-09T21:50:02.278+0800: [GC (Allocation Failure) [PSYoungGen: 40436K->17435K(58368K)] 163755K->145011K(233472K), 0.0153208 secs] [Times: user=0.02 sys=0.03, real=0.02 secs]
2020-11-09T21:50:02.309+0800: [GC (Allocation Failure) [PSYoungGen: 46663K->25136K(58368K)] 174239K->154803K(233472K), 0.0226771 secs] [Times: user=0.03 sys=0.02, real=0.02 secs]
2020-11-09T21:50:02.348+0800: [GC (Allocation Failure) [PSYoungGen: 54405K->27306K(58368K)] 184072K->160938K(233472K), 0.0124515 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-11-09T21:50:02.379+0800: [GC (Allocation Failure) [PSYoungGen: 56759K->18058K(58368K)] 190392K->171429K(233472K), 0.0236924 secs] [Times: user=0.03 sys=0.02, real=0.02 secs]
2020-11-09T21:50:02.404+0800: [Full GC (Ergonomics) [PSYoungGen: 18058K->0K(58368K)] [ParOldGen: 153371K->142856K(175104K)] 171429K->142856K(233472K), [Metaspace: 2719K->2719K(1056768K)], 0.0833835 secs] [Times: user=0.16 sys=0.01, real=0.08 secs]
2020-11-09T21:50:02.504+0800: [GC (Allocation Failure) [PSYoungGen: 29662K->12388K(58368K)] 172519K->155245K(233472K), 0.0083477 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-11-09T21:50:02.514+0800: [Full GC (Ergonomics) [PSYoungGen: 12388K->0K(58368K)] [ParOldGen: 142856K->150954K(175104K)] 155245K->150954K(233472K), [Metaspace: 2719K->2719K(1056768K)], 0.0665652 secs] [Times: user=0.09 sys=0.02, real=0.07 secs]
2020-11-09T21:50:02.600+0800: [Full GC (Ergonomics) [PSYoungGen: 29693K->0K(58368K)] [ParOldGen: 150954K->159413K(175104K)] 180647K->159413K(233472K), [Metaspace: 2719K->2719K(1056768K)], 0.0539639 secs] [Times: user=0.13 sys=0.00, real=0.05 secs]
2020-11-09T21:50:02.668+0800: [Full GC (Ergonomics) [PSYoungGen: 29696K->0K(58368K)] [ParOldGen: 159413K->167012K(175104K)] 189109K->167012K(233472K), [Metaspace: 2719K->2719K(1056768K)], 0.0513611 secs] [Times: user=0.09 sys=0.05, real=0.05 secs]
执行结束!共生成对象次数:2353
Heap
 PSYoungGen      total 58368K, used 1961K [0x00000000fab00000, 0x0000000100000000, 0x0000000100000000)
  eden space 29696K, 6% used [0x00000000fab00000,0x00000000facea658,0x00000000fc800000)
  from space 28672K, 0% used [0x00000000fc800000,0x00000000fc800000,0x00000000fe400000)
  to   space 28672K, 0% used [0x00000000fe400000,0x00000000fe400000,0x0000000100000000)
 ParOldGen       total 175104K, used 167012K [0x00000000f0000000, 0x00000000fab00000, 0x00000000fab00000)
  object space 175104K, 95% used [0x00000000f0000000,0x00000000fa319290,0x00000000fab00000)
 Metaspace       used 2726K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K

F:\eclipseWorkspace\jvm\src>java -XX:+UseParallelGC -Xms512m -Xmx512m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
2020-11-09T21:50:26.852+0800: [GC (Allocation Failure) [PSYoungGen: 131584K->21490K(153088K)] 131584K->43969K(502784K), 0.0571848 secs] [Times: user=0.13 sys=0.08, real=0.06 secs]
2020-11-09T21:50:26.988+0800: [GC (Allocation Failure) [PSYoungGen: 153074K->21499K(153088K)] 175553K->85991K(502784K), 0.0541417 secs] [Times: user=0.03 sys=0.09, real=0.06 secs]
2020-11-09T21:50:27.101+0800: [GC (Allocation Failure) [PSYoungGen: 153083K->21497K(153088K)] 217575K->129378K(502784K), 0.0383306 secs] [Times: user=0.05 sys=0.01, real=0.04 secs]
2020-11-09T21:50:27.200+0800: [GC (Allocation Failure) [PSYoungGen: 152385K->21497K(153088K)] 260266K->170670K(502784K), 0.0367037 secs] [Times: user=0.03 sys=0.08, real=0.04 secs]
2020-11-09T21:50:27.294+0800: [GC (Allocation Failure) [PSYoungGen: 153081K->21500K(153088K)] 302254K->219614K(502784K), 0.0406554 secs] [Times: user=0.03 sys=0.06, real=0.04 secs]
2020-11-09T21:50:27.399+0800: [GC (Allocation Failure) [PSYoungGen: 153084K->21493K(80384K)] 351198K->260441K(430080K), 0.0482522 secs] [Times: user=0.03 sys=0.06, real=0.05 secs]
2020-11-09T21:50:27.478+0800: [GC (Allocation Failure) [PSYoungGen: 80373K->32955K(116736K)] 319321K->275961K(466432K), 0.0472790 secs] [Times: user=0.03 sys=0.00, real=0.05 secs]
2020-11-09T21:50:27.560+0800: [GC (Allocation Failure) [PSYoungGen: 91835K->41687K(116736K)] 334841K->291243K(466432K), 0.0139254 secs] [Times: user=0.00 sys=0.02, real=0.01 secs]
2020-11-09T21:50:27.603+0800: [GC (Allocation Failure) [PSYoungGen: 100507K->52722K(116736K)] 350063K->309949K(466432K), 0.0232527 secs] [Times: user=0.03 sys=0.01, real=0.02 secs]
执行结束!共生成对象次数:3551
Heap
 PSYoungGen      total 116736K, used 57613K [0x00000000f5580000, 0x0000000100000000, 0x0000000100000000)
  eden space 58880K, 8% used [0x00000000f5580000,0x00000000f5a46e68,0x00000000f8f00000)
  from space 57856K, 91% used [0x00000000f8f00000,0x00000000fc27c900,0x00000000fc780000)
  to   space 57856K, 0% used [0x00000000fc780000,0x00000000fc780000,0x0000000100000000)
 ParOldGen       total 349696K, used 257227K [0x00000000e0000000, 0x00000000f5580000, 0x00000000f5580000)
  object space 349696K, 73% used [0x00000000e0000000,0x00000000efb32e38,0x00000000f5580000)
 Metaspace       used 2726K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K

F:\eclipseWorkspace\jvm\src>java -XX:+UseParallelGC -Xms1024m -Xmx1024m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
2020-11-09T22:17:18.522+0800: [GC (Allocation Failure) [PSYoungGen: 262144K->43509K(305664K)] 262144K->79756K(1005056K), 0.0801213 secs] [Times: user=0.03 sys=0.25, real=0.08 secs]
2020-11-09T22:17:18.723+0800: [GC (Allocation Failure) [PSYoungGen: 305653K->43503K(305664K)] 341900K->149583K(1005056K), 0.0993405 secs] [Times: user=0.03 sys=0.28, real=0.10 secs]
2020-11-09T22:17:18.935+0800: [GC (Allocation Failure) [PSYoungGen: 305647K->43506K(305664K)] 411727K->223045K(1005056K), 0.0678719 secs] [Times: user=0.06 sys=0.16, real=0.07 secs]
执行结束!共生成对象次数:3004
Heap
 PSYoungGen      total 305664K, used 77576K [0x00000000eab00000, 0x0000000100000000, 0x0000000100000000)
  eden space 262144K, 12% used [0x00000000eab00000,0x00000000ecc45898,0x00000000fab00000)
  from space 43520K, 99% used [0x00000000fab00000,0x00000000fd57c9b0,0x00000000fd580000)
  to   space 43520K, 0% used [0x00000000fd580000,0x00000000fd580000,0x0000000100000000)
 ParOldGen       total 699392K, used 179538K [0x00000000c0000000, 0x00000000eab00000, 0x00000000eab00000)
  object space 699392K, 25% used [0x00000000c0000000,0x00000000caf54a58,0x00000000eab00000)
 Metaspace       used 2726K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K

F:\eclipseWorkspace\jvm\src>java -XX:+UseParallelGC -Xms2048m -Xmx2048m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
执行结束!共生成对象次数:1782
Heap
 PSYoungGen      total 611840K, used 504577K [0x00000000d5580000, 0x0000000100000000, 0x0000000100000000)
  eden space 524800K, 96% used [0x00000000d5580000,0x00000000f4240608,0x00000000f5600000)
  from space 87040K, 0% used [0x00000000fab00000,0x00000000fab00000,0x0000000100000000)
  to   space 87040K, 0% used [0x00000000f5600000,0x00000000f5600000,0x00000000fab00000)
 ParOldGen       total 1398272K, used 0K [0x0000000080000000, 0x00000000d5580000, 0x00000000d5580000)
  object space 1398272K, 0% used [0x0000000080000000,0x0000000080000000,0x00000000d5580000)
 Metaspace       used 2724K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K
  
F:\eclipseWorkspace\jvm\src>java -XX:+UseParallelGC -Xms2g -Xmx2g -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
2020-11-09T22:38:12.135+0800: [GC (Allocation Failure) [PSYoungGen: 524800K->87034K(611840K)] 524800K->138292K(2010112K), 0.1101302 secs] [Times: user=0.11 sys=0.31, real=0.11 secs]
执行结束!共生成对象次数:3279
Heap
 PSYoungGen      total 611840K, used 444711K [0x00000000d5580000, 0x0000000100000000, 0x0000000100000000)
  eden space 524800K, 68% used [0x00000000d5580000,0x00000000eb2cb358,0x00000000f5600000)
  from space 87040K, 99% used [0x00000000f5600000,0x00000000faafea70,0x00000000fab00000)
  to   space 87040K, 0% used [0x00000000fab00000,0x00000000fab00000,0x0000000100000000)
 ParOldGen       total 1398272K, used 51258K [0x0000000080000000, 0x00000000d5580000, 0x00000000d5580000)
  object space 1398272K, 3% used [0x0000000080000000,0x000000008320e878,0x00000000d5580000)
 Metaspace       used 2725K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K
```

似乎与串行GC的运行并无太大差别（虽然GC时是多线程运行，但无论是GC总耗时还是生成对象次数(吞吐量)上都无太大差别，或者说是稍微好点）。
对于堆内存为2048M和2g(见后两次命令),在对象生成次数上相处甚远，why?


### CMS GC:
```
F:\eclipseWorkspace\jvm\src>java -XX:+UseConcMarkSweepGC -Xms128m -Xmx128m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
2020-11-09T22:43:22.587+0800: [GC (Allocation Failure) 2020-11-09T22:43:22.589+0800: [ParNew: 34906K->4350K(39296K), 0.0154034 secs] 34906K->13285K(126720K), 0.0192142 secs] [Times: user=0.02 sys=0.02, real=0.02 secs]
2020-11-09T22:43:22.642+0800: [GC (Allocation Failure) 2020-11-09T22:43:22.643+0800: [ParNew: 39154K->4352K(39296K), 0.0368511 secs] 48088K->23650K(126720K), 0.0400313 secs] [Times: user=0.09 sys=0.03, real=0.04 secs]
2020-11-09T22:43:22.709+0800: [GC (Allocation Failure) 2020-11-09T22:43:22.711+0800: [ParNew: 39163K->4352K(39296K), 0.0228102 secs] 58462K->38504K(126720K), 0.0258593 secs] [Times: user=0.05 sys=0.01, real=0.03 secs]
2020-11-09T22:43:22.759+0800: [GC (Allocation Failure) 2020-11-09T22:43:22.761+0800: [ParNew: 39296K->4352K(39296K), 0.0585883 secs] 73448K->51412K(126720K), 0.0623622 secs] [Times: user=0.19 sys=0.00, real=0.06 secs]
2020-11-09T22:43:22.826+0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 47060K(87424K)] 52214K(126720K), 0.0040944 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-11-09T22:43:22.833+0800: [CMS-concurrent-mark-start]
2020-11-09T22:43:22.839+0800: [CMS-concurrent-mark: 0.004/0.004 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-11-09T22:43:22.845+0800: [CMS-concurrent-preclean-start]
2020-11-09T22:43:22.849+0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.03 sys=0.00, real=0.01 secs]
2020-11-09T22:43:22.852+0800: [CMS-concurrent-abortable-preclean-start]
2020-11-09T22:43:22.853+0800: [GC (Allocation Failure) 2020-11-09T22:43:22.855+0800: [ParNew: 39238K->4340K(39296K), 0.0163758 secs] 86299K->62267K(126720K), 0.0204222 secs] [Times: user=0.03 sys=0.02, real=0.02 secs]
2020-11-09T22:43:22.893+0800: [GC (Allocation Failure) 2020-11-09T22:43:22.895+0800: [ParNew: 38981K->4341K(39296K), 0.0227994 secs] 96908K->73199K(126720K), 0.0255853 secs] [Times: user=0.05 sys=0.00, real=0.03 secs]
2020-11-09T22:43:22.941+0800: [GC (Allocation Failure) 2020-11-09T22:43:22.943+0800: [ParNew: 39129K->4328K(39296K), 0.0174240 secs] 107986K->86109K(126720K), 0.0199356 secs] [Times: user=0.05 sys=0.03, real=0.02 secs]
2020-11-09T22:43:22.978+0800: [GC (Allocation Failure) 2020-11-09T22:43:22.980+0800: [ParNew: 39123K->39123K(39296K), 0.0042806 secs]2020-11-09T22:43:22.985+0800: [CMS2020-11-09T22:43:22.986+0800: [CMS-concurrent-abortable-preclean: 0.002/0.132 secs] [Times: user=0.17 sys=0.05, real=0.14 secs]
 (concurrent mode failure): 81781K->86927K(87424K), 0.0585697 secs] 120904K->91903K(126720K), [Metaspace: 2718K->2718K(1056768K)], 0.0673655 secs] [Times: user=0.05 sys=0.00, real=0.07 secs]
2020-11-09T22:43:23.062+0800: [Full GC (Allocation Failure) 2020-11-09T22:43:23.064+0800: [CMS: 87071K->87037K(87424K), 0.0465396 secs] 126341K->101526K(126720K), [Metaspace: 2718K->2718K(1056768K)], 0.0499216 secs] [Times: user=0.03 sys=0.00, real=0.05 secs]
2020-11-09T22:43:23.114+0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87037K(87424K)] 101814K(126720K), 0.0032017 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-11-09T22:43:23.119+0800: [CMS-concurrent-mark-start]
2020-11-09T22:43:23.125+0800: [CMS-concurrent-mark: 0.002/0.002 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-11-09T22:43:23.128+0800: [CMS-concurrent-preclean-start]
2020-11-09T22:43:23.130+0800: [Full GC (Allocation Failure) 2020-11-09T22:43:23.132+0800: [CMS2020-11-09T22:43:23.135+0800: [CMS-concurrent-preclean: 0.002/0.005 secs] [Times: user=0.02 sys=0.00, real=0.01 secs]

 (concurrent mode failure): 87222K->87122K(87424K), 0.0482925 secs] 126492K->105442K(126720K), [Metaspace: 2718K->2718K(1056768K)], 0.0536111 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
2020-11-09T22:43:23.194+0800: [Full GC (Allocation Failure) 2020-11-09T22:43:23.196+0800: [CMS: 87122K->87331K(87424K), 0.0533380 secs] 125864K->110789K(126720K), [Metaspace: 2718K->2718K(1056768K)], 0.0578467 secs] [Times: user=0.05 sys=0.00, real=0.06 secs]
2020-11-09T22:43:23.288+0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87331K(87424K)] 111348K(126720K), 0.0021805 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-11-09T22:43:23.292+0800: [CMS-concurrent-mark-start]
2020-11-09T22:43:23.298+0800: [CMS-concurrent-mark: 0.003/0.003 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-11-09T22:43:23.300+0800: [CMS-concurrent-preclean-start]
2020-11-09T22:43:23.303+0800: [Full GC (Allocation Failure) 2020-11-09T22:43:23.309+0800: [CMS2020-11-09T22:43:23.312+0800: [CMS-concurrent-preclean: 0.002/0.009 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]

 (concurrent mode failure): 87331K->87369K(87424K), 0.0491362 secs] 126465K->114354K(126720K), [Metaspace: 2718K->2718K(1056768K)], 0.0570017 secs] [Times: user=0.05 sys=0.00, real=0.06 secs]
2020-11-09T22:43:23.367+0800: [Full GC (Allocation Failure) 2020-11-09T22:43:23.370+0800: [CMS: 87369K->87008K(87424K), 0.0523844 secs] 126600K->117806K(126720K), [Metaspace: 2718K->2718K(1056768K)], 0.0576276 secs] [Times: user=0.05 sys=0.00, real=0.06 secs]
2020-11-09T22:43:23.429+0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 87008K(87424K)] 117878K(126720K), 0.0026298 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-11-09T22:43:23.432+0800: [CMS-concurrent-mark-start]
2020-11-09T22:43:23.437+0800: [CMS-concurrent-mark: 0.003/0.003 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-11-09T22:43:23.439+0800: [CMS-concurrent-preclean-start]
2020-11-09T22:43:23.442+0800: [Full GC (Allocation Failure) 2020-11-09T22:43:23.444+0800: [CMS2020-11-09T22:43:23.446+0800: [CMS-concurrent-preclean: 0.002/0.005 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]

 (concurrent mode failure): 87216K->86872K(87424K), 0.0483409 secs] 126315K->120345K(126720K), [Metaspace: 2718K->2718K(1056768K)], 0.0549627 secs] [Times: user=0.06 sys=0.00, real=0.06 secs]
2020-11-09T22:43:23.499+0800: [Full GC (Allocation Failure) 2020-11-09T22:43:23.500+0800: [CMS: 87254K->86785K(87424K), 0.0463621 secs] 126481K->121989K(126720K), [Metaspace: 2718K->2718K(1056768K)], 0.0509726 secs] [Times: user=0.05 sys=0.00, real=0.05 secs]
2020-11-09T22:43:23.556+0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 86785K(87424K)] 122631K(126720K), 0.0038847 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-11-09T22:43:23.561+0800执行结束!共生成对象次数:1562:
[CMS-concurrent-mark-start]
Heap
 par new generation   total 39296K, used 35846K [0x00000000f8000000, 0x00000000faaa0000, 0x00000000faaa0000)
  eden space 34944K, 100% used [0x00000000f8000000, 0x00000000fa220000, 0x00000000fa220000)
  from space 4352K,  20% used [0x00000000fa660000, 0x00000000fa741b10, 0x00000000faaa0000)
  to   space 4352K,   0% used [0x00000000fa220000, 0x00000000fa220000, 0x00000000fa660000)
 concurrent mark-sweep generation2020-11-09T22:43:23.565+0800:  total 87424K, used 86785K [0x00000000faaa0000, 0x0000000100000000, 0x0000000100000000)
 Metaspace       used 2725K, capacity 4486K, committed 4864K, reserved 1056768K
[CMS-concurrent-mark: 0.002/0.002 secs]  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K
 [Times: user=0.00 sys=0.00, real=0.01 secs]

F:\eclipseWorkspace\jvm\src>java -XX:+UseConcMarkSweepGC -Xms256m -Xmx256m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
2020-11-09T22:47:37.722+0800: [GC (Allocation Failure) 2020-11-09T22:47:37.725+0800: [ParNew: 69952K->8701K(78656K), 0.0249554 secs] 69952K->27383K(253440K), 0.0290588 secs] [Times: user=0.03 sys=0.05, real=0.03 secs]
2020-11-09T22:47:37.805+0800: [GC (Allocation Failure) 2020-11-09T22:47:37.807+0800: [ParNew: 78653K->8704K(78656K), 0.0376451 secs] 97335K->56996K(253440K), 0.0414237 secs] [Times: user=0.03 sys=0.08, real=0.04 secs]
2020-11-09T22:47:37.890+0800: [GC (Allocation Failure) 2020-11-09T22:47:37.891+0800: [ParNew: 78464K->8704K(78656K), 0.0356834 secs] 126757K->80171K(253440K), 0.0390582 secs] [Times: user=0.08 sys=0.00, real=0.04 secs]
2020-11-09T22:47:37.975+0800: [GC (Allocation Failure) 2020-11-09T22:47:37.977+0800: [ParNew: 78656K->8695K(78656K), 0.0345039 secs] 150123K->102672K(253440K), 0.0380271 secs] [Times: user=0.09 sys=0.00, real=0.04 secs]
2020-11-09T22:47:38.020+0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 93977K(174784K)] 104132K(253440K), 0.0036755 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-11-09T22:47:38.025+0800: [CMS-concurrent-mark-start]
2020-11-09T22:47:38.035+0800: [CMS-concurrent-mark: 0.008/0.008 secs] [Times: user=0.03 sys=0.00, real=0.01 secs]
2020-11-09T22:47:38.038+0800: [CMS-concurrent-preclean-start]
2020-11-09T22:47:38.044+0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-11-09T22:47:38.047+0800: [CMS-concurrent-abortable-preclean-start]
2020-11-09T22:47:38.070+0800: [GC (Allocation Failure) 2020-11-09T22:47:38.072+0800: [ParNew: 78184K->8696K(78656K), 0.0292903 secs] 172161K->121357K(253440K), 0.0321326 secs] [Times: user=0.09 sys=0.00, real=0.03 secs]
2020-11-09T22:47:38.144+0800: [GC (Allocation Failure) 2020-11-09T22:47:38.147+0800: [ParNew: 78557K->8703K(78656K), 0.0398560 secs] 191217K->150572K(253440K), 0.0440826 secs] [Times: user=0.09 sys=0.02, real=0.04 secs]
2020-11-09T22:47:38.230+0800: [GC (Allocation Failure) 2020-11-09T22:47:38.232+0800: [ParNew: 78568K->78568K(78656K), 0.0026037 secs]2020-11-09T22:47:38.235+0800: [CMS2020-11-09T22:47:38.237+0800: [CMS-concurrent-abortable-preclean: 0.005/0.187 secs] [Times: user=0.30 sys=0.02, real=0.19 secs]
 (concurrent mode failure): 141869K->147926K(174784K), 0.0870311 secs] 220437K->147926K(253440K), [Metaspace: 2718K->2718K(1056768K)], 0.0945460 secs] [Times: user=0.08 sys=0.00, real=0.10 secs]
2020-11-09T22:47:38.368+0800: [GC (Allocation Failure) 2020-11-09T22:47:38.370+0800: [ParNew: 69852K->8698K(78656K), 0.0238255 secs] 217779K->169714K(253440K), 0.0334806 secs] [Times: user=0.03 sys=0.02, real=0.04 secs]
2020-11-09T22:47:38.406+0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 161015K(174784K)] 170143K(253440K), 0.0035775 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-11-09T22:47:38.411+0800: [CMS-concurrent-mark-start]
2020-11-09T22:47:38.418+0800: [CMS-concurrent-mark: 0.005/0.005 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-11-09T22:47:38.421+0800: [CMS-concurrent-preclean-start]
2020-11-09T22:47:38.426+0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.02 sys=0.00, real=0.01 secs]
2020-11-09T22:47:38.431+0800: [CMS-concurrent-abortable-preclean-start]
2020-11-09T22:47:38.433+0800: [CMS-concurrent-abortable-preclean: 0.000/0.000 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-11-09T22:47:38.437+0800: [GC (CMS Final Remark) [YG occupancy: 56476 K (78656 K)]2020-11-09T22:47:38.439+0800: [Rescan (parallel) , 0.0018565 secs]2020-11-09T22:47:38.442+0800: [weak refs processing, 0.0011037 secs]2020-11-09T22:47:38.444+0800: [class unloading, 0.0027545 secs]2020-11-09T22:47:38.448+0800: [scrub symbol table, 0.0029693 secs]2020-11-09T22:47:38.451+0800: [scrub string table, 0.0018568 secs][1 CMS-remark: 161015K(174784K)] 217492K(253440K), 0.0197985 secs] [Times: user=0.00 sys=0.00, real=0.02 secs]
2020-11-09T22:47:38.459+0800: [CMS-concurrent-sweep-start]
2020-11-09T22:47:38.462+0800: [CMS-concurrent-sweep: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-11-09T22:47:38.465+0800: [CMS-concurrent-reset-start]
2020-11-09T22:47:38.473+0800: [CMS-concurrent-reset: 0.001/0.001 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]
2020-11-09T22:47:38.479+0800: [GC (Allocation Failure) 2020-11-09T22:47:38.481+0800: [ParNew (promotion failed): 78650K->78654K(78656K), 0.0709941 secs]2020-11-09T22:47:38.553+0800: [CMS: 174246K->174732K(174784K), 0.0942149 secs] 233033K->181875K(253440K), [Metaspace: 2718K->2718K(1056768K)], 0.1718827 secs] [Times: user=0.34 sys=0.00, real=0.17 secs]
执行结束!共生成对象次数:2345
Heap
 par new generation   total 78656K, used 10078K [0x00000000f0000000, 0x00000000f5550000, 0x00000000f5550000)
  eden space 69952K,  14% used [0x00000000f0000000, 0x00000000f09d7a80, 0x00000000f4450000)
  from space 8704K,   0% used [0x00000000f4450000, 0x00000000f4450000, 0x00000000f4cd0000)
  to   space 8704K,   0% used [0x00000000f4cd0000, 0x00000000f4cd0000, 0x00000000f5550000)
 concurrent mark-sweep generation total 174784K, used 174732K [0x00000000f5550000, 0x0000000100000000, 0x0000000100000000)
 Metaspace       used 2725K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K

F:\eclipseWorkspace\jvm\src>java -XX:+UseConcMarkSweepGC -Xms512m -Xmx512m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
2020-11-09T22:48:19.726+0800: [GC (Allocation Failure) 2020-11-09T22:48:19.729+0800: [ParNew: 139715K->17471K(157248K), 0.0378478 secs] 139715K->41594K(506816K), 0.0415850 secs] [Times: user=0.02 sys=0.11, real=0.04 secs]
2020-11-09T22:48:19.854+0800: [GC (Allocation Failure) 2020-11-09T22:48:19.856+0800: [ParNew: 156882K->17472K(157248K), 0.0495272 secs] 181005K->81404K(506816K), 0.0532502 secs] [Times: user=0.08 sys=0.09, real=0.05 secs]
2020-11-09T22:48:19.991+0800: [GC (Allocation Failure) 2020-11-09T22:48:19.993+0800: [ParNew: 157248K->17472K(157248K), 0.0591543 secs] 221180K->128210K(506816K), 0.0627041 secs] [Times: user=0.17 sys=0.01, real=0.06 secs]
2020-11-09T22:48:20.139+0800: [GC (Allocation Failure) 2020-11-09T22:48:20.141+0800: [ParNew: 157248K->17472K(157248K), 0.0562831 secs] 267986K->170260K(506816K), 0.0597227 secs] [Times: user=0.09 sys=0.05, real=0.06 secs]
2020-11-09T22:48:20.281+0800: [GC (Allocation Failure) 2020-11-09T22:48:20.283+0800: [ParNew: 157248K->17472K(157248K), 0.0433053 secs] 310036K->208607K(506816K), 0.0459351 secs] [Times: user=0.11 sys=0.00, real=0.05 secs]
2020-11-09T22:48:20.330+0800: [GC (CMS Initial Mark) [1 CMS-initial-mark: 191135K(349568K)] 208835K(506816K), 0.0030577 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
2020-11-09T22:48:20.334+0800: [CMS-concurrent-mark-start]
2020-11-09T22:48:20.347+0800: [CMS-concurrent-mark: 0.011/0.011 secs] [Times: user=0.03 sys=0.00, real=0.01 secs]
2020-11-09T22:48:20.350+0800: [CMS-concurrent-preclean-start]
2020-11-09T22:48:20.354+0800: [CMS-concurrent-preclean: 0.001/0.001 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
2020-11-09T22:48:20.356+0800: [CMS-concurrent-abortable-preclean-start]
2020-11-09T22:48:20.409+0800: [GC (Allocation Failure) 2020-11-09T22:48:20.411+0800: [ParNew: 157248K->17472K(157248K), 0.0456528 secs] 348383K->250778K(506816K), 0.0486720 secs] [Times: user=0.08 sys=0.01, real=0.05 secs]
执行结束!共生成对象次数:3427
Heap
 par new generation   total 157248K, used 97917K [0x00000000e0000000, 0x00000000eaaa0000, 0x00000000eaaa0000)
  eden space 139776K,  57% used [0x00000000e0000000, 0x00000000e4e8f6e0, 0x00000000e8880000)
  from space 17472K, 100% used [0x00000000e8880000, 0x00000000e9990000, 0x00000000e9990000)
  to   space 17472K,   0% used [0x00000000e9990000, 0x00000000e9990000, 0x00000000eaaa0000)
 concurrent mark-sweep generation total 349568K, used 233306K [0x00000000eaaa0000, 0x0000000100000000, 0x0000000100000000)
 Metaspace       used 2726K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K

F:\eclipseWorkspace\jvm\src>java -XX:+UseConcMarkSweepGC -Xms1024m -Xmx1024m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
2020-11-09T22:48:44.181+0800: [GC (Allocation Failure) 2020-11-09T22:48:44.184+0800: [ParNew: 272640K->34048K(306688K), 0.0589575 secs] 272640K->77572K(1014528K), 0.0625167 secs] [Times: user=0.03 sys=0.17, real=0.06 secs]
2020-11-09T22:48:44.366+0800: [GC (Allocation Failure) 2020-11-09T22:48:44.367+0800: [ParNew: 306688K->34048K(306688K), 0.0884908 secs] 350212K->161329K(1014528K), 0.0909999 secs] [Times: user=0.03 sys=0.28, real=0.09 secs]
2020-11-09T22:48:44.574+0800: [GC (Allocation Failure) 2020-11-09T22:48:44.576+0800: [ParNew: 306688K->34048K(306688K), 0.0847194 secs] 433969K->238330K(1014528K), 0.0871950 secs] [Times: user=0.14 sys=0.06, real=0.09 secs]
2020-11-09T22:48:44.760+0800: [GC (Allocation Failure) 2020-11-09T22:48:44.762+0800: [ParNew: 306688K->34048K(306688K), 0.0690662 secs] 510970K->315306K(1014528K), 0.0712064 secs] [Times: user=0.20 sys=0.02, real=0.07 secs]
执行结束!共生成对象次数:4184
Heap
 par new generation   total 306688K, used 45278K [0x00000000c0000000, 0x00000000d4cc0000, 0x00000000d4cc0000)
  eden space 272640K,   4% used [0x00000000c0000000, 0x00000000c0af7838, 0x00000000d0a40000)
  from space 34048K, 100% used [0x00000000d0a40000, 0x00000000d2b80000, 0x00000000d2b80000)
  to   space 34048K,   0% used [0x00000000d2b80000, 0x00000000d2b80000, 0x00000000d4cc0000)
 concurrent mark-sweep generation total 707840K, used 281258K [0x00000000d4cc0000, 0x0000000100000000, 0x0000000100000000)
 Metaspace       used 2725K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K

F:\eclipseWorkspace\jvm\src>java -XX:+UseConcMarkSweepGC -Xms2048m -Xmx2048m -XX:+PrintGCDetails -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
2020-11-09T22:48:57.262+0800: [GC (Allocation Failure) 2020-11-09T22:48:57.264+0800: [ParNew: 272640K->34048K(306688K), 0.0769522 secs] 272640K->85700K(2063104K), 0.0803956 secs] [Times: user=0.11 sys=0.19, real=0.08 secs]
2020-11-09T22:48:57.507+0800: [GC (Allocation Failure) 2020-11-09T22:48:57.509+0800: [ParNew: 306592K->34046K(306688K), 0.0963625 secs] 358245K->161888K(2063104K), 0.0999893 secs] [Times: user=0.16 sys=0.22, real=0.10 secs]
2020-11-09T22:48:57.757+0800: [GC (Allocation Failure) 2020-11-09T22:48:57.760+0800: [ParNew: 306686K->34048K(306688K), 0.1080000 secs] 434528K->240265K(2063104K), 0.1127504 secs] [Times: user=0.31 sys=0.06, real=0.11 secs]
执行结束!共生成对象次数:2980
Heap
 par new generation   total 306688K, used 45049K [0x0000000080000000, 0x0000000094cc0000, 0x0000000094cc0000)
  eden space 272640K,   4% used [0x0000000080000000, 0x0000000080abe728, 0x0000000090a40000)
  from space 34048K, 100% used [0x0000000092b80000, 0x0000000094cc0000, 0x0000000094cc0000)
  to   space 34048K,   0% used [0x0000000090a40000, 0x0000000090a40000, 0x0000000092b80000)
 concurrent mark-sweep generation total 1756416K, used 206217K [0x0000000094cc0000, 0x0000000100000000, 0x0000000100000000)
 Metaspace       used 2725K, capacity 4486K, committed 4864K, reserved 1056768K
  class space    used 295K, capacity 386K, committed 512K, reserved 1048576K

```

CMS GC在full gc的耗时比串行和并行gc少，在生成对象次数(吞吐量)上更高些，但对于大堆内存（2048m)吞吐量反而减少。


### G1 GC:
```
F:\eclipseWorkspace\jvm\src>java -XX:+UseG1GC -Xms128m -Xmx128m -XX:+PrintGC -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
2020-11-09T23:09:46.890+0800: [GC pause (G1 Evacuation Pause) (young) 15M->5614K(128M), 0.0092280 secs]
2020-11-09T23:09:46.924+0800: [GC pause (G1 Evacuation Pause) (young) 19M->7927K(128M), 0.0072244 secs]
2020-11-09T23:09:46.961+0800: [GC pause (G1 Evacuation Pause) (young) 35M->15M(128M), 0.0110594 secs]
2020-11-09T23:09:47.039+0800: [GC pause (G1 Evacuation Pause) (young) 68M->31M(128M), 0.0147765 secs]
2020-11-09T23:09:47.100+0800: [GC pause (G1 Evacuation Pause) (young) 93M->51M(128M), 0.0188278 secs]
2020-11-09T23:09:47.135+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 77M->62M(128M), 0.0079577 secs]
2020-11-09T23:09:47.145+0800: [GC concurrent-root-region-scan-start]
2020-11-09T23:09:47.148+0800: [GC concurrent-root-region-scan-end, 0.0026354 secs]
2020-11-09T23:09:47.150+0800: [GC concurrent-mark-start]
2020-11-09T23:09:47.157+0800: [GC concurrent-mark-end, 0.0068223 secs]
2020-11-09T23:09:47.163+0800: [GC remark, 0.0042161 secs]
2020-11-09T23:09:47.169+0800: [GC cleanup 89M->89M(128M), 0.0036203 secs]
2020-11-09T23:09:47.183+0800: [GC pause (G1 Evacuation Pause) (young) 101M->76M(128M), 0.0073116 secs]
2020-11-09T23:09:47.197+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 81M->78M(128M), 0.0171134 secs]
2020-11-09T23:09:47.216+0800: [GC concurrent-root-region-scan-start]
2020-11-09T23:09:47.219+0800: [GC concurrent-root-region-scan-end, 0.0021560 secs]
2020-11-09T23:09:47.224+0800: [GC concurrent-mark-start]
2020-11-09T23:09:47.231+0800: [GC concurrent-mark-end, 0.0066625 secs]
2020-11-09T23:09:47.233+0800: [GC pause (G1 Evacuation Pause) (young) 101M->89M(128M), 0.0068040 secs]
2020-11-09T23:09:47.240+0800: [GC remark, 0.0050868 secs]
2020-11-09T23:09:47.246+0800: [GC cleanup 90M->90M(128M), 0.0032873 secs]
2020-11-09T23:09:47.257+0800: [GC pause (G1 Evacuation Pause) (young) 102M->95M(128M), 0.0052363 secs]
2020-11-09T23:09:47.271+0800: [GC pause (G1 Evacuation Pause) (mixed) 99M->93M(128M), 0.0037698 secs]
2020-11-09T23:09:47.279+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 95M->93M(128M), 0.0048140 secs]
2020-11-09T23:09:47.286+0800: [GC concurrent-root-region-scan-start]
2020-11-09T23:09:47.287+0800: [GC concurrent-root-region-scan-end, 0.0015220 secs]
2020-11-09T23:09:47.290+0800: [GC concurrent-mark-start]
2020-11-09T23:09:47.292+0800: [GC pause (G1 Evacuation Pause) (young) 104M->97M(128M), 0.0193392 secs]
2020-11-09T23:09:47.316+0800: [GC pause (G1 Evacuation Pause) (young) 104M->99M(128M), 0.0055603 secs]
2020-11-09T23:09:47.324+0800: [GC concurrent-mark-end, 0.0345185 secs]
2020-11-09T23:09:47.325+0800: [GC remark, 0.0034732 secs]
2020-11-09T23:09:47.330+0800: [GC cleanup 102M->102M(128M), 0.0024399 secs]
2020-11-09T23:09:47.335+0800: [GC pause (G1 Evacuation Pause) (young) 104M->100M(128M), 0.0036054 secs]
2020-11-09T23:09:47.343+0800: [GC pause (G1 Evacuation Pause) (mixed) 106M->98M(128M), 0.0063497 secs]
2020-11-09T23:09:47.354+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 102M->99M(128M), 0.0037301 secs]
2020-11-09T23:09:47.359+0800: [GC concurrent-root-region-scan-start]
2020-11-09T23:09:47.360+0800: [GC concurrent-root-region-scan-end, 0.0013656 secs]
2020-11-09T23:09:47.361+0800: [GC concurrent-mark-start]
2020-11-09T23:09:47.364+0800: [GC pause (G1 Evacuation Pause) (young) 106M->102M(128M), 0.0235525 secs]
2020-11-09T23:09:47.390+0800: [GC pause (G1 Evacuation Pause) (young) 108M->104M(128M), 0.0044739 secs]
2020-11-09T23:09:47.398+0800: [GC concurrent-mark-end, 0.0365138 secs]
2020-11-09T23:09:47.400+0800: [GC remark, 0.0037568 secs]
2020-11-09T23:09:47.404+0800: [GC cleanup 110M->110M(128M), 0.0040221 secs]
2020-11-09T23:09:47.411+0800: [GC pause (G1 Evacuation Pause) (young) 111M->105M(128M), 0.0049087 secs]
2020-11-09T23:09:47.421+0800: [GC pause (G1 Evacuation Pause) (mixed)-- 111M->111M(128M), 0.0100314 secs]
2020-11-09T23:09:47.435+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark)-- 115M->115M(128M), 0.0318924 secs]
2020-11-09T23:09:47.469+0800: [GC concurrent-root-region-scan-start]
2020-11-09T23:09:47.471+0800: 2020-11-09T23:09:47.471+0800: [GC concurrent-root-region-scan-end, 0.0012217 secs]
[GC pause (G1 Humongous Allocation) (young)2020-11-09T23:09:47.472+0800: [GC concurrent-mark-start]
 115M->115M(128M), 0.0070389 secs]
2020-11-09T23:09:47.479+0800: [Full GC (Allocation Failure)  115M->94M(128M), 0.0416272 secs]
2020-11-09T23:09:47.521+0800: [GC concurrent-mark-abort]
2020-11-09T23:09:47.523+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 100M->96M(128M), 0.0031539 secs]
2020-11-09T23:09:47.529+0800: [GC concurrent-root-region-scan-start]
2020-11-09T23:09:47.530+0800: [GC concurrent-root-region-scan-end, 0.0014429 secs]
2020-11-09T23:09:47.533+0800: [GC concurrent-mark-start]
2020-11-09T23:09:47.533+0800: [GC pause (G1 Evacuation Pause) (young) 102M->98M(128M), 0.0060794 secs]
2020-11-09T23:09:47.542+0800: [GC pause (G1 Evacuation Pause) (young)-- 104M->102M(128M), 0.0238218 secs]
2020-11-09T23:09:47.570+0800: [GC concurrent-mark-end, 0.0371825 secs]
2020-11-09T23:09:47.571+0800: [GC pause (G1 Evacuation Pause) (young)-- 105M->104M(128M), 0.0045521 secs]
2020-11-09T23:09:47.576+0800: [GC remark, 0.0039374 secs]
2020-11-09T23:09:47.582+0800: [GC cleanup 105M->105M(128M), 0.0020402 secs]
2020-11-09T23:09:47.584+0800: [GC pause (G1 Humongous Allocation) (young)-- 105M->105M(128M), 0.0031555 secs]
2020-11-09T23:09:47.590+0800: [Full GC (Allocation Failure)  105M->98M(128M), 0.0307201 secs]
2020-11-09T23:09:47.623+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 102M->100M(128M), 0.0138764 secs]
2020-11-09T23:09:47.639+0800: [GC concurrent-root-region-scan-start]
2020-11-09T23:09:47.640+0800: [GC concurrent-root-region-scan-end, 0.0017209 secs]
2020-11-09T23:09:47.642+0800: [GC concurrent-mark-start]
2020-11-09T23:09:47.645+0800: [GC pause (G1 Evacuation Pause) (young)-- 104M->104M(128M), 0.0065647 secs]
2020-11-09T23:09:47.651+0800: [GC pause (G1 Humongous Allocation) (young)-- 104M->104M(128M), 0.0055702 secs]
2020-11-09T23:09:47.659+0800: [Full GC (Allocation Failure)  104M->101M(128M), 0.0116968 secs]
2020-11-09T23:09:47.671+0800: [GC concurrent-mark-abort]
2020-11-09T23:09:47.673+0800: [GC pause (G1 Humongous Allocation) (young) 103M->102M(128M), 0.0039703 secs]
2020-11-09T23:09:47.679+0800: [GC pause (G1 Evacuation Pause) (young)-- 103M->103M(128M), 0.0031685 secs]
2020-11-09T23:09:47.684+0800: [GC pause (G1 Evacuation Pause) (young) (initial-mark)-- 104M->104M(128M), 0.0199794 secs]
2020-11-09T23:09:47.706+0800: [GC concurrent-root-region-scan-start]
2020-11-09T23:09:47.708+0800: [GC concurrent-root-region-scan-end, 0.0013206 secs]
2020-11-09T23:09:47.709+0800: [GC concurrent-mark-start]
2020-11-09T23:09:47.708+0800: [Full GC (Allocation Failure)  104M->102M(128M), 0.0138950 secs]
2020-11-09T23:09:47.721+0800: [GC concurrent-mark-abort]
2020-11-09T23:09:47.722+0800: [GC pause (G1 Humongous Allocation) (young)-- 102M->102M(128M), 0.0097850 secs]
2020-11-09T23:09:47.734+0800: [Full GC (Allocation Failure)  102M->102M(128M), 0.0080281 secs]
2020-11-09T23:09:47.742+0800: [GC pause (G1 Evacuation Pause) (young) (initial-mark) 103M->103M(128M), 0.0112509 secs]
2020-11-09T23:09:47.755+0800: [GC concurrent-root-region-scan-start]
2020-11-09T23:09:47.757+0800: 2020-11-09T23:09:47.757+0800: [GC concurrent-root-region-scan-end, 0.0011438 secs]
[GC pause (G1 Evacuation Pause) (young)2020-11-09T23:09:47.758+0800: [GC concurrent-mark-start]
 103M->103M(128M), 0.0201870 secs]
2020-11-09T23:09:47.778+0800: [Full GC (Allocation Failure)  103M->103M(128M), 0.0099147 secs]
2020-11-09T23:09:47.788+0800: [Full GC (Allocation Failure)  103M->103M(128M), 0.0375703 secs]
2020-11-09T23:09:47.827+0800: [GC concurrent-mark-abort]
2020-11-09T23:09:47.828+0800: [GC pause (G1 Evacuation Pause) (young)-- 104M->104M(128M), 0.0024424 secs]
2020-11-09T23:09:47.831+0800: [Full GC (Allocation Failure)  104M->103M(128M), 0.0085705 secs]
2020-11-09T23:09:47.841+0800: [Full GC (Allocation Failure)  103M->103M(128M), 0.0080123 secs]
2020-11-09T23:09:47.850+0800: [GC pause (G1 Evacuation Pause) (young) 103M->103M(128M), 0.0171625 secs]
2020-11-09T23:09:47.869+0800: [GC pause (G1 Evacuation Pause) (young) (initial-mark) 103M->103M(128M), 0.0019366 secs]
2020-11-09T23:09:47.872+0800: [GC concurrent-root-region-scan-start]
2020-11-09T23:09:47.873+0800: 2020-11-09T23:09:47.873+0800: [Full GC (Allocation Failure) [GC concurrent-root-region-scan-end, 0.0009824 secs]
2020-11-09T23:09:47.874+0800: [GC concurrent-mark-start]
 103M->640K(128M), 0.0093512 secs]
2020-11-09T23:09:47.882+0800: Exception in thread "main" [GC concurrent-mark-abort]
java.lang.OutOfMemoryError: Java heap space
        at week2.GCLogAnalysis.generateGarbage(GCLogAnalysis.java:47)
        at week2.GCLogAnalysis.main(GCLogAnalysis.java:27)

F:\eclipseWorkspace\jvm\src>java -XX:+UseG1GC -Xms256m -Xmx256m -XX:+PrintGC -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
2020-11-09T23:10:04.496+0800: [GC pause (G1 Evacuation Pause) (young) 14M->5720K(256M), 0.0124763 secs]
2020-11-09T23:10:04.545+0800: [GC pause (G1 Evacuation Pause) (young) 22M->11M(256M), 0.0083843 secs]
2020-11-09T23:10:04.590+0800: [GC pause (G1 Evacuation Pause) (young) 39M->21M(256M), 0.0113853 secs]
2020-11-09T23:10:04.646+0800: [GC pause (G1 Evacuation Pause) (young) 62M->35M(256M), 0.0111631 secs]
2020-11-09T23:10:04.824+0800: [GC pause (G1 Evacuation Pause) (young)-- 214M->172M(256M), 0.0149345 secs]
2020-11-09T23:10:04.842+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 174M->172M(256M), 0.0057319 secs]
2020-11-09T23:10:04.849+0800: [GC concurrent-root-region-scan-start]
2020-11-09T23:10:04.851+0800: [GC concurrent-root-region-scan-end, 0.0019878 secs]
2020-11-09T23:10:04.853+0800: [GC concurrent-mark-start]
2020-11-09T23:10:04.859+0800: [GC concurrent-mark-end, 0.0058302 secs]
2020-11-09T23:10:04.861+0800: [GC remark, 0.0037382 secs]
2020-11-09T23:10:04.866+0800: [GC cleanup 195M->195M(256M), 0.0025259 secs]
2020-11-09T23:10:04.880+0800: [GC pause (G1 Evacuation Pause) (young) 217M->188M(256M), 0.0224506 secs]
2020-11-09T23:10:04.910+0800: [GC pause (G1 Evacuation Pause) (mixed) 197M->166M(256M), 0.0199676 secs]
2020-11-09T23:10:04.939+0800: [GC pause (G1 Evacuation Pause) (mixed) 178M->148M(256M), 0.0168590 secs]
2020-11-09T23:10:04.963+0800: [GC pause (G1 Evacuation Pause) (mixed) 160M->132M(256M), 0.0194605 secs]
2020-11-09T23:10:04.991+0800: [GC pause (G1 Evacuation Pause) (mixed) 144M->128M(256M), 0.0167932 secs]
2020-11-09T23:10:05.012+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 131M->129M(256M), 0.0166784 secs]
2020-11-09T23:10:05.030+0800: [GC concurrent-root-region-scan-start]
2020-11-09T23:10:05.031+0800: [GC concurrent-root-region-scan-end, 0.0012037 secs]
2020-11-09T23:10:05.035+0800: [GC concurrent-mark-start]
2020-11-09T23:10:05.041+0800: [GC concurrent-mark-end, 0.0067205 secs]
2020-11-09T23:10:05.043+0800: [GC remark, 0.0171705 secs]
2020-11-09T23:10:05.061+0800: [GC cleanup 145M->145M(256M), 0.0030099 secs]
2020-11-09T23:10:05.065+0800: [GC concurrent-cleanup-start]
2020-11-09T23:10:05.067+0800: [GC concurrent-cleanup-end, 0.0024033 secs]
2020-11-09T23:10:05.103+0800: [GC pause (G1 Evacuation Pause) (young) 204M->157M(256M), 0.0297737 secs]
2020-11-09T23:10:05.138+0800: [GC pause (G1 Evacuation Pause) (mixed) 160M->150M(256M), 0.0072545 secs]
2020-11-09T23:10:05.148+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 152M->150M(256M), 0.0032554 secs]
2020-11-09T23:10:05.153+0800: [GC concurrent-root-region-scan-start]
2020-11-09T23:10:05.155+0800: [GC concurrent-root-region-scan-end, 0.0024992 secs]
2020-11-09T23:10:05.156+0800: [GC concurrent-mark-start]
2020-11-09T23:10:05.162+0800: [GC concurrent-mark-end, 0.0049388 secs]
2020-11-09T23:10:05.163+0800: [GC remark, 0.0082562 secs]
2020-11-09T23:10:05.173+0800: [GC cleanup 172M->172M(256M), 0.0039343 secs]
2020-11-09T23:10:05.195+0800: [GC pause (G1 Evacuation Pause) (young) 206M->173M(256M), 0.0071596 secs]
2020-11-09T23:10:05.207+0800: [GC pause (G1 Evacuation Pause) (mixed) 179M->167M(256M), 0.0163104 secs]
2020-11-09T23:10:05.227+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 169M->167M(256M), 0.0131102 secs]
2020-11-09T23:10:05.241+0800: [GC concurrent-root-region-scan-start]
2020-11-09T23:10:05.247+0800: [GC concurrent-root-region-scan-end, 0.0056180 secs]
2020-11-09T23:10:05.247+0800: [GC concurrent-mark-start]
2020-11-09T23:10:05.253+0800: [GC concurrent-mark-end, 0.0052478 secs]
2020-11-09T23:10:05.259+0800: [GC remark, 0.0042173 secs]
2020-11-09T23:10:05.264+0800: [GC cleanup 206M->206M(256M), 0.0028082 secs]
2020-11-09T23:10:05.270+0800: [GC pause (G1 Evacuation Pause) (young) 209M->179M(256M), 0.0072707 secs]
2020-11-09T23:10:05.283+0800: [GC pause (G1 Evacuation Pause) (mixed) 190M->171M(256M), 0.0110293 secs]
2020-11-09T23:10:05.296+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 173M->171M(256M), 0.0190702 secs]
2020-11-09T23:10:05.316+0800: [GC concurrent-root-region-scan-start]
2020-11-09T23:10:05.318+0800: [GC concurrent-root-region-scan-end, 0.0013998 secs]
2020-11-09T23:10:05.319+0800: [GC concurrent-mark-start]
2020-11-09T23:10:05.324+0800: [GC concurrent-mark-end, 0.0047445 secs]
2020-11-09T23:10:05.325+0800: [GC remark, 0.0140725 secs]
2020-11-09T23:10:05.340+0800: [GC cleanup 188M->188M(256M), 0.0023679 secs]
2020-11-09T23:10:05.350+0800: [GC pause (G1 Evacuation Pause) (young) 206M->184M(256M), 0.0119329 secs]
2020-11-09T23:10:05.369+0800: [GC pause (G1 Evacuation Pause) (mixed) 195M->183M(256M), 0.0144392 secs]
2020-11-09T23:10:05.387+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 186M->183M(256M), 0.0033727 secs]
2020-11-09T23:10:05.392+0800: [GC concurrent-root-region-scan-start]
2020-11-09T23:10:05.393+0800: [GC concurrent-root-region-scan-end, 0.0012033 secs]
2020-11-09T23:10:05.394+0800: [GC concurrent-mark-start]
2020-11-09T23:10:05.399+0800: [GC concurrent-mark-end, 0.0045347 secs]
2020-11-09T23:10:05.405+0800: [GC pause (G1 Evacuation Pause) (young) 205M->193M(256M), 0.0075515 secs]
2020-11-09T23:10:05.412+0800: [GC remark, 0.0051944 secs]
2020-11-09T23:10:05.419+0800: [GC cleanup 193M->193M(256M), 0.0024086 secs]
2020-11-09T23:10:05.427+0800: [GC pause (G1 Evacuation Pause) (young) 206M->197M(256M), 0.0127813 secs]
2020-11-09T23:10:05.446+0800: [GC pause (G1 Evacuation Pause) (mixed)-- 209M->200M(256M), 0.0166622 secs]
执行结束!共生成对象次数:2429

F:\eclipseWorkspace\jvm\src>java -XX:+UseG1GC -Xms512m -Xmx512m -XX:+PrintGC -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
2020-11-09T23:10:23.322+0800: [GC pause (G1 Evacuation Pause) (young) 32M->10M(512M), 0.0088768 secs]
2020-11-09T23:10:23.353+0800: [GC pause (G1 Evacuation Pause) (young) 37M->20M(512M), 0.0102797 secs]
2020-11-09T23:10:23.393+0800: [GC pause (G1 Evacuation Pause) (young) 51M->30M(512M), 0.0126020 secs]
2020-11-09T23:10:23.454+0800: [GC pause (G1 Evacuation Pause) (young) 78M->47M(512M), 0.0124974 secs]
2020-11-09T23:10:23.499+0800: [GC pause (G1 Evacuation Pause) (young) 102M->64M(512M), 0.0133498 secs]
2020-11-09T23:10:23.564+0800: [GC pause (G1 Evacuation Pause) (young) 135M->86M(512M), 0.0171966 secs]
2020-11-09T23:10:23.731+0800: [GC pause (G1 Evacuation Pause) (young) 267M->138M(512M), 0.0276168 secs]
2020-11-09T23:10:23.819+0800: [GC pause (G1 Evacuation Pause) (young) 245M->165M(512M), 0.0221751 secs]
2020-11-09T23:10:23.924+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 303M->203M(512M), 0.0210822 secs]
2020-11-09T23:10:23.948+0800: [GC concurrent-root-region-scan-start]
2020-11-09T23:10:23.949+0800: [GC concurrent-root-region-scan-end, 0.0016126 secs]
2020-11-09T23:10:23.950+0800: [GC concurrent-mark-start]
2020-11-09T23:10:23.957+0800: [GC concurrent-mark-end, 0.0059783 secs]
2020-11-09T23:10:23.959+0800: [GC remark, 0.0208330 secs]
2020-11-09T23:10:23.981+0800: [GC cleanup 226M->225M(512M), 0.0031899 secs]
2020-11-09T23:10:23.985+0800: [GC concurrent-cleanup-start]
2020-11-09T23:10:23.987+0800: [GC concurrent-cleanup-end, 0.0016390 secs]
2020-11-09T23:10:24.067+0800: [GC pause (G1 Evacuation Pause) (young) 366M->251M(512M), 0.0219721 secs]
2020-11-09T23:10:24.094+0800: [GC pause (G1 Evacuation Pause) (mixed) 257M->243M(512M), 0.0062687 secs]
2020-11-09T23:10:24.104+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 247M->244M(512M), 0.0028998 secs]
2020-11-09T23:10:24.108+0800: [GC concurrent-root-region-scan-start]
2020-11-09T23:10:24.109+0800: [GC concurrent-root-region-scan-end, 0.0013718 secs]
2020-11-09T23:10:24.110+0800: [GC concurrent-mark-start]
2020-11-09T23:10:24.115+0800: [GC concurrent-mark-end, 0.0050365 secs]
2020-11-09T23:10:24.121+0800: [GC remark, 0.0056304 secs]
2020-11-09T23:10:24.127+0800: [GC cleanup 275M->274M(512M), 0.0022432 secs]
2020-11-09T23:10:24.130+0800: [GC concurrent-cleanup-start]
2020-11-09T23:10:24.135+0800: [GC concurrent-cleanup-end, 0.0049459 secs]
2020-11-09T23:10:24.212+0800: [GC pause (G1 Evacuation Pause) (young)-- 420M->323M(512M), 0.0081141 secs]
2020-11-09T23:10:24.227+0800: [GC pause (G1 Evacuation Pause) (mixed) 332M->304M(512M), 0.0083002 secs]
2020-11-09T23:10:24.237+0800: [GC pause (G1 Humongous Allocation) (young) (initial-mark) 305M->304M(512M), 0.0033640 secs]
2020-11-09T23:10:24.242+0800: [GC concurrent-root-region-scan-start]
2020-11-09T23:10:24.243+0800: [GC concurrent-root-region-scan-end, 0.0010619 secs]
2020-11-09T23:10:24.244+0800: [GC concurrent-mark-start]
执行结束!共生成对象次数:38622020-11-09T23:10:24.249+0800:
[GC concurrent-mark-end, 0.0054396 secs]
2020-11-09T23:10:24.252+0800: [GC remark, 0.0061756 secs]
2020-11-09T23:10:24.259+0800: [GC cleanup 318M->317M(512M), 0.0027508 secs]
2020-11-09T23:10:24.262+0800: [GC concurrent-cleanup-start]
2020-11-09T23:10:24.263+0800: [GC concurrent-cleanup-end, 0.0011205 secs]

F:\eclipseWorkspace\jvm\src>java -XX:+UseG1GC -Xms1024m -Xmx1024m -XX:+PrintGC -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
2020-11-09T23:10:44.076+0800: [GC pause (G1 Evacuation Pause) (young) 66M->26M(1024M), 0.0166312 secs]
2020-11-09T23:10:44.145+0800: [GC pause (G1 Evacuation Pause) (young) 79M->46M(1024M), 0.0136079 secs]
2020-11-09T23:10:44.210+0800: [GC pause (G1 Evacuation Pause) (young) 103M->66M(1024M), 0.0142121 secs]
2020-11-09T23:10:44.269+0800: [GC pause (G1 Evacuation Pause) (young) 121M->84M(1024M), 0.0135834 secs]
2020-11-09T23:10:44.322+0800: [GC pause (G1 Evacuation Pause) (young) 143M->106M(1024M), 0.0229759 secs]
2020-11-09T23:10:44.407+0800: [GC pause (G1 Evacuation Pause) (young) 185M->133M(1024M), 0.0244300 secs]
执行结束!共生成对象次数:3019

F:\eclipseWorkspace\jvm\src>java -XX:+UseG1GC -Xms2048m -Xmx2048m -XX:+PrintGC -XX:+PrintGCDateStamps week2.GCLogAnalysis
正在执行...
2020-11-09T23:10:54.384+0800: [GC pause (G1 Evacuation Pause) (young) 131M->49M(2048M), 0.0285058 secs]
2020-11-09T23:10:54.492+0800: [GC pause (G1 Evacuation Pause) (young) 160M->80M(2048M), 0.0215644 secs]
2020-11-09T23:10:54.600+0800: [GC pause (G1 Evacuation Pause) (young) 202M->121M(2048M), 0.0237321 secs]
2020-11-09T23:10:54.696+0800: [GC pause (G1 Evacuation Pause) (young) 234M->157M(2048M), 0.0265605 secs]
2020-11-09T23:10:54.800+0800: [GC pause (G1 Evacuation Pause) (young) 275M->193M(2048M), 0.0240747 secs]
2020-11-09T23:10:54.891+0800: [GC pause (G1 Evacuation Pause) (young) 305M->227M(2048M), 0.0243254 secs]
2020-11-09T23:10:54.987+0800: [GC pause (G1 Evacuation Pause) (young) 335M->260M(2048M), 0.0238408 secs]
2020-11-09T23:10:55.097+0800: [GC pause (G1 Evacuation Pause) (young) 388M->294M(2048M), 0.0376219 secs]
执行结束!共生成对象次数:3614
```

G1 GC每次内存回收的耗时都比较稳定，堆内存越大，随着gc次数的减少，gc总耗时也减少。
