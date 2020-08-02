# Introduction of simple-dbmeter
 a simple dbmeter to test Kafka, mirrormaker, Azure Event Hub and Stream Analytics Job

# Overall architecture
<p><img src="/resources/simple-dbmeter-intro.png" alt="components of the solution" /> </p>

# HW & Service **Costs**


<div class=WordSection1>

<table class=MsoTableGrid border=1 cellspacing=0 cellpadding=0 width=642
 style='width:481.7pt;border-collapse:collapse;border:none'>
 <tr>
  <td width=120 valign=top style='width:90.1pt;border:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>Component</span></p>
  </td>
  <td width=120 valign=top style='width:90.1pt;border:solid windowtext 1.0pt;
  border-left:none;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>OTC
  (RMB/USD)</span></p>
  </td>
  <td width=128 valign=top style='width:96.0pt;border:solid windowtext 1.0pt;
  border-left:none;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>MRC
  (RMB/USB)</span></p>
  </td>
  <td width=274 valign=top style='width:205.5pt;border:solid windowtext 1.0pt;
  border-left:none;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>Comments</span></p>
  </td>
 </tr>
 <tr>
  <td width=120 valign=top style='width:90.1pt;border:solid windowtext 1.0pt;
  border-top:none;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US><img
  width=77 height=68 id="Picture 1" src="./resources/dbsensor.jpeg"
  alt="A picture containing engine&#10;&#10;Description automatically generated"></span></p>
  </td>
  <td width=120 valign=top style='width:90.1pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>240
  RMB/</span></p>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>34
  USD</span></p>
  </td>
  <td width=128 valign=top style='width:96.0pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>0</span></p>
  </td>
  <td width=274 valign=top style='width:205.5pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>Bought
  from Taobao.com</span></p>
  </td>
 </tr>
 <tr>
  <td width=120 valign=top style='width:90.1pt;border:solid windowtext 1.0pt;
  border-top:none;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US><img
  width=70 height=70 id="Picture 2" src="./resources/RS485-USB-convertor.jpeg"
  alt="A close up of a device&#10;&#10;Description automatically generated"></span></p>
  </td>
  <td width=120 valign=top style='width:90.1pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>35
  RMB/</span></p>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>5
  USD</span></p>
  </td>
  <td width=128 valign=top style='width:96.0pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>0</span></p>
  </td>
  <td width=274 valign=top style='width:205.5pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>Bought
  from Taobao.com</span></p>
  </td>
 </tr>
 <tr>
  <td width=120 valign=top style='width:90.1pt;border:solid windowtext 1.0pt;
  border-top:none;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US><img
  width=70 height=70 id="Picture 3" src="./resources/PowerAdapter.jpeg"
  alt="A close up of a device&#10;&#10;Description automatically generated"></span></p>
  </td>
  <td width=120 valign=top style='width:90.1pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>34
  RMB/</span></p>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>5
  USD</span></p>
  </td>
  <td width=128 valign=top style='width:96.0pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>0</span></p>
  </td>
  <td width=274 valign=top style='width:205.5pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>Bought
  from Taobao.com</span></p>
  </td>
 </tr>
 <tr>
  <td width=120 valign=top style='width:90.1pt;border:solid windowtext 1.0pt;
  border-top:none;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>Azure
  Event Hub (standard, 1 thoughput unit, no capture)</span></p>
  </td>
  <td width=120 valign=top style='width:90.1pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>&nbsp;</span></p>
  </td>
  <td width=128 valign=top style='width:96.0pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>154
  RMB/</span></p>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>22
  USD</span></p>
  </td>
  <td width=274 valign=top style='width:205.5pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoListParagraphCxSpFirst style='text-indent:-18.0pt'><span
  lang=EN-US style='font-family:Symbol'>·<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span><span lang=EN-US>Need standard tier to support Kafka endpoint</span></p>
  <p class=MsoListParagraphCxSpMiddle style='text-indent:-18.0pt'><span
  lang=EN-US style='font-family:Symbol'>·<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span><span lang=EN-US>1 throughput unit allows 1MB/s ingress and 2MB/s
  egress</span></p>
  <p class=MsoListParagraphCxSpLast style='text-indent:-18.0pt'><span
  lang=EN-US style='font-family:Symbol'>·<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span><span lang=EN-US>Deployed in Central US</span></p>
  </td>
 </tr>
 <tr>
  <td width=120 valign=top style='width:90.1pt;border:solid windowtext 1.0pt;
  border-top:none;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>Azure
  Stream Analytics (standard, 1 streaming unit)</span></p>
  </td>
  <td width=120 valign=top style='width:90.1pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>&nbsp;</span></p>
  </td>
  <td width=128 valign=top style='width:96.0pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>560
  RMB/</span></p>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>80
  USD</span></p>
  </td>
  <td width=274 valign=top style='width:205.5pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoListParagraphCxSpFirst style='text-indent:-18.0pt'><span
  lang=EN-US style='font-family:Symbol'>·<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span><span lang=EN-US>Deployment in Central US</span></p>
  <p class=MsoListParagraphCxSpLast style='text-indent:-18.0pt'><span
  lang=EN-US style='font-family:Symbol'>·<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span><span lang=EN-US>Default streaming unit is 3</span></p>
  </td>
 </tr>
 <tr>
  <td width=120 valign=top style='width:90.1pt;border:solid windowtext 1.0pt;
  border-top:none;padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>PowerBI
  license</span></p>
  </td>
  <td width=120 valign=top style='width:90.1pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>&nbsp;</span></p>
  </td>
  <td width=128 valign=top style='width:96.0pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoNormal align=center style='text-align:center'><span lang=EN-US>0</span></p>
  </td>
  <td width=274 valign=top style='width:205.5pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  padding:0cm 5.4pt 0cm 5.4pt'>
  <p class=MsoListParagraph style='text-indent:-18.0pt'><span lang=EN-US
  style='font-family:Symbol'>·<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  </span></span><span lang=EN-US>Come with company O365 suit</span></p>
  </td>
 </tr>
</table>

<p class=MsoNormal><span lang=EN-US>&nbsp;</span></p>

</div>



# Setup & Test
## 1. [Setup the edge (the collector on PC)](Jul-2020/Edge/Setup-Collector-PC.md)
## 2. [Setup the Bus (Kafka cluster & MirrorMaker)](Jul-2020/Bus/Setup-MsgBus.md)
## 3. [Setup Azure Cloud and PowerBI](Jul-2020/Cloud/Setup-Azure.md)

# Get it run
- Connect the sensor to RS485toUSB adaptor and DC power supply.
- Plug the RS485toUSB adaptor to PC
- On the MsbBus box, start the Kafka cluster with MirrorMaker. can send a test message on local to Kafka cluster and ensure it reaches and shown in PowerBI dashboard.
- on the PC, check the network connection to MsbBus box and run the manu_ser.py.

# Other Comments 
